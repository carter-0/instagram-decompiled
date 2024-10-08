package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.systrace.Systrace;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.81i  reason: invalid class name and case insensitive filesystem */
public final class C3496881i implements AnonymousClass0iw, 1DN {
    public static boolean A0Y = true;
    public static final String A0Z = 002.A0R("sup:", __redex_internal_original_name);
    public static final String __redex_internal_original_name = "CameraInitializationController";
    public C312136ds A00;
    public C343367q6 A01;
    public C340297l2 A02;
    public AnonymousClass8HC A03;
    public AnonymousClass8HB A04;
    public C339797kB A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final int A0D;
    public final Activity A0E;
    public final ViewGroup A0F;
    public final ViewStub A0G;
    public final C3496981j A0H = new C3496981j();
    public final C3497181l A0I = new C3497081k(this);
    public final C3496781h A0J;
    public final C3496181b A0K;
    public final UserSession A0L;
    public final C357638Yz A0M;
    public final List A0N = new ArrayList(4);
    public final AnonymousClass0eK A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public final C342857pH A0T;
    public final C342817pD A0U;
    public final C3495780x A0V;
    public final Integer A0W;
    public final Map A0X = new HashMap();

    private void A00() {
        UserSession userSession = this.A0L;
        Activity activity = this.A0E;
        if (C362988ir.A01(activity.getApplicationContext(), userSession)) {
            C363058j1.A02.A01(A0Z, "maybeStoreMediaStreamControllerCallback");
            1pd.A00(C362988ir.A00()).A00(activity.getApplicationContext(), userSession, new C40617Aff(this), __redex_internal_original_name);
        }
    }

    public static void A01(C3496881i r22, boolean z) {
        boolean z2;
        String str;
        String str2;
        String str3;
        C3496881i r3 = r22;
        C339797kB r0 = r3.A05;
        if (r0 != null) {
            r0.A00();
        }
        C340297l2 r4 = r3.A02;
        if (r4 == null) {
            if (Systrace.A0E(1)) {
                0fS.A01("igcam_start_camera_initialization", -670230927);
            }
            try {
                if (Systrace.A0E(1)) {
                    0fS.A01("igcam_inflate_optic_layout", 1084636240);
                }
                Activity activity = r3.A0E;
                boolean A002 = C305756Jk.A00(activity.getApplicationContext());
                UserSession userSession = r3.A0L;
                C340137kl r12 = new C340137kl(userSession, activity.getApplicationContext());
                r12.A00 = Integer.MAX_VALUE;
                A0Y = false;
                ViewStub viewStub = r3.A0G;
                C357638Yz r1 = r3.A0M;
                C3494680m r2 = r1.A08;
                String str4 = ((C279284yO) r2.A00).A01;
                Map map = C340157kn.A01;
                Context applicationContext = activity.getApplicationContext();
                C340177kp r19 = C340177kp.HIGH;
                r3.A02 = C340217kt.A02(viewStub, new C340187kq(applicationContext, r19, r19, r12, userSession), r12, r3.A0J, userSession, str4, A002 ? 1 : 0, r3.A0S);
                r3.A00();
                if (Systrace.A0E(1)) {
                    0fS.A00(184883532);
                }
                z2 = true;
                r3.A02.EdB(true);
                int A003 = C340377lA.A00(userSession, (C279284yO) r2.A00, Integer.valueOf(r3.A0D), r1.A0V(C358088aL.A0C));
                C340297l2 r7 = r3.A02;
                r7.A00 = A003;
                if (!A002) {
                    String name = ((28D) r3.A0O.get()).name();
                    if (z) {
                        str3 = ":GALLERY_SWIPE";
                    } else {
                        str3 = "";
                    }
                    r7.A0Q((C279284yO) r2.A00, 002.A0R(name, str3));
                } else {
                    r3.A0K.A00(r7.A0H.A00(), r7, ((C279284yO) r2.A00).A01, r3.A0R);
                    C340297l2 r42 = r3.A02;
                    String name2 = ((28D) r3.A0O.get()).name();
                    if (z) {
                        str2 = ":GALLERY_SWIPE";
                    } else {
                        str2 = "";
                    }
                    r42.A0Q((C279284yO) r2.A00, 002.A0R(name2, str2));
                }
                if (Systrace.A0E(1)) {
                    0fS.A00(471589795);
                }
            } catch (Throwable th) {
                if (Systrace.A0E(1)) {
                    0fS.A00(-1342204948);
                }
                throw th;
            }
        } else {
            String name3 = ((28D) r3.A0O.get()).name();
            if (z) {
                str = ":GALLERY_SWIPE";
            } else {
                str = "";
            }
            r4.A0P((C279284yO) r3.A0M.A08.A00, 002.A0R(name3, str));
            AnonymousClass8HB r02 = r3.A04;
            if (r02 != null) {
                AnonymousClass8FL r13 = (AnonymousClass8FL) r02.A00.A1B.A00.A00();
                if (!r13.A09 && r13.A08) {
                    r13.A09 = true;
                    C343437qD r23 = r13.A06;
                    if (r23 != null) {
                        AnonymousClass8FP r14 = r13.A0F;
                        0qQ.A0B(r14, 0);
                        r23.A00.A0G(r14);
                    }
                }
            }
            z2 = true;
            r4.EdB(true);
            r3.A00();
        }
        r3.A02.getClass();
        r3.A02.A0O(r3.A0I);
        r3.A06 = z2;
        List<C352918Fo> list = r3.A0N;
        synchronized (list) {
            for (C352918Fo D0E : list) {
                D0E.D0E();
            }
        }
    }

    public static void A02(C3496881i r7, boolean z) {
        String[] A052;
        if (!r7.A0C) {
            r7.A0C = true;
            r7.A0B = z;
            if (Systrace.A0E(1)) {
                0lq.A03(AnonymousClass000.A00(643), 0);
            }
            Activity activity = r7.A0E;
            String[] strArr = {"android.permission.CAMERA", "android.permission.RECORD_AUDIO"};
            UserSession userSession = r7.A0L;
            0qQ.A0B(userSession, 0);
            0qQ.A0B(activity, 1);
            if (!C361378g8.A01(userSession) || (!C2604245p.A03(activity) && !C2604245p.A02(activity))) {
                A052 = C2604245p.A05(activity);
            } else {
                A052 = new String[0];
            }
            int length = A052.length;
            String[] strArr2 = (String[]) Arrays.copyOf(strArr, length + 2);
            System.arraycopy(A052, 0, strArr2, 2, length);
            1DL.A04(activity, r7, strArr2);
        }
    }

    public final void A03(C3497181l r3) {
        C343367q6 r1 = this.A01;
        if (r1 == null || !this.A0A) {
            this.A0H.A01(r3);
        } else {
            r3.DKf(r1);
        }
    }

    public final void A04(C352918Fo r3) {
        List list = this.A0N;
        synchronized (list) {
            if (this.A06) {
                r3.D0E();
            }
            list.add(r3);
        }
    }

    public final void A05(boolean z) {
        Activity activity = this.A0E;
        Context applicationContext = activity.getApplicationContext();
        0qQ.A0B(applicationContext, 0);
        0qg.A01();
        if (0qg.A00(applicationContext, false) < 78643200) {
            String A0g = 002.A0g(activity.getString(2131954549), "\n\n", activity.getString(2131954550));
            C358248ab r2 = new C358248ab(activity);
            r2.A09(2131954551);
            r2.A0q(A0g);
            r2.A0H((DialogInterface.OnClickListener) null, 2131968772);
            AnonymousClass0fN.A00(r2.A02());
            return;
        }
        C342817pD r22 = this.A0U;
        if (r22 != null && r22.A00 < r22.A02) {
            r22.A01 = this.A0T;
        } else if (this.A0O.get() == 28D.A0Z || this.A06 || AnonymousClass8FD.A00(activity.getApplicationContext())) {
            if (A0Y) {
                this.A0F.post(new C340107ki(this, z));
            } else {
                A01(this, z);
            }
        } else if (!this.A07) {
            this.A07 = true;
            A02(this, z);
        } else {
            0f9 AEf = 0wj.A01.AEf(A0Z, 817892279);
            AEf.ABQ(DialogModule.KEY_MESSAGE, "Not starting the camera, permissions were requested by denied since last hide");
            AEf.report();
        }
    }

    public final void DWm(Map map) {
        String str;
        if (Systrace.A0E(1)) {
            0lq.A04(AnonymousClass000.A00(643), 0);
        }
        this.A0C = false;
        Map map2 = this.A0X;
        Map map3 = map;
        map2.putAll(map);
        if (this.A09) {
            this.A08 = false;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            String[] strArr = {"android.permission.CAMERA", "android.permission.RECORD_AUDIO"};
            int i = 0;
            boolean z = true;
            do {
                String str2 = strArr[i];
                arrayList.add(str2);
                if (map2.get(str2) != null) {
                    str = map2.get(str2).toString();
                } else {
                    str = "Error reading permission status";
                }
                arrayList2.add(str);
                if (!C346927vz.GRANTED.equals(map2.get(str2))) {
                    z = false;
                }
                if (C346927vz.DENIED_DONT_ASK_AGAIN.equals(map2.get(str2))) {
                    this.A08 = true;
                }
                i++;
            } while (i < 2);
            if (1 - this.A0W.intValue() != 0) {
                0xI A002 = 0xI.A00(this, "story_camera_permissions");
                A002.A0D("permission_type", arrayList);
                A002.A0D("permission_action", arrayList2);
                C60510iO.A00(this.A0L).EFq(A002);
            }
            if (z) {
                A01(this, this.A0B);
            } else {
                C339797kB r2 = this.A05;
                if (r2 == null) {
                    ViewGroup viewGroup = this.A0F;
                    Context context = viewGroup.getContext();
                    ViewGroup viewGroup2 = (ViewGroup) viewGroup.requireViewById(R.id.camera_permissions_cover);
                    0qQ.A0B(viewGroup2, 1);
                    r2 = new C339797kB(viewGroup2, R.layout.permission_empty_state_view);
                    r2.A06(map);
                    Drawable drawable = context.getDrawable(R.drawable.ig_illustrations_illo_camera_microphone_permissions);
                    ImageView imageView = r2.A02;
                    if (imageView != null) {
                        imageView.setImageDrawable(drawable);
                        imageView.setVisibility(0);
                    }
                    r2.A05(context.getString(2131969365));
                    r2.A04(context.getString(2131969364));
                    r2.A02(2131969362);
                    r2.A03(new AnonymousClass9W9(this));
                    r2.A01();
                    this.A05 = r2;
                }
                r2.A06(map);
            }
            AnonymousClass4O9 r0 = AnonymousClass4O9.CAMERA;
            AnonymousClass4OA r3 = AnonymousClass4OA.UNSPECIFIED;
            List A1P = 0sr.A1P(new Pair[]{new Pair(r0, r3), new Pair(AnonymousClass4O9.MICROPHONE, r3)});
            UserSession userSession = this.A0L;
            AnonymousClass4O6 r7 = new AnonymousClass4O6(new AnonymousClass9W2(), userSession);
            Long A003 = AnonymousClass4O7.A00(userSession);
            List singletonList = Collections.singletonList(AnonymousClass4O8.UNKNOWN);
            0qQ.A07(singletonList);
            r7.A01(A003, "CAMERA_INITIALIZATION_CONTROLLER", A1P, singletonList, map3);
        }
    }

    public final String getModuleName() {
        return "reel_composer_camera";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0058, code lost:
        if (r9.A3m != false) goto L_0x005a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C3496881i(android.view.ViewGroup r5, X.C3496781h r6, X.C3496181b r7, X.C357638Yz r8, X.AnonymousClass80D r9, X.C342817pD r10, X.C3495780x r11, X.AnonymousClass0eK r12) {
        /*
            r4 = this;
            r4.<init>()
            r1 = 4
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            r4.A0N = r0
            X.81j r0 = new X.81j
            r0.<init>()
            r4.A0H = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r4.A0X = r0
            X.81k r0 = new X.81k
            r0.<init>(r4)
            r4.A0I = r0
            android.app.Activity r0 = r9.A05
            r4.A0E = r0
            com.instagram.common.session.UserSession r0 = r9.A0S
            r4.A0L = r0
            r4.A0F = r5
            r4.A0K = r7
            r4.A0J = r6
            r4.A0U = r10
            if (r10 == 0) goto L_0x0137
            X.7pH r0 = new X.7pH
            r0.<init>(r4, r10)
        L_0x0037:
            r4.A0T = r0
            java.lang.Integer r0 = r9.A26
            r3 = 0
            if (r0 != 0) goto L_0x0131
            r0 = 0
        L_0x003f:
            r4.A0D = r0
            java.lang.String r1 = r9.A2q
            java.lang.String r0 = "story_selfie_reply"
            boolean r2 = r0.equals(r1)
            if (r2 == 0) goto L_0x012d
            java.lang.Integer r0 = X.AnonymousClass05K.A01
        L_0x004d:
            r4.A0W = r0
            if (r2 != 0) goto L_0x005a
            boolean r0 = r9.A3E
            if (r0 != 0) goto L_0x005a
            boolean r1 = r9.A3m
            r0 = 1
            if (r1 == 0) goto L_0x005b
        L_0x005a:
            r0 = 0
        L_0x005b:
            r4.A0S = r0
            r4.A0M = r8
            boolean r0 = r9.A35
            r4.A0Q = r0
            r4.A0V = r11
            X.82i r0 = r9.A18
            if (r0 == 0) goto L_0x0070
            X.9Tg r1 = r0.A02
            X.9Tg r0 = X.C379289Tg.CLIPS
            if (r1 != r0) goto L_0x0070
            r3 = 1
        L_0x0070:
            r4.A0R = r3
            boolean r1 = r9.A3E
            r4.A0P = r1
            r4.A0O = r12
            if (r2 == 0) goto L_0x009a
            r0 = 2131431748(0x7f0b1144, float:1.8485234E38)
            android.view.View r0 = r5.findViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            if (r0 == 0) goto L_0x0095
            android.view.View r1 = r0.inflate()
            r0 = 2131431745(0x7f0b1141, float:1.8485228E38)
        L_0x008c:
            android.view.View r0 = r1.requireViewById(r0)
        L_0x0090:
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            r4.A0G = r0
        L_0x0094:
            return
        L_0x0095:
            r0 = 2131431745(0x7f0b1141, float:1.8485228E38)
            goto L_0x0127
        L_0x009a:
            boolean r0 = r9.A3m
            if (r0 == 0) goto L_0x00b1
            r0 = 2131443739(0x7f0b401b, float:1.8509555E38)
            android.view.View r0 = r5.findViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            if (r0 == 0) goto L_0x0124
            android.view.View r1 = r0.inflate()
            r0 = 2131443736(0x7f0b4018, float:1.8509549E38)
            goto L_0x008c
        L_0x00b1:
            if (r1 == 0) goto L_0x0104
            r0 = 2131428726(0x7f0b0576, float:1.8479105E38)
            android.view.View r0 = r5.findViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            if (r0 == 0) goto L_0x00fc
            android.view.View r1 = r0.inflate()
            r0 = 2131428716(0x7f0b056c, float:1.8479084E38)
            android.view.View r0 = r1.requireViewById(r0)
        L_0x00c9:
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            r4.A0G = r0
            r0 = 2131428720(0x7f0b0570, float:1.8479092E38)
            android.view.View r0 = r5.findViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            if (r0 == 0) goto L_0x0094
            android.view.View r1 = r0.inflate()
            r0 = 2131428718(0x7f0b056e, float:1.8479088E38)
            android.view.View r2 = r1.requireViewById(r0)
            android.widget.TextView r2 = (android.widget.TextView) r2
            android.content.Context r0 = r5.getContext()
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131953814(0x7f130896, float:1.954411E38)
            java.lang.String r0 = r1.getString(r0)
            android.text.Spanned r0 = android.text.Html.fromHtml(r0)
            r2.setText(r0)
            return
        L_0x00fc:
            r0 = 2131428716(0x7f0b056c, float:1.8479084E38)
            android.view.View r0 = r5.requireViewById(r0)
            goto L_0x00c9
        L_0x0104:
            boolean r0 = r9.A3Z
            if (r0 == 0) goto L_0x0120
            r0 = 2131438053(0x7f0b29e5, float:1.8498022E38)
            android.view.View r0 = r5.findViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            if (r0 == 0) goto L_0x011c
            android.view.View r1 = r0.inflate()
            r0 = 2131438040(0x7f0b29d8, float:1.8497996E38)
            goto L_0x008c
        L_0x011c:
            r0 = 2131438040(0x7f0b29d8, float:1.8497996E38)
            goto L_0x0127
        L_0x0120:
            r0 = 2131429476(0x7f0b0864, float:1.8480626E38)
            goto L_0x0127
        L_0x0124:
            r0 = 2131443736(0x7f0b4018, float:1.8509549E38)
        L_0x0127:
            android.view.View r0 = r5.requireViewById(r0)
            goto L_0x0090
        L_0x012d:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            goto L_0x004d
        L_0x0131:
            int r0 = r0.intValue()
            goto L_0x003f
        L_0x0137:
            r0 = 0
            goto L_0x0037
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3496881i.<init>(android.view.ViewGroup, X.81h, X.81b, X.8Yz, X.80D, X.7pD, X.80x, X.0eK):void");
    }
}
