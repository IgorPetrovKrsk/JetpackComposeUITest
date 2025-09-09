import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.sharp.Menu
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TestComponent(shortDescription: String, description: String) {

    Column(modifier = Modifier
        .fillMaxWidth()
        .background(Color.Red.copy(alpha = 0.5f))
        .padding( 8.dp)) {

        Row(modifier = Modifier
            .padding(horizontal = 8.dp)
            .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                Icon(
                    imageVector = Icons.Filled.CheckCircle,
                    contentDescription = null,
                    tint = Color.White
                )
                Text(text = "Project X", fontSize = 24.sp, color = Color.White)
            }
            Row() {
                Icon(
                    imageVector = Icons.Sharp.Menu,
                    contentDescription = null,
                    tint = Color.White
                )

            }
        }
        Spacer(modifier = Modifier
            .height(8.dp))
        Text(text = shortDescription,
            fontSize = 12.sp,
            color = Color.White,
            modifier = Modifier
                .padding(horizontal = 40.dp))
        Spacer(modifier = Modifier
            .height(8.dp))
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 8.dp), horizontalArrangement = Arrangement.End) {
            Text(text = "Sep 9, 10:30", color = Color.White)
        }
    }

}

@Preview
@Composable
fun TestComponentPreview() {
    TestComponent("This is a short description", "Bacon ipsum dolor amet pork chop flank")
}