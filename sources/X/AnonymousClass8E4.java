package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.music.common.config.MusicAttributionConfig;

/* renamed from: X.8E4  reason: invalid class name */
public final class AnonymousClass8E4 extends 0Yg implements C62320sa {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Drawable A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ AnonymousClass4DH A03;
    public final /* synthetic */ AnonymousClass82W A04;
    public final /* synthetic */ UserSession A05;
    public final /* synthetic */ C357638Yz A06;
    public final /* synthetic */ TargetViewSizeProvider A07;
    public final /* synthetic */ AnonymousClass8E2 A08;
    public final /* synthetic */ AnonymousClass8E0 A09;
    public final /* synthetic */ AnonymousClass8E3 A0A;
    public final /* synthetic */ AnonymousClass846 A0B;
    public final /* synthetic */ C3499982t A0C;
    public final /* synthetic */ MusicAttributionConfig A0D;
    public final /* synthetic */ C234462xu A0E;
    public final /* synthetic */ C349337zz A0F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8E4(Drawable drawable, View view, AnonymousClass4DH r4, AnonymousClass82W r5, UserSession userSession, C357638Yz r7, TargetViewSizeProvider targetViewSizeProvider, AnonymousClass8E2 r9, AnonymousClass8E0 r10, AnonymousClass8E3 r11, AnonymousClass846 r12, C3499982t r13, MusicAttributionConfig musicAttributionConfig, C234462xu r15, C349337zz r16, int i) {
        super(0);
        this.A02 = view;
        this.A03 = r4;
        this.A09 = r10;
        this.A08 = r9;
        this.A05 = userSession;
        this.A04 = r5;
        this.A0C = r13;
        this.A0E = r15;
        this.A0B = r12;
        this.A0D = musicAttributionConfig;
        this.A00 = i;
        this.A06 = r7;
        this.A0A = r11;
        this.A07 = targetViewSizeProvider;
        this.A0F = r16;
        this.A01 = drawable;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        View view = this.A02;
        AnonymousClass4DH r14 = this.A03;
        AnonymousClass8E0 r13 = this.A09;
        AnonymousClass8E2 r12 = this.A08;
        UserSession userSession = this.A05;
        AnonymousClass82W r10 = this.A04;
        C3499982t r9 = this.A0C;
        C234462xu r8 = this.A0E;
        AnonymousClass846 r7 = this.A0B;
        MusicAttributionConfig musicAttributionConfig = this.A0D;
        int i = this.A00;
        C357638Yz r4 = this.A06;
        AnonymousClass8E3 r3 = this.A0A;
        TargetViewSizeProvider targetViewSizeProvider = this.A07;
        C349337zz r31 = this.A0F;
        C234462xu r30 = r8;
        MusicAttributionConfig musicAttributionConfig2 = musicAttributionConfig;
        C3499982t r28 = r9;
        AnonymousClass846 r27 = r7;
        AnonymousClass8E3 r26 = r3;
        AnonymousClass8E0 r25 = r13;
        AnonymousClass8E2 r24 = r12;
        TargetViewSizeProvider targetViewSizeProvider2 = targetViewSizeProvider;
        C357638Yz r22 = r4;
        UserSession userSession2 = userSession;
        AnonymousClass82W r20 = r10;
        AnonymousClass4DH r19 = r14;
        View view2 = view;
        return new C357738Zk(this.A01, view2, r19, r20, userSession2, r22, targetViewSizeProvider2, r24, r25, r26, r27, r28, musicAttributionConfig2, r30, r31, i);
    }
}
