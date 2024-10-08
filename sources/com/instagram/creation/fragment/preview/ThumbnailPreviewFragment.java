package com.instagram.creation.fragment.preview;

import X.0Tu;
import X.0lg;
import X.0qQ;
import X.182;
import X.2Ht;
import X.AnonymousClass0fD;
import X.AnonymousClass32G;
import X.AnonymousClass32Q;
import X.C227642jf;
import X.C267834cI;
import X.C267844cJ;
import X.C3499582p;
import X.C378369Pn;
import X.DbT;
import X.DbY;
import X.K9C;
import X.M3L;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.emptystaterow.EmptyStateView;

public class ThumbnailPreviewFragment extends AnonymousClass32G {
    public static final AnonymousClass32Q A03 = AnonymousClass32Q.A00;
    public UserSession A00;
    public K9C A01;
    public C267834cI A02;
    public View mContainer;
    public EmptyStateView mEmptyStateView;

    public final String getModuleName() {
        return "metadata_thumbnail_preview";
    }

    public final /* bridge */ /* synthetic */ 0lg A0Y() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1867871847);
        ThumbnailPreviewFragment.super.onCreate(bundle);
        C3499582p Ajn = ((C267844cJ) requireContext()).Ajn();
        Bundle A08 = DbY.A08(this);
        UserSession userSession = (UserSession) C227642jf.A02(this).getValue();
        this.A00 = userSession;
        this.A02 = (C267834cI) requireContext();
        this.A01 = new K9C(requireContext(), this, userSession, Ajn, this.A02, A03, (float) A08.getInt("args_selected_thumbnail_index"));
        AnonymousClass0fD.A09(1548199589, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-791162136);
        ThumbnailPreviewFragment.super.onCreateView(layoutInflater, viewGroup, bundle);
        View A0C = DbT.A0C(layoutInflater, viewGroup, R.layout.fragment_thumbnail_preview);
        AnonymousClass0fD.A09(1588675318, A022);
        return A0C;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-888823205);
        super.onDestroyView();
        ThumbnailPreviewFragmentLifecycleUtil.cleanupReferences(this);
        AnonymousClass0fD.A09(322232772, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-798952668);
        ThumbnailPreviewFragment.super.onPause();
        for (C378369Pn A012 : this.A01.A01.A05) {
            A012.A01();
        }
        AnonymousClass0fD.A09(-1059218324, A022);
    }

    public final void onResume() {
        FragmentActivity activity;
        int A022 = AnonymousClass0fD.A02(-418372827);
        super.onResume();
        if (!(Build.VERSION.SDK_INT < 34 || (activity = getActivity()) == null || activity.getDisplay() == null || !getActivity().getDisplay().isHdrSdrRatioAvailable() || getActivity().getWindow() == null)) {
            UserSession userSession = this.A00;
            0qQ.A0B(userSession, 0);
            if (2Ht.A06(userSession) && 182.A06(0Tu.A06, userSession, 36321670839019129L)) {
                getActivity().getWindow().setColorMode(2);
            }
        }
        for (C378369Pn A032 : this.A01.A01.A05) {
            A032.A03();
        }
        AnonymousClass0fD.A09(656705631, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mContainer = view;
        this.A02.EBv(new M3L(this));
    }
}
