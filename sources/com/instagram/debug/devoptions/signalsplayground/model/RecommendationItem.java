package com.instagram.debug.devoptions.signalsplayground.model;

import X.0qQ;
import X.C16181Uq6;
import X.C267324bN;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class RecommendationItem {

    public final class AudioRecommendation extends RecommendationItem {
        public final C16181Uq6 audioItem;

        public AudioRecommendation(C16181Uq6 uq6) {
            0qQ.A0B(uq6, 1);
            this.audioItem = uq6;
        }

        public final C16181Uq6 component1() {
            return this.audioItem;
        }

        public final AudioRecommendation copy(C16181Uq6 uq6) {
            0qQ.A0B(uq6, 0);
            return new AudioRecommendation(uq6);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof AudioRecommendation) && 0qQ.A0K(this.audioItem, ((AudioRecommendation) obj).audioItem));
        }

        public int hashCode() {
            return this.audioItem.hashCode();
        }

        public String toString() {
            return super.toString();
        }

        public static /* synthetic */ AudioRecommendation copy$default(AudioRecommendation audioRecommendation, C16181Uq6 uq6, int i, Object obj) {
            if ((i & 1) != 0) {
                uq6 = audioRecommendation.audioItem;
            }
            0qQ.A0B(uq6, 0);
            return new AudioRecommendation(uq6);
        }

        public final C16181Uq6 getAudioItem() {
            return this.audioItem;
        }
    }

    public final class ClipsRecommendation extends RecommendationItem {
        public final C267324bN clipsItem;

        public ClipsRecommendation(C267324bN r2) {
            0qQ.A0B(r2, 1);
            this.clipsItem = r2;
        }

        public final C267324bN component1() {
            return this.clipsItem;
        }

        public final ClipsRecommendation copy(C267324bN r2) {
            0qQ.A0B(r2, 0);
            return new ClipsRecommendation(r2);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof ClipsRecommendation) && 0qQ.A0K(this.clipsItem, ((ClipsRecommendation) obj).clipsItem));
        }

        public int hashCode() {
            return this.clipsItem.hashCode();
        }

        public String toString() {
            return super.toString();
        }

        public static /* synthetic */ ClipsRecommendation copy$default(ClipsRecommendation clipsRecommendation, C267324bN r2, int i, Object obj) {
            if ((i & 1) != 0) {
                r2 = clipsRecommendation.clipsItem;
            }
            0qQ.A0B(r2, 0);
            return new ClipsRecommendation(r2);
        }

        public final C267324bN getClipsItem() {
            return this.clipsItem;
        }
    }

    public /* synthetic */ RecommendationItem(DefaultConstructorMarker defaultConstructorMarker) {
    }

    public RecommendationItem() {
    }
}
