package com.example.taskc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.taskc.ui.theme.TaskcTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TaskcTheme {
                Example()

            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Example(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = modifier.height(10.dp))

        Text(
            text = "Log in",
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 135.dp, vertical = 30.dp),
            style = TextStyle(
                fontSize = 40.sp,
                fontStyle = FontStyle.Italic,
                fontWeight = FontWeight.Bold,
                color= Color.DarkGray
            )
        )

        Spacer(modifier = modifier.height(10.dp))

        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp),
            value = "",
            onValueChange = {},
            label = { Text(text = "Email") },
            shape = RoundedCornerShape(16.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            maxLines = 2,
            singleLine = true,
            trailingIcon = {},
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor =  Color(0xFF21919C),
                unfocusedBorderColor =  Color(0xFF21919C),
                containerColor = Color.Transparent
            )
        )

        Spacer(modifier = modifier.height(25.dp))

        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp),
            value = "",
            onValueChange = {},
            label = { Text(text = "Password") },
            shape = RoundedCornerShape(16.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            maxLines = 1,
            singleLine = true,
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor =  Color(0xFF21919C),
                unfocusedBorderColor =  Color(0xFF21919C),
                containerColor = Color.Transparent
            )
        )

        Spacer(modifier = modifier.height(10.dp))
        (
                Row(
            modifier = modifier
            .padding(start =0.dp,end=180.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        )
        {
            Icon(
                painter = painterResource(id = R.drawable.baseline_check_box_24),
                contentDescription = "",
                        tint = Color.Blue
            )

              Text(
                modifier = Modifier.padding(8.dp),
                text = "remember me",
                color = Color.DarkGray,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp,

                )
        })


        Spacer(modifier = modifier.height(70.dp))

        Button(
            onClick = {},
            shape = RoundedCornerShape(30),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF3F8BC7)
            ),
        ) {
            Text(
                modifier = Modifier.padding(8.dp),
                text = "Sign Up",
                textAlign = TextAlign.Center,
            )

        }

        Spacer(modifier = modifier.height(20.dp))
        Row(
            modifier = modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Spacer(modifier = modifier.width(10.dp))
        }
        Text(
            modifier = Modifier.padding(start = 150.dp, end = 0.dp),
            text = "forgot your password?",
            color = Color(0xFF21919C),
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp,
        )
        Row(
            modifier = modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        )
        {
            Spacer(modifier = modifier.height(170.dp)) }
        Text(
            modifier = Modifier.padding(8.dp),
            text = "Don't have an account? ",
            color = Color.DarkGray,
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp,
        )
        Text(
            modifier = Modifier.padding(5.dp),
            text = " Sign Up",
            color = Color(0xFF21919C),
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp,
        )
    }
}

@Preview
@Composable
fun TaskcPreview(modifier: Modifier = Modifier) {
    Surface {
        TaskcTheme {
            Example()
        }
    }
}
