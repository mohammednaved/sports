package com.example.sport.data.remote;

import android.os.Parcel;
import android.os.Parcelable;

import com.squareup.moshi.Json;

public class Team implements Parcelable {

	@Json(name = "intStadiumCapacity")
	private String intStadiumCapacity;

	@Json(name = "strTeamShort")
	private String strTeamShort;

	@Json(name = "idLeague3")
	private String idLeague3;

	@Json(name = "idLeague2")
	private String idLeague2;

	@Json(name = "idLeague5")
	private String idLeague5;

	@Json(name = "strSport")
	private String strSport;

	@Json(name = "idLeague4")
	private String idLeague4;

	@Json(name = "idLeague7")
	private Object idLeague7;

	@Json(name = "strDescriptionCN")
	private Object strDescriptionCN;

	@Json(name = "idLeague6")
	private Object idLeague6;

	@Json(name = "strTeamJersey")
	private String strTeamJersey;

	@Json(name = "strTeamFanart2")
	private String strTeamFanart2;

	@Json(name = "strTeamFanart3")
	private String strTeamFanart3;

	@Json(name = "strTeamFanart4")
	private String strTeamFanart4;

	@Json(name = "strStadiumDescription")
	private String strStadiumDescription;

	@Json(name = "strTeamFanart1")
	private String strTeamFanart1;

	@Json(name = "intLoved")
	private String intLoved;

	@Json(name = "idLeague")
	private String idLeague;

	@Json(name = "idSoccerXML")
	private String idSoccerXML;

	@Json(name = "strTeamLogo")
	private String strTeamLogo;

	@Json(name = "strDescriptionSE")
	private Object strDescriptionSE;

	@Json(name = "strDescriptionJP")
	private String strDescriptionJP;

	@Json(name = "strDescriptionFR")
	private String strDescriptionFR;

	@Json(name = "strStadiumLocation")
	private String strStadiumLocation;

	@Json(name = "strDescriptionNL")
	private Object strDescriptionNL;

	@Json(name = "strCountry")
	private String strCountry;

	@Json(name = "strRSS")
	private String strRSS;

	@Json(name = "strDescriptionRU")
	private String strDescriptionRU;

	@Json(name = "strTeamBanner")
	private String strTeamBanner;

	@Json(name = "strDescriptionNO")
	private String strDescriptionNO;

	@Json(name = "strStadiumThumb")
	private String strStadiumThumb;

	@Json(name = "strDescriptionES")
	private String strDescriptionES;

	@Json(name = "intFormedYear")
	private String intFormedYear;

	@Json(name = "strInstagram")
	private String strInstagram;

	@Json(name = "strDescriptionIT")
	private String strDescriptionIT;

	@Json(name = "idTeam")
	private String idTeam;

	@Json(name = "strDescriptionEN")
	private String strDescriptionEN;

	@Json(name = "strWebsite")
	private String strWebsite;

	@Json(name = "strYoutube")
	private String strYoutube;

	@Json(name = "strDescriptionIL")
	private Object strDescriptionIL;

	@Json(name = "idAPIfootball")
	private String idAPIfootball;

	@Json(name = "strLocked")
	private String strLocked;

	@Json(name = "strAlternate")
	private String strAlternate;

	@Json(name = "strTeam")
	private String strTeam;

	@Json(name = "strTwitter")
	private String strTwitter;

	@Json(name = "strDescriptionHU")
	private Object strDescriptionHU;

	@Json(name = "strGender")
	private String strGender;

	@Json(name = "strDivision")
	private Object strDivision;

	@Json(name = "strStadium")
	private String strStadium;

	@Json(name = "strFacebook")
	private String strFacebook;

	@Json(name = "strTeamBadge")
	private String strTeamBadge;

	@Json(name = "strLeague2")
	private String strLeague2;

	@Json(name = "strLeague3")
	private String strLeague3;

	@Json(name = "strLeague4")
	private String strLeague4;

	@Json(name = "strLeague5")
	private String strLeague5;

	@Json(name = "strDescriptionPT")
	private String strDescriptionPT;

	@Json(name = "strLeague6")
	private Object strLeague6;

	@Json(name = "strDescriptionDE")
	private String strDescriptionDE;

	@Json(name = "strLeague7")
	private Object strLeague7;

	@Json(name = "strLeague")
	private String strLeague;

	@Json(name = "strManager")
	private String strManager;

	@Json(name = "strKeywords")
	private String strKeywords;

	@Json(name = "strDescriptionPL")
	private Object strDescriptionPL;

	protected Team(Parcel in) {
		intStadiumCapacity = in.readString();
		strTeamShort = in.readString();
		idLeague3 = in.readString();
		idLeague2 = in.readString();
		idLeague5 = in.readString();
		strSport = in.readString();
		idLeague4 = in.readString();
		strTeamJersey = in.readString();
		strTeamFanart2 = in.readString();
		strTeamFanart3 = in.readString();
		strTeamFanart4 = in.readString();
		strStadiumDescription = in.readString();
		strTeamFanart1 = in.readString();
		intLoved = in.readString();
		idLeague = in.readString();
		idSoccerXML = in.readString();
		strTeamLogo = in.readString();
		strDescriptionJP = in.readString();
		strDescriptionFR = in.readString();
		strStadiumLocation = in.readString();
		strCountry = in.readString();
		strRSS = in.readString();
		strDescriptionRU = in.readString();
		strTeamBanner = in.readString();
		strDescriptionNO = in.readString();
		strStadiumThumb = in.readString();
		strDescriptionES = in.readString();
		intFormedYear = in.readString();
		strInstagram = in.readString();
		strDescriptionIT = in.readString();
		idTeam = in.readString();
		strDescriptionEN = in.readString();
		strWebsite = in.readString();
		strYoutube = in.readString();
		idAPIfootball = in.readString();
		strLocked = in.readString();
		strAlternate = in.readString();
		strTeam = in.readString();
		strTwitter = in.readString();
		strGender = in.readString();
		strStadium = in.readString();
		strFacebook = in.readString();
		strTeamBadge = in.readString();
		strLeague2 = in.readString();
		strLeague3 = in.readString();
		strLeague4 = in.readString();
		strLeague5 = in.readString();
		strDescriptionPT = in.readString();
		strDescriptionDE = in.readString();
		strLeague = in.readString();
		strManager = in.readString();
		strKeywords = in.readString();
	}

	public static final Creator<Team> CREATOR = new Creator<Team>() {
		@Override
		public Team createFromParcel(Parcel in) {
			return new Team(in);
		}

		@Override
		public Team[] newArray(int size) {
			return new Team[size];
		}
	};

	public String getIntStadiumCapacity(){
		return intStadiumCapacity;
	}

	public String getStrTeamShort(){
		return strTeamShort;
	}

	public String getIdLeague3(){
		return idLeague3;
	}

	public String getIdLeague2(){
		return idLeague2;
	}

	public String getIdLeague5(){
		return idLeague5;
	}

	public String getStrSport(){
		return strSport;
	}

	public String getIdLeague4(){
		return idLeague4;
	}

	public Object getIdLeague7(){
		return idLeague7;
	}

	public Object getStrDescriptionCN(){
		return strDescriptionCN;
	}

	public Object getIdLeague6(){
		return idLeague6;
	}

	public String getStrTeamJersey(){
		return strTeamJersey;
	}

	public String getStrTeamFanart2(){
		return strTeamFanart2;
	}

	public String getStrTeamFanart3(){
		return strTeamFanart3;
	}

	public String getStrTeamFanart4(){
		return strTeamFanart4;
	}

	public String getStrStadiumDescription(){
		return strStadiumDescription;
	}

	public String getStrTeamFanart1(){
		return strTeamFanart1;
	}

	public String getIntLoved(){
		return intLoved;
	}

	public String getIdLeague(){
		return idLeague;
	}

	public String getIdSoccerXML(){
		return idSoccerXML;
	}

	public String getStrTeamLogo(){
		return strTeamLogo;
	}

	public Object getStrDescriptionSE(){
		return strDescriptionSE;
	}

	public String getStrDescriptionJP(){
		return strDescriptionJP;
	}

	public String getStrDescriptionFR(){
		return strDescriptionFR;
	}

	public String getStrStadiumLocation(){
		return strStadiumLocation;
	}

	public Object getStrDescriptionNL(){
		return strDescriptionNL;
	}

	public String getStrCountry(){
		return strCountry;
	}

	public String getStrRSS(){
		return strRSS;
	}

	public String getStrDescriptionRU(){
		return strDescriptionRU;
	}

	public String getStrTeamBanner(){
		return strTeamBanner;
	}

	public String getStrDescriptionNO(){
		return strDescriptionNO;
	}

	public String getStrStadiumThumb(){
		return strStadiumThumb;
	}

	public String getStrDescriptionES(){
		return strDescriptionES;
	}

	public String getIntFormedYear(){
		return intFormedYear;
	}

	public String getStrInstagram(){
		return strInstagram;
	}

	public String getStrDescriptionIT(){
		return strDescriptionIT;
	}

	public String getIdTeam(){
		return idTeam;
	}

	public String getStrDescriptionEN(){
		return strDescriptionEN;
	}

	public String getStrWebsite(){
		return strWebsite;
	}

	public String getStrYoutube(){
		return strYoutube;
	}

	public Object getStrDescriptionIL(){
		return strDescriptionIL;
	}

	public String getIdAPIfootball(){
		return idAPIfootball;
	}

	public String getStrLocked(){
		return strLocked;
	}

	public String getStrAlternate(){
		return strAlternate;
	}

	public String getStrTeam(){
		return strTeam;
	}

	public String getStrTwitter(){
		return strTwitter;
	}

	public Object getStrDescriptionHU(){
		return strDescriptionHU;
	}

	public String getStrGender(){
		return strGender;
	}

	public Object getStrDivision(){
		return strDivision;
	}

	public String getStrStadium(){
		return strStadium;
	}

	public String getStrFacebook(){
		return strFacebook;
	}

	public String getStrTeamBadge(){
		return strTeamBadge;
	}

	public String getStrLeague2(){
		return strLeague2;
	}

	public String getStrLeague3(){
		return strLeague3;
	}

	public String getStrLeague4(){
		return strLeague4;
	}

	public String getStrLeague5(){
		return strLeague5;
	}

	public String getStrDescriptionPT(){
		return strDescriptionPT;
	}

	public Object getStrLeague6(){
		return strLeague6;
	}

	public String getStrDescriptionDE(){
		return strDescriptionDE;
	}

	public Object getStrLeague7(){
		return strLeague7;
	}

	public String getStrLeague(){
		return strLeague;
	}

	public String getStrManager(){
		return strManager;
	}

	public String getStrKeywords(){
		return strKeywords;
	}

	public Object getStrDescriptionPL(){
		return strDescriptionPL;
	}

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeString(intStadiumCapacity);
		dest.writeString(strTeamShort);
		dest.writeString(idLeague3);
		dest.writeString(idLeague2);
		dest.writeString(idLeague5);
		dest.writeString(strSport);
		dest.writeString(idLeague4);
		dest.writeString(strTeamJersey);
		dest.writeString(strTeamFanart2);
		dest.writeString(strTeamFanart3);
		dest.writeString(strTeamFanart4);
		dest.writeString(strStadiumDescription);
		dest.writeString(strTeamFanart1);
		dest.writeString(intLoved);
		dest.writeString(idLeague);
		dest.writeString(idSoccerXML);
		dest.writeString(strTeamLogo);
		dest.writeString(strDescriptionJP);
		dest.writeString(strDescriptionFR);
		dest.writeString(strStadiumLocation);
		dest.writeString(strCountry);
		dest.writeString(strRSS);
		dest.writeString(strDescriptionRU);
		dest.writeString(strTeamBanner);
		dest.writeString(strDescriptionNO);
		dest.writeString(strStadiumThumb);
		dest.writeString(strDescriptionES);
		dest.writeString(intFormedYear);
		dest.writeString(strInstagram);
		dest.writeString(strDescriptionIT);
		dest.writeString(idTeam);
		dest.writeString(strDescriptionEN);
		dest.writeString(strWebsite);
		dest.writeString(strYoutube);
		dest.writeString(idAPIfootball);
		dest.writeString(strLocked);
		dest.writeString(strAlternate);
		dest.writeString(strTeam);
		dest.writeString(strTwitter);
		dest.writeString(strGender);
		dest.writeString(strStadium);
		dest.writeString(strFacebook);
		dest.writeString(strTeamBadge);
		dest.writeString(strLeague2);
		dest.writeString(strLeague3);
		dest.writeString(strLeague4);
		dest.writeString(strLeague5);
		dest.writeString(strDescriptionPT);
		dest.writeString(strDescriptionDE);
		dest.writeString(strLeague);
		dest.writeString(strManager);
		dest.writeString(strKeywords);
	}
}