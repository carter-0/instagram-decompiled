package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import java.util.ArrayList;

/* renamed from: X.E2q  reason: case insensitive filesystem */
public final class C47444E2q extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "FollowRequestsComposeFragment";
    public TextView A00;
    public final AnonymousClass0iw A01 = DbS.A0O("follow_requests");
    public final AnonymousClass0eM A02 = C51792G2b.A00(this, 4);
    public final AnonymousClass0eM A03 = C51792G2b.A00(this, 5);
    public final AnonymousClass0eM A04 = C51792G2b.A00(this, 8);
    public final AnonymousClass0eM A05 = AnonymousClass1YB.A00(G22.A00);
    public final AnonymousClass0eM A06 = C51792G2b.A00(this, 9);
    public final AnonymousClass0eM A07;
    public final AnonymousClass0eM A08;

    public final void configureActionBar(2da r4) {
        0qQ.A0B(r4, 0);
        if (isAdded() && getContext() != null) {
            DbW.A1B(r4, 2131962574);
            TextView A0D = DbZ.A0D(this, (2dZ) r4);
            DbU.A1G(A0D, this, 2131962572);
            DbT.A17(requireContext(), A0D, 2Yu.A07(A0D.getContext()));
            FP3.A00(A0D, 63, this);
            this.A00 = A0D;
            AnonymousClass3JR A0K = DbS.A0K();
            A0K.A0I = this.A00;
            r4.AA4(new AnonymousClass3Jb(A0K));
            boolean z = ((LMY) A00(this).A0A.getValue()).A02;
            TextView textView = this.A00;
            if (textView != null) {
                textView.setEnabled(z);
                float f = 0.35f;
                if (textView.isEnabled()) {
                    f = 1.0f;
                }
                textView.setAlpha(f);
            }
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        ArrayList<String> arrayList;
        if (i2 == -1 && i == 277) {
            boolean z = false;
            if (intent != null) {
                z = intent.getBooleanExtra("ARG_IS_POSITIVE_ACTION", false);
                arrayList = intent.getStringArrayListExtra("ARG_USER_IDS");
            } else {
                arrayList = null;
            }
            C47539E7c A002 = A00(this);
            AnonymousClass7TE.A1Z(new C59673JTe(arrayList, A002, (AnonymousClass4D7) null, 23, z), C318116oQ.A00(A002));
        }
        super.onActivityResult(i, i2, intent);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ((2bu) this.A06.getValue()).Dh3();
        07U r3 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new C66170MGh(viewLifecycleOwner, r3, this, (AnonymousClass4D7) null, 30), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public static final C47539E7c A00(C47444E2q e2q) {
        return (C47539E7c) e2q.A08.getValue();
    }

    public final String getModuleName() {
        return this.A01.getModuleName();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A07);
    }

    public C47444E2q() {
        C51792G2b g2b = new C51792G2b(this, 13);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C51792G2b(new C51792G2b(this, 10), 11));
        this.A08 = DbS.A0I(new C51792G2b(A002, 12), g2b, new MJ7(12, (Object) null, A002), DbS.A0z(C47539E7c.class));
        this.A07 = C227642jf.A02(this);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(958834564);
        C47444E2q.super.onCreate(bundle);
        AnonymousClass0eM r4 = this.A04;
        DbY.A0v(requireContext(), (MYU) r4.getValue(), this, this.A07);
        C49284EsT.A00(r4);
        C47539E7c A002 = A00(this);
        C51645Fy4.A01(A002, C318116oQ.A00(A002), 30);
        A00(this).A02().A00 = new C51657FyJ(this, 2);
        ((F2T) A00(this).A04.A04.getValue()).A00 = new C51657FyJ(this, 3);
        AnonymousClass0fD.A09(189366863, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-804238315);
        ComposeView A012 = GTX.A01(this, AnonymousClass5PI.A03(new C59345JFx(this, 30), -314194747), false, 182.A06(0Tu.A05, DbT.A0X(this.A07), 36316357965123859L));
        AnonymousClass0fD.A09(1115104517, A022);
        return A012;
    }
}
