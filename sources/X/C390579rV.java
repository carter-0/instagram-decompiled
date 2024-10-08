package X;

import android.content.Intent;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.creation.cameraconfiguration.CameraConfiguration;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.ui.swipenavigation.PositionConfig;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9rV  reason: invalid class name and case insensitive filesystem */
public final class C390579rV extends C15291UZw {
    public static final String __redex_internal_original_name = "UniversalCreationQuickCameraFragment";
    public 28D A00 = 28D.A42;
    public String A01 = "stories_precapture_camera";
    public boolean A02;
    public boolean A03;
    public long A04;
    public RectF A05;
    public AnonymousClass80E A06;
    public PendingRecipient A07;
    public AnonymousClass3NV A08;
    public 2L6 A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public boolean A0D;
    public boolean A0E;
    public final List A0F = AnonymousClass7TE.A1D(AnonymousClass7TE.A1I(AnonymousClass9QA.A00));

    public final AnonymousClass80D A02(ViewGroup viewGroup) {
        long j;
        0qQ.A0B(viewGroup, 0);
        HashSet A1F = AnonymousClass7TE.A1F();
        if (this.A03) {
            A1F.add(C363138jC.A00);
            A1F.add(AnonymousClass9QA.A00);
            A1F.add(AnonymousClass80N.A00);
            A1F.add(AnonymousClass80L.A00);
        } else {
            A1F.addAll(this.A0F);
        }
        C279284yO r4 = (C279284yO) this.A0F.get(0);
        AnonymousClass80D A002 = AnonymousClass80D.A00();
        AnonymousClass80D.A0D(A002, new WUP(this, 33), this);
        AnonymousClass80I r1 = AnonymousClass80H.A02;
        0qQ.A06(this.A00);
        AnonymousClass80H A022 = r1.A02(A1F);
        A022.getClass();
        A002.A0W = A022;
        boolean z = false;
        if (r4 != AnonymousClass80L.A00) {
            z = true;
        }
        AnonymousClass80D.A05(viewGroup, A002, this, z);
        AnonymousClass80D.A07(this.A00, this, A002);
        A002.A3H = true;
        A002.A47 = true;
        AnonymousClass80D.A0B(A002);
        A002.A3Q = true;
        A002.A3N = true;
        A002.A3f = true;
        A002.A1S = this.A07;
        A002.A25 = Boolean.valueOf(this.A0E);
        A002.A2o = this.A0C;
        A002.A2d = this.A0A;
        A002.A3c = this.A02;
        A002.A3J = true;
        RectF rectF = this.A05;
        if (rectF != null) {
            j = 0;
            A002.A06 = rectF;
            A002.A07 = rectF;
            A002.A3r = false;
            A002.A3v = true;
            A002.A33 = false;
        } else {
            j = 0;
            A002.A06 = null;
            A002.A07 = null;
            A002.A3r = false;
            A002.A3v = false;
            A002.A33 = true;
        }
        A002.A04 = j;
        C39605A1v.A00((AnonymousClass84B) null, C358098aM.A00(r4, new C358088aL[0]), A002, (C62622Kit) null, (String) null, (String) null, (String) null, (String) null);
        AnonymousClass80E r0 = this.A06;
        if (r0 == null) {
            if (this.A07 != null) {
                r0 = AnonymousClass80E.GROUP_PROFILE;
            } else {
                r0 = AnonymousClass80E.ALL;
            }
        }
        A002.A0y = r0;
        A002.A3g = true;
        AnonymousClass3NV r02 = this.A08;
        if (r02 != null) {
            A002.A1w = r02;
        }
        String str = this.A0B;
        if (str != null) {
            A002.A2n = str;
        }
        A002.A2B = Long.valueOf(this.A04);
        return A002;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        2L6 r4 = new 2L6(AnonymousClass12T.A00);
        this.A09 = r4;
        r4.A00(requireActivity(), getViewLifecycleOwner(), new AhQ(this, 2), true);
    }

    public static final void A00(C390579rV r19) {
        C390579rV r2 = r19;
        if (r2.A0D) {
            2ZS A002 = C71172bH.A00();
            if (A002 instanceof 2ZS) {
                2ZS r1 = A002;
                r1.FLD(new PositionConfig((AnonymousClass57C) null, (CameraConfiguration) null, (AnonymousClass3QO) null, "media_posted_to_feed", (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0.0f, 0, false));
                C240073Jm.A00 = true;
                r1.Enh(1QK.A0C);
                r2.requireActivity().finish();
            }
        }
    }

    public final String getModuleName() {
        return this.A01;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 10001 && i2 == -1) {
            A00(this);
            if (this.A02) {
                2ZS A002 = C71172bH.A00();
                if (A002 instanceof 2ZS) {
                    C240073Jm.A00 = true;
                    A002.Enh(1QK.A0E);
                    requireActivity().finish();
                }
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        String str;
        int A022 = AnonymousClass0fD.A02(169235867);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            ArrayList<String> stringArrayList = bundle2.getStringArrayList(AnonymousClass000.A00(1048));
            if (stringArrayList != null && !stringArrayList.isEmpty()) {
                List list = this.A0F;
                list.clear();
                Iterator<String> it = stringArrayList.iterator();
                while (it.hasNext()) {
                    list.add(C338817ia.A00(AnonymousClass7TE.A18(it)));
                }
                Object A13 = AnonymousClass7TE.A13(list);
                if (A13 == AnonymousClass9QA.A00) {
                    str = "stories_precapture_camera";
                } else if (A13 instanceof AnonymousClass80O) {
                    str = "clips_precapture_camera";
                } else if (A13 == AnonymousClass80L.A00) {
                    str = "live_precapture_camera";
                }
                this.A01 = str;
            }
            this.A07 = (PendingRecipient) bundle2.getParcelable(C273654mx.A00(31));
            this.A02 = bundle2.getBoolean(AnonymousClass000.A00(35), false);
            this.A0D = bundle2.getBoolean(AnonymousClass000.A00(3616));
            String A002 = C273654mx.A00(175);
            if (bundle2.getSerializable(A002) != null) {
                this.A06 = (AnonymousClass80E) bundle2.getSerializable(A002);
            }
            this.A05 = (RectF) bundle2.getParcelable("camera_entry_bounds");
            String A003 = AnonymousClass000.A00(2929);
            String str2 = "";
            if (bundle2.getString(A003) != null) {
                String string = bundle2.getString(A003);
                if (string == null) {
                    string = str2;
                }
                this.A0C = string;
            }
            if (bundle2.getSerializable("camera_entry_point") != null) {
                this.A00 = bundle2.getSerializable("camera_entry_point");
            }
            String A004 = AnonymousClass000.A00(961);
            if (bundle2.getString(A004) != null) {
                String string2 = bundle2.getString(A004);
                if (string2 == null) {
                    string2 = str2;
                }
                this.A08 = C278154wM.A01(string2);
            }
            if (bundle2.getString("IgLiveCapture.CAPTURE_FRAGMENT_ARGUMENTS_KEY_LIVE_TITLE") != null) {
                String string3 = bundle2.getString("IgLiveCapture.CAPTURE_FRAGMENT_ARGUMENTS_KEY_LIVE_TITLE");
                if (string3 == null) {
                    string3 = str2;
                }
                this.A0B = string3;
            }
            String A005 = AnonymousClass000.A00(2324);
            if (bundle2.getString(A005) != null) {
                this.A0E = bundle2.getBoolean(A005);
            }
            this.A04 = bundle2.getLong("IgLiveCapture.CAPTURE_FRAGMENT_ARGUMENTS_NOTE_ID", 0);
            this.A03 = bundle2.getBoolean("show_all_destinations", false);
            if (bundle2.getString("quick_snap_initial_user_id") != null) {
                String string4 = bundle2.getString("quick_snap_initial_user_id");
                if (string4 != null) {
                    str2 = string4;
                }
                this.A0A = str2;
            }
        }
        AnonymousClass0fD.A09(257130834, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-438675455);
        super.onResume();
        AnonymousClass7TF.A17(this, new C40927AlZ(this));
        AnonymousClass0fD.A09(1510989467, A022);
    }
}
