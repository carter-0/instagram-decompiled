package com.instagram.direct.messagethread.voice;

import X.0nA;
import X.0qQ;
import X.AnonymousClass1GB;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C242553Us;
import X.C252063oV;
import X.C255943uy;
import X.C270354gb;
import X.C308486Ul;
import X.C320056rh;
import X.C328047Df;
import X.C61084JwM;
import X.C66802Mco;
import X.C66805Mcr;
import X.C66806Mcs;
import X.C68174N3p;
import X.C68888NaQ;
import X.C68889NaR;
import X.C68890NaS;
import X.C70564OBm;
import X.C71399Ojy;
import X.C71408Ok7;
import X.DbS;
import X.DbU;
import X.DbW;
import X.Dbb;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.HashMap;

public final class VoiceMessageControlsView extends ConstraintLayout {
    public C66805Mcr A00;
    public C70564OBm A01 = C68889NaR.A00;
    public int A02 = -16777216;
    public int A03 = -16777216;
    public IgTextView A04;
    public final C270354gb A05;
    public final C252063oV A06;
    public final C252063oV A07;
    public final C252063oV A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VoiceMessageControlsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
        C270354gb r1 = new C270354gb();
        this.A05 = r1;
        View.inflate(context, R.layout.voice_message_controls, this);
        this.A06 = DbU.A0Z(this, R.id.voice_message_playback_speed_button);
        this.A07 = DbU.A0Z(this, R.id.voice_message_transcription_button);
        this.A08 = DbU.A0Z(this, R.id.voice_message_transcription_loading_icon);
        r1.A0I(this);
    }

    public final void setupView(C61084JwM jwM) {
        0qQ.A0B(jwM, 0);
        C66805Mcr mcr = (C66805Mcr) jwM.A00;
        if (mcr != null) {
            setupPlaybackSpeed(mcr);
        }
        C66806Mcs mcs = (C66806Mcs) jwM.A01;
        if (mcs != null) {
            C270354gb r1 = this.A05;
            C270354gb.A02(r1, R.id.voice_message_controls_button_container).A05.A03 = 0;
            C270354gb.A02(r1, R.id.message_content_voice_playback_timer).A05.A03 = 0;
            setupTimer(mcs);
        }
        C68174N3p n3p = (C68174N3p) jwM.A02;
        if (n3p != null) {
            C270354gb r12 = this.A05;
            C270354gb.A02(r12, R.id.voice_message_controls_button_container).A05.A03 = 0;
            C270354gb.A02(r12, R.id.voice_message_transcription_button).A05.A03 = 0;
            setupTranscriptionButton(n3p);
        } else if (mcr == null) {
            return;
        }
        Dbb.A0t(this, R.id.voice_message_controls_button_container, 0);
    }

    private final ShapeDrawable A00(Integer num) {
        C242553Us r2 = new C242553Us();
        Context A0S = AnonymousClass7TE.A0S(this);
        r2.A06(0nA.A00(A0S, A0S.getResources().getDimension(R.dimen.album_music_sticker_text_vertical_padding)));
        ShapeDrawable shapeDrawable = new ShapeDrawable(new C328047Df(r2, 126));
        if (num == null) {
            C308486Ul.A02(Paint.Style.FILL, shapeDrawable, shapeDrawable.getShape(), 0.0f, -16777216);
            shapeDrawable.setAlpha(51);
        } else {
            int intValue = num.intValue();
            C308486Ul.A02(Paint.Style.FILL, shapeDrawable, shapeDrawable.getShape(), 0.0f, intValue);
        }
        shapeDrawable.setIntrinsicWidth(DbS.A03(A0S.getResources(), R.dimen.ai_sticker_creation_suggested_prompt_pill_height));
        return shapeDrawable;
    }

    private final void A01() {
        C66805Mcr mcr = this.A00;
        if (mcr != null) {
            IgImageView view = this.A06.getView();
            view.setOnClickListener(new C71399Ojy(22, view, this, mcr));
            view.setBackground(A00(Integer.valueOf(mcr.A01)));
            A02(view, (C66802Mco) mcr.A04);
            view.setColorFilter(mcr.A02, PorterDuff.Mode.SRC_IN);
        }
    }

    public static final void A02(IgImageView igImageView, C66802Mco mco) {
        igImageView.setImageResource(mco.A01);
        Context context = igImageView.getContext();
        String A0d = AnonymousClass7TF.A0d(context.getResources(), mco.A02);
        igImageView.setContentDescription(AnonymousClass7TF.A0e(context.getResources(), A0d, 2131960591));
        igImageView.setTag(A0d);
    }

    /* access modifiers changed from: private */
    public final void setTranscriptionState(C70564OBm oBm) {
        C255943uy r0;
        this.A01 = oBm;
        int i = 0;
        this.A07.getView().setVisibility(DbW.A01(oBm.A00 ? 1 : 0));
        C252063oV r2 = this.A08;
        View view = r2.getView();
        if (!oBm.A01) {
            i = 8;
        }
        view.setVisibility(i);
        SpinnerImageView spinnerImageView = (SpinnerImageView) r2.getView();
        if (oBm.equals(C68890NaS.A00)) {
            r0 = C255943uy.LOADING;
        } else {
            r0 = C255943uy.SUCCESS;
        }
        spinnerImageView.setLoadingStatus(r0);
    }

    private final void setupPlaybackSpeed(C66805Mcr mcr) {
        this.A00 = mcr;
        if (this.A06.CVM()) {
            A01();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r1 != null) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void setupTimer(X.C66806Mcs r3) {
        /*
            r2 = this;
            com.instagram.common.ui.base.IgTextView r1 = r2.A04
            if (r1 != 0) goto L_0x000f
            r0 = 2131436197(0x7f0b22a5, float:1.8494258E38)
            com.instagram.common.ui.base.IgTextView r1 = X.DbT.A0a(r2, r0)
            r2.A04 = r1
            if (r1 == 0) goto L_0x0014
        L_0x000f:
            int r0 = r3.A00
            r1.setTextColor(r0)
        L_0x0014:
            com.instagram.common.ui.base.IgTextView r0 = r2.A04
            X.AnonymousClass7TF.A16(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.messagethread.voice.VoiceMessageControlsView.setupTimer(X.Mcs):void");
    }

    private final void setupTranscriptionButton(C68174N3p n3p) {
        int i = n3p.A03;
        this.A03 = i;
        int i2 = n3p.A01;
        this.A02 = i2;
        C252063oV r4 = this.A07;
        r4.getView().setOnClickListener(new C71408Ok7(40, (Object) this, (Object) n3p));
        setTranscriptionState((C70564OBm) n3p.A05);
        C70564OBm oBm = this.A01;
        C68888NaQ naQ = C68888NaQ.A00;
        if (!0qQ.A0K(oBm, naQ)) {
            i = n3p.A02;
        }
        if (!0qQ.A0K(this.A01, naQ)) {
            i2 = n3p.A00;
        }
        r4.getView().setBackground(A00(Integer.valueOf(i2)));
        ((ImageView) r4.getView()).setColorFilter(i, PorterDuff.Mode.SRC_IN);
    }

    public final void A0D() {
        setTranscriptionState(C68888NaQ.A00);
        int i = this.A03;
        int i2 = this.A02;
        C252063oV r2 = this.A07;
        r2.getView().setBackground(A00(Integer.valueOf(i2)));
        ((ImageView) r2.getView()).setColorFilter(i, PorterDuff.Mode.SRC_IN);
    }

    public final void A0E(C66802Mco mco, boolean z) {
        C270354gb r5;
        if (this.A00 != null) {
            C252063oV r3 = this.A06;
            if (!r3.CVM()) {
                A01();
            }
            r3.getView().setVisibility(DbW.A01(z ? 1 : 0));
            if (z && mco != null) {
                ((ImageView) r3.getView()).setImageResource(mco.A01);
                C66805Mcr mcr = this.A00;
                if (mcr != null) {
                    ((ImageView) r3.getView()).setColorFilter(mcr.A02, PorterDuff.Mode.SRC_IN);
                }
            }
        }
        if (this.A06.CVM() && this.A07.CVM()) {
            if (z) {
                r5 = new C270354gb();
                C270354gb r0 = this.A05;
                HashMap hashMap = r5.A00;
                hashMap.clear();
                HashMap hashMap2 = r0.A00;
                for (Object next : hashMap2.keySet()) {
                    C320056rh r02 = (C320056rh) hashMap2.get(next);
                    if (r02 != null) {
                        hashMap.put(next, r02.clone());
                    }
                }
                Context A0S = AnonymousClass7TE.A0S(this);
                r5.A0E(R.id.message_content_voice_playback_timer, 6, R.id.voice_message_controls_button_container, 7, DbS.A02(A0S, 2));
                r5.A0C(R.id.message_content_voice_playback_timer, 4, 0, 4);
                r5.A0C(R.id.voice_message_controls_button_container, 3, 0, 3);
                r5.A0E(R.id.voice_message_controls_button_container, 7, R.id.message_content_voice_playback_timer, 6, DbS.A02(A0S, 2));
            } else {
                r5 = this.A05;
            }
            r5.A0G(this);
        }
    }

    public final void setTimerValueMs(long j) {
        int i;
        IgTextView igTextView = this.A04;
        if (igTextView != null) {
            int i2 = 0;
            if (j < 0) {
                i = 0;
            } else {
                int A012 = AnonymousClass1GB.A01(((float) j) / 1000.0f);
                i2 = A012 / 60;
                i = A012 % 60;
            }
            igTextView.setText(StringFormatUtil.formatStrLocaleSafe("%d:%02d", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }
}
