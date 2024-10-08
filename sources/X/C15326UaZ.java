package X;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.google.common.collect.ImmutableSet;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.cameraconfiguration.CameraConfiguration;
import com.instagram.creation.capture.DragToDismissView;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.util.HashSet;

/* renamed from: X.UaZ  reason: case insensitive filesystem */
public final class C15326UaZ extends AnonymousClass4DH implements AnonymousClass4DR, C60580id {
    public static final String __redex_internal_original_name = "CameraBottomUpNavigationFragment";
    public C17714Vcj A00;
    public AnonymousClass80Q A01;
    public AnonymousClass80C A02;
    public final float A03 = 1.0f;
    public final float A04 = 0.9f;
    public final C17214VMs A05 = new C17214VMs(this);
    public final C41837B2s A06 = new WUP(this, 1);
    public final AnonymousClass0eM A07 = C227642jf.A02(this);
    public final X1O A08 = new WUG(this);

    public final String getModuleName() {
        return "quick_camera_fragment_nav3_bottom_up_navigation";
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [X.WUS, X.B1Q, X.B1P, java.lang.Object] */
    public final void onViewCreated(View view, Bundle bundle) {
        C363138jC r5;
        AnonymousClass80H A022;
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        DragToDismissView dragToDismissView = (DragToDismissView) view2.requireViewById(R.id.quick_capture_fragment_container_drag);
        dragToDismissView.setDismissListener(this.A08);
        View findViewById = view2.findViewById(R.id.quick_capture_fragment_container);
        if (findViewById != null) {
            dragToDismissView.A00 = findViewById;
            AnonymousClass80C r0 = new AnonymousClass80C();
            this.A02 = r0;
            registerLifecycleListener(r0);
            ViewGroup A0I = DbX.A0I(view2, R.id.quick_capture_fragment_container);
            Bundle requireArguments = requireArguments();
            CameraConfiguration cameraConfiguration = (CameraConfiguration) requireArguments.getParcelable("camera_configuration");
            String string = requireArguments.getString(C273654mx.A00(591));
            boolean z = requireArguments.getBoolean(AnonymousClass000.A00(2753), false);
            28D r9 = 28D.A0a;
            PendingRecipient pendingRecipient = (PendingRecipient) requireArguments.getParcelable("targetGroupProfile");
            boolean z2 = requireArguments.getBoolean(AnonymousClass000.A00(35), false);
            if (pendingRecipient != null) {
                0sl r3 = 0sl.A00;
                r5 = C363138jC.A00;
                ImmutableSet A012 = ImmutableSet.A01(r5, AnonymousClass9QA.A00, AnonymousClass80N.A00);
                0qQ.A07(A012);
                A022 = AnonymousClass80I.A00(r3, A012);
            } else {
                this.A07.getValue();
                HashSet hashSet = new HashSet();
                hashSet.add(AnonymousClass9QA.A00);
                hashSet.add(AnonymousClass80N.A00);
                hashSet.add(AnonymousClass80L.A00);
                r5 = C363138jC.A00;
                hashSet.add(r5);
                A022 = AnonymousClass80H.A02.A02(hashSet);
            }
            AnonymousClass80D r32 = new AnonymousClass80D();
            C41837B2s b2s = this.A06;
            b2s.getClass();
            r32.A0l = b2s;
            AnonymousClass0eM r2 = this.A07;
            UserSession A0l = AnonymousClass7TE.A0l(r2);
            A0l.getClass();
            r32.A0S = A0l;
            FragmentActivity activity = getActivity();
            activity.getClass();
            r32.A05 = activity;
            r32.A0M = this;
            A022.getClass();
            r32.A0W = A022;
            r32.A3h = true;
            r32.A0R = this.volumeKeyPressController;
            AnonymousClass80C r02 = this.A02;
            if (r02 == null) {
                0qQ.A0F("lifecycleDispatcher");
                throw AnonymousClass00P.createAndThrow();
            }
            r32.A0t = r02;
            A0I.getClass();
            r32.A09 = A0I;
            r32.A0B = r9;
            r32.A0O = this;
            r32.A2g = string;
            r32.A3F = true;
            r32.A3H = true;
            r32.A47 = true;
            AnonymousClass80D.A0B(r32);
            r32.A3k = false;
            r32.A44 = requireArguments.getBoolean(AnonymousClass000.A00(2754), true);
            r32.A3Q = true;
            r32.A41 = z;
            r32.A3f = true;
            AnonymousClass80D.A0A(r32);
            r32.A3N = true;
            r32.A1S = pendingRecipient;
            r32.A3c = z2;
            r32.A3X = requireArguments.getBoolean(AnonymousClass000.A00(1156));
            setModuleNameV2("feed_precapture_camera");
            ? obj = new Object();
            obj.A00 = r5;
            obj.A03 = true;
            obj.A02 = "feed_precapture_camera";
            obj.A01 = new C17213VMr(this);
            r32.A0i = new WUL(this, obj);
            r32.A0q = obj;
            r32.A0r = obj;
            r32.A0V = cameraConfiguration;
            0qQ.A07(r32);
            28D r03 = r32.A0B;
            0qQ.A07(r03);
            r2.getValue();
            C360908fL.A00(r03);
            AnonymousClass7TF.A17(this, new C20200Wmy(this, r32));
            return;
        }
        throw DbU.A0h();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A07);
    }

    public final boolean onBackPressed() {
        AnonymousClass80Q r0 = this.A01;
        if (r0 != null) {
            return r0.A06();
        }
        0qQ.A0F("quickCaptureController");
        throw AnonymousClass00P.createAndThrow();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-2116995413);
        0qQ.A0B(layoutInflater, 0);
        C15326UaZ.super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.fragment_quick_capture_bottom_navigation, viewGroup, false);
        inflate.findViewById(R.id.quick_capture_fragment_container).setBackground((Drawable) null);
        AnonymousClass0fD.A09(-1333465296, A022);
        return inflate;
    }

    public final void onDestroyView() {
        String str;
        int A022 = AnonymousClass0fD.A02(-314867703);
        super.onDestroyView();
        if (this.mView != null) {
            AnonymousClass80Q r0 = this.A01;
            if (r0 == null) {
                str = "quickCaptureController";
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            r0.A00();
        }
        AnonymousClass80C r02 = this.A02;
        str = "lifecycleDispatcher";
        if (r02 != null) {
            unregisterLifecycleListener(r02);
            AnonymousClass80C r03 = this.A02;
            if (r03 != null) {
                r03.onDestroyView();
                this.A00 = null;
                AnonymousClass0fD.A09(979546903, A022);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(1771526093);
        super.onResume();
        Activity A032 = DbT.A03(this);
        this.A07.getValue();
        C357628Yy.A00(A032);
        AnonymousClass0fD.A09(346466594, A022);
    }
}
