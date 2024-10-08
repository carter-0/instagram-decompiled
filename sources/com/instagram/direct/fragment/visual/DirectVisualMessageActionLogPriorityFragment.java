package com.instagram.direct.fragment.visual;

import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass0eM;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass11X;
import X.AnonymousClass4DH;
import X.C227642jf;
import X.C255943uy;
import X.C67794Muy;
import X.C71395Oju;
import X.C73899Pla;
import X.C74450Pv5;
import X.DbS;
import X.DbT;
import X.DbW;
import X.JTR;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.List;

public final class DirectVisualMessageActionLogPriorityFragment extends AnonymousClass4DH {
    public C74450Pv5 A00;
    public C67794Muy A01;
    public final AnonymousClass0eM A02 = C227642jf.A02(this);
    public final AnonymousClass0eM A03 = C73899Pla.A00(this, 22);
    public SpinnerImageView spinner;

    public final String getModuleName() {
        return "direct_story_action_log_priority_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        RecyclerView A0c = JTR.A0c(view, R.id.recycler_view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireContext(), 1, false);
        linearLayoutManager.A0v(true);
        A0c.setLayoutManager(linearLayoutManager);
        C67794Muy muy = this.A01;
        if (muy == null) {
            str = "adapter";
        } else {
            A0c.setAdapter(muy);
            SpinnerImageView spinnerImageView = (SpinnerImageView) view.requireViewById(R.id.direct_recycler_view_spinner);
            0qQ.A0B(spinnerImageView, 0);
            this.spinner = spinnerImageView;
            C71395Oju.A00(view.requireViewById(R.id.header_done_button), 27, this);
            C74450Pv5 pv5 = this.A00;
            if (pv5 == null) {
                str = "controller";
            } else {
                AnonymousClass11X Ex0 = pv5.Ex0();
                if (Ex0 != null) {
                    schedule(Ex0);
                    return;
                }
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A00(List list) {
        String str;
        SpinnerImageView spinnerImageView = this.spinner;
        if (spinnerImageView != null) {
            spinnerImageView.setLoadingStatus(C255943uy.SUCCESS);
            C67794Muy muy = this.A01;
            if (muy == null) {
                str = "adapter";
            } else {
                DbW.A0z(muy, list, muy.A02);
                return;
            }
        } else {
            str = "spinner";
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A02);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: X.P34} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: X.P33} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: X.P35} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: X.P35} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: X.P35} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: X.P35} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r19) {
        /*
            r18 = this;
            r0 = -1684508102(0xffffffff9b98723a, float:-2.5220108E-22)
            int r2 = X.AnonymousClass0fD.A02(r0)
            r1 = r18
            r0 = r19
            com.instagram.direct.fragment.visual.DirectVisualMessageActionLogPriorityFragment.super.onCreate(r0)
            android.os.Bundle r6 = r1.mArguments
            java.lang.String r10 = "Required value was null."
            if (r6 == 0) goto L_0x00d4
            java.lang.String r0 = "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_ID"
            X.3t3 r0 = X.OXL.A00(r6, r0)
            if (r0 == 0) goto L_0x00cc
            X.3sy r7 = X.C300965yF.A05(r0)
            java.lang.String r0 = "is_instamadillo"
            java.lang.Boolean r3 = X.C311706d7.A00(r6, r0)
            java.lang.String r0 = "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_MESSAGE_ID"
            java.lang.String r14 = r6.getString(r0)
            java.lang.String r0 = "DirectEmojiReactionsListFragment.MESSAGE_TIMESTAMP_MS"
            long r16 = r6.getLong(r0)
            boolean r0 = r7 instanceof com.instagram.model.direct.threadkey.impl.MsysThreadId
            java.lang.String r5 = "DirectFragment.ARGUMENT_RECIPIENTS"
            if (r0 == 0) goto L_0x0063
            android.content.Context r12 = r1.requireContext()
            X.0eM r0 = r1.A02
            com.instagram.common.session.UserSession r13 = X.AnonymousClass7TE.A0l(r0)
            if (r14 == 0) goto L_0x00b4
            java.lang.Class<com.instagram.pendingmedia.model.recipients.PendingRecipient> r0 = com.instagram.pendingmedia.model.recipients.PendingRecipient.class
            java.util.ArrayList r15 = X.C320236s2.A02(r6, r0, r5)
            X.P35 r10 = new X.P35
            r11 = r10
            r11.<init>(r12, r13, r14, r15, r16)
        L_0x0050:
            r1.A00 = r10
            r10.EU7(r1)
            X.Muy r0 = new X.Muy
            r0.<init>(r1, r1)
            r1.A01 = r0
            r0 = 2013313547(0x7800ba0b, float:1.0443553E34)
            X.AnonymousClass0fD.A09(r0, r2)
            return
        L_0x0063:
            boolean r0 = X.DbX.A1a(r3)
            if (r0 == 0) goto L_0x0090
            X.0eM r9 = r1.A02
            X.0lg r8 = X.DbT.A0X(r9)
            X.0Tu r0 = X.0Tu.A05
            r3 = 36320519788765723(0x8109520011221b, double:3.0325811931851555E-306)
            boolean r0 = X.182.A06(r0, r8, r3)
            if (r0 == 0) goto L_0x0090
            android.content.Context r4 = r1.requireContext()
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r9)
            if (r14 == 0) goto L_0x00dc
            com.instagram.model.direct.DirectThreadKey r0 = X.C66647MaG.A03(r7)
            X.P33 r10 = new X.P33
            r10.<init>(r4, r3, r0, r14)
            goto L_0x0050
        L_0x0090:
            android.content.Context r11 = r1.requireContext()
            X.0eM r0 = r1.A02
            com.instagram.common.session.UserSession r12 = X.AnonymousClass7TE.A0l(r0)
            java.lang.String r13 = X.C66647MaG.A09(r7)
            if (r13 == 0) goto L_0x00c4
            if (r14 == 0) goto L_0x00bc
            java.lang.String r0 = "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_MESSAGE_CLIENT_CONTEXT"
            java.lang.String r15 = r6.getString(r0)
            java.lang.Class<com.instagram.pendingmedia.model.recipients.PendingRecipient> r0 = com.instagram.pendingmedia.model.recipients.PendingRecipient.class
            java.util.ArrayList r16 = X.C320236s2.A02(r6, r0, r5)
            X.P34 r10 = new X.P34
            r10.<init>(r11, r12, r13, r14, r15, r16)
            goto L_0x0050
        L_0x00b4:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r10)
            r0 = 1292056723(0x4d033893, float:1.37595184E8)
            goto L_0x00e3
        L_0x00bc:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r10)
            r0 = 642070981(0x264539c5, float:6.8426397E-16)
            goto L_0x00e3
        L_0x00c4:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r10)
            r0 = -826394971(0xffffffffcebe36a5, float:-1.59562611E9)
            goto L_0x00e3
        L_0x00cc:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r10)
            r0 = -839736377(0xffffffffcdf2a3c7, float:-5.08852448E8)
            goto L_0x00e3
        L_0x00d4:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r10)
            r0 = -531196968(0xffffffffe05693d8, float:-6.1847758E19)
            goto L_0x00e3
        L_0x00dc:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r10)
            r0 = 1959784119(0x74cfeeb7, float:1.3179287E32)
        L_0x00e3:
            X.AnonymousClass0fD.A09(r0, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.fragment.visual.DirectVisualMessageActionLogPriorityFragment.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1685277967);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.fragment_direct_recycler_view_with_header, false);
        AnonymousClass0fD.A09(2110200656, A022);
        return A0D;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1042420617);
        super.onDestroyView();
        this.spinner = null;
        C74450Pv5 pv5 = this.A00;
        if (pv5 == null) {
            0qQ.A0F("controller");
            throw AnonymousClass00P.createAndThrow();
        }
        pv5.cleanup();
        AnonymousClass0fD.A09(-1676227200, A022);
    }
}
