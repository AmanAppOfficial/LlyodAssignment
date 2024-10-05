package e.aman.catgalleryapp.presentation.components

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import dagger.hilt.android.AndroidEntryPoint
import e.aman.catgalleryapp.presentation.viewmodel.CatViewModel
import e.aman.catgalleryapp.presentation.components.ui.theme.CatGalleryAppTheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private val viewModel: CatViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CatGalleryAppTheme {
                val state = viewModel.catState.collectAsStateWithLifecycle().value
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CatList(state)
                }
            }
        }
    }
}