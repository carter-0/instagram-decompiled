package X;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.xapp.messaging.audio.waveforms.VoiceVisualizer;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.direct.messagethread.voice.VoiceMessageControlsView;
import com.instagram.direct.messagethread.voice.transcription.VoiceMessageTranscriptionTextView;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;

/* renamed from: X.Man  reason: case insensitive filesystem */
public final class C66680Man implements C328007Db, AnonymousClass7PN, C328017Dc, AnonymousClass7JP, C328027Dd {
    public int A00 = -16777216;
    public int A01 = -16777216;
    public Drawable A02;
    public Drawable A03;
    public C70762OKi A04;
    public C328657Fq A05;
    public 0sP A06;
    public C328087Dj A07;
    public final FrameLayout A08;
    public final VoiceVisualizer A09;
    public final IgImageView A0A;
    public final C252063oV A0B;
    public final VoiceMessageControlsView A0C;
    public final AnonymousClass0eM A0D;
    public final AnonymousClass0eM A0E;
    public final C70460O7l A0F;

    public C66680Man(View view, C70460O7l o7l) {
        0qQ.A0B(view, 1);
        this.A0F = o7l;
        this.A0B = DbU.A0Z(view, R.id.voice_message_transcription);
        this.A0C = (VoiceMessageControlsView) AnonymousClass7TF.A0F(view, R.id.voice_message_controls);
        this.A0E = C73920Pm0.A00(view, 21);
        this.A08 = (FrameLayout) AnonymousClass7TF.A0F(view, R.id.message_content_voice_bubble_container);
        this.A0A = DbX.A0b(view, R.id.playback_control);
        this.A09 = (VoiceVisualizer) AnonymousClass7TF.A0F(view, R.id.message_content_voice_visualizer);
        this.A0D = AnonymousClass1YB.A00(C66892Mea.A00);
        this.A06 = C74069PoY.A00;
    }

    public final void A01(N4D n4d, DirectMessageIdentifier directMessageIdentifier) {
        C328657Fq r0 = this.A05;
        if (r0 != null && r0.A07.A02(directMessageIdentifier)) {
            ((VoiceMessageTranscriptionTextView) this.A0B.getView()).setStatus(A00(n4d, this));
            this.A0C.A0D();
        }
    }

    public final void APf(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        C70460O7l o7l = this.A0F;
        RectF A0F2 = 0nA.A0F(this.A09);
        float rawX = (motionEvent.getRawX() - A0F2.left) / A0F2.width();
        C331037Pg r1 = o7l.A00.A04;
        if (r1 != null) {
            r1.A04(AnonymousClass1GB.A01(rawX * ((float) r1.A02())));
        }
    }

    public final void Cwj() {
        this.A0A.setImageDrawable(this.A03);
        this.A09.A09 = false;
        this.A0C.A0E((C66802Mco) null, false);
    }

    public final void Cwk(int i, int i2, boolean z) {
        this.A09.setPlaybackPercentage(((float) i) / ((float) i2));
        if (i != i2) {
            i2 -= i;
        }
        this.A0C.setTimerValueMs((long) i2);
    }

    public final void DAV(float f, float f2) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        if (r4 != r0.A00) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean EsS(android.view.MotionEvent r5) {
        /*
            r4 = this;
            r0 = 0
            X.0qQ.A0B(r5, r0)
            X.O7l r0 = r4.A0F
            r3 = 1
            X.74o r0 = r0.A00
            X.7Pg r1 = r0.A04
            if (r1 == 0) goto L_0x003c
            X.Tol r0 = r1.A06
            if (r0 == 0) goto L_0x001e
            boolean r0 = r0.A01
            if (r0 != 0) goto L_0x001e
            X.OFQ r0 = r1.A02
            if (r0 == 0) goto L_0x001e
            X.7JP r0 = r0.A00
            r1 = 1
            if (r4 == r0) goto L_0x001f
        L_0x001e:
            r1 = 0
        L_0x001f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            if (r0 == 0) goto L_0x003c
            if (r1 != r3) goto L_0x003c
            com.facebook.xapp.messaging.audio.waveforms.VoiceVisualizer r0 = r4.A09
            android.graphics.RectF r2 = X.0nA.A0F(r0)
            float r1 = r5.getRawX()
            float r0 = r5.getRawY()
            boolean r0 = r2.contains(r1, r0)
            if (r0 == 0) goto L_0x003c
            return r3
        L_0x003c:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66680Man.EsS(android.view.MotionEvent):boolean");
    }

    public final boolean Esh() {
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.Nou, java.lang.Object] */
    public static final C69612Nou A00(N4D n4d, C66680Man man) {
        int A0M = AnonymousClass7TE.A0M(n4d.A01);
        boolean z = true;
        if (A0M == 2) {
            return new Object();
        }
        if (A0M == 3 || A0M == 1 || A0M == 0) {
            return C68893NaV.A00;
        }
        if (A0M == 4) {
            String str = n4d.A03;
            String str2 = (String) AnonymousClass7TE.A14(man.A0E);
            if (!n4d.A05 && !n4d.A04) {
                z = false;
            }
            return new C68892NaU(str, str2, man.A06, z);
        }
        throw AnonymousClass7TE.A1K();
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [X.Nou, java.lang.Object] */
    public final void A02(DirectMessageIdentifier directMessageIdentifier) {
        C328657Fq r0 = this.A05;
        if (r0 != null && r0.A07.A02(directMessageIdentifier)) {
            ((VoiceMessageTranscriptionTextView) this.A0B.getView()).setStatus(new Object());
            this.A0C.A0D();
        }
    }

    public final View BJd() {
        return this.A08;
    }

    public final C328087Dj BY0() {
        return this.A07;
    }

    public final void FHQ(int i) {
        AnonymousClass7PT.A00(this.A08.getBackground(), i);
        AnonymousClass7PT.A00(this.A0A.getDrawable(), i);
    }

    public final void EeT(C328087Dj r1) {
        this.A07 = r1;
    }
}
