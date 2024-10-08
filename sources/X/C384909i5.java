package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.RemoteMedia;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.camera.DirectCameraViewModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: X.9i5  reason: invalid class name and case insensitive filesystem */
public final class C384909i5 extends AnonymousClass4DH implements AnonymousClass4DR {
    public static final String __redex_internal_original_name = "DirectPermanentMediaSendFragment";
    public AnonymousClass80Q A00;
    public AnonymousClass80C A01;
    public DirectCameraViewModel A02;
    public 2L6 A03;
    public Boolean A04;
    public String A05;
    public String A06;
    public List A07;
    public boolean A08;
    public boolean A09;
    public AnonymousClass7H6 A0A;
    public AnonymousClass7L0 A0B;
    public C254923tH A0C;
    public DirectThreadKey A0D;
    public boolean A0E;
    public boolean A0F = true;
    public final AnonymousClass0eM A0G = C227642jf.A02(this);

    public final String getModuleName() {
        return "stories_precapture_camera";
    }

    public final void onAttach(Context context) {
        AnonymousClass7L2 A072;
        0qQ.A0B(context, 0);
        C384909i5.super.onAttach(context);
        AnonymousClass0eM r3 = this.A0G;
        this.A0A = new AnonymousClass7H6(requireActivity(), AnonymousClass7TE.A0l(r3), (AnonymousClass3E6) null, 120, true, false);
        AnonymousClass9HD r2 = AnonymousClass9HC.A1b;
        UserSession A0l = AnonymousClass7TE.A0l(r3);
        Parcelable.Creator creator = Capabilities.CREATOR;
        AnonymousClass9HC A002 = r2.A00(A0l, C376189Gz.A00(0sn.A00));
        if (182.A06(0Tu.A05, AnonymousClass7TF.A0L(r3, 0), 36323625050123596L)) {
            setDayNightMode(AnonymousClass2k4.NIGHT);
            A072 = C250563lf.A05(2Yn.A01(context), A002);
        } else {
            A072 = C250563lf.A07(context, A002, this.A0E);
        }
        this.A0B = A072.A07;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        0qQ.A0B(bundle, 0);
        super.onSaveInstanceState(bundle);
        C226112fe.A0B.A05(requireActivity(), new C41070Ans(bundle, this));
    }

    public final void onViewCreated(View view, Bundle bundle) {
        2L6 r3;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AnonymousClass80C r0 = new AnonymousClass80C();
        this.A01 = r0;
        registerLifecycleListener(r0);
        AnonymousClass7TF.A17(this, new C41166ApQ(bundle, view, this));
        2L6 r1 = this.A03;
        if (r1 == null) {
            r1 = new 2L6(AnonymousClass12T.A00);
            this.A03 = r1;
        }
        C262204Co r02 = r1.A00;
        if ((r02 == null || !r02.isActive()) && (r3 = this.A03) != null) {
            r3.A00(requireActivity(), getViewLifecycleOwner(), new AhQ(this, 0), true);
        }
        view.post(new C40868Akc(this));
    }

    public static final void A00(C384909i5 r17, boolean z, boolean z2) {
        int i;
        boolean z3;
        String str;
        C384909i5 r0 = r17;
        View view = r0.mView;
        if (view != null) {
            if (C226122ff.A03()) {
                i = C226122ff.A01();
            } else {
                i = 0;
            }
            float A032 = 1.0f - (((float) i) / AnonymousClass7TE.A03(view));
            AnonymousClass0eM r4 = r0.A0G;
            UserSession A0l = AnonymousClass7TE.A0l(r4);
            C254923tH r7 = r0.A0C;
            DirectThreadKey directThreadKey = r0.A0D;
            0lg r5 = (0lg) r4.getValue();
            0qQ.A0B(r5, 0);
            0Tu r3 = 0Tu.A05;
            boolean A062 = 182.A06(r3, r5, 36323625049599301L);
            boolean A063 = 182.A06(r3, AnonymousClass7TF.A0L(r4, 0), 36323625050058059L);
            float A002 = (float) 182.A00(r3, AnonymousClass7TF.A0L(r4, 0), 37168049979589070L);
            float A003 = (float) 182.A00(r3, AnonymousClass7TF.A0L(r4, 0), 37168049980047823L);
            boolean A004 = new C227422jG(AnonymousClass7TE.A0l(r4)).A00();
            0qQ.A0B(A0l, 0);
            K6K A005 = LNF.A00(A0l, r7, directThreadKey, A002, A003, A032, false, z, A062, z2, A063, A004, true);
            A005.setDayNightMode(r0.dayNightMode);
            C65262LqH lqH = new C65262LqH(1, r0, A005);
            AnonymousClass7H6 r9 = r0.A0A;
            if (r9 == null) {
                str = "directAggregatedMediaViewerController";
            } else {
                boolean z4 = r0.A0E;
                String str2 = r0.A05;
                List list = r0.A07;
                boolean z5 = r0.A0F;
                Bundle bundle = r0.mArguments;
                if (bundle != null) {
                    z3 = bundle.getBoolean(C273654mx.A00(1233));
                } else {
                    z3 = false;
                }
                A005.A0F = r9;
                A005.A0D = lqH;
                A005.A0R = z4;
                A005.A0Q = false;
                A005.A01 = 10;
                A005.A02 = 10;
                A005.A0C = null;
                A005.A0L = null;
                A005.A0M = str2;
                if (list != null) {
                    A005.A0N = C64151LQo.A01(list);
                }
                A005.A0H = null;
                A005.A0K = null;
                A005.A0G = null;
                A005.A0P = z3;
                A005.A0S = z5;
                A005.A0O = true;
                AnonymousClass7L0 r2 = r0.A0B;
                if (r2 == null) {
                    str = "theme";
                } else {
                    A005.ADi(r2);
                    AnonymousClass37D A012 = AnonymousClass37D.A00.A01(r0.requireActivity());
                    if (A012 != null) {
                        ((AnonymousClass37F) A012).A0H = new C65747Lz1(r0, 2);
                        A012.A0N(A005, AnonymousClass05K.A00, 0, 255, true);
                    }
                    if (AnonymousClass7TF.A1Y(r0.A04, true) && r0.A06 != null) {
                        O02.A00(r0.requireContext(), true, false);
                        return;
                    }
                    return;
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final boolean getCanShowVoiceMessageBar() {
        return false;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return (AnonymousClass0wW) this.A0G.getValue();
    }

    public final boolean onBackPressed() {
        List list;
        C356848Vl r0;
        C356858Vm A002;
        ArrayList arrayList;
        RemoteMedia remoteMedia;
        String str;
        AnonymousClass37D A012 = AnonymousClass37D.A00.A01(requireActivity());
        boolean z = true;
        if (A012 == null || !((AnonymousClass37F) A012).A0g) {
            z = false;
        }
        if (!z) {
            AnonymousClass80Q r02 = this.A00;
            if (r02 == null || !r02.A06()) {
                if (this.A08 && (list = this.A07) != null) {
                    if (list.size() >= 2) {
                        AnonymousClass80Q r03 = this.A00;
                        if (r03 != null) {
                            List<AnonymousClass9SZ> list2 = r03.A00.A0b.A0Y.A01;
                            arrayList = AnonymousClass7TE.A1C();
                            for (AnonymousClass9SZ r04 : list2) {
                                GalleryItem galleryItem = r04.A01;
                                if (galleryItem.A03()) {
                                    C352218Cl r05 = galleryItem.A07;
                                    if (r05 != null) {
                                        str = r05.A07();
                                    }
                                } else if (galleryItem.A06()) {
                                    C349307zv r06 = galleryItem.A08;
                                    if (r06 != null) {
                                        str = r06.A0k;
                                    }
                                } else if (galleryItem.A04() && (remoteMedia = galleryItem.A04) != null) {
                                    str = remoteMedia.A07;
                                }
                                if (str != null) {
                                    arrayList.add(str);
                                }
                            }
                        } else {
                            arrayList = 0sn.A00;
                        }
                        Set A0k = 00k.A0k(arrayList);
                        ArrayList A1C = AnonymousClass7TE.A1C();
                        for (Object next : list) {
                            if (A0k.contains(((Medium) next).A0X)) {
                                A1C.add(next);
                            }
                        }
                        list = A1C;
                    }
                    this.A07 = list;
                    AnonymousClass80Q r07 = this.A00;
                    if (!(r07 == null || (r0 = r07.A00.A18) == null || (A002 = r0.A00()) == null)) {
                        A002.A0B(AnonymousClass05K.A01);
                    }
                    A00(this, 182.A06(0Tu.A05, AnonymousClass7TF.A0L(this.A0G, 0), 36323625049271617L), false);
                    return true;
                }
            }
            return true;
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
            return true;
        }
        return true;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        FragmentActivity activity;
        super.onActivityResult(i, i2, intent);
        if (i == 0 && i2 == -1 && (activity = getActivity()) != null) {
            activity.finish();
        }
    }

    public final void onCreate(Bundle bundle) {
        Boolean bool;
        int A022 = AnonymousClass0fD.A02(1599196775);
        C384909i5.super.onCreate(bundle);
        this.A02 = (DirectCameraViewModel) C320236s2.A00(requireArguments(), DirectCameraViewModel.class, AnonymousClass000.A00(106));
        requireArguments().getBoolean(AnonymousClass000.A00(903));
        this.A0E = requireArguments().getBoolean(AnonymousClass000.A00(218));
        Bundle requireArguments = requireArguments();
        String A002 = C273654mx.A00(1234);
        if (requireArguments.containsKey(A002)) {
            bool = Boolean.valueOf(requireArguments().getBoolean(A002));
        } else {
            bool = null;
        }
        this.A04 = bool;
        String string = requireArguments().getString(C273654mx.A00(1235));
        if (string != null) {
            this.A0C = C395269zU.A00(string);
        }
        this.A06 = requireArguments().getString(AnonymousClass000.A00(224));
        this.A0F = requireArguments().getBoolean(C273654mx.A00(1236), true);
        this.A0D = (DirectThreadKey) requireArguments().getParcelable(AnonymousClass000.A00(15));
        setModuleNameV2("stories_precapture_camera");
        AnonymousClass0fD.A09(2103038441, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-426540453);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_media_send, viewGroup, false);
        AnonymousClass0fD.A09(1022529965, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-527027108);
        super.onDestroyView();
        AnonymousClass80Q r0 = this.A00;
        if (r0 != null) {
            r0.A00();
        }
        this.A00 = null;
        unregisterLifecycleListener(this.A01);
        AnonymousClass80C r02 = this.A01;
        if (r02 != null) {
            r02.onDestroyView();
        }
        this.A01 = null;
        C71012OYk A002 = C63234Ktf.A00(AnonymousClass7TE.A0l(this.A0G));
        C71012OYk.A01(A002, new C67570Mq4(A002, 7));
        if (this.A09) {
            O02.A00(requireActivity(), false, true);
        }
        AnonymousClass0fD.A09(1034074739, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(393278925);
        super.onResume();
        Activity rootActivity = getRootActivity();
        0qQ.A0A(rootActivity);
        this.A0G.getValue();
        C357628Yy.A00(rootActivity);
        AnonymousClass0fD.A09(-1548691218, A022);
    }
}
