package com.instagram.creation.capture;

import X.00k;
import X.02m;
import X.0KC;
import X.0Tu;
import X.0fE;
import X.0mb;
import X.0mk;
import X.0nA;
import X.0qQ;
import X.0sl;
import X.0sn;
import X.0sr;
import X.0tX;
import X.0xI;
import X.0xY;
import X.0xa;
import X.1DL;
import X.1Wr;
import X.1YN;
import X.1iA;
import X.1wn;
import X.27p;
import X.28D;
import X.28K;
import X.28t;
import X.29f;
import X.2Yu;
import X.2bV;
import X.2cs;
import X.AnonymousClass000;
import X.AnonymousClass05K;
import X.AnonymousClass0eM;
import X.AnonymousClass0fD;
import X.AnonymousClass1Nd;
import X.AnonymousClass2bO;
import X.AnonymousClass36W;
import X.AnonymousClass3D4;
import X.AnonymousClass4DR;
import X.AnonymousClass5Gt;
import X.AnonymousClass5w8;
import X.AnonymousClass5w9;
import X.AnonymousClass6SR;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.AnonymousClass82Y;
import X.AnonymousClass82f;
import X.AnonymousClass8ZW;
import X.AnonymousClass8ZX;
import X.AnonymousClass8ZZ;
import X.AnonymousClass9PQ;
import X.AnonymousClass9Q1;
import X.B1N;
import X.C226262fy;
import X.C231002qi;
import X.C2366634p;
import X.C267844cJ;
import X.C273374mT;
import X.C273554mm;
import X.C279294yP;
import X.C2801950r;
import X.C282665Eg;
import X.C283255Gu;
import X.C3034168s;
import X.C349307zv;
import X.C3498382a;
import X.C3498482b;
import X.C3498582c;
import X.C3498682d;
import X.C3498782e;
import X.C3498882g;
import X.C3498982i;
import X.C3499082j;
import X.C3499182k;
import X.C3499282m;
import X.C3499382n;
import X.C3499582p;
import X.C3499682q;
import X.C352218Cl;
import X.C357268Xf;
import X.C357638Yz;
import X.C358248ab;
import X.C360948fP;
import X.C361528gN;
import X.C363138jC;
import X.C363528js;
import X.C365798nh;
import X.C394259xn;
import X.C49061Eof;
import X.C51966G9m;
import X.C51970G9q;
import X.C59743JWb;
import X.C59863Jag;
import X.C59864Jah;
import X.C59867Jal;
import X.C59870Jat;
import X.C59877Jb0;
import X.C59878Jb1;
import X.C59879Jb2;
import X.C59881Jb4;
import X.C59882Jb5;
import X.C59884Jb7;
import X.C59893JbI;
import X.C59933Jbx;
import X.C60055JeN;
import X.C60240fb;
import X.C63136Ks4;
import X.C63137Ks5;
import X.C63744L5c;
import X.C64681Lg9;
import X.C64698LgT;
import X.C65796Lzo;
import X.C71202bS;
import X.C71342cb;
import X.DbS;
import X.DbT;
import X.DbU;
import X.DbV;
import X.DbW;
import X.DbY;
import X.Dba;
import X.EWT;
import X.FFa;
import X.JTO;
import X.JTP;
import X.JTR;
import X.JTS;
import X.JW1;
import X.JW7;
import X.JW8;
import X.JW9;
import X.JWB;
import X.JWE;
import X.JWN;
import X.JWO;
import X.JWX;
import X.JXL;
import X.JZM;
import X.K0B;
import X.L0A;
import X.LG7;
import X.LU1;
import X.LV3;
import X.LY1;
import X.M6B;
import X.MQE;
import X.MQF;
import X.MXN;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;
import com.instagram.android.R;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.creation.activity.MediaCaptureActivity;
import com.instagram.creation.base.ui.mediatabbar.Tab;
import com.instagram.creation.capture.quickcapture.sundial.reshare.model.ClipsCelebrationReshareViewModel;
import com.instagram.creation.capture.quickcapture.superlativesticker.model.SuperlativeStickerClientModel;
import com.instagram.model.creation.MediaCaptureConfig;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.ui.widget.mediapicker.Folder;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MediaCaptureFragment extends C273374mT implements AnonymousClass4DR, AnonymousClass8ZW, AnonymousClass8ZX, AnonymousClass8ZZ, B1N, MQE, MQF {
    public float A00;
    public int A01 = 10;
    public C59881Jb4 A02;
    public C59863Jag A03;
    public C3499582p A04;
    public C363528js A05;
    public File A06;
    public boolean A07;
    public boolean A08;
    public 28D A09 = 28D.A5J;
    public Tab A0A;
    public AnonymousClass9Q1 A0B;
    public AnonymousClass82Y A0C;
    public 0xa A0D;
    public C231002qi A0E;
    public C63744L5c A0F;
    public String A0G = null;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public final 1wn A0K = C64698LgT.A00(this, 7);
    public final C59884Jb7 A0L = new C59884Jb7(this);
    public JW9 mActionBar;
    public View mActionBarShadow;
    public MXN mCaptureProvider;
    public View mCaptureView;
    public JW7 mGalleryPickerView;
    public C59864Jah mMediaTabHost;
    public C60055JeN mUnifiedCaptureView;

    public final void DHY(JW7 jw7, float f) {
        float min = Math.min(f, 0.0f);
        this.A00 = min;
        this.mActionBar.setTranslationY(min);
        this.mActionBarShadow.setTranslationY(this.A00);
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [android.content.Context, com.instagram.creation.activity.MediaCaptureActivity] */
    public final boolean DPr(List list) {
        Medium A032;
        String str;
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C365798nh r2 = (C365798nh) it.next();
            if (r2.A05.ordinal() != 0) {
                C349307zv r22 = r2.A03;
                if (r22 != null) {
                    A032 = C282665Eg.A03(AnonymousClass7TE.A0t(r22.A0k), 3, 0);
                    A032.A07 = r22.A09;
                    String str2 = r22.A0f;
                    if (str2 != null) {
                        A032.A0P = str2;
                    }
                    String str3 = r22.A0g;
                    if (str3 != null) {
                        A032.A0Q = str3;
                    }
                    CameraAREffect cameraAREffect = r22.A0P;
                    if (cameraAREffect != null) {
                        A032.A0M = cameraAREffect.A0K;
                        str = r22.A0j;
                    } else {
                        A1C.add(A032);
                    }
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            } else {
                C352218Cl r23 = r2.A02;
                if (r23 != null) {
                    File A033 = r23.A03();
                    0qQ.A0B(A033, 0);
                    A032 = C282665Eg.A03(A033, 1, 0);
                    A032.A07 = r23.A07;
                    String str4 = r23.A0a;
                    if (str4 != null) {
                        A032.A0P = str4;
                    }
                    String str5 = r23.A0b;
                    if (str5 != null) {
                        A032.A0Q = str5;
                    }
                    CameraAREffect cameraAREffect2 = r23.A0E;
                    if (cameraAREffect2 != null) {
                        A032.A0M = cameraAREffect2.A0K;
                        str = r23.A0c;
                    } else {
                        A1C.add(A032);
                    }
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            }
            if (str != null) {
                A032.A0S = str;
            }
            A1C.add(A032);
        }
        C273554mm activity = getActivity();
        if (activity != null) {
            ? r24 = (MediaCaptureActivity) activity;
            if (A1C.size() == 1) {
                r24.A09((Medium) A1C.get(0));
            } else {
                UserSession userSession = r24.A04;
                C3499682q r0 = r24.A09.A00;
                r0.getClass();
                C63136Ks4.A00(r24, userSession, r0, A1C);
                return false;
            }
        }
        return false;
    }

    public final boolean Erj() {
        return false;
    }

    public final String getModuleName() {
        return "tabbed_gallery_camera";
    }

    private void A00() {
        Integer num;
        Tab currentTab = this.mMediaTabHost.getCurrentTab();
        MXN mxn = this.mCaptureProvider;
        if (mxn != null) {
            num = ((C59867Jal) mxn).A0A;
        } else {
            num = null;
        }
        0xa r1 = this.A0D;
        0qQ.A0B(r1, 1);
        0xY AR4 = r1.AR4();
        if (currentTab != null) {
            AR4.E5Z("__CAPTURE_TAB_V2__", currentTab.A00);
        }
        if (num != null) {
            AR4.E5Z("__CAMERA_FACING__", num.intValue());
        }
        AR4.apply();
    }

    public static void A01(MediaCaptureFragment mediaCaptureFragment) {
        double d;
        2cs r0;
        MXN mxn = mediaCaptureFragment.mCaptureProvider;
        mxn.getClass();
        boolean CJh = mxn.CJh();
        C59864Jah jah = mediaCaptureFragment.mMediaTabHost;
        if (CJh) {
            jah.A03(JXL.A02, false);
            C59864Jah jah2 = mediaCaptureFragment.mMediaTabHost;
            d = 1.0d;
            jah2.A0I.setEnabled(false);
            r0 = jah2.A0H;
        } else {
            d = 0.0d;
            jah.A0I.setEnabled(true);
            r0 = jah.A0H;
        }
        r0.A06(d);
        mediaCaptureFragment.mActionBar.A02();
    }

    public static void A02(MediaCaptureFragment mediaCaptureFragment, float f) {
        float f2;
        float right;
        JW7 jw7 = mediaCaptureFragment.mGalleryPickerView;
        if (mediaCaptureFragment.A0I) {
            f2 = ((float) ((mediaCaptureFragment.mMediaTabHost.A0I.getChildCount() - 1) * mediaCaptureFragment.mActionBar.getWidth())) - f;
        } else {
            f2 = -f;
        }
        jw7.setTranslationX(f2);
        View view = mediaCaptureFragment.mCaptureView;
        if (mediaCaptureFragment.A0I) {
            right = ((float) ((mediaCaptureFragment.mMediaTabHost.A0I.getChildCount() - 2) * mediaCaptureFragment.mActionBar.getWidth())) - f;
        } else {
            right = ((float) mediaCaptureFragment.mGalleryPickerView.getRight()) + (-f);
        }
        view.setTranslationX(right);
    }

    public final C59743JWb B6e() {
        return this.mGalleryPickerView.A11;
    }

    public final C226262fy B6f() {
        return C226262fy.BELOW_ANCHOR;
    }

    public final boolean CX2() {
        return AnonymousClass7TF.A1V(this.mGalleryPickerView.A0B);
    }

    public final void DGI(JW7 jw7, Folder folder) {
        this.mActionBar.setSelectedFolder(folder);
    }

    public final void DHZ(JW7 jw7) {
        this.mActionBar.A02();
    }

    public final void DQZ(JW7 jw7, List list, List list2) {
        Tab currentTab = this.mMediaTabHost.getCurrentTab();
        if (!this.A0J && list.isEmpty() && currentTab == JXL.A00) {
            this.mMediaTabHost.A03(JXL.A01, false);
        }
        this.A0J = true;
        BaseAdapter baseAdapter = this.mActionBar.A00;
        baseAdapter.getClass();
        0fE.A00(baseAdapter, 1687863073);
        JW1.A00(getSession()).A0A(true, (String) null);
        this.A0B.A01.A05();
    }

    public final void DUJ() {
        C59893JbI jbI;
        long j;
        C349307zv r0;
        MXN mxn = this.mCaptureProvider;
        if (mxn != null) {
            jbI = ((C59867Jal) mxn).A06;
        } else {
            jbI = C59893JbI.GALLERY;
        }
        int ordinal = jbI.ordinal();
        if (ordinal == 0) {
            JW7 jw7 = this.mGalleryPickerView;
            if (jw7.A0B != null) {
                28t mediaType = jw7.getMediaType();
                this.A0C.A0n.clear();
                Iterator it = this.mGalleryPickerView.A1H.iterator();
                while (it.hasNext()) {
                    Medium A0O = JTP.A0O(it);
                    if (A0O != null) {
                        this.A0C.A0n.add(A0O);
                    }
                }
                if (mediaType != 28t.A06) {
                    UserSession session = getSession();
                    AnonymousClass82Y r7 = this.A0C;
                    0qQ.A0B(session, 0);
                    AnonymousClass7TF.A1C(r7, 1, mediaType);
                    int ordinal2 = r7.A01().ordinal();
                    int i = -1;
                    if (ordinal2 == 0) {
                        C352218Cl r02 = ((C365798nh) r7.A0m.get(r7.A00)).A02;
                        if (r02 != null) {
                            i = r02.A08;
                        }
                    } else if (ordinal2 == 1 && (r0 = ((C365798nh) r7.A0m.get(r7.A00)).A03) != null) {
                        i = r0.A0F;
                    }
                    List list = r7.A0n;
                    Medium medium = (Medium) 00k.A0O(C51966G9m.A1J(list), 0);
                    long j2 = 0;
                    if (medium != null) {
                        j = (long) medium.A04;
                    } else {
                        j = 0;
                    }
                    Long valueOf = Long.valueOf(j);
                    Medium medium2 = (Medium) 00k.A0O(C51966G9m.A1J(list), 0);
                    if (medium2 != null) {
                        j2 = (long) medium2.A0B;
                    }
                    List A1I = AnonymousClass7TE.A1I(0sr.A1P(new Long[]{valueOf, Long.valueOf(j2)}));
                    List A1J = C51966G9m.A1J(list);
                    ArrayList A0p = AnonymousClass7TF.A0p(A1J);
                    Iterator it2 = A1J.iterator();
                    while (it2.hasNext()) {
                        Medium A0W = JTO.A0W(it2);
                        A0p.add(0sr.A1P(new Long[]{DbS.A0j(A0W.A04), DbS.A0j(A0W.A0B)}));
                    }
                    List A1J2 = C51966G9m.A1J(list);
                    ArrayList A0p2 = AnonymousClass7TF.A0p(A1J2);
                    Iterator it3 = A1J2.iterator();
                    while (it3.hasNext()) {
                        AnonymousClass7TE.A1Y(A0p2, JTO.A0W(it3).A01());
                    }
                    List A1J3 = C51966G9m.A1J(list);
                    ArrayList A0p3 = AnonymousClass7TF.A0p(A1J3);
                    Iterator it4 = A1J3.iterator();
                    while (it4.hasNext()) {
                        A0p3.add(JTO.A0W(it4).A0X);
                    }
                    29f A0c = JTO.A0c(session);
                    String str = r7.A0F;
                    0qQ.A07(str);
                    A0c.A0Z(C360948fP.GALLERY, C279294yP.FEED, mediaType, r7.A09, str, (List) null, A1I, A0p, A0p2, A0p3, i, false);
                }
                this.mGalleryPickerView.A0W((L0A) null);
            } else {
                return;
            }
        } else if (ordinal == 2) {
            mxn.getClass();
            boolean A1R = AnonymousClass7TF.A1R((((double) ((C59867Jal) mxn).A0e.A06.A01.A00()) > 3000.0d ? 1 : (((double) ((C59867Jal) mxn).A0e.A06.A01.A00()) == 3000.0d ? 0 : -1)));
            MXN mxn2 = this.mCaptureProvider;
            if (A1R) {
                mxn2.E4X();
            } else {
                C59867Jal jal = (C59867Jal) mxn2;
                Context context = jal.getContext();
                AnonymousClass5Gt A0f = AnonymousClass7TG.A0f((Activity) context, context.getString(2131976492));
                A0f.A03(jal.A0S);
                A0f.A07(C283255Gu.A06);
                A0f.A02();
                View rootView = jal.getRootView();
                if (rootView != null) {
                    rootView.post(new M6B(jal, A0f));
                }
                C59867Jal.A06(jal, true);
                return;
            }
        } else {
            return;
        }
        C59881Jb4 jb4 = this.A02;
        jb4.getClass();
        C3499682q A002 = jb4.A04.A00();
        Activity activity = jb4.A02;
        0qQ.A0A(activity);
        C63137Ks5.A00(activity, jb4.A03, A002);
    }

    public final boolean DX6(Folder folder) {
        0xI A002 = C59882Jb5.A00(AnonymousClass05K.A06);
        A002.A0C("folder_name", folder.A00());
        Set set = folder.A05;
        A002.A08(Integer.valueOf(set.size()), AnonymousClass000.A00(3138));
        DbU.A1R(A002, getSession());
        UserSession session = getSession();
        List folders = this.mGalleryPickerView.getFolders();
        0qQ.A0B(session, 0);
        JZM.A00(session).A0F(folders);
        int i = folder.A02;
        if (i == -5) {
            File A042 = 0mb.A04(requireContext());
            this.A06 = A042;
            A042.getClass();
            FFa.A03(this, A042, 10002);
        } else if (!set.isEmpty()) {
            this.mGalleryPickerView.setCurrentFolderById(i);
            boolean A1Y = JTS.A1Y(getSession());
            JW9 jw9 = this.mActionBar;
            if (A1Y) {
                jw9.setSelectedMixedFolder(folder);
                return true;
            }
            jw9.setSelectedFolder(folder);
            return true;
        }
        return false;
    }

    public final boolean DX7(C65796Lzo lzo) {
        this.mGalleryPickerView.setCurrentRemoteFolder(lzo);
        this.mActionBar.setSelectedMixedFolder(lzo);
        return false;
    }

    public final List getCombinedFolders() {
        return this.mGalleryPickerView.getCombinedFolders();
    }

    public final C357268Xf getCurrentMixedFolder() {
        return this.mGalleryPickerView.A14.A0B();
    }

    public final List getFolders() {
        return this.mGalleryPickerView.getFolders();
    }

    public final boolean onBackPressed() {
        boolean z = true;
        if (!this.mGalleryPickerView.A0e()) {
            MXN mxn = this.mCaptureProvider;
            z = false;
            if (mxn != null) {
                if (this.A0H) {
                    this.A0H = false;
                    C59867Jal jal = (C59867Jal) mxn;
                    if (jal.A06 == C59893JbI.CAMCORDER && jal.CJh()) {
                        C358248ab A0Y = DbS.A0Y(jal.getContext());
                        A0Y.A09(2131960818);
                        A0Y.A08(2131960821);
                        LV3.A01(A0Y, jal, 31, 2131960822);
                        A0Y.A0H(new LU1(0), 2131960823);
                        DbT.A1V(A0Y);
                        return true;
                    } else if (JTR.A0k(jal.getContext()).COf()) {
                        return false;
                    } else {
                        UserSession userSession = jal.A0e.A04;
                        28K.A00(userSession).A0C(1iA.A0a, 0sl.A00);
                        JTP.A1M(userSession);
                        return false;
                    }
                } else {
                    C59867Jal jal2 = (C59867Jal) mxn;
                    if (jal2.A06 == C59893JbI.CAMCORDER && jal2.CJh()) {
                        C59870Jat jat = jal2.A0e;
                        if (jat.A01()) {
                            C59867Jal.A01(jal2);
                            jat.A06.A00();
                            jal2.A07();
                            return true;
                        }
                        jal2.A08();
                        return true;
                    } else if (JTR.A0k(jal2.getContext()).COf()) {
                        return false;
                    } else {
                        UserSession userSession2 = jal2.A0e.A04;
                        28K.A00(userSession2).A0C(1iA.A0a, 0sl.A00);
                        JTP.A1M(userSession2);
                        return false;
                    }
                }
            }
        }
        return z;
    }

    public final void Cuz(View view, C361528gN r7) {
        AnonymousClass0eM r2;
        UserSession session = getSession();
        List folders = this.mGalleryPickerView.getFolders();
        0qQ.A0B(session, 0);
        JZM.A00(session).A0G(folders);
        if (JTS.A1Y(getSession())) {
            UserSession session2 = getSession();
            0qQ.A0B(session2, 0);
            AnonymousClass9PQ.A08(this, session2, AnonymousClass000.A00(501), "posts", (Map) null);
        }
        JWO jwo = new JWO(requireContext(), this, getSession());
        JW7 jw7 = this.mGalleryPickerView;
        jwo.A00 = jw7;
        JW8 jw8 = jw7.A14;
        if (JW8.A09(jw8, jw8.A0K)) {
            r2 = jwo.A04;
            ((LG7) r2.getValue()).A04.A00 = true;
        } else if (C394259xn.A00(getSession(), C363138jC.A00)) {
            jwo.A01(view, r7, false);
            return;
        } else {
            r2 = jwo.A04;
        }
        ((LG7) r2.getValue()).A02(jwo);
    }

    public final void DCx(Exception exc) {
        JW1.A00(getSession()).A0A(false, exc.getMessage());
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 9587 && (i2 == 9683 || i2 == 9685)) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                UserSession session = getSession();
                AnonymousClass82Y r0 = this.A0C;
                AnonymousClass7TG.A1Q(session, r0);
                if (i2 == 9683) {
                    JZM.A00(session).A0A(28t.A06, r0.A09, 0sn.A00);
                }
                activity.setResult(i2, intent);
                activity.finish();
            }
        } else if (i2 == -1 && i == 10002) {
            intent.getClass();
            File file = this.A06;
            file.getClass();
            requireActivity().CpX(FFa.A01(intent, file));
        }
    }

    public final void onCancel() {
        JZM.A00(getSession());
        this.A0H = true;
        ((Activity) requireContext()).onBackPressed();
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(679246545);
        MediaCaptureFragment.super.onCreate(bundle);
        UserSession session = getSession();
        AnonymousClass9Q1 r2 = new AnonymousClass9Q1(session);
        this.A0B = r2;
        r2.A0R(requireContext(), C71342cb.A00(session), this);
        SharedPreferences preferences = requireActivity().getPreferences(0);
        preferences.getClass();
        this.A0D = new 0tX(preferences, "MediaCaptureFragment");
        this.A03 = new C59863Jag(requireActivity(), this);
        C3499582p Ajn = ((C267844cJ) requireContext()).Ajn();
        this.A04 = Ajn;
        if (JWE.A04(Ajn.A00()) == AnonymousClass36W.FOLLOWERS_SHARE) {
            JWB.A00(this, session);
        }
        Bundle A082 = DbY.A08(this);
        this.A07 = A082.getBoolean("standalone_mode", false);
        String A002 = AnonymousClass000.A00(863);
        if (A082.get(A002) instanceof 28D) {
            this.A09 = (28D) A082.get(A002);
        }
        if (bundle == null) {
            int intExtra = requireActivity().getIntent().getIntExtra("mediaCaptureTab", -1);
            if (intExtra >= 0 && !this.A07) {
                this.A0A = JXL.A00(intExtra);
            }
            this.A0G = requireActivity().getIntent().getStringExtra(AnonymousClass000.A00(2359));
        }
        this.A0I = 0mk.A02(requireContext());
        1YN A003 = AnonymousClass2bO.A00();
        QuickPromotionSlot quickPromotionSlot = QuickPromotionSlot.A0g;
        AnonymousClass2bO.A00();
        this.A0E = A003.A01(this, this, session, 2bV.A08((C71202bS) null), quickPromotionSlot);
        AnonymousClass6SR.A01();
        if (AnonymousClass6SR.A01().A0A != null) {
            this.A0F = new C63744L5c(requireContext());
        }
        this.A0C = new AnonymousClass82Y((C3499182k) null, (UserSession) null, (C357638Yz) null, (C3498682d) null, (C3498482b) null, (C3498382a) null, (C3499282m) null, (C3498882g) null, (C3498782e) null, (C3499382n) null, (ClipsCelebrationReshareViewModel) null, (AnonymousClass82f) null, (C2801950r) null, (SuperlativeStickerClientModel) null, (C3498982i) null, (C3498582c) null, (MusicAttributionConfig) null, (PendingRecipient) null, (C3499082j) null, (String) null, false, false, false, true, false, false, false, false);
        this.A01 = AnonymousClass7TF.A0Y(0Tu.A06, getSession(), 36610086482745314L).intValue();
        AnonymousClass0fD.A09(-1004418587, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(810733209);
        Context requireContext = requireContext();
        this.mMediaTabHost = new C59864Jah(requireContext);
        this.A0B.A01.A04();
        Context themedContext = getThemedContext();
        boolean z = this.A07;
        String str = this.A0G;
        int i = this.A01;
        JW7 jw7 = new JW7(themedContext, this.A09, this, getSession(), this, this.A04, str, i, z);
        this.mGalleryPickerView = jw7;
        C3499582p r5 = this.A04;
        if (r5.A00().COf() || (this.A07 && JWE.A01(r5).A0J)) {
            jw7.A0Z((Integer) null, JWX.A00(getSession()).A03, -1);
        } else {
            jw7.setCurrentFolderByIdAndSelectFirstItem(-1);
        }
        this.mGalleryPickerView.setId(R.id.gallery_picker_view);
        this.mGalleryPickerView.setTopOffset(AnonymousClass3D4.A00(requireContext()));
        this.mGalleryPickerView.A06 = this.mMediaTabHost.getTabHeight();
        this.A08 = AnonymousClass7TF.A1W(JWN.A02(requireContext()), AnonymousClass05K.A0N);
        LayoutInflater layoutInflater2 = layoutInflater;
        View inflate = layoutInflater2.inflate(R.layout.delete_clip_button, this.mMediaTabHost, false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, 0);
        inflate.setLayoutParams(layoutParams);
        if (this.A08) {
            layoutParams.height = AnonymousClass3D4.A00(requireContext());
            layoutParams.gravity = 49;
            0nA.A0X(inflate, DbS.A02(requireContext(), 2));
        } else {
            layoutParams.height = this.mMediaTabHost.getTabHeight();
            layoutParams.gravity = 81;
        }
        C59867Jal jal = new C59867Jal(requireContext, this.A0B.A00);
        jal.setDeleteClipButton(inflate, new K0B(0, inflate, this));
        this.mCaptureView = jal;
        this.mCaptureProvider = jal;
        jal.A04 = this;
        jal.A05 = requireActivity();
        JW9 jw9 = new JW9(getThemedContext(), getSession(), false, false, AnonymousClass7TF.A1W(JWE.A04(this.A04.A00()), AnonymousClass36W.PROFILE_PHOTO));
        this.mActionBar = jw9;
        if (this.A07) {
            jw9.A01();
        }
        this.mActionBar.setBaseDelegate(this);
        this.mActionBar.setGalleryDelegate(this, this.mGalleryPickerView);
        this.mActionBar.setFeedCaptureDelegate(this);
        C59864Jah jah = this.mMediaTabHost;
        JW7 jw72 = this.mGalleryPickerView;
        0qQ.A0B(jw72, 0);
        jah.A0L.add(jw72);
        Tab currentTab = jah.getCurrentTab();
        jw72.DqA(currentTab, currentTab);
        MediaCaptureConfig mediaCaptureConfig = JWE.A01(this.A04).A09;
        if (mediaCaptureConfig != null && mediaCaptureConfig.A06) {
            this.mMediaTabHost.addView(this.mGalleryPickerView, 0);
        }
        MXN mxn = this.mCaptureProvider;
        if (mxn != null) {
            C59864Jah jah2 = this.mMediaTabHost;
            jah2.A0L.add(mxn);
            Tab currentTab2 = jah2.getCurrentTab();
            mxn.DqA(currentTab2, currentTab2);
        }
        this.mMediaTabHost.addView(this.mCaptureView, 1);
        C59864Jah jah3 = this.mMediaTabHost;
        JW9 jw92 = this.mActionBar;
        0qQ.A0B(jw92, 0);
        jah3.A0L.add(jw92);
        jw92.A01 = jah3.getCurrentTab();
        this.mMediaTabHost.addView(this.mActionBar, 2);
        this.mMediaTabHost.addView(inflate, 3);
        View inflate2 = layoutInflater2.inflate(R.layout.action_bar_shadow, this.mMediaTabHost, false);
        this.mActionBarShadow = inflate2;
        this.mMediaTabHost.addView(inflate2);
        this.mMediaTabHost.setThemeBackground(getThemedContext());
        C59877Jb0 jb0 = new C59877Jb0(this);
        ArrayList A1C = AnonymousClass7TE.A1C();
        MediaCaptureConfig mediaCaptureConfig2 = JWE.A01(this.A04).A09;
        if (mediaCaptureConfig2 != null && mediaCaptureConfig2.A06) {
            A1C.add(JXL.A00);
        }
        MediaCaptureConfig mediaCaptureConfig3 = JWE.A01(this.A04).A09;
        if (mediaCaptureConfig3 != null && mediaCaptureConfig3.A09) {
            A1C.add(JXL.A01);
        }
        MediaCaptureConfig mediaCaptureConfig4 = JWE.A01(this.A04).A09;
        if (mediaCaptureConfig4 != null && mediaCaptureConfig4.A0A) {
            A1C.add(JXL.A02);
        }
        C59864Jah jah4 = this.mMediaTabHost;
        jah4.A0I.setTabs(A1C, new LY1(jah4, 63));
        jah4.A01 = A1C.stream().mapToInt(new C59878Jb1(C59879Jb2.A00)).min().orElse(0);
        C59864Jah jah5 = this.mMediaTabHost;
        boolean A1W = C51970G9q.A1W(A1C.size(), 1);
        jah5.A05 = A1W;
        jah5.A0I.setVisibility(DbW.A01(A1W ? 1 : 0));
        C59864Jah jah6 = this.mMediaTabHost;
        jah6.A0L.add(jb0);
        jah6.getCurrentTab();
        this.mGalleryPickerView.A0H = this;
        this.A00 = 0.0f;
        AnonymousClass1Nd.A00(getSession()).A01(this.A0K, C59933Jbx.class);
        this.A0E.Dh3();
        0xa r2 = this.A0D;
        0qQ.A0B(r2, 0);
        Tab A002 = JXL.A00(r2.getInt("__CAPTURE_TAB_V2__", 0));
        r2.getInt("__CAMERA_FACING__", 0);
        Tab tab = this.A0A;
        C59864Jah jah7 = this.mMediaTabHost;
        if (tab == null) {
            jah7.A03(A002, false);
        } else {
            jah7.A03(tab, false);
            A00();
        }
        C59864Jah jah8 = this.mMediaTabHost;
        AnonymousClass0fD.A09(-2134920274, A022);
        return jah8;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(1748398873);
        super.onDestroy();
        this.A02 = null;
        C49061Eof.A00(getSession()).A03(EWT.EDIT_PROFILE_PIC_FLOW, "edit_profile_picture_cancel");
        AnonymousClass0fD.A09(-68504693, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1138467989);
        super.onDestroyView();
        AnonymousClass1Nd.A00(getSession()).A02(this.A0K, C59933Jbx.class);
        this.mGalleryPickerView.A0H = null;
        this.mMediaTabHost.A0L.clear();
        JW9 jw9 = this.mActionBar;
        jw9.A02 = null;
        jw9.setGalleryDelegate((AnonymousClass8ZW) null, (C361528gN) null);
        this.mActionBar.A03 = null;
        MXN mxn = this.mCaptureProvider;
        if (mxn != null) {
            ((C59867Jal) mxn).A04 = null;
        }
        Window A0G2 = DbV.A0G(this);
        A0G2.getClass();
        A0G2.setBackgroundDrawableResource(2Yu.A0C(requireContext()));
        MediaCaptureFragmentLifecycleUtil.cleanupReferences(this);
        AnonymousClass0fD.A09(695626853, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(2027390713);
        MediaCaptureFragment.super.onPause();
        A00();
        1Wr r2 = 1Wr.A00;
        r2.getClass();
        UserSession session = getSession();
        C59881Jb4 jb4 = this.A02;
        jb4.getClass();
        r2.removeLocationUpdates(session, jb4);
        1Wr.A00.cancelSignalPackageRequest(getSession(), this.A02);
        this.A0L.removeMessages(1);
        C59863Jag jag = this.A03;
        if (jag.A06 == null) {
            0KC.A0D("PreciseOrientationEventListener", "Cannot detect sensors. Invalid disable");
        } else if (jag.A05) {
            C60240fb.A00(jag.A04, jag.A07);
            jag.A05 = false;
        }
        this.mGalleryPickerView.A0U();
        MXN mxn = this.mCaptureProvider;
        if (mxn != null) {
            C59867Jal jal = (C59867Jal) mxn;
            jal.A0Y.A0D();
            if (jal.A0H) {
                jal.A0H = false;
                jal.A0B();
            }
            jal.A0C = false;
            Dialog dialog = jal.A02;
            if (dialog != null && dialog.isShowing()) {
                dialog.dismiss();
            }
            C59867Jal.A06(jal, false);
            2cs r22 = jal.A0W;
            r22.A08(r22.A01, true);
            AnonymousClass1Nd.A00(jal.A0a).A02(jal.A0Z, C64681Lg9.class);
        }
        AnonymousClass0fD.A09(-2049000454, A022);
    }

    public final void onResume() {
        String str;
        int A022 = AnonymousClass0fD.A02(396772774);
        super.onResume();
        0xa r1 = this.A0D;
        0qQ.A0B(r1, 0);
        Tab tab = JXL.A00;
        Tab A002 = JXL.A00(r1.getInt("__CAPTURE_TAB_V2__", 0));
        int i = r1.getInt("__CAMERA_FACING__", 0);
        Integer valueOf = Integer.valueOf(i);
        Window A0G2 = DbV.A0G(this);
        A0G2.getClass();
        A0G2.setBackgroundDrawable(new ColorDrawable(JTP.A02(requireContext(), requireContext(), R.attr.igds_color_secondary_background)));
        if (!this.A07) {
            JWE.A01(this.A04).A0P.clear();
        }
        this.A02 = new C59881Jb4(requireActivity(), getSession(), this.A03, this.A04);
        1Wr r5 = 1Wr.A00;
        r5.getClass();
        r5.requestLocationUpdates(getSession(), this.A02, "MediaCaptureFragment");
        AnonymousClass9Q1 r2 = this.A0B;
        if (tab.equals(A002)) {
            C2366634p r12 = r2.A01;
            r2.A07.add(r12);
            r2.A06.add(r12);
            str = "gallery";
        } else {
            C2366634p r13 = r2.A00;
            r2.A07.add(r13);
            r2.A06.add(r13);
            str = "camera";
        }
        r2.A0J(DatePickerDialogModule.ARG_MODE, str);
        this.A0L.sendEmptyMessage(1);
        this.mGalleryPickerView.A0V();
        MXN mxn = this.mCaptureProvider;
        if (mxn != null) {
            int i2 = 0;
            if (valueOf != null) {
                i2 = i;
            }
            mxn.setInitialCameraFacing(i2);
            C59867Jal jal = (C59867Jal) mxn;
            02m.A0p.markerStart(18284547);
            if (1DL.A07(jal.getContext(), "android.permission.CAMERA")) {
                C59867Jal.A02(jal);
            } else {
                C59867Jal.A05(jal);
            }
            AnonymousClass1Nd.A00(jal.A0a).A01(jal.A0Z, C64681Lg9.class);
        }
        C363528js r14 = this.A05;
        if (r14 == null) {
            r14 = new C363528js(getSession());
            this.A05 = r14;
        }
        r14.A06("feed_composer_prefetch", false);
        UserSession session = getSession();
        AnonymousClass5w9 r0 = AnonymousClass5w8.A05;
        AnonymousClass5w9.A00(session).A08((C3034168s) null);
        AnonymousClass0fD.A09(1797210174, A022);
    }

    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(651514294);
        MediaCaptureFragment.super.onStart();
        UserSession session = getSession();
        AnonymousClass82Y r0 = this.A0C;
        AnonymousClass7TG.A1N(session, r0);
        27p.A01(session).A1r(r0.A05());
        AnonymousClass0fD.A09(218041820, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(2018108677);
        MediaCaptureFragment.super.onStop();
        UserSession session = getSession();
        0qQ.A0B(session, 0);
        27p.A01(session).A0Z();
        AnonymousClass0fD.A09(-1460515552, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C63744L5c l5c = this.A0F;
        if (l5c != null && !l5c.A00) {
            C358248ab A0Y = DbS.A0Y(l5c.A01);
            A0Y.A09(2131953209);
            A0Y.A08(2131953208);
            Dba.A1L(A0Y);
            l5c.A00 = true;
        }
    }
}
