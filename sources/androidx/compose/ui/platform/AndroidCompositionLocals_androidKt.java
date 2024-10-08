package androidx.compose.ui.platform;

import X.002;
import X.08Y;
import X.0fL;
import X.0qQ;
import X.0sL;
import X.0sP;
import X.AnonymousClass0eM;
import X.AnonymousClass0g9;
import X.AnonymousClass5PI;
import X.AnonymousClass5XH;
import X.AnonymousClass5XT;
import X.AnonymousClass5Y0;
import X.AnonymousClass5Y1;
import X.AnonymousClass5Y3;
import X.AnonymousClass5Y4;
import X.AnonymousClass5Y6;
import X.AnonymousClass5Y7;
import X.AnonymousClass5Y8;
import X.AnonymousClass5Y9;
import X.AnonymousClass5YA;
import X.AnonymousClass5YV;
import X.AnonymousClass5YX;
import X.AnonymousClass9M7;
import X.AnonymousClass9MG;
import X.C267304bL;
import X.C267314bM;
import X.C284885Or;
import X.C284905Ot;
import X.C284945Oz;
import X.C286565Wx;
import X.C286575Wy;
import X.C286615Xc;
import X.C286625Xd;
import X.C286645Xf;
import X.C286705Xl;
import X.C286715Xm;
import X.C286755Xr;
import X.C286765Xs;
import X.C286775Xt;
import X.C286785Xu;
import X.C286795Xv;
import X.C286805Xw;
import X.C286815Xx;
import X.C286825Xy;
import X.C377189Kw;
import X.C377469Ly;
import X.C377659Mr;
import X.C60340gF;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.instagram.android.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public abstract class AndroidCompositionLocals_androidKt {
    public static final C267314bM A00;
    public static final C267314bM A01 = new C267304bL(C286775Xt.A00);
    public static final C267314bM A02 = new C267304bL(C286805Xw.A00);
    public static final C267314bM A03 = new C267304bL(C286815Xx.A00);
    public static final C267314bM A04 = new C267304bL(C286785Xu.A00);
    public static final C267314bM A05 = new C267304bL(C286795Xv.A00);

    /* JADX WARNING: type inference failed for: r0v2, types: [X.4bM, X.4bL] */
    /* JADX WARNING: type inference failed for: r0v3, types: [X.4bM, X.4bL] */
    /* JADX WARNING: type inference failed for: r0v4, types: [X.4bM, X.4bL] */
    /* JADX WARNING: type inference failed for: r0v5, types: [X.4bM, X.4bL] */
    /* JADX WARNING: type inference failed for: r0v6, types: [X.4bM, X.4bL] */
    static {
        C286755Xr r2 = C286755Xr.A00;
        C284885Or r1 = C284885Or.A00;
        0qQ.A0C(r1, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        A00 = new C286765Xs(r1, r2);
    }

    public static final /* synthetic */ void A01(String str) {
        throw new IllegalStateException(002.A0g("CompositionLocal ", str, " not present"));
    }

    public static final C267314bM getLocalLifecycleOwner() {
        return AnonymousClass5YV.A00;
    }

    public static final void A00(C286575Wy r20, AndroidComposeView androidComposeView, 0sL r22, int i) {
        int i2;
        String str;
        LinkedHashMap linkedHashMap;
        boolean z;
        C286575Wy r1 = r20;
        r1.ExV(1396852028);
        int i3 = i;
        AndroidComposeView androidComposeView2 = androidComposeView;
        if ((i & 6) == 0) {
            int i4 = 2;
            if (r1.AGw(androidComposeView2)) {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i3;
        }
        0sL r4 = r22;
        if ((i & 48) == 0) {
            int i5 = 16;
            if (r1.AGw(r4)) {
                i5 = 32;
            }
            i2 |= i5;
        }
        if ((i2 & 19) != 18 || !r1.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1609010939, "androidx.compose.ui.platform.ProvideAndroidCompositionLocals (AndroidCompositionLocals.android.kt:91)");
            }
            Context context = androidComposeView2.getContext();
            Object ECw = r1.ECw();
            Object obj = AnonymousClass5XT.A00;
            if (ECw == obj) {
                Configuration configuration = new Configuration(context.getResources().getConfiguration());
                C284885Or r2 = C284885Or.A00;
                0qQ.A0C(r2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
                AnonymousClass0eM r0 = C284905Ot.A01;
                ECw = new ParcelableSnapshotMutableState(r2, configuration);
                ((C286565Wx) r1).A0Q(ECw);
            }
            C284945Oz r15 = (C284945Oz) ECw;
            Object ECw2 = r1.ECw();
            if (ECw2 == obj) {
                ECw2 = new C377189Kw(r15, 7);
                r1.FLL(ECw2);
            }
            androidComposeView2.A06 = (0sP) ECw2;
            Object ECw3 = r1.ECw();
            if (ECw3 == obj) {
                ECw3 = new C286825Xy(context);
                ((C286565Wx) r1).A0Q(ECw3);
            }
            AnonymousClass5XH viewTreeOwners = androidComposeView2.getViewTreeOwners();
            if (viewTreeOwners != null) {
                Object ECw4 = r1.ECw();
                if (ECw4 == obj) {
                    AnonymousClass0g9 r8 = viewTreeOwners.A01;
                    ViewParent parent = androidComposeView2.getParent();
                    0qQ.A0C(parent, "null cannot be cast to non-null type android.view.View");
                    View view = (View) parent;
                    Object tag = view.getTag(R.id.compose_view_saveable_id_tag);
                    if (!(tag instanceof String) || (str = (String) tag) == null) {
                        str = String.valueOf(view.getId());
                    }
                    String A0T = 002.A0T("SaveableStateRegistry", str, ':');
                    08Y savedStateRegistry = r8.getSavedStateRegistry();
                    Bundle A002 = savedStateRegistry.A00(A0T);
                    if (A002 != null) {
                        linkedHashMap = new LinkedHashMap();
                        for (String next : A002.keySet()) {
                            ArrayList parcelableArrayList = A002.getParcelableArrayList(next);
                            0qQ.A0C(parcelableArrayList, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Any?> }");
                            linkedHashMap.put(next, parcelableArrayList);
                        }
                    } else {
                        linkedHashMap = null;
                    }
                    AnonymousClass5Y1 r82 = new AnonymousClass5Y1(linkedHashMap, AnonymousClass5Y0.A00);
                    try {
                        savedStateRegistry.A03(new AnonymousClass5Y3(r82), A0T);
                        z = true;
                    } catch (IllegalArgumentException unused) {
                        z = false;
                    }
                    ECw4 = new AnonymousClass5Y4(r82, new C377659Mr(savedStateRegistry, A0T, 0, z));
                    ((C286565Wx) r1).A0Q(ECw4);
                }
                C60340gF r7 = C60340gF.A00;
                boolean AGw = r1.AGw(ECw4);
                Object ECw5 = r1.ECw();
                if (AGw || ECw5 == obj) {
                    ECw5 = new C377189Kw(ECw4, 8);
                    r1.FLL(ECw5);
                }
                C286645Xf.A03(r1, r7, (0sP) ECw5);
                Configuration configuration2 = (Configuration) r15.getValue();
                if (0fL.A02()) {
                    0fL.A01(-1298978053, "androidx.compose.ui.platform.obtainImageVectorCache (AndroidCompositionLocals.android.kt:172)");
                }
                Object ECw6 = r1.ECw();
                if (ECw6 == obj) {
                    ECw6 = new AnonymousClass5Y6();
                    ((C286565Wx) r1).A0Q(ECw6);
                }
                AnonymousClass5Y6 r9 = (AnonymousClass5Y6) ECw6;
                Object ECw7 = r1.ECw();
                Configuration configuration3 = ECw7;
                if (ECw7 == obj) {
                    Configuration configuration4 = new Configuration();
                    if (configuration2 != null) {
                        configuration4.setTo(configuration2);
                    }
                    r1.FLL(configuration4);
                    configuration3 = configuration4;
                }
                Configuration configuration5 = (Configuration) configuration3;
                Object ECw8 = r1.ECw();
                if (ECw8 == obj) {
                    ECw8 = new AnonymousClass5Y7(configuration5, r9);
                    ((C286565Wx) r1).A0Q(ECw8);
                }
                boolean AGw2 = r1.AGw(context);
                Object ECw9 = r1.ECw();
                if (AGw2 || ECw9 == obj) {
                    ECw9 = new C377469Ly(13, (Object) context, ECw8);
                    r1.FLL(ECw9);
                }
                C286645Xf.A03(r1, r9, (0sP) ECw9);
                if (0fL.A02()) {
                    0fL.A00(1903363574);
                }
                if (0fL.A02()) {
                    0fL.A01(1984987453, "androidx.compose.ui.platform.obtainResourceIdCache (AndroidCompositionLocals.android.kt:141)");
                }
                Object ECw10 = r1.ECw();
                if (ECw10 == obj) {
                    ECw10 = new AnonymousClass5Y8();
                    ((C286565Wx) r1).A0Q(ECw10);
                }
                AnonymousClass5Y8 r83 = (AnonymousClass5Y8) ECw10;
                Object ECw11 = r1.ECw();
                if (ECw11 == obj) {
                    ECw11 = new AnonymousClass5Y9(r83);
                    ((C286565Wx) r1).A0Q(ECw11);
                }
                boolean AGw3 = r1.AGw(context);
                Object ECw12 = r1.ECw();
                if (AGw3 || ECw12 == obj) {
                    ECw12 = new C377469Ly(14, (Object) context, ECw11);
                    r1.FLL(ECw12);
                }
                C286645Xf.A03(r1, r83, (0sP) ECw12);
                if (0fL.A02()) {
                    0fL.A00(-1020397719);
                }
                C267314bM r72 = AnonymousClass5YA.A09;
                boolean booleanValue = ((Boolean) C286615Xc.A01(r72, C286565Wx.A04((C286565Wx) r1))).booleanValue() | androidComposeView2.getScrollCaptureInProgress$ui_release();
                C286715Xm.A01(r1, AnonymousClass5PI.A01(r1, new AnonymousClass9MG(0, androidComposeView2, ECw3, r4), 1471621628), new C286705Xl[]{A00.A02(r15.getValue()), A01.A02(context), AnonymousClass5YV.A00.A02(viewTreeOwners.A00), A02.A02(viewTreeOwners.A01), AnonymousClass5YX.A00.A02(ECw4), A03.A02(androidComposeView2), A04.A02(r9), A05.A02(r83), r72.A02(Boolean.valueOf(booleanValue))}, 56);
                if (0fL.A02()) {
                    0fL.A00(195263100);
                }
            } else {
                throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
            }
        } else {
            r1.Evl();
        }
        C286625Xd ASQ = r1.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new AnonymousClass9M7(i3, 2, r4, androidComposeView2);
        }
    }
}
