package com.instagram.api.schemas;

import X.0oU;
import X.DE6;
import X.DbY;
import X.Dbb;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum SmartReelType implements Parcelable {
    UNRECOGNIZED("SmartReelType_unspecified"),
    ANIMALS_AND_PETS("animal_and_pets"),
    BIRTHDAY_HIGHLIGHTS("birthday_highlights"),
    BOOMERANGS("boomerangs"),
    CULTURAL_MOMENT("cultural_moments"),
    END_OF_YEAR("end_of_year"),
    FEED_ANIMALS_AND_PETS("feed_animal_and_pets"),
    FEED_FIT_ANIMAL_AND_PETS("feed_fit_animal_and_pets"),
    FEED_FIT_CHILDREN_AND_PARENTING("feed_fit_children_and_parenting"),
    FEED_FIT_FASHION_AND_STYLE("feed_fit_fashion_and_style"),
    FEED_FIT_FITNESS_AND_WORKOUTS("feed_fit_fitness_and_workouts"),
    FEED_FIT_FOOD_AND_DRINK("feed_fit_food_and_drink"),
    FEED_FIT_HOLIDAY_AND_CELEBRATION("feed_fit_holiday_and_celebration"),
    FEED_FIT_HOME_AND_GARDEN("feed_fit_home_and_garden"),
    FEED_FIT_SPORTS("feed_fit_sports"),
    FEED_FIT_TRAVEL("feed_fit_travel"),
    FEED_FIT_VISUALARTS("feed_fit_visualarts"),
    FEED_FOOD_AND_DRINK("feed_food_and_drink"),
    FEED_HASHTAG("feed_hashtag"),
    FEED_MEMORABLE_MOMENTS("feed_memorable_moments"),
    FEED_MENTION("feed_mention"),
    FEED_OUTDOOR("feed_outdoor"),
    FEED_PEOPLE("feed_people"),
    FEED_SELFIE("feed_selfie"),
    FEED_VIRAL_MOMENTS("feed_viral_moments"),
    FEED_WEEKENDS("feed_weekends"),
    FIT_ANIMAL_AND_PETS("fit_animal_and_pets"),
    FIT_ANIMAL_AND_PETS_3D("fit_animal_and_pets_3d"),
    FIT_CHILDREN_AND_PARENTING("fit_children_and_parenting"),
    FIT_CHILDREN_AND_PARENTING_3D("fit_children_and_parenting_3d"),
    FIT_FASHION_AND_STYLE("fit_fashion_and_style"),
    FIT_FASHION_AND_STYLE_3D("fit_fashion_and_style_3d"),
    FIT_FITNESS_AND_WORKOUTS("fit_fitness_and_workouts"),
    FIT_FITNESS_AND_WORKOUTS_3D("fit_fitness_and_workouts_3d"),
    FIT_FOOD_AND_DRINK("fit_food_and_drink"),
    FIT_FOOD_AND_DRINK_3D("fit_food_and_drink_3d"),
    FIT_GAMES_PUZZLES_AND_PLAY("fit_games_puzzles_and_play"),
    FIT_HOLIDAY_AND_CELEBRATION("fit_holiday_and_celebration"),
    FIT_HOLIDAY_AND_CELEBRATION_3D("fit_holiday_and_celebration_3d"),
    FIT_HOME_AND_GARDEN("fit_home_and_garden"),
    FIT_HOME_AND_GARDEN_3D("fit_home_and_garden_3d"),
    FIT_MUSIC_AND_AUDIO("fit_music_and_audio"),
    FIT_PERFORMINGARTS("fit_performingarts"),
    FIT_RELATIONSHIPS("fit_relationships"),
    FIT_SPORTS("fit_sports"),
    FIT_SPORTS_3D("fit_sports_3d"),
    FIT_TRANSPORTATION("fit_transportation"),
    FIT_TRAVEL("fit_travel"),
    FIT_TRAVEL_3D("fit_travel_3d"),
    FIT_TV_AND_MOVIES("fit_tv_and_movies"),
    FIT_VISUALARTS("fit_visualarts"),
    FOLLOW_VERSARIES("follow_versaries"),
    FOOD("food"),
    FOOD_AND_DRINK("food_and_drink"),
    FRIENDSHIP("friendship"),
    HASHTAG("hashtag"),
    HEARTS("hearts"),
    MEMORABLE_MOMENTS("memorable_moments"),
    MENTION("mention"),
    MENTION_3D("mention_3d"),
    MONTHS("months"),
    A12(""),
    OUTDOOR("outdoor"),
    PEOPLE("people"),
    PEOPLE_3D("people_3d"),
    POLLS("polls"),
    POPULAR("popular"),
    SELFIE("selfie"),
    SELFIE_3D("selfie_3d"),
    SHOP("shop"),
    STRICT_MULTI_FORMAT_ANIMALS_AND_PETS("strict_multi_format_animal_and_pets"),
    STRICT_MULTI_FORMAT_FIT_ANIMAL_AND_PETS("strict_multi_format_fit_animal_and_pets"),
    STRICT_MULTI_FORMAT_FIT_CHILDREN_AND_PARENTING("strict_multi_format_fit_children_and_parenting"),
    STRICT_MULTI_FORMAT_FIT_FASHION_AND_STYLE("strict_multi_format_fit_fashion_and_style"),
    STRICT_MULTI_FORMAT_FIT_FITNESS_AND_WORKOUTS("strict_multi_format_fit_fitness_and_workouts"),
    STRICT_MULTI_FORMAT_FIT_FOOD_AND_DRINK("strict_multi_format_fit_food_and_drink"),
    STRICT_MULTI_FORMAT_FIT_HOLIDAY_AND_CELEBRATION("strict_multi_format_fit_holiday_and_celebration"),
    STRICT_MULTI_FORMAT_FIT_HOME_AND_GARDEN("strict_multi_format_fit_home_and_garden"),
    STRICT_MULTI_FORMAT_FIT_SPORTS("strict_multi_format_fit_sports"),
    STRICT_MULTI_FORMAT_FIT_TRAVEL("strict_multi_format_fit_travel"),
    STRICT_MULTI_FORMAT_FIT_VISUALARTS("strict_multi_format_fit_visualarts"),
    STRICT_MULTI_FORMAT_FOOD_AND_DRINK("strict_multi_format_food_and_drink"),
    STRICT_MULTI_FORMAT_HASHTAG("strict_multi_format_hashtag"),
    STRICT_MULTI_FORMAT_MEMORABLE_MOMENTS("strict_multi_format_memorable_moments"),
    STRICT_MULTI_FORMAT_MENTION("strict_multi_format_mention"),
    STRICT_MULTI_FORMAT_OUTDOOR("strict_multi_format_outdoor"),
    STRICT_MULTI_FORMAT_PEOPLE("strict_multi_format_people"),
    STRICT_MULTI_FORMAT_SELFIE("strict_multi_format_selfie"),
    STRICT_MULTI_FORMAT_VIRAL_MOMENTS("strict_multi_format_viral_moments"),
    STRICT_MULTI_FORMAT_WEEKENDS("strict_multi_format_weekends"),
    TEST_3D("test_3d"),
    TRIPS("trips"),
    VIRAL_MOMENTS("viral_moments"),
    WEEKENDS("weekends"),
    WEEKLY_MEMORY("weekly_memory");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        SmartReelType[] smartReelTypeArr;
        A02 = 0oU.A00(smartReelTypeArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(DbY.A00(r3));
        for (SmartReelType smartReelType : values()) {
            linkedHashMap.put(smartReelType.A00, smartReelType);
        }
        A01 = linkedHashMap;
        CREATOR = new DE6(82);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    SmartReelType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
