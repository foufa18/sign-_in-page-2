package com.example.food
import androidx.compose.foundation.shape.CircleShape
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.ui.draw.clip
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
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.food.ui.theme.FoodTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FoodTheme {
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
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.food),
            contentDescription = "",
            modifier = modifier
                .fillMaxWidth()
                .height(270.dp)
                .clip(RoundedCornerShape(bottomStart = 90.dp, bottomEnd = 90.dp)),
            contentScale = ContentScale.Crop

        )
        Spacer(modifier = modifier.height(40.dp))
        Text(
            modifier = Modifier.padding(start = 0.dp, end = 150.dp),

            text = "Welcome!",
            style = TextStyle(),
            fontSize = 40.sp,
            fontStyle = FontStyle.Normal,
            fontWeight = FontWeight.Bold,
            color= Color.DarkGray

        )
        Spacer(modifier = modifier.height(30.dp))
        Text(
            modifier = Modifier.padding(start = 0.dp, end = 300.dp),

            text = "Email",
            style = TextStyle(),
            fontSize = 20.sp,
            fontStyle = FontStyle.Normal,
            fontWeight = FontWeight.Bold,
            color= Color.DarkGray

        )

        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp)
            ,
            value = "",
            onValueChange = {

            },
            label = {
                Text(text = "Enter your Email")
            }, shape = RoundedCornerShape(0.dp),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Text,
            ),
            maxLines = 1,
            singleLine = true,
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor =  Color(0xFF21919C),
                unfocusedBorderColor =  Color(0xFF21919C),
                containerColor = Color.Transparent
            ))
        Spacer(modifier = modifier.height(30.dp))

            Text(
                modifier = Modifier.padding(start = 0.dp, end = 257.dp),

                text = "Password",
                style = TextStyle(),
                fontSize = 20.sp,
                fontStyle = FontStyle.Normal,
                fontWeight = FontWeight.Bold,
                color = Color.DarkGray

            )



        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp)
            ,
            value = "",
            onValueChange = {

            },
            label = {
                Text(text = "Enter your Password")
            }, shape = RoundedCornerShape(0.dp),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Text,
            ),
            maxLines = 1,
            singleLine = true,
            trailingIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.baseline_disabled_visible_24),
                    contentDescription = ""
                )
            },
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor =  Color(0xFF21919C),
                unfocusedBorderColor =  Color(0xFF21919C),
                containerColor = Color.Transparent

            )

        )
        Row(
            modifier = modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Spacer(modifier = modifier.width(20.dp))
        }
        Text(

            modifier = Modifier.padding(start = 150.dp, end = 0.dp,top=10.dp, bottom = 20.dp),
            text = "forgot your password?",
            color = Color(0xFFD38C25),
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp,

        )
        Button(
            onClick = {

            },
            shape = RoundedCornerShape(50),
            modifier = Modifier
                .padding(start = 40.dp, end = 40.dp,top=20.dp,bottom=0.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFE0802C)

            ),

            ) {
            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                text = "Login",
                textAlign = TextAlign.Center,
            )

        }
        Row(
            modifier = modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        )
        {
            Spacer(modifier = modifier.height(60.dp))
        Text(
            modifier = Modifier.padding(0.dp),
            text = "Don't have an account? ",
            color = Color.DarkGray,
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp,
        )
        Text(
            modifier = Modifier.padding(0.dp),
            text = " Sign Up",
            color = Color(0xFFD38C25),
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp,
        )}
    }




}
@Preview
@Composable
fun FoodPreview(modifier: Modifier = Modifier){
    Surface {
        FoodTheme{
            Example()
        }
    }
}

