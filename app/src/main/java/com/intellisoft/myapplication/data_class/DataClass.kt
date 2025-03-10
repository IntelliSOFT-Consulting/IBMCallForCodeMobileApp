package com.intellisoft.myapplication.data_class

import com.intellisoft.myapplication.R
import java.time.LocalDateTime

enum class UrlData(var message: Int) {
    BASE_URL(R.string.base_url),
}
data class DbBardResponse(
    val choices: List<DbContent>,
)
data class DbContent(
    val content:List<String>
)
data class DbBardRequest(
    val inputText:String
)
data class DbUpdateMetadata(
    val searchSubject: String,
    val observedTimeStartUse: String,
    val observedTimeLastUse: String,
    val durationOfEngagement: String,
)

data class DbNCDs(
    val imageResource: Int,
    val imageName: String
)

data class DbLLMResponse(
    val choices:List<DbChoices>
)
data class DbChoices(
    val message: DbMessage
)
data class DbMessage(
    val role: String,
    val content: String
)

data class DbLLM(
    val phoneNumber:String,
    val searchSubject:String,
    val messages : List<DbMessages>
)
data class ApiResponse(
    val id: String,
    val model_id: String,
    val created: Long,
    val created_at: String,
    val choices: List<Choice>,
    val usage: Usage
)

data class Choice(
    val index: Int,
    val message: Message,
    val finish_reason: String
)

data class Message(
    val role: String,
    val content: String
)

data class Usage(
    val completion_tokens: Int,
    val prompt_tokens: Int,
    val total_tokens: Int
)

data class DbMessagesData(
    val message: String
)
data class DbMessages(
    val role:String,
    val content:String,
)
data class DbNcd(
    val imageSource: Int,
    val imageName:String
)
data class DbChat(
    val username: String,
    val chat: String
)

data class DbSignIn(
    val username:String,
    val password:String,
)

data class DbSignUp(
    var uniqueID:String,
    var dob:String,
    var gender:String,
    var phoneNumber:String,
    var signUpDate:String,

    var location:String,
    var specificLocation:String,
    var fullName:String,

    var heardAppFrom:String,
    var username:String, //this is the email address
    var password:String,
    var roles:List<DbRoles>,
)
data class DbProfile(
    var age:Int,
    var gender:String,
    var contact:String,
    var heardAppFrom:String,
    var phoneNumber:String
)
data class DbRoles(
    val name:String
)

data class DbSignUpResponse(
    val id: Int,
    val uniqueId: String,
    val age: Int,
    val gender: String,
    val contact: String,
    val heardAppFrom: String,
    val username: String,
    val password: String,
    val signUpDate: String,
    val token: String,
    val roles: List<Role>,
    val enabled: Boolean,
    val accountNonExpired: Boolean,
    val accountNonLocked: Boolean,
    val credentialsNonExpired: Boolean,
    val authorities: List<Authority>,

    var location:String?,
    var specificLocation:String?,
    var fullName:String?,
)

data class Role(
    val id: Int,
    val name: String
)

data class Authority(
    val authority: String
)