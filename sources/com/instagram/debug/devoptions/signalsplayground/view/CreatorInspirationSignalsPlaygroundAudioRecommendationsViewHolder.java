package com.instagram.debug.devoptions.signalsplayground.view;

import X.AnonymousClass0fU;
import X.AnonymousClass0iw;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.AnonymousClass8ZH;
import X.AnonymousClass8ZI;
import X.C16181Uq6;
import X.C234502xy;
import X.C249703kE;
import X.C315536k3;
import X.C66580MXl;
import X.Dba;
import X.JTR;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import com.instagram.music.common.model.MusicDataSource;
import com.instagram.music.common.ui.MusicPreviewButton;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class CreatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder extends C249703kE {
    public static final Companion Companion = new Object();
    public static final int PREVIEW_TRACK_DURATION_MS = 30000;
    public final IgImageView albumArt;
    public C16181Uq6 audioTrackItem;
    public final IgImageView backgroundImageBlur;
    public final View container;
    public final IgdsMediaButton ctaButton;
    public final Delegate delegate;
    public final C234502xy musicPlayer;
    public final MusicPreviewButton musicPreviewButton;
    public final IgTextView primaryText;
    public final IgTextView secondaryText;
    public final IgTextView tertiaryText;
    public C315536k3 trackListener;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0010 */
        static {
            /*
                r3 = 3
                java.lang.Integer[] r0 = X.AnonymousClass05K.A00(r3)
                int r0 = r0.length
                int[] r2 = new int[r0]
                r1 = 0
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x000c }
            L_0x000c:
                r1 = 1
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2[r0] = r3     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                $EnumSwitchMapping$0 = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instagram.debug.devoptions.signalsplayground.view.CreatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder.WhenMappings.<clinit>():void");
        }
    }

    public interface Delegate {
        void onViewAudioDetailsClick(C16181Uq6 uq6);
    }

    public final void bind(C16181Uq6 uq6, int i, int i2, AnonymousClass0iw r6) {
        AnonymousClass7TF.A1C(uq6, 0, r6);
        this.audioTrackItem = uq6;
        C66580MXl.A1C(this.container, i);
        C66580MXl.A1B(this.container, i2);
        IgImageView igImageView = this.backgroundImageBlur;
        ImageUrl imageUrl = uq6.A01;
        igImageView.setUrl(imageUrl, r6);
        this.albumArt.setUrl(imageUrl, r6);
        bindTrackState(uq6.A02);
        this.trackListener = new CreatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder$createTrackListener$1(this, uq6);
        AnonymousClass0fU.A00(new CreatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder$bind$1(this, uq6), this.musicPreviewButton);
        this.primaryText.setText(uq6.A09);
        this.secondaryText.setText(uq6.A0A);
        this.tertiaryText.setText(uq6.A0B);
        AnonymousClass0fU.A00(new CreatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder$bind$2(this, uq6), this.ctaButton);
    }

    /* access modifiers changed from: private */
    public final void bindTrackState(MusicDataSource musicDataSource) {
        AnonymousClass8ZI r1;
        AnonymousClass8ZH r0;
        int intValue = this.musicPlayer.C9D(musicDataSource).intValue();
        if (intValue != 0) {
            MusicPreviewButton musicPreviewButton2 = this.musicPreviewButton;
            if (intValue != 1) {
                AnonymousClass8ZI r12 = musicPreviewButton2.A00;
                r12.A01(AnonymousClass8ZH.STOP);
                r12.A00(0.0f);
                return;
            }
            r1 = musicPreviewButton2.A00;
            r0 = AnonymousClass8ZH.LOADING;
        } else {
            r1 = this.musicPreviewButton.A00;
            r0 = AnonymousClass8ZH.PLAY;
        }
        r1.A01(r0);
    }

    private final C315536k3 createTrackListener(C16181Uq6 uq6) {
        return new CreatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder$createTrackListener$1(this, uq6);
    }

    public final C16181Uq6 getAudioTrackItem() {
        return this.audioTrackItem;
    }

    public final IgImageView getBackgroundImageBlur() {
        return this.backgroundImageBlur;
    }

    public final C315536k3 getTrackListener() {
        return this.trackListener;
    }

    public final void setAudioTrackItem(C16181Uq6 uq6) {
        this.audioTrackItem = uq6;
    }

    public final void setTrackListener(C315536k3 r1) {
        this.trackListener = r1;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder(View view, Delegate delegate2, C234502xy r4) {
        super(view);
        AnonymousClass7TG.A1U(view, delegate2, r4);
        this.delegate = delegate2;
        this.musicPlayer = r4;
        this.backgroundImageBlur = JTR.A0i(view, R.id.album_art_background_blur);
        this.container = AnonymousClass7TE.A0b(view, R.id.audio_recommendation_item_container);
        this.albumArt = JTR.A0i(view, R.id.album_art);
        this.musicPreviewButton = (MusicPreviewButton) AnonymousClass7TE.A0b(view, R.id.preview_button);
        this.primaryText = Dba.A0E(view, R.id.primary_text);
        this.secondaryText = Dba.A0E(view, R.id.secondary_text);
        this.tertiaryText = Dba.A0E(view, R.id.tertiary_text);
        this.ctaButton = (IgdsMediaButton) AnonymousClass7TE.A0b(view, R.id.cta_button);
    }

    public final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }
}
