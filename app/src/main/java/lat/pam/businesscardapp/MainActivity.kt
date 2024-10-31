package lat.pam.businesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import lat.pam.businesscardapp.ui.theme.BusinessCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardAppTheme {
                BusinessCard()
            }
        }
    }
}

@Composable
fun BusinessCard() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFDDF2DD)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // Logo Android
        Image(
            painter = painterResource(id = R.drawable.android_logo),
            contentDescription = "Android Logo",
            modifier = Modifier.size(100.dp),
            contentScale = ContentScale.Fit
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Nama
        Text(
            text = "Jennifer Doe",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )

        // Title/Deskripsi
        Text(
            text = "Android Developer Extraordinaire",
            fontSize = 16.sp,
            color = Color(0xFF4CAF50) // Darker green color
        )

        Spacer(modifier = Modifier.height(32.dp))

        // Kontak
        ContactInfo()
    }
}

@Composable
fun ContactInfo() {
    Column(
        horizontalAlignment = Alignment.Start,
        modifier = Modifier.padding(horizontal = 16.dp)
    ) {
        // Nomor Telepon
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(Icons.Default.Phone, contentDescription = "Phone Icon", tint = Color(0xFF4CAF50))
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "+11 (123) 444 555 666", fontSize = 14.sp)
        }

        Spacer(modifier = Modifier.height(8.dp))

        // Social Media Handle
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(Icons.Default.Share, contentDescription = "Share Icon", tint = Color(0xFF4CAF50))
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "@AndroidDev", fontSize = 14.sp)
        }

        Spacer(modifier = Modifier.height(8.dp))

        // Email
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(Icons.Default.Email, contentDescription = "Email Icon", tint = Color(0xFF4CAF50))
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "jen.doe@android.com", fontSize = 14.sp)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BusinessCardAppTheme {
        BusinessCard()
    }
}
