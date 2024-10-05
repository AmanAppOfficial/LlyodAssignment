package e.aman.catgalleryapp.presentation.components

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.dp
import e.aman.catgalleryapp.presentation.state.CatState

/**
 * author: Aman Srivastava
 * Created on: 04/10/2024
 * Cat List composable.
 * */

@Composable
fun CatList(catState: CatState) {
    // If list is empty show loader
    if (catState.isLoading) {
        Surface(
            modifier = Modifier.fillMaxSize()
        ) {
            CircularProgressIndicator(
                modifier = Modifier
                    .requiredWidth(50.dp)
                    .requiredHeight(50.dp)
            )
        }
    } else if (!catState.errorMessage.isNullOrEmpty()){
        Surface(
            modifier = Modifier.fillMaxSize()
        ) {
            Text(text = catState.errorMessage)
        }
    }
    else {
        val configuration = LocalConfiguration.current
        catState.cats?.let {
            CatList(
                catList = it,
                modifier = Modifier,
                orientation = configuration.orientation)
        }
    }
}
