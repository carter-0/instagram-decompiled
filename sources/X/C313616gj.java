package X;

import android.animation.ValueAnimator;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.widget.EditText;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;
import com.instagram.video.live.mvvm.model.repository.IgLiveQuestionSubmissionsRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveQuestionsRepository;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;
import instagram.features.stories.fragment.ReelViewerFragment;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import org.json.JSONObject;

/* renamed from: X.6gj  reason: invalid class name and case insensitive filesystem */
public final class C313616gj implements AnonymousClass6Z1, C313626gk {
    public C270194gL A00;
    public C305836Jt A01;
    public C64514LdG A02;
    public C313716gt A03;
    public LOI A04;
    public LAW A05;
    public LGX A06;
    public C64102LMw A07;
    public LEK A08;
    public String A09;
    public C262204Co A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public String A0G;
    public String A0H;
    public final Handler A0I = new Handler(Looper.getMainLooper());
    public final FragmentActivity A0J;
    public final AnonymousClass4DH A0K;
    public final AnonymousClass0iw A0L;
    public final 1a8 A0M = new 1a8(C318146oT.A01);
    public final UserSession A0N;
    public final C313756gx A0O;
    public final AnonymousClass4DU A0P;
    public final AnonymousClass3BQ A0Q;
    public final C313596gh A0R;
    public final C249763kK A0S;
    public final C313546gc A0T;
    public final C313556gd A0U;
    public final C313736gv A0V;
    public final C313886hJ A0W;
    public final String A0X;
    public final String A0Y;
    public final C62320sa A0Z;

    public final boolean COF() {
        return false;
    }

    public final boolean COG() {
        return false;
    }

    public final void Cfr() {
    }

    public final void DLs(Reel reel) {
        LOI loi;
        C270194gL r0;
        0qQ.A0B(reel, 0);
        if (A04(this) && (loi = this.A04) != null && !loi.A01() && (r0 = reel.A0H) != null) {
            A00(r0, this);
        }
    }

    public final void DWT(String str) {
        C64855LjH ljH;
        LRB lrb;
        C62245Kcf kcf;
        C62267Kd1 kd1;
        C57106IOu iOu;
        LGN lgn;
        C64705Lgb lgb;
        C57106IOu iOu2;
        this.A0D = true;
        C305836Jt r0 = this.A01;
        if (!(r0 == null || (iOu2 = r0.A09) == null)) {
            iOu2.A0A.onStop();
        }
        this.A0I.removeCallbacksAndMessages((Object) null);
        if (this.A0F) {
            this.A0F = false;
            LGX lgx = this.A06;
            if (lgx != null) {
                lgx.A01();
            }
            C262204Co r02 = this.A0A;
            if (r02 != null) {
                r02.AG7((CancellationException) null);
            }
            this.A0A = null;
            C305836Jt r03 = this.A01;
            if (!(r03 == null || (lgb = r03.A0I) == null)) {
                C60310JjB jjB = (C60310JjB) lgb.A08.getValue();
                C262204Co r04 = jjB.A01;
                if (r04 != null) {
                    r04.AG7((CancellationException) null);
                }
                jjB.A01 = null;
                C60310JjB.A01(jjB, true);
            }
            C305836Jt r05 = this.A01;
            if (!(r05 == null || (lgn = r05.A0E) == null)) {
                lgn.A02();
            }
            C305836Jt r06 = this.A01;
            if (!(r06 == null || (iOu = r06.A09) == null)) {
                iOu.A0A.onStop();
            }
            C305836Jt r07 = this.A01;
            if (!(r07 == null || (kd1 = r07.A0J) == null)) {
                kd1.A05.onStop();
            }
            C305836Jt r08 = this.A01;
            if (!(r08 == null || (kcf = r08.A06) == null)) {
                kcf.A06();
            }
            C305836Jt r09 = this.A01;
            if (!(r09 == null || (lrb = r09.A0H) == null)) {
                C262204Co r010 = lrb.A00;
                if (r010 != null) {
                    r010.AG7((CancellationException) null);
                }
                lrb.A00 = null;
            }
            C305836Jt r011 = this.A01;
            if (r011 != null && (ljH = r011.A0L) != null) {
                C60205JhO jhO = ljH.A00;
                if (jhO == null) {
                    0qQ.A0F("viewModel");
                    throw AnonymousClass00P.createAndThrow();
                }
                C318136oS A002 = C318116oQ.A00(jhO);
                1Eo.A05(19B.A00, new MG2(jhO, (AnonymousClass4D7) null, 29), A002);
                C262204Co r012 = ljH.A01;
                if (r012 != null) {
                    r012.AG7((CancellationException) null);
                }
                ljH.A01 = null;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.0r1, java.lang.Object] */
    public final void Dfe() {
        C64855LjH ljH;
        LRB lrb;
        C62245Kcf kcf;
        LGN lgn;
        C64872LjY ljY;
        C64874Lja lja;
        C62267Kd1 kd1;
        C57106IOu iOu;
        C64705Lgb lgb;
        String str;
        this.A0D = false;
        ? obj = new Object();
        obj.A00 = true;
        C262204Co r0 = this.A0A;
        if (r0 != null) {
            r0.AG7((CancellationException) null);
        }
        C61860pz r1 = new C61860pz(new AnonymousClass9KB(this, obj, (AnonymousClass4D7) null, 5), C313766gy.A00(this.A0N).A03().A00);
        AnonymousClass4DH r5 = this.A0K;
        this.A0A = AnonymousClass11O.A03(AnonymousClass07a.A00(r5.getViewLifecycleOwner()), r1);
        C305836Jt r02 = this.A01;
        if (!(r02 == null || (lgb = r02.A0I) == null)) {
            C270194gL r03 = this.A00;
            if (r03 != null) {
                str = r03.A0X;
                str.getClass();
            } else {
                str = null;
            }
            String str2 = this.A09;
            C313556gd r6 = this.A0U;
            0qQ.A0B(r6, 2);
            lgb.A00 = str;
            C60310JjB.A00(r6, (C60310JjB) lgb.A08.getValue(), (Boolean) null, str, str2, (String) null, false);
        }
        C305836Jt r04 = this.A01;
        if (!(r04 == null || (iOu = r04.A09) == null)) {
            iOu.A0A.DmJ(iOu.A08.getActivity());
        }
        C305836Jt r05 = this.A01;
        if (!(r05 == null || (kd1 = r05.A0J) == null)) {
            kd1.A05.DmJ(kd1.A03.getActivity());
        }
        C305836Jt r06 = this.A01;
        if (!(r06 == null || (lja = r06.A0D) == null)) {
            lja.A03.DmJ(lja.A01.getActivity());
        }
        C305836Jt r07 = this.A01;
        if (!(r07 == null || (ljY = r07.A0A) == null)) {
            ljY.A01.DmJ(ljY.A00.requireActivity());
        }
        C305836Jt r08 = this.A01;
        if (!(r08 == null || (lgn = r08.A0E) == null)) {
            lgn.A01().A05();
        }
        C305836Jt r09 = this.A01;
        if (!(r09 == null || (kcf = r09.A06) == null)) {
            kcf.A07();
        }
        C305836Jt r010 = this.A01;
        if (!(r010 == null || (lrb = r010.A0H) == null)) {
            lrb.A02();
        }
        C305836Jt r011 = this.A01;
        if (!(r011 == null || (ljH = r011.A0L) == null)) {
            if (ljH.A01 == null) {
                C60205JhO jhO = ljH.A00;
                if (jhO != null) {
                    ljH.A01 = AnonymousClass11O.A03(AnonymousClass07a.A00(r5.getViewLifecycleOwner()), new C61860pz(new MHB(ljH, (AnonymousClass4D7) null, 19), jhO.A05));
                }
                0qQ.A0F("viewModel");
                throw AnonymousClass00P.createAndThrow();
            }
            C60205JhO jhO2 = ljH.A00;
            if (jhO2 != null) {
                C318136oS A002 = C318116oQ.A00(jhO2);
                1Eo.A03(AnonymousClass05K.A00, 19B.A00, new MG2(jhO2, (AnonymousClass4D7) null, 33), A002);
            }
            0qQ.A0F("viewModel");
            throw AnonymousClass00P.createAndThrow();
        }
        if (this.A09 != null) {
            this.A09 = null;
        }
    }

    public final /* synthetic */ void DiL(int i) {
    }

    public final /* synthetic */ void DiM(int i, int i2) {
    }

    public final /* synthetic */ void DiO(int i, int i2) {
    }

    public final /* synthetic */ void DiP() {
    }

    public final void DyN(C255773uh r11, C316036l0 r12) {
        C270194gL r3;
        String str;
        0qQ.A0B(r11, 0);
        0qQ.A0B(r12, 1);
        if (A04(this) && (r3 = this.A00) != null) {
            if (!0qQ.A0K(r11.A0c, r3)) {
                throw new IllegalArgumentException("Failed requirement.");
            } else if (!r12.equals(this.A01)) {
                throw new IllegalArgumentException("Failed requirement.");
            } else if (this.A04 == null) {
                throw new IllegalArgumentException("Failed requirement.");
            } else if (!this.A0F) {
                this.A0F = true;
                LGX lgx = this.A06;
                if (lgx == null) {
                    AnonymousClass4DH r4 = this.A0K;
                    UserSession userSession = this.A0N;
                    User A032 = r3.A03();
                    C313556gd r7 = this.A0U;
                    C313666go r8 = C313666go.VIEWER;
                    lgx = C63489Kxt.A00(r4, userSession, A032, r7, r8, C313776gz.A0K.A00(userSession, r8));
                    this.A06 = lgx;
                }
                String str2 = r3.A0X;
                str2.getClass();
                r3.A0e.getClass();
                lgx.A03(str2);
                String str3 = this.A0G;
                if (str3 != null && str3.length() != 0 && (str = this.A0H) != null && !00l.A0W(str)) {
                    HashMap hashMap = new HashMap();
                    JSONObject jSONObject = new JSONObject(str);
                    Iterator<String> keys = jSONObject.keys();
                    0qQ.A07(keys);
                    while (keys.hasNext()) {
                        String next = keys.next();
                        hashMap.put(next, jSONObject.optString(next));
                    }
                    new AnonymousClass32W(this.A0N).A00(this.A0K, (JOC) null, (C55539HjL) null, str3, hashMap);
                }
            }
        }
    }

    public final /* synthetic */ void onDestroy() {
    }

    public final void onDestroyView() {
        C64872LjY ljY;
        C64874Lja lja;
        C62267Kd1 kd1;
        C57106IOu iOu;
        this.A03 = null;
        A01(this);
        C305836Jt r0 = this.A01;
        if (!(r0 == null || (iOu = r0.A09) == null)) {
            iOu.A0A.onStop();
        }
        C305836Jt r02 = this.A01;
        if (!(r02 == null || (kd1 = r02.A0J) == null)) {
            kd1.A05.onStop();
        }
        C305836Jt r03 = this.A01;
        if (!(r03 == null || (lja = r03.A0D) == null)) {
            lja.A03.onStop();
        }
        C305836Jt r04 = this.A01;
        if (!(r04 == null || (ljY = r04.A0A) == null)) {
            ljY.A01.onStop();
        }
        A02(this);
        UserSession userSession = this.A0N;
        AnonymousClass4DH r4 = this.A0K;
        int hashCode = r4.hashCode();
        Set set = ((C313956hQ) userSession.A01(C313956hQ.class, C313946hP.A00)).A00;
        set.remove(Integer.valueOf(hashCode));
        if (set.isEmpty()) {
            C313776gz.A0K.A01(userSession, C313666go.VIEWER);
        }
        int hashCode2 = r4.hashCode();
        Set set2 = ((C313976hS) userSession.A01(C313976hS.class, C313966hR.A00)).A00;
        set2.remove(Integer.valueOf(hashCode2));
        if (set2.isEmpty()) {
            C313646gm.A0A.A01(userSession, C313666go.VIEWER);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0025, code lost:
        r0 = r5.A02;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C270194gL r6, X.C313616gj r7) {
        /*
            X.LOI r0 = r7.A04
            if (r0 == 0) goto L_0x000b
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x000b
        L_0x000a:
            return
        L_0x000b:
            com.instagram.common.session.UserSession r0 = r7.A0N
            com.instagram.reels.store.ReelStore r1 = X.1OP.A05(r0)
            com.instagram.user.model.User r0 = r6.A03()
            java.lang.String r0 = r0.getId()
            com.instagram.model.reels.Reel r4 = r1.A0L(r0)
            if (r4 == 0) goto L_0x000a
            X.6gh r5 = r7.A0R
            X.4gL r0 = r4.A0H
            if (r0 == r6) goto L_0x000a
            X.4mU r0 = r5.A02
            X.3uh r3 = r0.Au5()
            if (r3 == 0) goto L_0x000a
            com.instagram.common.session.UserSession r1 = r5.A01
            instagram.features.stories.fragment.ReelViewerFragment r0 = (instagram.features.stories.fragment.ReelViewerFragment) r0
            X.3mM r0 = r0.A0a
            r2 = 0
            if (r0 == 0) goto L_0x0048
            X.3uh r0 = r0.A08(r1)
            X.1Xj r1 = r0.A0b
            boolean r0 = r0.CWu()
            if (r0 == 0) goto L_0x0048
            if (r1 == 0) goto L_0x0048
            java.lang.String r2 = r1.getId()
        L_0x0048:
            java.lang.String r1 = "Required value was null."
            if (r2 == 0) goto L_0x005f
            com.instagram.user.model.User r0 = r3.A0i
            if (r0 == 0) goto L_0x0071
            r0.getId()
            java.lang.String r0 = r3.A0j
            X.0qQ.A07(r0)
            java.lang.String r0 = r4.getId()
            X.0qQ.A07(r0)
        L_0x005f:
            X.0sL r2 = r5.A04
            java.lang.String r1 = r3.A0j
            X.0qQ.A07(r1)
            java.lang.String r0 = r4.getId()
            X.0qQ.A07(r0)
            r2.invoke(r1, r0)
            return
        L_0x0071:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C313616gj.A00(X.4gL, X.6gj):void");
    }

    public static final void A01(C313616gj r2) {
        AnonymousClass37D A012;
        FragmentActivity activity = r2.A0K.getActivity();
        if (activity != null && (A012 = AnonymousClass37D.A00.A01(activity)) != null) {
            AnonymousClass37F r1 = (AnonymousClass37F) A012;
            if (r1.A0g && !r1.A0b) {
                A012.A0B();
            }
        }
    }

    public static final void A02(C313616gj r8) {
        C64705Lgb lgb;
        String str;
        if (r8.A0B) {
            r8.A0B = false;
            r8.A0F = false;
            C305836Jt r0 = r8.A01;
            if (!(r0 == null || (lgb = r0.A0I) == null)) {
                C270194gL r02 = r8.A00;
                if (r02 != null) {
                    str = r02.A0X;
                    str.getClass();
                } else {
                    str = null;
                }
                ((C60310JjB) lgb.A08.getValue()).A03(str);
                C64855LjH ljH = lgb.A06.A0L;
                if (ljH != null) {
                    C60205JhO jhO = ljH.A00;
                    if (jhO == null) {
                        0qQ.A0F("viewModel");
                        throw AnonymousClass00P.createAndThrow();
                    }
                    C318136oS A002 = C318116oQ.A00(jhO);
                    1Eo.A03(AnonymousClass05K.A00, 19B.A00, new MG2(jhO, (AnonymousClass4D7) null, 35), A002);
                    C262204Co r03 = ljH.A02;
                    if (r03 != null) {
                        r03.AG7((CancellationException) null);
                    }
                    ljH.A02 = null;
                    C262204Co r04 = ljH.A01;
                    if (r04 != null) {
                        r04.AG7((CancellationException) null);
                    }
                    ljH.A01 = null;
                    ValueAnimator valueAnimator = ljH.A03;
                    valueAnimator.removeAllUpdateListeners();
                    valueAnimator.cancel();
                }
            }
            r8.A01 = null;
            r8.A00 = null;
            r8.A04 = null;
            LGX lgx = r8.A06;
            if (lgx != null) {
                lgx.A01();
            }
            LGX lgx2 = r8.A06;
            if (lgx2 != null) {
                lgx2.A01 = null;
                lgx2.A02 = true;
            }
            r8.A06 = null;
            UserSession userSession = r8.A0N;
            if (182.A06(0Tu.A05, userSession, 36326519856969525L)) {
                C239403Gi.A01(r8.A0K.requireActivity(), userSession).A02 = null;
            }
            r8.A0I.removeCallbacksAndMessages((Object) null);
            C64514LdG ldG = r8.A02;
            if (ldG != null) {
                ldG.destroy();
            }
            r8.A02 = null;
            LEK lek = r8.A08;
            if (lek != null) {
                C62010KVj A003 = C63492Kxw.A00(userSession);
                0wc r4 = A003.A00;
                0Aj A004 = r4.A00(r4.A00, "ig_user_pay_viewer_exited_live");
                C64090LMi lMi = A003.A01;
                A004.AAJ("media_id", lMi.A02);
                A004.AAJ("container_module", lMi.A01);
                A004.AAJ("product_type", lMi.A03);
                A004.Cgf();
                lek.A09.unregisterLifecycleListener(lek.A02);
            }
            r8.A08 = null;
            C64102LMw lMw = r8.A07;
            if (lMw != null) {
                ((T7R) lMw.A04.getValue()).A01();
                C64102LMw.A05 = null;
            }
            r8.A07 = null;
            C305836Jt r05 = r8.A01;
            if (r05 != null) {
                r05.A0B = null;
            }
            r8.A0M.A01();
            C313716gt r1 = r8.A03;
            if (r1 != null) {
                r1.A02 = "0";
                r1.A03 = "0";
                r1.A04 = "0";
            }
            r8.A0W.A02();
            C62010KVj.A02 = null;
            if (C278264wZ.A05(userSession)) {
                ((ReelViewerFragment) r8.A0R.A02).A1E.notifyDataSetChanged();
            }
        }
    }

    public static final boolean A04(C313616gj r1) {
        if (!r1.A0B || r1.A04 == null) {
            return false;
        }
        return true;
    }

    public final /* synthetic */ int BrB() {
        return 0;
    }

    public final boolean Cau() {
        Integer num;
        LOI loi = this.A04;
        if (loi != null) {
            num = loi.A03;
        } else {
            num = null;
        }
        if (num == AnonymousClass05K.A0j) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: X.4DH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v2, resolved type: X.4DH} */
    /* JADX WARNING: type inference failed for: r10v12, types: [X.LjG, X.Kco] */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003e, code lost:
        if (X.0qQ.A0K(r0.A01, r6) != false) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ca, code lost:
        if (r4 != null) goto L_0x0040;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:195:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0058  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D7Q(X.C255773uh r22, X.C250973mM r23, X.C316026kz r24, X.C309426Yf r25) {
        /*
            r21 = this;
            r6 = r24
            r0 = 0
            X.0qQ.A0B(r6, r0)
            r0 = 1
            r3 = r22
            X.0qQ.A0B(r3, r0)
            r0 = 3
            r7 = r23
            X.0qQ.A0B(r7, r0)
            X.4gL r4 = r3.A0c
            r0 = r21
            boolean r1 = A04(r0)
            if (r1 == 0) goto L_0x00ca
            r2 = 0
            if (r4 == 0) goto L_0x004f
            java.lang.String r1 = r4.A0X
            r1.getClass()
            X.4gL r1 = r0.A00
            if (r1 == 0) goto L_0x002d
            java.lang.String r2 = r1.A0X
            r2.getClass()
        L_0x002d:
            java.lang.String r1 = r4.A0X
            r1.getClass()
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 == 0) goto L_0x0040
            X.6Jt r1 = r0.A01
            boolean r1 = X.0qQ.A0K(r1, r6)
            if (r1 != 0) goto L_0x0052
        L_0x0040:
            X.4wI r1 = r4.A06
            if (r1 != 0) goto L_0x0046
            X.4wI r1 = X.C278114wI.UNKNOWN
        L_0x0046:
            boolean r1 = r1.A00()
            if (r1 != 0) goto L_0x004f
            A01(r0)
        L_0x004f:
            A02(r0)
        L_0x0052:
            boolean r1 = r3.A17()
            if (r1 == 0) goto L_0x03ce
            com.instagram.common.session.UserSession r5 = r0.A0N
            X.6h3 r1 = X.C313766gy.A00(r5)
            X.0eM r1 = r1.A00
            java.lang.Object r2 = r1.getValue()
            X.LDa r2 = (X.C63921LDa) r2
            r2.A00 = r7
            boolean r1 = r2.A03
            if (r1 == 0) goto L_0x0073
            boolean r1 = r7.A0C
            if (r1 == 0) goto L_0x00c4
            r2.A00()
        L_0x0073:
            if (r4 == 0) goto L_0x03ce
            X.6gv r2 = r0.A0V
            java.lang.String r1 = r4.A0X
            r1.getClass()
            r2.A00 = r1
            X.6gt r12 = r0.A03
            if (r12 == 0) goto L_0x00e0
            X.4DU r11 = r0.A0P
            java.lang.String r10 = r0.A0Y
            X.3kK r9 = r0.A0S
            com.instagram.user.model.User r1 = r4.A03()
            java.lang.String r8 = r1.getId()
            java.lang.String r7 = r4.A0X
            r7.getClass()
            java.lang.String r2 = r4.A0e
            r2.getClass()
            java.util.Set r14 = r4.A06()
            X.0qQ.A07(r14)
            r1 = 10
            int r1 = X.0Yv.A1E(r14, r1)
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>(r1)
            java.util.Iterator r14 = r14.iterator()
        L_0x00b0:
            boolean r1 = r14.hasNext()
            if (r1 == 0) goto L_0x00ce
            java.lang.Object r1 = r14.next()
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            java.lang.String r1 = r1.getId()
            r13.add(r1)
            goto L_0x00b0
        L_0x00c4:
            com.instagram.model.reels.Reel r2 = r7.A0H
            r1 = 1
            r2.A1U = r1
            goto L_0x0073
        L_0x00ca:
            if (r4 == 0) goto L_0x004f
            goto L_0x0040
        L_0x00ce:
            java.util.Set r1 = X.00k.A0k(r13)
            r12.A00 = r11
            r12.A05 = r10
            r12.A01 = r9
            r12.A03 = r8
            r12.A02 = r7
            r12.A04 = r2
            r12.A06 = r1
        L_0x00e0:
            boolean r1 = r0.A0B
            r10 = 1
            if (r1 != 0) goto L_0x03ec
            r0.A0B = r10
            X.4DH r14 = r0.A0K
            androidx.fragment.app.FragmentActivity r1 = r14.requireActivity()
            X.3Gj r1 = X.C239403Gi.A01(r1, r5)
            r1.A02 = r0
            X.6Jt r6 = (X.C305836Jt) r6
            r0.A01 = r6
            r0.A00 = r4
            com.instagram.user.model.User r1 = r4.A03()
            java.lang.String r1 = r1.getId()
            X.C239403Gi.A02(r5, r1)
            X.6Jt r1 = r0.A01
            if (r1 == 0) goto L_0x0130
            X.4gL r8 = r0.A00
            if (r8 == 0) goto L_0x0130
            X.LOI r7 = new X.LOI
            r7.<init>(r0)
            boolean r1 = r0.A0E
            if (r1 == 0) goto L_0x011d
            r7.A05 = r10
            X.LOI.A00(r7)
            r1 = 0
            r0.A0E = r1
        L_0x011d:
            X.4wI r1 = r8.A06
            if (r1 != 0) goto L_0x0123
            X.4wI r1 = X.C278114wI.UNKNOWN
        L_0x0123:
            boolean r1 = r1.A00()
            if (r1 == 0) goto L_0x03d6
            r7.A06 = r10
            X.LOI.A00(r7)
        L_0x012e:
            r0.A04 = r7
        L_0x0130:
            X.4wI r1 = r4.A06
            if (r1 != 0) goto L_0x0136
            X.4wI r1 = X.C278114wI.UNKNOWN
        L_0x0136:
            boolean r1 = r1.A00()
            if (r1 != 0) goto L_0x017e
            X.6hJ r7 = r0.A0W
            java.lang.String r1 = r4.A0X
            r1.getClass()
            X.6gc r2 = r0.A0T
            r7.A03(r2, r1)
            java.lang.String r1 = r4.A0X
            r1.getClass()
            r7.A04(r1)
            X.1X4 r13 = X.1X4.A00
            if (r13 == 0) goto L_0x04c7
            java.lang.Integer r18 = X.AnonymousClass05K.A01
            com.instagram.ui.widget.slidecontentlayout.SlideContentLayout r1 = r6.A0j
            r15 = r5
            r16 = r1
            r17 = r2
            X.LdG r6 = r13.A00(r14, r15, r16, r17, r18)
            X.M0J r2 = new X.M0J
            r2.<init>(r0)
            X.MXE r1 = r6.A00
            r1.EhZ(r2)
            r0.A02 = r6
            X.2Fk r6 = r7.A00
            r1 = 9
            X.9LR r2 = new X.9LR
            r2.<init>(r0, r1)
            X.Auk r1 = new X.Auk
            r1.<init>(r2)
            r6.A06(r14, r1)
        L_0x017e:
            X.6h0 r1 = X.C313776gz.A0K
            X.6go r6 = X.C313666go.VIEWER
            X.6gz r1 = r1.A00(r5, r6)
            X.LES r2 = r1.A02()
            X.4wI r1 = r4.A06
            if (r1 != 0) goto L_0x0190
            X.4wI r1 = X.C278114wI.UNKNOWN
        L_0x0190:
            boolean r1 = r1.A00()
            X.05G r2 = r2.A0H
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2.Epw(r1)
            X.6Jt r5 = r0.A01
            if (r5 == 0) goto L_0x03ce
            X.0iw r9 = r0.A0L
            java.lang.String r7 = r0.A09
            java.lang.String r2 = r0.A0X
            X.6gd r1 = r0.A0U
            X.6gh r8 = r0.A0R
            X.6hJ r0 = r0.A0W
            r11 = 4
            X.0qQ.A0B(r1, r11)
            r11 = 8
            X.0qQ.A0B(r0, r11)
            android.view.ViewGroup r13 = r5.A0V
            r11 = 2131434461(0x7f0b1bdd, float:1.8490737E38)
            android.view.View r11 = r13.findViewById(r11)
            android.view.ViewStub r11 = (android.view.ViewStub) r11
            if (r11 == 0) goto L_0x01c6
            r11.inflate()
        L_0x01c6:
            X.Kco r11 = r5.A0B
            if (r11 != 0) goto L_0x01d7
            com.instagram.common.session.UserSession r12 = r5.A00
            X.0qQ.A0B(r12, r10)
            r11 = 0
            X.Kco r10 = new X.Kco
            r10.<init>(r13, r14, r12, r11)
            r5.A0B = r10
        L_0x01d7:
            X.L8c r10 = r5.A0M
            if (r10 != 0) goto L_0x01e4
            com.instagram.common.session.UserSession r11 = r5.A00
            X.L8c r10 = new X.L8c
            r10.<init>(r13, r14, r11)
            r5.A0M = r10
        L_0x01e4:
            X.LEJ r10 = r5.A07
            if (r10 != 0) goto L_0x01f8
            com.instagram.common.session.UserSession r15 = r5.A00
            r16 = 0
            r18 = 2131434386(0x7f0b1b92, float:1.8490584E38)
            X.LEJ r12 = new X.LEJ
            r17 = r6
            r12.<init>(r13, r14, r15, r16, r17, r18)
            r5.A07 = r12
        L_0x01f8:
            X.Lgb r10 = r5.A0I
            if (r10 != 0) goto L_0x0205
            com.instagram.common.session.UserSession r11 = r5.A00
            X.Lgb r10 = new X.Lgb
            r10.<init>(r14, r9, r11, r5)
            r5.A0I = r10
        L_0x0205:
            X.Kd1 r9 = r5.A0J
            if (r9 != 0) goto L_0x022c
            com.instagram.common.session.UserSession r9 = r5.A00
            X.Kd1 r12 = new X.Kd1
            r12.<init>(r13, r14, r9, r6)
            X.IOu r9 = r5.A09
            if (r9 != 0) goto L_0x022a
            com.instagram.common.session.UserSession r11 = r12.A04
            android.view.View r10 = r12.A02
            X.IOu r9 = new X.IOu
            r15 = r9
            r16 = r13
            r17 = r10
            r18 = r14
            r19 = r11
            r20 = r6
            r15.<init>(r16, r17, r18, r19, r20)
            r5.A09 = r9
        L_0x022a:
            r5.A0J = r12
        L_0x022c:
            X.LGN r9 = r5.A0E
            if (r9 != 0) goto L_0x023f
            com.instagram.common.session.UserSession r10 = r5.A00
            boolean r9 = X.C278264wZ.A01(r10)
            if (r9 == 0) goto L_0x03cf
            X.Kcr r9 = new X.Kcr
            r9.<init>(r13, r14, r10)
        L_0x023d:
            r5.A0E = r9
        L_0x023f:
            X.LAp r9 = r5.A0N
            if (r9 != 0) goto L_0x024c
            com.instagram.common.session.UserSession r10 = r5.A00
            X.LAp r9 = new X.LAp
            r9.<init>(r13, r14, r10, r4)
            r5.A0N = r9
        L_0x024c:
            X.LBL r9 = r5.A0C
            if (r9 != 0) goto L_0x0260
            com.instagram.common.session.UserSession r9 = r5.A00
            X.LBL r12 = new X.LBL
            r18 = r5
            r15 = r9
            r16 = r3
            r17 = r8
            r12.<init>(r13, r14, r15, r16, r17, r18)
            r5.A0C = r12
        L_0x0260:
            X.Kcf r8 = r5.A06
            if (r8 != 0) goto L_0x026d
            com.instagram.common.session.UserSession r9 = r5.A00
            X.Kcf r8 = new X.Kcf
            r8.<init>(r13, r14, r9, r4)
            r5.A06 = r8
        L_0x026d:
            X.LRB r8 = r5.A0H
            if (r8 != 0) goto L_0x027a
            com.instagram.common.session.UserSession r9 = r5.A00
            X.LRB r8 = new X.LRB
            r8.<init>(r14, r9, r6)
            r5.A0H = r8
        L_0x027a:
            X.LA6 r8 = r5.A0G
            if (r8 != 0) goto L_0x0287
            com.instagram.common.session.UserSession r9 = r5.A00
            X.LA6 r8 = new X.LA6
            r8.<init>(r14, r9)
            r5.A0G = r8
        L_0x0287:
            X.LEE r8 = r5.A0F
            if (r8 != 0) goto L_0x0294
            com.instagram.common.session.UserSession r9 = r5.A00
            X.LEE r8 = new X.LEE
            r8.<init>(r13, r14, r9, r6)
            r5.A0F = r8
        L_0x0294:
            X.L5W r8 = r5.A0K
            if (r8 != 0) goto L_0x02a1
            com.instagram.common.session.UserSession r9 = r5.A00
            X.L5W r8 = new X.L5W
            r8.<init>(r14, r9)
            r5.A0K = r8
        L_0x02a1:
            X.Lja r8 = r5.A0D
            if (r8 != 0) goto L_0x02ae
            com.instagram.common.session.UserSession r9 = r5.A00
            X.Lja r8 = new X.Lja
            r8.<init>(r14, r9, r6)
            r5.A0D = r8
        L_0x02ae:
            X.L9Q r8 = r5.A08
            if (r8 != 0) goto L_0x02bb
            com.instagram.common.session.UserSession r9 = r5.A00
            X.L9Q r8 = new X.L9Q
            r8.<init>(r13, r14, r9, r6)
            r5.A08 = r8
        L_0x02bb:
            X.KaQ r8 = r5.A05
            if (r8 != 0) goto L_0x02d2
            com.instagram.common.session.UserSession r8 = r5.A00
            r19 = 0
            X.KaQ r15 = new X.KaQ
            r16 = r14
            r17 = r8
            r18 = r6
            r20 = r0
            r15.<init>(r16, r17, r18, r19, r20)
            r5.A05 = r15
        L_0x02d2:
            X.LBM r0 = r5.A0O
            if (r0 != 0) goto L_0x02df
            com.instagram.common.session.UserSession r8 = r5.A00
            X.LBM r0 = new X.LBM
            r0.<init>(r13, r14, r8)
            r5.A0O = r0
        L_0x02df:
            X.LjY r0 = r5.A0A
            if (r0 != 0) goto L_0x02ec
            com.instagram.common.session.UserSession r8 = r5.A00
            X.LjY r0 = new X.LjY
            r0.<init>(r13, r14, r8, r6)
            r5.A0A = r0
        L_0x02ec:
            X.Lgb r5 = r5.A0I
            if (r5 == 0) goto L_0x03ce
            java.lang.String r0 = r4.A0X
            r0.getClass()
            r5.A00 = r0
            X.0eM r0 = r5.A08
            java.lang.Object r6 = r0.getValue()
            X.JjB r6 = (X.C60310JjB) r6
            X.4Co r4 = r6.A02
            if (r4 == 0) goto L_0x0307
            r0 = 0
            r4.AG7(r0)
        L_0x0307:
            X.LDa r0 = r6.A08
            X.0Ud r4 = r0.A02
            X.0qC r0 = new X.0qC
            r0.<init>(r4)
            r4 = 0
            com.instagram.video.live.mvvm.viewmodel.state.IgLiveViewerStateViewModel$onEnteringBroadcast$1 r8 = new com.instagram.video.live.mvvm.viewmodel.state.IgLiveViewerStateViewModel$onEnteringBroadcast$1
            r9 = r3
            r10 = r1
            r11 = r6
            r12 = r7
            r13 = r2
            r14 = r4
            r8.<init>(r9, r10, r11, r12, r13, r14)
            X.0pz r1 = new X.0pz
            r1.<init>(r8, r0)
            X.6oS r0 = X.C318116oQ.A00(r6)
            X.4Co r0 = X.AnonymousClass11O.A03(r0, r1)
            r6.A02 = r0
            X.6Jt r0 = r5.A06
            X.4DH r5 = r5.A03
            X.LjH r3 = r0.A0L
            if (r3 == 0) goto L_0x03ce
            X.07f r6 = r5.getViewModelStore()
            com.instagram.common.session.UserSession r0 = r3.A05
            X.KDA r2 = new X.KDA
            r2.<init>(r5, r0)
            X.2YP r0 = X.AnonymousClass2YP.A00
            X.2YN r1 = new X.2YN
            r1.<init>(r2, r6, r0)
            java.lang.Class<X.JhO> r0 = X.C60205JhO.class
            X.2YL r0 = r1.A00(r0)
            X.JhO r0 = (X.C60205JhO) r0
            r3.A00 = r0
            java.lang.String r6 = "viewModel"
            if (r0 == 0) goto L_0x04c9
            X.0Ud r0 = r0.A07
            X.0qC r2 = new X.0qC
            r2.<init>(r0)
            r1 = 18
            X.MHB r0 = new X.MHB
            r0.<init>(r3, r4, r1)
            X.0pz r1 = new X.0pz
            r1.<init>(r0, r2)
            X.07Z r0 = r5.getViewLifecycleOwner()
            X.0xx r0 = X.AnonymousClass07a.A00(r0)
            X.4Co r0 = X.AnonymousClass11O.A03(r0, r1)
            r3.A02 = r0
            X.0eM r0 = r3.A08
            java.lang.Object r1 = r0.getValue()
            X.0qQ.A07(r1)
            android.view.View r1 = (android.view.View) r1
            X.LX2 r0 = new X.LX2
            r0.<init>(r3)
            X.AnonymousClass0fU.A00(r0, r1)
            X.0eM r0 = r3.A0F
            java.lang.Object r1 = r0.getValue()
            X.0qQ.A07(r1)
            android.view.View r1 = (android.view.View) r1
            X.LX3 r0 = new X.LX3
            r0.<init>(r3)
            X.AnonymousClass0fU.A00(r0, r1)
            android.content.Context r1 = r5.requireContext()
            X.JdZ r0 = new X.JdZ
            r0.<init>(r3)
            android.view.GestureDetector r2 = new android.view.GestureDetector
            r2.<init>(r1, r0)
            X.0eM r0 = r3.A06
            java.lang.Object r1 = r0.getValue()
            android.view.View r1 = (android.view.View) r1
            X.LYh r0 = new X.LYh
            r0.<init>(r2, r3)
            r1.setOnTouchListener(r0)
            X.JhO r1 = r3.A00
            if (r1 == 0) goto L_0x04c9
            X.6oS r3 = X.C318116oQ.A00(r1)
            r0 = 26
            X.MG2 r2 = new X.MG2
            r2.<init>(r1, r4, r0)
            X.19B r1 = X.19B.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.1Eo.A03(r0, r1, r2, r3)
        L_0x03ce:
            return
        L_0x03cf:
            X.Kcq r9 = new X.Kcq
            r9.<init>(r13, r14, r10)
            goto L_0x023d
        L_0x03d6:
            java.lang.String r2 = r4.A0X
            r2.getClass()
            r1 = 0
            X.1OC r2 = X.LTC.A06(r5, r2, r1)
            X.KAB r1 = new X.KAB
            r1.<init>(r8, r4, r0, r7)
            r2.A00 = r1
            r14.schedule(r2)
            goto L_0x012e
        L_0x03ec:
            X.4wI r1 = r4.A06
            if (r1 != 0) goto L_0x03f2
            X.4wI r1 = X.C278114wI.UNKNOWN
        L_0x03f2:
            boolean r1 = r1.A00()
            if (r1 == 0) goto L_0x0406
            X.LOI r1 = r0.A04
            if (r1 == 0) goto L_0x0406
            java.lang.Integer r2 = r1.A03
            java.lang.Integer r1 = X.AnonymousClass05K.A0N
            if (r2 == r1) goto L_0x0406
            r0.DxL()
            return
        L_0x0406:
            X.4gL r3 = r0.A00
            if (r3 == 0) goto L_0x03ce
            X.LGX r2 = r0.A06
            if (r2 == 0) goto L_0x041c
            java.util.Set r1 = r3.A06()
            int r1 = r1.size()
            if (r1 > 0) goto L_0x0419
            r10 = 0
        L_0x0419:
            r2.A04(r10)
        L_0x041c:
            X.3NV r2 = r3.A0A
            if (r2 != 0) goto L_0x0422
            X.3NV r2 = X.AnonymousClass3NV.A08
        L_0x0422:
            X.3NV r1 = X.AnonymousClass3NV.A09
            if (r2 != r1) goto L_0x03ce
            X.6gx r7 = r0.A0O
            java.lang.String r5 = r3.A0e
            r5.getClass()
            X.0iw r1 = r0.A0L
            java.lang.String r4 = r1.getModuleName()
            X.3BQ r6 = r0.A0Q
            r0 = 1
            X.0qQ.A0B(r4, r0)
            X.0wc r0 = r7.A03
            X.1Ln r3 = X.1Ln.A0E(r0)
            X.0Aj r0 = r3.A00
            boolean r0 = r0.isSampled()
            if (r0 == 0) goto L_0x03ce
            long r0 = r7.A02
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.A0h(r0)
            java.lang.String r0 = "join_live_stream"
            r3.A0l(r0)
            java.lang.String r0 = "tap"
            r3.A0k(r0)
            java.lang.String r0 = "live_feed_timeline"
            boolean r2 = r4.equals(r0)
            java.lang.String r1 = "live_in_app_notification"
            if (r2 == 0) goto L_0x04b0
            java.lang.String r0 = "live_story_button"
        L_0x0466:
            r3.A0p(r0)
            if (r2 == 0) goto L_0x04a4
            java.lang.String r0 = "feed"
        L_0x046d:
            r3.A0q(r0)
            java.lang.String r0 = "broadcast"
            r3.A0o(r0)
            java.lang.String r0 = r7.A01
            r3.A0v(r0)
            X.3BQ r0 = X.AnonymousClass3BQ.DIRECT_THREAD_PARTICIPATION_HUB
            if (r6 != r0) goto L_0x04a2
            X.Nmb r1 = X.C69493Nmb.MEMBER_PARTICIPATION_HUB
        L_0x0480:
            java.lang.String r0 = "entrypoint"
            r3.A0M(r1, r0)
            java.lang.String r0 = "live_id"
            X.0eP r2 = new X.0eP
            r2.<init>(r0, r5)
            java.lang.String r1 = "module"
            X.0eP r0 = new X.0eP
            r0.<init>(r1, r4)
            X.0eP[] r0 = new X.0eP[]{r2, r0}
            java.util.LinkedHashMap r0 = X.0Yt.A06(r0)
            r3.A0w(r0)
            r3.Cgf()
            return
        L_0x04a2:
            r1 = 0
            goto L_0x0480
        L_0x04a4:
            boolean r0 = r4.equals(r1)
            if (r0 == 0) goto L_0x04ad
            java.lang.String r0 = "user_device_notification"
            goto L_0x046d
        L_0x04ad:
            java.lang.String r0 = "thread_view"
            goto L_0x046d
        L_0x04b0:
            boolean r0 = r4.equals(r1)
            if (r0 == 0) goto L_0x04b9
            java.lang.String r0 = "broadcast_chat_live_notification"
            goto L_0x0466
        L_0x04b9:
            X.3BQ r0 = X.AnonymousClass3BQ.DIRECT_THREAD_PARTICIPATION_HUB
            if (r6 != r0) goto L_0x04c4
            r0 = 354(0x162, float:4.96E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            goto L_0x0466
        L_0x04c4:
            java.lang.String r0 = "live_message"
            goto L_0x0466
        L_0x04c7:
            java.lang.String r6 = "instance"
        L_0x04c9:
            X.0qQ.A0F(r6)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C313616gj.D7Q(X.3uh, X.3mM, X.6kz, X.6Yf):void");
    }

    public final void DNx() {
        C313716gt r3 = this.A03;
        if (r3 != null) {
            0wc r2 = r3.A08;
            0Aj A002 = r2.A00(r2.A00, "ig_live_tap_copy_link_button");
            A002.AAJ("view_mode", "viewer");
            A002.A9F("a_pk", 00y.A0n(10, r3.A03));
            A002.AAJ("m_pk", r3.A04);
            A002.A9F(TraceFieldType.BroadcastId, Long.valueOf(Long.parseLong(r3.A02)));
            A002.AAJ("container_module", r3.A07.getModuleName());
            A002.AAe("current_guest_ids", 00k.A0a(r3.A06));
            A002.Cgf();
        }
    }

    public final void DNy() {
        C313716gt r3 = this.A03;
        if (r3 != null) {
            0wc r2 = r3.A08;
            0Aj A002 = r2.A00(r2.A00, "ig_live_tap_share_link_button");
            A002.AAJ("view_mode", "viewer");
            A002.A9F("a_pk", 00y.A0n(10, r3.A03));
            A002.AAJ("m_pk", r3.A04);
            A002.A9F(TraceFieldType.BroadcastId, Long.valueOf(Long.parseLong(r3.A02)));
            A002.AAJ("container_module", r3.A07.getModuleName());
            A002.AAe("current_guest_ids", 00k.A0a(r3.A06));
            A002.Cgf();
        }
    }

    public final void DVL() {
        C313716gt r3 = this.A03;
        if (r3 != null) {
            0wc r2 = r3.A08;
            0Aj A002 = r2.A00(r2.A00, "ig_live_open_options_menu");
            A002.AAE(new C263944Ny(Long.valueOf(Long.parseLong(r3.A03))), "a_pk");
            A002.A9F(TraceFieldType.BroadcastId, Long.valueOf(Long.parseLong(r3.A02)));
            A002.AAJ("container_module", r3.A07.getModuleName());
            A002.AAJ("m_pk", r3.A04);
            A002.AAJ("view_mode", "viewer");
            A002.AAe("current_guest_ids", 00k.A0a(r3.A06));
            A002.Cgf();
        }
    }

    public final boolean EtF(String str) {
        C270194gL r0 = this.A00;
        if (r0 == null) {
            return false;
        }
        String str2 = r0.A0X;
        str2.getClass();
        return !str2.equals(str);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        String stringExtra;
        if (i == 5151 && i2 == 0 && intent != null && (stringExtra = intent.getStringExtra("IgLive.error_message")) != null) {
            C310336ap r2 = new C310336ap();
            r2.A05();
            r2.A0H = StringFormatUtil.formatStrLocaleSafe("reel_viewer_request_error_with_code_%d", Integer.valueOf(i));
            r2.A0D = stringExtra;
            1xC.A01.A00(new AnonymousClass3GP(r2.A00()));
        }
        LOI loi = this.A04;
        if (loi != null) {
            loi.A05 = true;
            LOI.A00(loi);
        } else {
            this.A0E = true;
        }
        this.A0C = true;
    }

    public C313616gj(FragmentActivity fragmentActivity, AnonymousClass4DH r13, AnonymousClass0iw r14, UserSession userSession, AnonymousClass4DU r16, AnonymousClass3BQ r17, C313596gh r18, C249763kK r19, C313556gd r20, C313556gd r21, String str, String str2, String str3, String str4, String str5, C62320sa r27) {
        this.A0N = userSession;
        this.A0J = fragmentActivity;
        this.A0K = r13;
        this.A0Z = r27;
        this.A0R = r18;
        C313556gd r1 = r20;
        this.A0U = r1;
        this.A09 = str;
        this.A0X = str2;
        this.A0G = str3;
        this.A0H = str4;
        this.A0S = r19;
        this.A0Y = str5;
        this.A0L = r14;
        this.A0Q = r17;
        this.A0P = r16;
        this.A03 = (C313716gt) C313636gl.A00(r14, userSession).A05.getValue();
        this.A0V = new C313736gv(r14, userSession);
        this.A0O = C313746gw.A00(userSession);
        C313666go r5 = C313666go.VIEWER;
        IgLiveBroadcastInfoManager A012 = C313766gy.A00(userSession).A01();
        IgLiveQuestionSubmissionsRepository igLiveQuestionSubmissionsRepository = (IgLiveQuestionSubmissionsRepository) C313766gy.A00(userSession).A0C.getValue();
        C313876hI r7 = (C313876hI) C313766gy.A00(userSession).A0B.getValue();
        this.A0W = new C313886hJ(userSession, r5, (C313726gu) C313646gm.A0A.A00(r13, userSession, r5).A06.getValue(), r7, igLiveQuestionSubmissionsRepository, (IgLiveQuestionsRepository) C313766gy.A00(userSession).A0D.getValue(), A012);
        C313556gd r2 = r21;
        0qQ.A0B(r2, 0);
        this.A0T = new C313936hO(r2);
        Class<C313956hQ> cls = C313956hQ.class;
        ((C313956hQ) userSession.A01(cls, C313946hP.A00)).A00.add(Integer.valueOf(r13.hashCode()));
        Class<C313976hS> cls2 = C313976hS.class;
        ((C313976hS) userSession.A01(cls2, C313966hR.A00)).A00.add(Integer.valueOf(r13.hashCode()));
        C313776gz.A0K.A00(userSession, r5).A03.A00 = r1;
    }

    private final boolean A03() {
        C305836Jt r0;
        View view;
        if (!A04(this) || !this.A0F || (r0 = this.A01) == null || (view = r0.A0T) == null || view.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    public final boolean BVb() {
        C255773uh r0;
        if (A04(this) && this.A0C) {
            1iA r2 = 1iA.A0L;
            C305836Jt r02 = this.A01;
            if (r02 == null || (r0 = r02.A02) == null || r2 != r0.A0C()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final Integer Bdi(String str) {
        if (EtF(str)) {
            return AnonymousClass05K.A0C;
        }
        return null;
    }

    public final boolean Bu3() {
        LOI loi;
        if (!A04(this) || ((loi = this.A04) != null && !loi.A01())) {
            return false;
        }
        return true;
    }

    public final void DMq(int i) {
        LGX lgx;
        if (A04(this) && (lgx = this.A06) != null) {
            lgx.A02(i);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0021 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean Dpr() {
        /*
            r4 = this;
            boolean r0 = r4.A03()
            if (r0 == 0) goto L_0x0033
            X.6Jt r0 = r4.A01
            if (r0 == 0) goto L_0x0022
            X.Kcf r0 = r0.A06
            if (r0 == 0) goto L_0x0022
            boolean r0 = r0.A03()
        L_0x0012:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
        L_0x0016:
            r1 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 == 0) goto L_0x0033
            return r1
        L_0x0022:
            X.LGX r1 = r4.A06
            if (r1 == 0) goto L_0x0031
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x002f
            r1.A00()
            r0 = 1
            goto L_0x0012
        L_0x002f:
            r0 = 0
            goto L_0x0012
        L_0x0031:
            r2 = 0
            goto L_0x0016
        L_0x0033:
            boolean r0 = A04(r4)
            if (r0 == 0) goto L_0x0054
            X.1Wj r0 = X.1Wj.A00
            if (r0 == 0) goto L_0x0054
            boolean r0 = r4.BVb()
            if (r0 == 0) goto L_0x0054
            X.1Wj r3 = X.DcL.A00()
            X.4DH r0 = r4.A0K
            androidx.fragment.app.FragmentActivity r2 = r0.requireActivity()
            com.instagram.common.session.UserSession r1 = r4.A0N
            java.lang.String r0 = "350250235394743"
            r3.A03(r1, r2, r0)
        L_0x0054:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C313616gj.Dpr():boolean");
    }

    public final boolean Dq0() {
        LGX lgx;
        if (!A03() || (lgx = this.A06) == null || lgx.A03) {
            return false;
        }
        EditText editText = lgx.A09;
        editText.requestFocus();
        0nA.A0Q(editText);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0028 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean Dqd() {
        /*
            r4 = this;
            boolean r0 = A04(r4)
            r3 = 0
            if (r0 == 0) goto L_0x0032
            boolean r0 = r4.A03()
            if (r0 == 0) goto L_0x0032
            X.6Jt r0 = r4.A01
            if (r0 == 0) goto L_0x0029
            X.Kcf r0 = r0.A06
            if (r0 == 0) goto L_0x0029
            boolean r0 = r0.A04()
        L_0x0019:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
        L_0x001d:
            r1 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 == 0) goto L_0x0032
            return r1
        L_0x0029:
            X.LGX r0 = r4.A06
            if (r0 == 0) goto L_0x0030
            boolean r0 = r0.A03
            goto L_0x0019
        L_0x0030:
            r2 = 0
            goto L_0x001d
        L_0x0032:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C313616gj.Dqd():boolean");
    }

    public final void DxL() {
        if (A04(this)) {
            LOI loi = this.A04;
            if (loi != null) {
                loi.A06 = true;
                LOI.A00(loi);
            }
            LGX lgx = this.A06;
            if (lgx != null) {
                lgx.A01();
            }
        }
    }

    public final void DxN() {
        LOI loi;
        if (A04(this) && (loi = this.A04) != null) {
            loi.A04 = true;
            LOI.A00(loi);
            if (loi.A00 < 5) {
                C313616gj r1 = loi.A07;
                Handler handler = r1.A0I;
                handler.removeCallbacksAndMessages((Object) null);
                handler.postDelayed(new M59(r1), 3000);
                loi.A00++;
            }
        }
    }

    public final void DxU() {
        IgImageView igImageView;
        if (A04(this)) {
            LOI loi = this.A04;
            if (loi != null) {
                loi.A01 = SystemClock.elapsedRealtime();
                loi.A04 = false;
                loi.A00 = 0;
                LOI.A00(loi);
            }
            C305836Jt r0 = this.A01;
            if (r0 != null && (igImageView = r0.A0X) != null) {
                igImageView.setVisibility(8);
            }
        }
    }
}
