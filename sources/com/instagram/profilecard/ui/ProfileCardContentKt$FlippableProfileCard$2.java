package com.instagram.profilecard.ui;

import X.0eS;
import X.0rh;
import X.0sK;
import X.0sP;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C284945Oz;
import X.C51965G9l;
import X.C51967G9n;
import X.C60340gF;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.profilecard.ui.ProfileCardContentKt$FlippableProfileCard$2", f = "ProfileCardContent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ProfileCardContentKt$FlippableProfileCard$2 extends AnonymousClass1Ek implements 0sK {
    public /* synthetic */ float A00;
    public final /* synthetic */ C284945Oz A01;
    public final /* synthetic */ 0sP A02;
    public final /* synthetic */ 0rh A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProfileCardContentKt$FlippableProfileCard$2(C284945Oz r2, AnonymousClass4D7 r3, 0sP r4, 0rh r5) {
        super(3, r3);
        this.A02 = r4;
        this.A03 = r5;
        this.A01 = r2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        float A04 = AnonymousClass7TE.A04(obj2);
        0sP r3 = this.A02;
        0rh r2 = this.A03;
        ProfileCardContentKt$FlippableProfileCard$2 profileCardContentKt$FlippableProfileCard$2 = new ProfileCardContentKt$FlippableProfileCard$2(this.A01, (AnonymousClass4D7) obj3, r3, r2);
        profileCardContentKt$FlippableProfileCard$2.A00 = A04;
        return profileCardContentKt$FlippableProfileCard$2.invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        float f;
        0eS.A00(obj);
        float f2 = this.A00;
        C51967G9n.A16(this.A01, false);
        0sP r4 = this.A02;
        float f3 = this.A03.A00;
        float f4 = 0.0f;
        if (Math.abs(f2) > 1000.0f) {
            f = Math.signum(f2) * 90.0f;
        } else {
            f = 0.0f;
        }
        float f5 = 360.0f;
        float f6 = (f3 % 360.0f) + f;
        float f7 = ((float) ((int) (f3 / 360.0f))) * 360.0f;
        if (-90.0f > f6 || f6 > 90.0f) {
            float abs = Math.abs(f6);
            if (abs < 270.0f) {
                if (abs >= 90.0f) {
                    f5 = 180.0f;
                }
            }
            f4 = f7 + (Math.signum(f3) * f5);
        } else {
            f4 = f7;
        }
        r4.invoke(C51965G9l.A0q(f4));
        return C60340gF.A00;
    }
}
