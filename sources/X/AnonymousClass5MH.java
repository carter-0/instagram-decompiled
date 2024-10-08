package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableString;
import com.instagram.creation.capture.quickcapture.sundial.tts.intf.VoiceOption;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* renamed from: X.5MH  reason: invalid class name */
public final class AnonymousClass5MH extends C268694dq implements AnonymousClass5MI, C268684dp, AnonymousClass5MJ, AnonymousClass5MK, AnonymousClass5ML {
    public static final int A0D = AnonymousClass1GB.A01(127.5f);
    public int A00;
    public int A01;
    public C376699Iz A02;
    public Integer A03;
    public String A04;
    public int A05;
    public int A06;
    public Boolean A07;
    public boolean A08;
    public boolean A09;
    public final Drawable A0A;
    public final String A0B;
    public final Context A0C;

    public final void A9D(C41815B1v b1v) {
        0qQ.A0B(b1v, 0);
        Drawable drawable = this.A0A;
        if (drawable instanceof C268684dp) {
            ((C268684dp) drawable).A9D(b1v);
        }
    }

    public final void EE1(C41815B1v b1v) {
        0qQ.A0B(b1v, 0);
        Drawable drawable = this.A0A;
        if (drawable instanceof C268684dp) {
            ((C268684dp) drawable).EE1(b1v);
        }
    }

    public final void draw(Canvas canvas) {
        int i;
        0qQ.A0B(canvas, 0);
        boolean A092 = A09();
        Boolean bool = this.A07;
        if (bool == null || !0qQ.A0K(Boolean.valueOf(A092), bool)) {
            Drawable drawable = this.A0A;
            if (A092) {
                i = 255;
            } else {
                i = A0D;
            }
            drawable.setAlpha(i);
        }
        this.A07 = Boolean.valueOf(A092);
        if (A092 || this.A09) {
            this.A0A.draw(canvas);
        }
    }

    public final int getDurationInMs() {
        return -1;
    }

    public final void onBoundsChange(Rect rect) {
        0qQ.A0B(rect, 0);
        this.A0A.setBounds(rect);
    }

    public final List A07() {
        List singletonList = Collections.singletonList(this.A0A);
        0qQ.A07(singletonList);
        return singletonList;
    }

    public final Drawable A08() {
        Drawable drawable = this.A0A;
        if (!(drawable instanceof C347017w8)) {
            return drawable;
        }
        Drawable A042 = ((C347017w8) drawable).A04();
        0qQ.A07(A042);
        return A042;
    }

    public final boolean A09() {
        int max = Math.max(this.A05 + this.A06, 0);
        if (!this.A0A.isVisible()) {
            return false;
        }
        if (this.A03 != AnonymousClass05K.A00) {
            int i = this.A01;
            if (max > this.A00 || i > max) {
                return false;
            }
        }
        return true;
    }

    public final void AHg() {
        Drawable drawable = this.A0A;
        if (drawable instanceof C268684dp) {
            ((C268684dp) drawable).AHg();
        }
    }

    public final void AQX(Canvas canvas) {
        Drawable drawable = this.A0A;
        if (drawable instanceof AnonymousClass5MK) {
            ((AnonymousClass5MK) drawable).AQX(canvas);
        } else {
            drawable.draw(canvas);
        }
    }

    public final Drawable AfT() {
        return this.A0A;
    }

    public final int B1e() {
        return this.A00;
    }

    public final int Byn() {
        return this.A01;
    }

    public final C2802350v BzV() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        Drawable drawable = this.A0A;
        if (drawable.getAlpha() != 255) {
            drawable.setAlpha(255);
        }
        C2802350v A002 = C394879yq.A00(drawable);
        if (A002 != null) {
            String str8 = this.A0B;
            int i = this.A01;
            int i2 = this.A00;
            C376699Iz r1 = this.A02;
            VoiceOption voiceOption = (VoiceOption) r1.A01;
            if (voiceOption != null) {
                str5 = voiceOption.A02;
            } else {
                str5 = null;
            }
            if (voiceOption != null) {
                str6 = voiceOption.A00;
            } else {
                str6 = null;
            }
            if (voiceOption != null) {
                str7 = voiceOption.A01;
            } else {
                str7 = null;
            }
            return new AnonymousClass5JL(A002, str8, str5, str6, str7, r1.A02, i, i2);
        }
        try {
            String str9 = this.A0B;
            int i3 = this.A01;
            int i4 = this.A00;
            C376699Iz r2 = this.A02;
            VoiceOption voiceOption2 = (VoiceOption) r2.A01;
            if (voiceOption2 != null) {
                str = voiceOption2.A02;
            } else {
                str = null;
            }
            if (voiceOption2 != null) {
                str2 = voiceOption2.A00;
            } else {
                str2 = null;
            }
            if (voiceOption2 != null) {
                str3 = voiceOption2.A01;
            } else {
                str3 = null;
            }
            String str10 = r2.A02;
            if (drawable.getBounds().width() <= 0 || drawable.getBounds().height() <= 0) {
                str4 = "";
            } else {
                str4 = AnonymousClass45F.A03(drawable);
            }
            return new AnonymousClass5JL(new C19473WaL(new Rect(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight()), "bitmap_sticker_id", str4), str9, str, str2, str3, str10, i3, i4);
        } catch (IOException unused) {
            throw new IllegalStateException("Could not create TimedStickerClientModel");
        }
    }

    public final C376699Iz CAA() {
        return this.A02;
    }

    public final void EXC(int i, int i2) {
        boolean z;
        C321016tR r1;
        C347017w8 r5;
        C3510387i r52;
        this.A05 = i;
        Drawable drawable = this.A0A;
        if (drawable instanceof AnonymousClass5MJ) {
            0qQ.A0C(drawable, "null cannot be cast to non-null type com.instagram.reels.interactive.model.AnimatedSticker");
            ((AnonymousClass5MJ) drawable).EXC(this.A05, this.A00 - this.A01);
        }
        if (!this.A08 || (!A09() && !this.A09)) {
            z = false;
        } else {
            z = true;
        }
        if (drawable instanceof AnonymousClass9X8) {
            AnonymousClass9X8 r53 = (AnonymousClass9X8) drawable;
            if (r53.A0C == C391149sQ.GALLERY_STICKER && (r52 = r53.A05) != null) {
                RoundedCornerFrameLayout roundedCornerFrameLayout = r52.A0U;
                int i3 = 0;
                if (roundedCornerFrameLayout.getVisibility() == 0) {
                    if (!z) {
                        r52.A0P.A04("sticker is not visible");
                    }
                    roundedCornerFrameLayout.setVisibility(i3);
                } else if (z) {
                    C3510887n r12 = r52.A0P;
                    int i4 = i - r52.A07;
                    if (i4 < 0) {
                        i4 = 0;
                    }
                    r12.A02(i4);
                    r12.A05("sticker turns visible");
                    roundedCornerFrameLayout.setVisibility(i3);
                }
                i3 = 4;
                roundedCornerFrameLayout.setVisibility(i3);
            }
        } else if (!z) {
            Drawable drawable2 = null;
            if ((drawable instanceof C347017w8) && (r5 = (C347017w8) drawable) != null) {
                drawable2 = (Drawable) 00k.A0A(r5.A05());
            }
            if ((drawable2 instanceof C321016tR) && (r1 = (C321016tR) drawable2) != null) {
                r1.A06();
            }
        }
        super.setVisible(z, false);
        invalidateSelf();
    }

    public final void EcL(C41784B0n b0n) {
        Drawable drawable = this.A0A;
        if (drawable instanceof AnonymousClass5ML) {
            ((AnonymousClass5ML) drawable).EcL(b0n);
        }
    }

    public final void Eog(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        Drawable A082 = A08();
        if (A082 instanceof C3724991d) {
            ((C3724991d) A082).Dre(this.A01, this.A00);
        }
    }

    public final void EqG() {
        C321016tR r1;
        C347017w8 r2;
        Drawable drawable = this.A0A;
        Drawable drawable2 = null;
        if ((drawable instanceof C347017w8) && (r2 = (C347017w8) drawable) != null) {
            drawable2 = (Drawable) 00k.A0A(r2.A05());
        }
        if ((drawable2 instanceof C321016tR) && (r1 = (C321016tR) drawable2) != null) {
            r1.A06();
        }
    }

    public final String getId() {
        return this.A0B;
    }

    public final int getIntrinsicHeight() {
        return this.A0A.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        return this.A0A.getIntrinsicWidth();
    }

    public final boolean isLoading() {
        Drawable drawable = this.A0A;
        if (drawable instanceof C268684dp) {
            return ((C268684dp) drawable).isLoading();
        }
        return false;
    }

    public final boolean setVisible(boolean z, boolean z2) {
        this.A08 = z;
        return super.setVisible(z, z2);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass5MH(X.AnonymousClass5MH r5, X.AnonymousClass5JL r6, X.C306386Ly r7) {
        /*
            r4 = this;
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r1 = r0.toString()
            X.0qQ.A07(r1)
            android.content.Context r0 = r5.A0C
            r4.<init>((android.content.Context) r0, (android.graphics.drawable.Drawable) r7, (java.lang.String) r1)
            int r0 = r5.A05
            r4.A05 = r0
            int r0 = r5.A06
            r4.A06 = r0
            boolean r0 = r5.A08
            r4.A08 = r0
            boolean r0 = r5.A09
            r4.A09 = r0
            java.lang.Boolean r0 = r5.A07
            r4.A07 = r0
            java.lang.Integer r0 = r5.A03
            r4.A03 = r0
            java.lang.String r0 = r5.A04
            r4.A04 = r0
            X.9Iz r0 = r5.A02
            java.lang.Object r3 = r0.A00
            java.lang.Integer r3 = (java.lang.Integer) r3
            java.lang.Object r2 = r0.A01
            com.instagram.creation.capture.quickcapture.sundial.tts.intf.VoiceOption r2 = (com.instagram.creation.capture.quickcapture.sundial.tts.intf.VoiceOption) r2
            java.lang.String r1 = r6.A05
            X.9Iz r0 = new X.9Iz
            r0.<init>((com.instagram.creation.capture.quickcapture.sundial.tts.intf.VoiceOption) r2, (java.lang.Integer) r3, (java.lang.String) r1)
            r4.A02 = r0
            int r0 = r5.A01
            r4.A01 = r0
            int r0 = r5.A00
            r4.A00 = r0
            android.text.Spannable r2 = r7.A0F
            android.graphics.drawable.Drawable r1 = r4.A08()
            boolean r0 = r1 instanceof X.C306386Ly
            if (r0 == 0) goto L_0x005a
            X.6Ly r1 = (X.C306386Ly) r1
            if (r2 != 0) goto L_0x0057
            android.text.Spannable r2 = X.C306386Ly.A0d
        L_0x0057:
            r1.A0L(r2)
        L_0x005a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5MH.<init>(X.5MH, X.5JL, X.6Ly):void");
    }

    public final Integer Azv() {
        if (A08() instanceof C306386Ly) {
            Drawable drawable = this.A0A;
            if (!(drawable instanceof C347017w8) || !(((C347017w8) drawable).A03 instanceof C387319m1)) {
                return AnonymousClass05K.A00;
            }
        }
        return AnonymousClass05K.A01;
    }

    public final Spannable C4k() {
        Drawable A082 = A08();
        if (A082 instanceof C306386Ly) {
            return ((C306386Ly) A082).A0F;
        }
        if (A082 instanceof C369488uq) {
            return new SpannableString(((C369488uq) A082).A03);
        }
        return null;
    }

    public final C62529KhL CAX() {
        Drawable A082 = A08();
        if (!(A082 instanceof C369898vV)) {
            if (A082 instanceof C306386Ly) {
                Drawable drawable = this.A0A;
                if (!(drawable instanceof C347017w8) || !(((C347017w8) drawable).A03 instanceof C387319m1)) {
                    return C62529KhL.TEXT;
                }
            } else if (A082 instanceof AnonymousClass5MM) {
                return C62529KhL.CAPTION_STICKER;
            } else {
                if (A082 instanceof C369488uq) {
                    return C62529KhL.LOCATION;
                }
                if ((A082 instanceof AnonymousClass9XD) && ((AnonymousClass9XD) A082).A04 == C391049sG.BARCELONA_CLIPS) {
                    return C62529KhL.BARCELONA_SHARE;
                }
            }
        }
        return C62529KhL.STICKER;
    }

    public final void EpP(C376699Iz r1) {
        this.A02 = r1;
    }

    public AnonymousClass5MH(Context context, Drawable drawable, String str) {
        0qQ.A0B(str, 1);
        0qQ.A0B(drawable, 2);
        0qQ.A0B(context, 3);
        this.A0B = str;
        this.A0A = drawable;
        this.A0C = context;
        this.A05 = -1;
        this.A08 = true;
        this.A02 = new C376699Iz(AnonymousClass05K.A00);
        this.A01 = -1;
        this.A00 = -1;
        this.A0A.setCallback(this);
    }
}
