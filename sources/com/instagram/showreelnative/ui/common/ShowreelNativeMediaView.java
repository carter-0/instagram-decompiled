package com.instagram.showreelnative.ui.common;

import X.0qQ;
import X.AnonymousClass59L;
import X.AnonymousClass621;
import X.AnonymousClass623;
import X.AnonymousClass6L7;
import X.AnonymousClass6Q7;
import X.AnonymousClass9J6;
import X.C306796Nn;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.instagram.common.session.UserSession;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class ShowreelNativeMediaView extends AnonymousClass59L {
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ShowreelNativeMediaView(Context context) {
        this(context, (AttributeSet) null, 0, (AnonymousClass9J6) null, (AnonymousClass623) null, (AnonymousClass621) null, 62, (DefaultConstructorMarker) null);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ShowreelNativeMediaView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, (AnonymousClass9J6) null, (AnonymousClass623) null, (AnonymousClass621) null, 60, (DefaultConstructorMarker) null);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ShowreelNativeMediaView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, (AnonymousClass9J6) null, (AnonymousClass623) null, (AnonymousClass621) null, 56, (DefaultConstructorMarker) null);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ShowreelNativeMediaView(Context context, AttributeSet attributeSet, int i, AnonymousClass9J6 r11, AnonymousClass623 r12) {
        this(context, attributeSet, i, r11, r12, (AnonymousClass621) null);
        0qQ.A0B(context, 1);
        0qQ.A0B(r11, 4);
    }

    public static /* synthetic */ void setShowreelAnimation$default(ShowreelNativeMediaView showreelNativeMediaView, AnonymousClass6L7 r7, UserSession userSession, String str, C306796Nn r10, boolean z, int i, Object obj) {
        boolean z2 = z;
        if ((i & 16) != 0) {
            z2 = false;
        }
        showreelNativeMediaView.A08(r7, userSession, r10, str, z2);
    }

    public final void A07(AnonymousClass6Q7 r12, AnonymousClass6L7 r13, UserSession userSession, String str, boolean z) {
        0qQ.A0B(r13, 0);
        0qQ.A0B(userSession, 1);
        0qQ.A0B(str, 2);
        0qQ.A0B(r12, 3);
        A08(r13, userSession, new C306796Nn(r12, 0, 0, 1, 0), str, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0021, code lost:
        if (X.182.A06(X.0Tu.A05, r13, 36313235523635021L) == false) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A08(X.AnonymousClass6L7 r12, com.instagram.common.session.UserSession r13, X.C306796Nn r14, java.lang.String r15, boolean r16) {
        /*
            r11 = this;
            r0 = 0
            r3 = r12
            X.0qQ.A0B(r12, r0)
            r0 = 1
            X.0qQ.A0B(r13, r0)
            r0 = 2
            r5 = r15
            X.0qQ.A0B(r15, r0)
            r0 = 3
            r4 = r14
            X.0qQ.A0B(r14, r0)
            if (r16 == 0) goto L_0x0023
            X.0Tu r2 = X.0Tu.A05
            r0 = 36313235523635021(0x8102b20008074d, double:3.027974594585118E-306)
            boolean r0 = X.182.A06(r2, r13, r0)
            r1 = 1
            if (r0 != 0) goto L_0x0024
        L_0x0023:
            r1 = 0
        L_0x0024:
            X.1vk r0 = X.C67671vk.A01
            r0.A00 = r13
            X.0sn r6 = X.0sn.A00
            r7 = 0
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r1)
            r2 = r11
            r9 = r7
            r10 = r7
            r2.setShowreelAnimation(r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.showreelnative.ui.common.ShowreelNativeMediaView.A08(X.6L7, com.instagram.common.session.UserSession, X.6Nn, java.lang.String, boolean):void");
    }

    public final void setScaleType(ImageView.ScaleType scaleType) {
        0qQ.A0B(scaleType, 0);
        this.A0J.setScaleType(scaleType);
    }

    public final void setShowreelAnimation(AnonymousClass6L7 r7, UserSession userSession, String str, AnonymousClass6Q7 r10) {
        0qQ.A0B(r7, 0);
        0qQ.A0B(userSession, 1);
        0qQ.A0B(str, 2);
        0qQ.A0B(r10, 3);
        A07(r10, r7, userSession, str, false);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ShowreelNativeMediaView(Context context, AnonymousClass9J6 r9, AnonymousClass623 r10, AnonymousClass621 r11) {
        this(context, (AttributeSet) null, 0, r9, r10, r11);
        0qQ.A0B(context, 1);
        0qQ.A0B(r9, 2);
    }

    public static /* synthetic */ void setShowreelAnimation$default(ShowreelNativeMediaView showreelNativeMediaView, AnonymousClass6L7 r7, UserSession userSession, String str, AnonymousClass6Q7 r10, boolean z, int i, Object obj) {
        boolean z2 = z;
        if ((i & 16) != 0) {
            z2 = false;
        }
        showreelNativeMediaView.A07(r10, r7, userSession, str, z2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ShowreelNativeMediaView(Context context, AttributeSet attributeSet, int i, AnonymousClass9J6 r11) {
        this(context, attributeSet, i, r11, (AnonymousClass623) null, (AnonymousClass621) null);
        0qQ.A0B(context, 1);
        0qQ.A0B(r11, 4);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ShowreelNativeMediaView(Context context, AttributeSet attributeSet, int i, AnonymousClass9J6 r12, AnonymousClass623 r13, AnonymousClass621 r14, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? new AnonymousClass9J6("sn_integration_feed", "IG_FEED", 0) : r12, (i2 & 16) != 0 ? null : r13, (i2 & 32) == 0 ? r14 : null);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ShowreelNativeMediaView(android.content.Context r9, android.util.AttributeSet r10, int r11, X.AnonymousClass9J6 r12, X.AnonymousClass623 r13, X.AnonymousClass621 r14) {
        /*
            r8 = this;
            r0 = 1
            r1 = r9
            X.0qQ.A0B(r9, r0)
            r0 = 4
            r3 = r12
            X.0qQ.A0B(r12, r0)
            java.util.concurrent.Executor r6 = r9.getMainExecutor()
            r0 = r8
            r2 = r10
            r7 = r11
            r5 = r13
            r4 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r1 = 2147483647(0x7fffffff, float:NaN)
            r8.A00 = r1
            X.627 r0 = r8.A0J
            X.2gu r0 = r0.getKeyframesAnimatable()
            if (r0 == 0) goto L_0x0026
            r0.EFJ(r1)
        L_0x0026:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.showreelnative.ui.common.ShowreelNativeMediaView.<init>(android.content.Context, android.util.AttributeSet, int, X.9J6, X.623, X.621):void");
    }
}
