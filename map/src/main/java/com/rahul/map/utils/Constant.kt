package com.rahul.map.utils

class Constant {

    companion object {
        val serverKey =
            "key=" + "AAAAfZL8OYo:APA91bHXbVhKAL1YnEYsM8Xr0Mbgzke52X7uyetCXVr7GiJN86SHP3EBeG-f9Om_2RlXMHGDIVYo_MspVqsrtEzdZvUcNLU6vyISoYPrKMCYB4m6dxp42eSRM_YjtpltLQI5Fw71rhAk"
        val contentType = "application/json"

        var REQ_CODE_SPEECH_INPUT = 100
        var locationCode = 1
        var storage = 2

        val googleSignInCode: Int = 100
        val GOOGLE_KEY = "AIzaSyBHDezjE5b4j_2M0vTnkJY6nyclFnfPGkQ"   //TODo Sir api 2
        val BASE_URL = ""
        const val FCM_API = "https://fcm.googleapis.com/"
        var users = "Users"
        var UsersLatLng = "UsersLatLng"
        val PREFRENCE_NAME = "PREFRENCE_NAME"
        var name = "Name"
        var url = "url"
        var Time_Stamp = "Time_Stamp"
        var email = "Email"
        var user_id = "User_Id"
        var id = "id"
        var DeviceToken = "DeviceToken"
        var Block = "Block"
        var Online = "online"
        var Freinds = "Freinds"
        var Status = "Status"
        var Invite_List = "Invite_List"
        var Sender_Id = "Sender_Id"
        var Reciever_Id = "Reciever_Id"
        var chat = "chat"
        var videoCall = "videoCall"
        var voiceCall = "voiceCall"
        var endVideo = "endVideo"
        var lat = "latitute"
        var lng = "longitude"
        var profileurl = "profile_url"
        var cityName = "city_name"
        var state = "state"
        var colorCode = "colorCode"
        var time = "time"
        var onlineTime = "onlinetime"
        var date = "date"
        var dataType = "dataType"
        var leftText = "leftText"
        var righTtext = "rightText"
        var leftImage = "leftImage"
        var rightImage = "rightImage"


        var seenStatusCount = "SeenStatusCount"
        var imagePath = "ImagePath"


        var Request_Count = "Request_Count"
        var Requests = "Requests"
        var Request_Status = "Request_Status"
        var Invite_Pending_Acceptet = "Invite_Pending_Acceptet"

        //    TODO Heading names
        var Invite = "Invite"
        var Invited = "Invited"
        var Accept = "Accept"
        var Decline = "Decline"
        var Reject = "Reject"
        var Pending = "Pending"
        var Accepted = "Accepted"
        var Waiting = "Waiting..."
        var Conversation = "Conversation"
        var Message = "Message"
        var SeenStatusCountSender = "SeenStatusCount_Sender"
        var SeenStatusCountReciever = "SeenStatusCount_reciever"


        //    TODO Contact List
        var Contact_List = "Contact_List"
        var directoryname = "HiFriend"
        var db = "DB"
        var vedio = "VEDIO"
        var picture = "PICTURE"
        var document = "DOCUMENT"
        var folderArray = arrayOf(db, picture, vedio, document)

        const val ovalShape = "oval"
        const val rectangleShape = "rectangle"

        var text = "Text"
        var image = "Image"

        var mapJson = "{\n" +
                "   \"geocoded_waypoints\" : [\n" +
                "      {\n" +
                "         \"geocoder_status\" : \"OK\",\n" +
                "         \"place_id\" : \"ChIJ6QNwvLroDDkRKv6KhAkhGYY\",\n" +
                "         \"types\" : [ \"route\" ]\n" +
                "      },\n" +
                "      {\n" +
                "         \"geocoder_status\" : \"OK\",\n" +
                "         \"place_id\" : \"ChIJwXJWeyh3dDkRR1PIavsdesw\",\n" +
                "         \"types\" : [ \"street_address\" ]\n" +
                "      }\n" +
                "   ],\n" +
                "   \"routes\" : [\n" +
                "      {\n" +
                "         \"bounds\" : {\n" +
                "            \"northeast\" : {\n" +
                "               \"lat\" : 28.5355044,\n" +
                "               \"lng\" : 78.0488522\n" +
                "            },\n" +
                "            \"southwest\" : {\n" +
                "               \"lat\" : 27.1766518,\n" +
                "               \"lng\" : 77.385071\n" +
                "            }\n" +
                "         },\n" +
                "         \"copyrights\" : \"Map data ©2021\",\n" +
                "         \"legs\" : [\n" +
                "            {\n" +
                "               \"distance\" : {\n" +
                "                  \"text\" : \"191 km\",\n" +
                "                  \"value\" : 190745\n" +
                "               },\n" +
                "               \"duration\" : {\n" +
                "                  \"text\" : \"2 hours 48 mins\",\n" +
                "                  \"value\" : 10050\n" +
                "               },\n" +
                "               \"end_address\" : \"28/256, Pathwari, Belanganj, Civil Lines, Agra, Uttar Pradesh 282001, India\",\n" +
                "               \"end_location\" : {\n" +
                "                  \"lat\" : 27.1766518,\n" +
                "                  \"lng\" : 78.0080693\n" +
                "               },\n" +
                "               \"start_address\" : \"Dadri Main Rd, Bhangel, Sector - 106, Noida, Uttar Pradesh 201304, India\",\n" +
                "               \"start_location\" : {\n" +
                "                  \"lat\" : 28.5355044,\n" +
                "                  \"lng\" : 77.39104809999999\n" +
                "               },\n" +
                "               \"steps\" : [\n" +
                "                  {\n" +
                "                     \"distance\" : {\n" +
                "                        \"text\" : \"0.3 km\",\n" +
                "                        \"value\" : 298\n" +
                "                     },\n" +
                "                     \"duration\" : {\n" +
                "                        \"text\" : \"1 min\",\n" +
                "                        \"value\" : 30\n" +
                "                     },\n" +
                "                     \"end_location\" : {\n" +
                "                        \"lat\" : 28.5341592,\n" +
                "                        \"lng\" : 77.38847489999999\n" +
                "                     },\n" +
                "                     \"html_instructions\" : \"Head \\u003cb\\u003esouth-west\\u003c/b\\u003e on \\u003cb\\u003eVishwakarma Rd\\u003c/b\\u003e towards \\u003cb\\u003eकर्नल कृष्ण बाल कपूर मार्ग\\u003c/b\\u003e\\u003cdiv style=\\\"font-size:0.9em\\\"\\u003ePass by wonderland institute of robotics (on the left)\\u003c/div\\u003e\",\n" +
                "                     \"polyline\" : {\n" +
                "                        \"points\" : \"{idmDamjwMn@zBfBjGFNDJHHFFrAlA\"\n" +
                "                     },\n" +
                "                     \"start_location\" : {\n" +
                "                        \"lat\" : 28.5355044,\n" +
                "                        \"lng\" : 77.39104809999999\n" +
                "                     },\n" +
                "                     \"travel_mode\" : \"DRIVING\"\n" +
                "                  },\n" +
                "                  {\n" +
                "                     \"distance\" : {\n" +
                "                        \"text\" : \"1.4 km\",\n" +
                "                        \"value\" : 1392\n" +
                "                     },\n" +
                "                     \"duration\" : {\n" +
                "                        \"text\" : \"3 mins\",\n" +
                "                        \"value\" : 183\n" +
                "                     },\n" +
                "                     \"end_location\" : {\n" +
                "                        \"lat\" : 28.523787,\n" +
                "                        \"lng\" : 77.3909027\n" +
                "                     },\n" +
                "                     \"html_instructions\" : \"Turn \\u003cb\\u003eleft\\u003c/b\\u003e at Sachin Vegetable , Fruits and general store onto \\u003cb\\u003eकर्नल कृष्ण बाल कपूर मार्ग\\u003c/b\\u003e\\u003cdiv style=\\\"font-size:0.9em\\\"\\u003ePass by Dr sumaira Bhat (on the right in 750&nbsp;m)\\u003c/div\\u003e\",\n" +
                "                     \"maneuver\" : \"turn-left\",\n" +
                "                     \"polyline\" : {\n" +
                "                        \"points\" : \"oadmD}|iwM|F{JtCeFFKTc@BEDEFGFIFEFEHCB?j@Er@I|@Gj@Gv@IPCr@GjBQNC~N{AnBQBAD@D@D@FDpItGvB`BRP\"\n" +
                "                     },\n" +
                "                     \"start_location\" : {\n" +
                "                        \"lat\" : 28.5341592,\n" +
                "                        \"lng\" : 77.38847489999999\n" +
                "                     },\n" +
                "                     \"travel_mode\" : \"DRIVING\"\n" +
                "                  },\n" +
                "                  {\n" +
                "                     \"distance\" : {\n" +
                "                        \"text\" : \"0.2 km\",\n" +
                "                        \"value\" : 215\n" +
                "                     },\n" +
                "                     \"duration\" : {\n" +
                "                        \"text\" : \"1 min\",\n" +
                "                        \"value\" : 30\n" +
                "                     },\n" +
                "                     \"end_location\" : {\n" +
                "                        \"lat\" : 28.5226417,\n" +
                "                        \"lng\" : 77.3926694\n" +
                "                     },\n" +
                "                     \"html_instructions\" : \"Turn \\u003cb\\u003eleft\\u003c/b\\u003e onto \\u003cb\\u003eJanpath Marg\\u003c/b\\u003e\",\n" +
                "                     \"maneuver\" : \"turn-left\",\n" +
                "                     \"polyline\" : {\n" +
                "                        \"points\" : \"u`bmDcljwMd@{@~CuF^o@\"\n" +
                "                     },\n" +
                "                     \"start_location\" : {\n" +
                "                        \"lat\" : 28.523787,\n" +
                "                        \"lng\" : 77.3909027\n" +
                "                     },\n" +
                "                     \"travel_mode\" : \"DRIVING\"\n" +
                "                  },\n" +
                "                  {\n" +
                "                     \"distance\" : {\n" +
                "                        \"text\" : \"1.4 km\",\n" +
                "                        \"value\" : 1373\n" +
                "                     },\n" +
                "                     \"duration\" : {\n" +
                "                        \"text\" : \"3 mins\",\n" +
                "                        \"value\" : 151\n" +
                "                     },\n" +
                "                     \"end_location\" : {\n" +
                "                        \"lat\" : 28.5126833,\n" +
                "                        \"lng\" : 77.38553859999999\n" +
                "                     },\n" +
                "                     \"html_instructions\" : \"Turn \\u003cb\\u003eright\\u003c/b\\u003e at CBB Fitness Funda Health Fitness Club onto \\u003cb\\u003eSampark Marg\\u003c/b\\u003e\\u003cdiv style=\\\"font-size:0.9em\\\"\\u003ePass by Active Plus Physiotherapy Centre : Dr Mala Singh (on the left in 400&nbsp;m)\\u003c/div\\u003e\",\n" +
                "                     \"maneuver\" : \"turn-right\",\n" +
                "                     \"polyline\" : {\n" +
                "                        \"points\" : \"oyamDewjwMJURNlBtA@@vEnD~ApAl@d@rDnCn@f@xGnFRLnK|HhJjHRNtAdAzA}A\"\n" +
                "                     },\n" +
                "                     \"start_location\" : {\n" +
                "                        \"lat\" : 28.5226417,\n" +
                "                        \"lng\" : 77.3926694\n" +
                "                     },\n" +
                "                     \"travel_mode\" : \"DRIVING\"\n" +
                "                  },\n" +
                "                  {\n" +
                "                     \"distance\" : {\n" +
                "                        \"text\" : \"13.5 km\",\n" +
                "                        \"value\" : 13504\n" +
                "                     },\n" +
                "                     \"duration\" : {\n" +
                "                        \"text\" : \"12 mins\",\n" +
                "                        \"value\" : 704\n" +
                "                     },\n" +
                "                     \"end_location\" : {\n" +
                "                        \"lat\" : 28.4498506,\n" +
                "                        \"lng\" : 77.49161239999999\n" +
                "                     },\n" +
                "                     \"html_instructions\" : \"Take the slip road on the \\u003cb\\u003eright\\u003c/b\\u003e onto \\u003cb\\u003eNoida-Greater Noida Expy\\u003c/b\\u003e\",\n" +
                "                     \"maneuver\" : \"ramp-right\",\n" +
                "                     \"polyline\" : {\n" +
                "                        \"points\" : \"g{_mDsjiwMz@g@ZQRGTIHGv@w@pBkBbBwAzDyCfCkB`@[h@e@j@m@n@s@x@cAjAeBp@kAd@eAXk@Vk@^{@Tk@|B_HnBgGjBcGl@mBbAgD|AmFtE_P~AsFtGuT`@sALa@La@`ByFH[HYr@gCjBcGbEsNlB{G~@{Ch@cBhB_FhCkHh@_B`@kAt@sBx@uBp@wAr@qAR]PWT_@RYV]PURYX_@tAiBpAaBbByB~FuHxC_Ev@eAtAqBtR_\\\\~@uAn@cAx@kA|@iAh@q@pAaBtAcB|AsBrDsEt@kA\\\\e@`@q@PWNSpBcDb@s@~@}ApBaD~@uAp@aApA}A|CuDnB}BrA{ArCkDnB{Bt@}@dAmAFG`AeApBoBt@q@hAeAxDoDh@i@PSRU`@g@d@o@h@u@`@o@f@y@dAkBn@iAj@cAnA{B`AeBbAiBjAuBbAiBl@eA^o@j@eAl@eAp@qA|@_Bl@gArA_C|@{A@Aj@eAb@q@TYb@m@V]RWV[RUZ[HKXW`@_@TUTO@Al@g@bAy@t@q@nAgAx@u@h@g@n@q@`@e@p@_APSbC_D|AkB|AsBzAcB`BcBz@_AfCoC`CoC|AgBBChCcD~AiBv@cAnA}Az@cAd@g@pCwCj@k@n@k@bEuDVUbDwC~@w@nBcBz@q@HGn@g@nA}@v@k@lAw@fCcBp@c@z@i@vDcCBAjBsAv@g@pA_AXWZW^a@p@y@`@k@`@i@Zi@Tc@Ve@\\\\y@Rm@Tu@l@}BLw@Lw@Da@Fu@Dk@De@@y@By@?m@Ae@A[A]Ee@Ca@Ec@Go@Ig@Mw@WmAYkA_@iAe@kAMWMUQ]Uc@We@oAiBg@u@s@aAm@y@e@q@m@{@w@iAaByB{@gAw@iAcAwAACk@o@mAuAKK{@mAYa@IK\"\n" +
                "                     },\n" +
                "                     \"start_location\" : {\n" +
                "                        \"lat\" : 28.5126833,\n" +
                "                        \"lng\" : 77.38553859999999\n" +
                "                     },\n" +
                "                     \"travel_mode\" : \"DRIVING\"\n" +
                "                  },\n" +
                "                  {\n" +
                "                     \"distance\" : {\n" +
                "                        \"text\" : \"1.3 km\",\n" +
                "                        \"value\" : 1253\n" +
                "                     },\n" +
                "                     \"duration\" : {\n" +
                "                        \"text\" : \"1 min\",\n" +
                "                        \"value\" : 79\n" +
                "                     },\n" +
                "                     \"end_location\" : {\n" +
                "                        \"lat\" : 28.4485917,\n" +
                "                        \"lng\" : 77.4980357\n" +
                "                     },\n" +
                "                     \"html_instructions\" : \"Take the exit towards \\u003cb\\u003eTaj Express Highway\\u003c/b\\u003e/\\u003cwbr/\\u003e\\u003cb\\u003eYamuna Expy\\u003c/b\\u003e\\u003cdiv style=\\\"font-size:0.9em\\\"\\u003eToll road\\u003c/div\\u003e\",\n" +
                "                     \"maneuver\" : \"ramp-left\",\n" +
                "                     \"polyline\" : {\n" +
                "                        \"points\" : \"qrslDqa~wMMAOEIEIGMMa@]UO]QQIOE[K]GSCOCO?M?O?U?O@O@ODMBKBKBKBQHMDKBMBMBI@Q@KAK?KAKAICICKCIEKEKGGEIGGGGIGIGIGKEMEIEMESAGCMCOAM?CAM?S?OB]BQDODQFQDIDGHOJOFGPQLM\\\\WjA}@p@g@tC{BZSZUhCsBj@c@lHoFNMHG^e@\"\n" +
                "                     },\n" +
                "                     \"start_location\" : {\n" +
                "                        \"lat\" : 28.4498506,\n" +
                "                        \"lng\" : 77.49161239999999\n" +
                "                     },\n" +
                "                     \"travel_mode\" : \"DRIVING\"\n" +
                "                  },\n" +
                "                  {\n" +
                "                     \"distance\" : {\n" +
                "                        \"text\" : \"153 km\",\n" +
                "                        \"value\" : 153138\n" +
                "                     },\n" +
                "                     \"duration\" : {\n" +
                "                        \"text\" : \"1 hour 52 mins\",\n" +
                "                        \"value\" : 6694\n" +
                "                     },\n" +
                "                     \"end_location\" : {\n" +
                "                        \"lat\" : 27.2986563,\n" +
                "                        \"lng\" : 78.0332179\n" +
                "                     },\n" +
                "                     \"html_instructions\" : \"Continue onto \\u003cb\\u003eTaj Express Highway\\u003c/b\\u003e/\\u003cwbr/\\u003e\\u003cb\\u003eYamuna Expy\\u003c/b\\u003e\\u003cdiv style=\\\"font-size:0.9em\\\"\\u003eToll road\\u003c/div\\u003e\",\n" +
                "                     \"polyline\" : {\n" +
                "                        \"points\" : \"ujslDwi_xMBAPOlDgCzB_BxAcA~AkAz@o@x@i@NIjAu@nAw@`B_AdAk@lAm@j@Yf@UpBaAzAs@v@_@vS_K~TsKvBgAtE}B|BaARMRKpLwFnG}CzIaEpD}ArCgA|By@dCy@dNaERExAe@hGiBlJsCpIeCHCXING@?h@QlEuAdC}@xCiA|BgAjBy@rAm@xOaHrScJnMyFnCkAda@eQh@ULE?ALEt@a@rGoCbb@wQPG@?RInEmBxB{@xBu@zBw@pBm@fDaAd@KFCn@Olp@mNdCi@TGVGzJsBjX_Ghf@iKr@ODAz@SxDw@~EeA`VeFv@Qx@Q~OiDbAUdAU`FgAtDw@vFkAbE}@xBe@vHaBlCm@r@OnBc@pd@uJ|Be@x@Qx@Oz@Q|Co@|Cs@zA]tN{CdDu@nIiB~Co@nFkArGyA`NuCd@Kd@MVE`@Kb@I`@I`@I`@Kb@I`@IJCjAYRG`B_@b@I`@Ib@I`@Ib@I`@Iny@mQf@Kf@Ktz@gQREBA\\\\G`@KTE`@Kb@IXIFA`@Ib@K`@Ib@I@?^K`@Ib@K`@I`@Kb@I`@I`@Kb@IHCVG`@Ib@K`@I`@Kb@I`@KNCPEb@K`@I`@Kb@I`@K`@Kb@IRE|FoAhDs@xBa@XGXGlZuGpa@wIlHyAr@Or@Or@O\\\\I~G}A`HyAzFqAvFsAtEcAb@IXIBA@?^KlCg@xB_@vAUhBYp@KnC[|BU`AIbBQxDWf@AnCKpDM^?\\\\AZAb@?b@AJ?V?b@?b@?b@?b@?b@AN?R?b@?b@?b@?b@?b@?@?`@Ab@?b@?b@Ab@?b@?b@?b@Ab@?b@?b@Ab@?b@?b@Ab@?b@?b@Ab@?X?H?b@?b@?H?X?b@Ab@?b@?b@Ab@?b@?ZAF?b@?b@@b@?Z?F?b@Ab@?b@?`@?b@Ab@?b@?b@?b@AJ?V?b@Ab@?R?P?nDFnDFnADtBDvCBvA?pCCrA@fCE`ECj@?j@A~DC`ECfBArAAxA?b@?nAArCCfAAh@?fGGrB?~KH\\\\Ad@?f@?jDDzSApF?fD?hN@vF@`D@bHCd@@b@?fA@fA?tAAtH?zAAtACvAEdAA|@?n@?R?r@?~BDv@DdABt@?zOArD?`E?dCAdD?jB?tC@rB@jB?lSChC?l@?l@@dI?pE?`C@`A?fIAvB@tB@tBBvA@xBB\\\\@B?X@pMHvIFvBBxDJrEPzCR|CVtGt@rBXrF~@rB`@dANdANv@LfAJvAPpBP~@Fn@DlAFhADbABpCDrC@`BA`ACbAAnBIdBKbAGhBO`BQbDa@|AUpAUXGZErRwDp@M`AOdDc@nBWjOiBxQyB`@E`@G~L{AdEk@|KqArH}@nC[ZEZClC]hAMpBU`CUvE]|Fc@|Fa@fEYjF]hGa@zBMpIu@d@ClGg@zFa@`Im@h@Eh@GpAI`DUxBOhH_@`Gc@|Fm@dGi@~Gm@nFg@fGg@zAQVATCjOuA^C^CvAK~AIlDK|ACxACrB?nC@T@T?`EJ`DPrADh@@n@@h@@l@@T@f@@pBHrAF`BLh@DtCZj@Hv@JbCd@l@Lj@Jx@NnATdAPhARjAPp@J|AR|Fl@|@JxEd@dI|@bCVTBTBr@Hp@Fv@Hv@HpY`DlEd@jBRx@HvANVBTB~Db@fD\\\\bEd@nCZlD^fFj@bFh@jHr@bALj@D^DZBvE^`BHzAHtCHj@@~BD`GBdA?bBAdBCrACpAElAGhEUnAIZABA^CjAI~D_@tAOjDa@nASfBWv@MnCg@xDy@`Ba@VG`@I`@KDAFC~DgA~Ae@|@[VIlC_A`DkAf@SxCoAfBw@bBu@r@_@|DoBh@[fEeCdAo@`EmC\\\\W^UlCqBtC{BbLaJ~CcC`EaDDErKqIpDuCrBaBhByAPORO~J_Ir@i@pB_Bf@_@bBqAn@g@`As@~@s@vAaAp@c@`@U^U`@U|@i@|A{@jBaAhAk@vCsAlDwAzB{@vAe@BAjA_@bA[bAYXIVI`AU`AWDAnCk@rCk@dDe@p@I~C_@TCPCRChAKfAIfCQvAEpAGp@At@Cv@ApBAt@?pD@d@@b@?T?vEDfC@p@?nCBdHBpI?X?X?hDBtB@tB@rA?`A?dAAv@?nACpCK`@Ab@AfDQtDYjFm@~F}@l@K|@Qx@ShJsBbFgAlFkAfDu@jFkAl@Mn@M|Cs@~Aa@~Bq@`A[~Ag@jBo@|B{@b@Sx@]p@[|As@dAg@jAk@bCsArDyB`DwB~@s@|AiApNuKzCsB`GoDjE_CjDcBjCkAVKXKdFoBbEqAxCy@vBi@vCs@~@SfCg@|Ey@lBYzDe@~BUhCUdAGdAGxFWnEKzDMzFMj@Cj@AfJUv\\\\}@hBEvDKr@Cr@CtISzEOpDQVA|CYp@G~BWpDg@tAU`AOrGuA~DeAhDeAdEwAjEgBjFcC`E}BbF_DvT_OfCiBv@g@x@i@pDcCzBwAbMgI`IkFdCaB`BgAhFaDpBgAxFoClCiApCeAnC}@jDgAbCw@z@[|@]`C{@`EkBfDkBvCiBrDiCZWPOROdL_JjCsBzGgEdAm@XQXQ`CuArF_DjHmExHiEfEoCfI{EzFkDjAu@lAs@dAo@pKiGpF_D|EwCvA{@pBkAzBqAzFiDlReLpBmArBmAlDuBnJsF~H}Dz@]^OhEeBtGsCbFuCp@a@t@_@`@U`Ao@hAu@bCeBjDmCzAgApG{EtAcAzFqDdLcHhDyBbD_CdAu@z@q@~DkDPOfEeEtFuGf@o@\\\\c@Zc@|D_G|@wAzCoF`HkOjBqFp@uBxAcFbDuKRs@zEmPrCqJNc@`DwK|EmPzEkPr@iChBkGdCkIj@kB~CaK@E\\\\_AbBoEzB}EfAyBjBkDhAmB?A\\\\k@tCkETYhFyG~DkElMyMtDyD\\\\]\\\\_@tCcDzJ}JnPcQZ[X[`HmHdMsM~FeG~HmGRO\\\\WjGkEp@a@n@a@t@e@pBgAnEwBdCeA\\\\OvDyA~KqDl@Q`@OxM_EnEqAlBe@b@Ib@KZIzEcAvB_@bDi@zBW`E]|@I|@EJApCMpEOzEE~@AnB?nDHpCHnCPvDZxEb@|F~@VD^DjG`AbDh@~AVxCh@hDh@xAVp@JnDh@jC`@~ATdEr@dEl@pDh@xHlAVBVDfFv@fIrAvMvBhQlCPBPBjC`@dB\\\\xIpAdEr@nARpARjGbA`L`BPBPBf@H|HjA~@N~@NtO|BZH@?d@FdS`Dv]tFzEt@ZDnARfInAfRvChMjBvB^d@HvO`CxGr@fAFRB`@B|DVlHRdC?nDCvCGzDW|DYxBSFAF?x@I~Ca@bHoAvEcAbFwA|OaFf@Qf@OxZqJ^K^MdPcFxk@uQLENEtT_HhEsAtYcJ^Kj@Ql@ObLqDNGNElKeDr^cLZKDAXKf@QtOsEjLqDxO}EtGsBf@OdD_A|GaBdCc@pHiAtBUr@Et@GdC]`I]fJ?pBDtUn@tOd@d@@b@Bn\\\\z@j^~@b@@b@@lh@~A|BD~BFz\\\\`AhJT~@@bA@hA?|C?dACjCEdFGfAFlBRbAFp@Hp@Fx@H`@DH?bDZL@jAFjBB~@BnHTnBBpCB`CCvEIdEM~DWhCW`D[tCc@d@Kf@I|UiEnVmElAUnAStQiDvI}AdASjHoAnFcAvI}A|MgCx@Ox@MvHyAnNaC|@Qz@OfKkBzBa@fDm@pCi@vDo@pFaA|@Qz@OdAQtIaBrDk@~Dw@bHoApCg@tB]bAS`AQt@M~Ck@zCm@hASjAUfASlCi@bDo@vCi@lDm@jEu@rCg@|Cm@nB[lMyB\\\\GbF_AlLyBvCa@dBSbD[pAK`BMlBK~BIpDGrAAr@CfB?vBBdBB`DLxBLrDVH@dGh@pGl@tALzE`@nALnAJrGj@dAHfAHxFf@dAJvBP`E\\\\pEd@xALzAJ`ADx@DjABhAD`ABvA@~B?bCEzACzAGnAE|@GfAKnAIdAKfAK`AM~@M`@G`@GbAOvCk@hBa@nBc@zBm@zC}@t@Wx@W~BaAxCoAzCyAhBaApC_BbBgAb@WfEuCnCoB`@Yb@Yv@e@z@i@|A_AhAq@dCmAlAk@`DuAjAe@|By@JEpDgAd@Of@QbCm@bDo@nCg@fEs@`C_@hASlBa@xCm@lD_An@QvEyAz@[|Ai@ZMbCaAlB{@r@]r@]pDoBtAs@vAw@zAy@nCwAhBcA^SdFiCtC}ApAs@bAg@`Am@`CwApAq@FEfAe@hAm@dAg@TKvBkAbDcB~F_Dv@c@dBaAdAi@rDqBpDmBtDqB|CaB|DsBxEcCnBgAvFwCpDkBtBoAzGmDd@Yh@YnAq@xCaBzC_BfCsA`DcBbCqAtDmB~BoAjCwAhB_AdB}@pBcAjAi@zAq@bDsApBo@rAe@bA[pCy@dFoAnAUb@IhAS~Cg@rEm@fAKvCSr@KtAMjDKhDKrDEhDFx@@`BBh@?fABzAHhCL~@H`A@bUfAdo@vCz_@fBp@DH?x@Dj^~AnOr@nJd@xCLrAHpAFr`@jBxVlAfENfEPh@DB?j@Df@Bf@BbETdFRvDHd@?d@@D?jB?pDAtEGtDUfEYpAKPCdDa@jEq@`Do@fEaAzBm@r@QdKeD~@a@zAo@fHiDdEwBp[uPv]}QRKTM~@c@dRyJp@_@p@]lBcAlM_H|Ay@j@Yj@[|GoD|GqD`JqEzCcB@Ab@Ul@]dFqCpCkB~BiBdGeFj@i@fBcBlBwBhBoBxAiB|B_Db@k@d@w@xAaClC}EfCiFvAgDlB{EdBqFRq@Rq@l@uB~@aE~AkHfByHn@eChBuG`@mA|@yCzAaE~@yBr@_BpAsCr@mAt@sAhB{Cb@o@@A`@m@zAuB|DcFp@{@fAkAjCoCRQ~CwCnAkAzCoCfAeAfB_BvD}ChCsBlCiBhC}AbDkBnAq@lAk@lAm@xAo@rBw@vAg@vIoCrDeA`IsB|@UvFyAlD_AnCw@jEiAlD_Av@ShBc@rA[~Cm@zA]vE_AvA]rAYVEVGLCzA]bASdCm@rBe@fA[zCeAzBw@nAg@r@Wr@YzBgAhAi@zBgAhBcA|@k@h@]r@_@f@[z@e@fAu@rA_A`Au@j@g@l@e@n@i@t@s@p@m@|@y@j@k@j@e@d@g@JKBEtB}BtCiDtBkCjB}B^g@LQFMHOFMZq@|@}A`@q@jAmBrB}DpAqCpDyHLWJUjCaG~@aB^u@Te@l@yA`@_ATe@Zo@bCoEn@oAl@wA`@{@`@y@T_@lAwBxAwCxC_G`@u@t@wAt@wAzDyH~EuJHMFOd@u@rAoC\\\\s@Tg@NYP[`@u@NYVi@R]T]Ta@Xi@Pa@N[Re@Tg@N[P]FIR]bAsB|@{AdAgB~@wAx@mAj@{@tBsCfAuABALORWJMf@o@Z_@TWPSNQVYVYVURS\\\\c@LORS^c@f@i@X[f@i@~@iA`@a@TW^a@hAmATW`@e@x@}@XWRUVY`@g@XYV[\\\\a@d@e@TU^c@Z]`@c@b@g@f@g@n@w@NOX[V[h@i@NSPSTWX[d@g@RUVWZ]b@g@TYNO?AJKxEmFlIiJbAgAJMJMlAuAn@q@b@k@|@mA`@k@b@e@b@g@TWV_@T]Zk@^q@r@kAf@y@`@u@t@sALY@AN[\\\\o@^w@Pa@N]P_@R_@P_@Ti@Xk@Tg@L_@N_@To@Ne@Tk@Re@Pe@Pc@Lc@Lc@Pq@Le@FUJ_@Rm@Nk@L_@Ni@Pq@No@Ha@Pw@Li@N}@Li@Hi@BMFWD[Jm@H]N_AHk@Ji@Fq@J_ALgALoAFk@B]D]LuAB[Ba@Dw@Bo@Bs@Bi@Bo@HuAB]?c@@c@?]Bi@Bo@@w@@s@?a@@i@?k@Ag@@u@?o@?q@Aw@?u@Cm@Cu@Ao@Cg@Ao@A_@?g@Ak@?c@A]Ae@Cq@Co@Cy@CcAEsACqAAs@?W?C?UA]?e@AWAm@Cy@C_AA{@Aq@Ak@?q@Ai@Co@As@?a@A_@As@?WAq@Ai@Ak@Ck@Aw@Ay@Ci@Co@Ai@A{@?o@Ai@Ai@Cq@CgACs@?s@Am@CgAA{@?o@Cu@Co@CeAC{@A}@A}@Ay@A}@Ai@Au@AeAAy@Co@Cs@Cy@AaACgACcAA}@Cs@E}@Aw@C][iUCsBAo@Aq@[kRq@c^Am@ScJOqFGsFAqA]kNAs@Cq@o@a`@CiACiA_@_ROiICcECeC@oC@w@FyGJ}CLkCPsCZ_Ej@yFT_BXwB^wBx@yEt@oDLe@Lg@xAiGpAgEbA}CvA}D|CqHnBmEjHiP~CgHVm@@ARi@vCwGjHkPhFwLt@oBRg@Re@fAyCf@}Ah@kB`@sA^oAT}@d@kBr@oC~@oEZiB`@kCR}APeBFk@Fy@N}AJcBDi@DgAJeCLaCHqBPmE@QRiCH_ADm@RsCR{BJwAJoAHqAJwALmATqDPoCT}C~AmXNoCxDkr@Du@Fu@b@wGNgBN_BPyABWPwAJs@fA}GtCoM\\\\kBb@_B`@cB\"\n" +
                "                     },\n" +
                "                     \"start_location\" : {\n" +
                "                        \"lat\" : 28.4485917,\n" +
                "                        \"lng\" : 77.4980357\n" +
                "                     },\n" +
                "                     \"travel_mode\" : \"DRIVING\"\n" +
                "                  },\n" +
                "                  {\n" +
                "                     \"distance\" : {\n" +
                "                        \"text\" : \"11.7 km\",\n" +
                "                        \"value\" : 11680\n" +
                "                     },\n" +
                "                     \"duration\" : {\n" +
                "                        \"text\" : \"18 mins\",\n" +
                "                        \"value\" : 1083\n" +
                "                     },\n" +
                "                     \"end_location\" : {\n" +
                "                        \"lat\" : 27.20316,\n" +
                "                        \"lng\" : 78.0400449\n" +
                "                     },\n" +
                "                     \"html_instructions\" : \"Exit onto \\u003cb\\u003eNH 509\\u003c/b\\u003e\\u003cdiv style=\\\"font-size:0.9em\\\"\\u003ePass by Goverment Primary School (on the right in 8.2&nbsp;km)\\u003c/div\\u003e\",\n" +
                "                     \"maneuver\" : \"ramp-left\",\n" +
                "                     \"polyline\" : {\n" +
                "                        \"points\" : \"swreDszg{MD_@BYP_ABQ@O?S?KCYCUEWGSQa@OSQQ]We@UOEQCW?U?SBUDQFUHQLURWXOZIZGPCRC\\\\AV@VBVDVHVHVLRNTTRHFHFPHB@PDVFP@TAv@GRAP?|Dw@tCe@vEiAvEMTAf@EhRsDxBa@tBc@n[kGfHwAdDo@|[qGvFiAnEw@fSsDrEy@xOsCHC~@OzFiAHAfCe@vDq@JC|FgA`ASHAzDs@ZGrHuA~Ds@pDq@VE`Dk@`AQrBa@nE_AjAU`B]rB_@rAWv@OPCzBa@pAQ^Cn@Ef@Eh@AvA?`A?jC@fAC`AGn@Iv@OnA]j@YZM^On@]v@e@DCXOZQl@[b@SJCNEDAZIb@Ij@G@?l@G~AKpCQhAIf@CRCdAGHAlAGTAx@EhDM~AExDOpEQ|BMtAGfDQt@EpDSnBKbDI\\\\AzAAz@CtAAxAAd@?hBCF?pAAH?J?RGhCE|AIn@GlBUtC[@?@?H@B?FAXCFAF?D?B?N?L@L@LBf@FlARF@T?H@H@nBf@p@LXH|@Tp@J~ARzATdAPf@JTLh@L^H^HZFxA^`@Jl@Rh@PXL|Ap@JB`@NZN^Ll@RVH^HdARlAX|AZ@?bDp@LBTDd@Hx@ND@^HtAVp@LfDl@`ARhDt@l@Lv@LnDv@dCf@jAPnAVjAVJDXFbDz@h@JpAVj@HRBn@Jv@H\\\\Dh@F`@FhANVBb@HTB|@J@?dALnCR\\\\BF@ZFnDRdANl@J`@H^J`Bf@THh@R|@\\\\ZLv@\\\\hAh@b@Tt@^XNdE`Cd@X\"\n" +
                "                     },\n" +
                "                     \"start_location\" : {\n" +
                "                        \"lat\" : 27.2986563,\n" +
                "                        \"lng\" : 78.0332179\n" +
                "                     },\n" +
                "                     \"travel_mode\" : \"DRIVING\"\n" +
                "                  },\n" +
                "                  {\n" +
                "                     \"distance\" : {\n" +
                "                        \"text\" : \"1.4 km\",\n" +
                "                        \"value\" : 1433\n" +
                "                     },\n" +
                "                     \"duration\" : {\n" +
                "                        \"text\" : \"3 mins\",\n" +
                "                        \"value\" : 204\n" +
                "                     },\n" +
                "                     \"end_location\" : {\n" +
                "                        \"lat\" : 27.2074435,\n" +
                "                        \"lng\" : 78.0267985\n" +
                "                     },\n" +
                "                     \"html_instructions\" : \"Turn \\u003cb\\u003eright\\u003c/b\\u003e at \\u003cb\\u003eRam Bagh Chauraha\\u003c/b\\u003e\",\n" +
                "                     \"maneuver\" : \"turn-right\",\n" +
                "                     \"polyline\" : {\n" +
                "                        \"points\" : \"wb`eDgei{Mx@b@GPu@jB{CfHO^MZEJGJGRUt@Yx@Qf@Oh@Sl@YpAa@fBe@rBe@vBa@jB[bBQjAUnAETi@dCK^Kf@Kd@ENKb@Oj@K^EPEPKZWx@IZETEVGXI`@EZMpAQhAENCP?JCh@Gt@EVCPOh@\"\n" +
                "                     },\n" +
                "                     \"start_location\" : {\n" +
                "                        \"lat\" : 27.20316,\n" +
                "                        \"lng\" : 78.0400449\n" +
                "                     },\n" +
                "                     \"travel_mode\" : \"DRIVING\"\n" +
                "                  },\n" +
                "                  {\n" +
                "                     \"distance\" : {\n" +
                "                        \"text\" : \"1.6 km\",\n" +
                "                        \"value\" : 1598\n" +
                "                     },\n" +
                "                     \"duration\" : {\n" +
                "                        \"text\" : \"2 mins\",\n" +
                "                        \"value\" : 132\n" +
                "                     },\n" +
                "                     \"end_location\" : {\n" +
                "                        \"lat\" : 27.2088074,\n" +
                "                        \"lng\" : 78.0107568\n" +
                "                     },\n" +
                "                     \"html_instructions\" : \"Continue straight onto \\u003cb\\u003eNH19\\u003c/b\\u003e/\\u003cwbr/\\u003e\\u003cb\\u003eNH 44\\u003c/b\\u003e\\u003cdiv style=\\\"font-size:0.9em\\\"\\u003ePass by ICICI Bank Kamla Nagar, Agra - Branch &amp; ATM (on the right in 1.0&nbsp;km)\\u003c/div\\u003e\",\n" +
                "                     \"maneuver\" : \"straight\",\n" +
                "                     \"polyline\" : {\n" +
                "                        \"points\" : \"o}`eDorf{MCHAJATK~@Gn@KjAS~BKdAOfBQdBGz@SlCA^I`AObBIrAIlAEnAG|A_@rS?VAXGtNAdB?tBAbAA|@@zAI~@Ix@Kz@\"\n" +
                "                     },\n" +
                "                     \"start_location\" : {\n" +
                "                        \"lat\" : 27.2074435,\n" +
                "                        \"lng\" : 78.0267985\n" +
                "                     },\n" +
                "                     \"travel_mode\" : \"DRIVING\"\n" +
                "                  },\n" +
                "                  {\n" +
                "                     \"distance\" : {\n" +
                "                        \"text\" : \"0.2 km\",\n" +
                "                        \"value\" : 154\n" +
                "                     },\n" +
                "                     \"duration\" : {\n" +
                "                        \"text\" : \"1 min\",\n" +
                "                        \"value\" : 45\n" +
                "                     },\n" +
                "                     \"end_location\" : {\n" +
                "                        \"lat\" : 27.2076211,\n" +
                "                        \"lng\" : 78.01098209999999\n" +
                "                     },\n" +
                "                     \"html_instructions\" : \"Sharp \\u003cb\\u003eleft\\u003c/b\\u003e onto \\u003cb\\u003eDargah Rd\\u003c/b\\u003e\",\n" +
                "                     \"maneuver\" : \"turn-sharp-left\",\n" +
                "                     \"polyline\" : {\n" +
                "                        \"points\" : \"afaeDgnc{MNKJUFQHW`BJR@hAP\"\n" +
                "                     },\n" +
                "                     \"start_location\" : {\n" +
                "                        \"lat\" : 27.2088074,\n" +
                "                        \"lng\" : 78.0107568\n" +
                "                     },\n" +
                "                     \"travel_mode\" : \"DRIVING\"\n" +
                "                  },\n" +
                "                  {\n" +
                "                     \"distance\" : {\n" +
                "                        \"text\" : \"0.6 km\",\n" +
                "                        \"value\" : 592\n" +
                "                     },\n" +
                "                     \"duration\" : {\n" +
                "                        \"text\" : \"1 min\",\n" +
                "                        \"value\" : 83\n" +
                "                     },\n" +
                "                     \"end_location\" : {\n" +
                "                        \"lat\" : 27.2072263,\n" +
                "                        \"lng\" : 78.00539499999999\n" +
                "                     },\n" +
                "                     \"html_instructions\" : \"Turn \\u003cb\\u003eright\\u003c/b\\u003e after the petrol station (on the left)\\u003cdiv style=\\\"font-size:0.9em\\\"\\u003ePass by St.Thomas Jr High School (on the right)\\u003c/div\\u003e\",\n" +
                "                     \"maneuver\" : \"turn-right\",\n" +
                "                     \"polyline\" : {\n" +
                "                        \"points\" : \"s~`eDsoc{M@TCt@ClAEx@C|A?RBtC@bA@vBAtC?BBfAEpC@PBNDPBLDJPBP@PAL?\"\n" +
                "                     },\n" +
                "                     \"start_location\" : {\n" +
                "                        \"lat\" : 27.2076211,\n" +
                "                        \"lng\" : 78.01098209999999\n" +
                "                     },\n" +
                "                     \"travel_mode\" : \"DRIVING\"\n" +
                "                  },\n" +
                "                  {\n" +
                "                     \"distance\" : {\n" +
                "                        \"text\" : \"0.2 km\",\n" +
                "                        \"value\" : 185\n" +
                "                     },\n" +
                "                     \"duration\" : {\n" +
                "                        \"text\" : \"1 min\",\n" +
                "                        \"value\" : 30\n" +
                "                     },\n" +
                "                     \"end_location\" : {\n" +
                "                        \"lat\" : 27.207021,\n" +
                "                        \"lng\" : 78.0035724\n" +
                "                     },\n" +
                "                     \"html_instructions\" : \"Turn \\u003cb\\u003eright\\u003c/b\\u003e\",\n" +
                "                     \"maneuver\" : \"turn-right\",\n" +
                "                     \"polyline\" : {\n" +
                "                        \"points\" : \"e|`eDulb{M`@~ADR@LDb@@Z@T?j@?LAVATCZAN\"\n" +
                "                     },\n" +
                "                     \"start_location\" : {\n" +
                "                        \"lat\" : 27.2072263,\n" +
                "                        \"lng\" : 78.00539499999999\n" +
                "                     },\n" +
                "                     \"travel_mode\" : \"DRIVING\"\n" +
                "                  },\n" +
                "                  {\n" +
                "                     \"distance\" : {\n" +
                "                        \"text\" : \"3.9 km\",\n" +
                "                        \"value\" : 3930\n" +
                "                     },\n" +
                "                     \"duration\" : {\n" +
                "                        \"text\" : \"10 mins\",\n" +
                "                        \"value\" : 602\n" +
                "                     },\n" +
                "                     \"end_location\" : {\n" +
                "                        \"lat\" : 27.1766518,\n" +
                "                        \"lng\" : 78.0080693\n" +
                "                     },\n" +
                "                     \"html_instructions\" : \"At the roundabout, take the \\u003cb\\u003e1st\\u003c/b\\u003e exit onto \\u003cb\\u003eMahatma Gandhi Rd\\u003c/b\\u003e\\u003cdiv style=\\\"font-size:0.9em\\\"\\u003ePass by Canara Bank ATM (on the left)\\u003c/div\\u003e\\u003cdiv style=\\\"font-size:0.9em\\\"\\u003eDestination will be on the left\\u003c/div\\u003e\",\n" +
                "                     \"maneuver\" : \"roundabout-left\",\n" +
                "                     \"polyline\" : {\n" +
                "                        \"points\" : \"{z`eDiab{MHDHFJFDDD?H?NCJALCLGTK|CkB|AaA\\\\SBAd@SHEFADADAFADA\\\\EfEIpBGh@CN?LAF?D@^FFDFDJJTPh@b@n@^JF@@@@B@B@B@D@BB~Aj@fEzA~Bz@`@NRFr@XpDxA`Cv@ZLz@^RF`@Ld@Jd@F|@RvB^n@Hj@Fj@H~@LrEr@l@JVDVBZBd@BH?LAnFY`EYbCSzAIjA@zA@dABfDJdABLAD?ZCpC_@hBWb@Gv@GH?N?l@DVDt@L^Hf@R`@LTFJBZDX@n@?dAA`@ARALAHALCt@Ul@QFCJEFCn@_@LGVSNM^i@h@cAZs@Lg@BY@k@CeACmA?}@AoB?O@K?I@I@KBK@GBIBG@GHSTUJGDC@CHGFC~@[bBk@|@YBAZKvAe@TIJELGNKHIFEFGnAwAX]P[FODSBYBU@Q?I@G\"\n" +
                "                     },\n" +
                "                     \"start_location\" : {\n" +
                "                        \"lat\" : 27.207021,\n" +
                "                        \"lng\" : 78.0035724\n" +
                "                     },\n" +
                "                     \"travel_mode\" : \"DRIVING\"\n" +
                "                  }\n" +
                "               ],\n" +
                "               \"traffic_speed_entry\" : [],\n" +
                "               \"via_waypoint\" : []\n" +
                "            }\n" +
                "         ],\n" +
                "         \"overview_polyline\" : {\n" +
                "            \"points\" : \"{idmDamjwMdDbLPPrAlA|F{J|CqFXi@\\\\]vGs@zXoCdJ~GjCrBdEqHj@eA`CdBfJhH~g@n`@tAdAzA}AvAy@jBqA`UmRdI{N|i@iiBdX_{@rHuPvJmMfi@sx@`a@gk@~Wu[dR}QvWmc@xRe\\\\pQoPzi@wo@nU_UzN_LfTsN|FoHnDsMTkJiAgJ{DwJcY{_@yH}D_Fp@uDs@eAmEp@eCdJqHde@q]~oAsn@ho@qYlt@oT`UiI|`Bos@|m@_Xr[}KtmDuu@jkEa_A|aEo{@dxBge@`PqCv]aCdNGzOGl^Kte@Xnx@g@d_DNfzA?pRPza@`@bXrB~XfEbVx@lUgApb@qHhhBmTx~AkLp{AaMtVY~Rl@rRxAbQ|C|nA~Ml}@lJ~_@hArVy@hVmCdQqDtUwHn[_PxnA{`Ab`@gWpVeJdSaEfP}AbTUxy@XbWaAlm@eLp\\\\aI|R}Hpi@y^dW_NzMyExb@mIvg@{B`w@sB|f@yCjRaEfXiKds@ud@l^}UbVcMn_@eNfb@kZpj@g\\\\bfBydAx[eQbV_L`TyNxm@wa@nSwS~GwJfRea@bIcXn_@_qAzTyp@pTa]`}@c_A|WyXpR{Ph[kQbn@oRr\\\\cFh^c@tf@hFb[bFz~AtVrmA`R~gBzXjg@fGzVFzNgAdO{B`_@oK~|Aaf@bgA_]tn@{RbjAm\\\\pOmB`\\\\u@xgBzE~_BhE`[Z`O`ApR`@~Us@j`A{OtkAiTrwAiW~`AiQjn@wKnYkE`Lo@z[Tfd@zDny@~F`Vu@nP_CzZsJx[{RtTkL|VmHh_@qHfVgJlq@m^riC_uAlXcLp^_Hn_@aA~f@rBj`FfUfW`An^cAdPgC|VgHfoAso@prAmr@dPeKfOkNdJeLtKaS~HgT`FuSbHcXlGuPhMgTbZa[pNwLjOeJng@sPr{@wSfWcH`TcKlYyTjP}RtIyOb[ap@nb@sy@hIeP|Ts\\\\d]o_@`m@uq@xMqTpHoQlF}S`DkUhA{UK}VcA{k@mAas@yI}yEn@if@tGyd@|FwSpSgf@p\\\\mv@xGsSdGq\\\\~Dgp@zNw~BbJae@\\\\uEiCwDkCF{BbDf@`ExBrApTqD~ZiEfl@iLj{AiYr_A_QrXoFxMiAvIIbFqAlGcDhT}Bdx@aD~MM|PqAbG^~V|E|RfGda@bI`b@fIbZ|CtJdDzM`IeGzNgE|OyGp[mCxPeDb^sBbdABn@Rg@hEFI~OH~OtBpCFjEn@fA|LeGlL[vD|BzZdLh[tFzWmA~LNvL{@vFlAfGc@nDiBrBiEAyEFuF|@wAtG_CpDaBrCwF@Q\"\n" +
                "         },\n" +
                "         \"summary\" : \"Taj Express Highway/Yamuna Expy\",\n" +
                "         \"warnings\" : [],\n" +
                "         \"waypoint_order\" : []\n" +
                "      }\n" +
                "   ],\n" +
                "   \"status\" : \"OK\"\n" +
                "}\n"
    }
}