package com.instagram.debug.devoptions.section.localinjection.datastore;

import X.0oU;
import X.0qQ;
import X.AnonymousClass7TG;
import X.JTT;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class LocalMediaInjectionConstants {
    public static final String CONTENT_TYPE_KEY = "content_type_key";
    public static final String ID_REELS_CAROUSEL_WITH_MUSIC = "clips_mixed_media_carousel_with_music";
    public static final String ID_REELS_PHOTO = "clips_mixed_media_photo";
    public static final String ID_REELS_PHOTO_CAROUSEL = "clips_mixed_media_photo_carousel";
    public static final String ID_REELS_PHOTO_WITH_MUSIC = "clips_mixed_media_photo_with_music";
    public static final String ID_REELS_UNAVAILABLE = "clips_unavailable";
    public static final String ID_REELS_VIDEO_AND_PHOTO_CAROUSEL = "clips_mixed_media_video_and_photo_carousel";
    public static final String ID_REELS_VIDEO_CAROUSEL = "clips_mixed_media_video_carousel";
    public static final LocalMediaInjectionConstants INSTANCE = new Object();

    public enum InjectionContentType {
        FEED_ADS("Feed Ads"),
        FEED_NETEGO("Feed Netego"),
        STORIES_ADS("Stories Ads"),
        STORIES_NETEGO("Stories Netego"),
        REELS_ADS("Reels Ads"),
        REELS_ORGANIC("Organic Reels"),
        THREADS_ADS("Threads Ads");
        
        public static final Companion Companion = null;
        public static final Map reverseMap = null;
        public final String value;

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        /* JADX WARNING: type inference failed for: r0v9, types: [java.lang.Object, com.instagram.debug.devoptions.section.localinjection.datastore.LocalMediaInjectionConstants$InjectionContentType$Companion] */
        /* access modifiers changed from: public */
        static {
            InjectionContentType[] $values;
            $ENTRIES = 0oU.A00($values);
            Companion = new Object();
            EnumEntries entries = getEntries();
            LinkedHashMap linkedHashMap = new LinkedHashMap(JTT.A08(entries));
            for (Object next : entries) {
                linkedHashMap.put(((InjectionContentType) next).value, next);
            }
            reverseMap = linkedHashMap;
        }

        public final String getValue() {
            return this.value;
        }

        /* access modifiers changed from: public */
        InjectionContentType(String str) {
            this.value = str;
        }

        public final class Companion {
            public final InjectionContentType fromValue(String str) {
                0qQ.A0B(str, 0);
                return (InjectionContentType) InjectionContentType.reverseMap.get(str);
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }
    }

    public final class InjectionGroup {
        public final String name;
        public final List options;

        public final String getName() {
            return this.name;
        }

        public final List getOptions() {
            return this.options;
        }

        public InjectionGroup(String str, List list) {
            AnonymousClass7TG.A1O(str, list);
            this.name = str;
            this.options = list;
        }
    }
}
