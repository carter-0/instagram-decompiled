package X;

import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.feed.ui.state.IntentAwareAdPivotState;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.save.model.SavedCollection;
import com.instagram.user.model.User;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class GAR {
    public void A0G(0jB r1) {
    }

    public boolean A0X() {
        return false;
    }

    public boolean A0d() {
        return false;
    }

    public static boolean A01(0lg r3) {
        return 182.A06(0Tu.A05, r3, 36319626434911786L);
    }

    public int A04(Context context) {
        if (this instanceof C54375HAq) {
            return AnonymousClass3D4.A00(context);
        }
        if (this instanceof C52767GcK) {
            return A00(context);
        }
        if (this instanceof C54373HAo) {
            return A00(context);
        }
        if (this instanceof C54376HAr) {
            return A00(context);
        }
        if (this instanceof C54371HAm) {
            return A00(context);
        }
        if (this instanceof C54374HAp) {
            return A00(context);
        }
        if (this instanceof C54372HAn) {
            return A00(context);
        }
        return A00(context);
    }

    public C54620HLd A05() {
        if (this instanceof C54375HAq) {
            return null;
        }
        if (this instanceof C52767GcK) {
            String str = ((C52767GcK) this).A0H;
            if (0qQ.A0K(str, "feed_timeline_favorites")) {
                return C54620HLd.FAVORITES_FEED;
            }
            if (0qQ.A0K(str, "feed_timeline_fan_club")) {
                return C54620HLd.FAN_CLUB_FEED;
            }
            return null;
        } else if ((this instanceof C54373HAo) || (this instanceof C54376HAr) || (this instanceof C54371HAm)) {
            return null;
        } else {
            boolean z = this instanceof C54374HAp;
            return null;
        }
    }

    public 1sy A06() {
        if (this instanceof C54375HAq) {
            return 1sy.A0Q;
        }
        if (this instanceof C52767GcK) {
            return 1sy.A0H;
        }
        if (this instanceof C54373HAo) {
            return 1sy.A0I;
        }
        if (this instanceof C54376HAr) {
            return 1sy.A0M;
        }
        if (this instanceof C54371HAm) {
            return 1sy.A06;
        }
        if (this instanceof C54374HAp) {
            return 1sy.A0F;
        }
        if (this instanceof C54372HAn) {
            return 1sy.A0L;
        }
        if (this instanceof C52765GcI) {
            return 1sy.A0E;
        }
        return 1sy.A02;
    }

    public Integer A07() {
        if ((this instanceof C54375HAq) || (!(this instanceof C52767GcK) && !(this instanceof C54373HAo) && !(this instanceof C54376HAr) && ((this instanceof C54371HAm) || (this instanceof C54374HAp) || !(this instanceof C54372HAn)))) {
            return AnonymousClass05K.A01;
        }
        return AnonymousClass05K.A00;
    }

    public List A08() {
        String str;
        AnonymousClass4ZJ r0;
        if (!(this instanceof C54375HAq)) {
            if (this instanceof C52767GcK) {
                C52767GcK gcK = (C52767GcK) this;
                C56502HzY A00 = C56502HzY.A01.A00(gcK.A0C);
                String str2 = gcK.A03;
                if (!(str2 == null || (r0 = (AnonymousClass4ZJ) A00.A00.get(str2)) == null)) {
                    List<1Xg> A0a = 00k.A0a(r0.A06);
                    if (!"feed_timeline_older".equals(gcK.A0H)) {
                        return A0a;
                    }
                    for (1Xg r1 : A0a) {
                        if (C51965G9l.A0o(r1) != null) {
                            AnonymousClass3W1 BQs = gcK.A0D.BQs(r1);
                            0qQ.A07(BQs);
                            BQs.A2a = AnonymousClass7TF.A1W(r1.A06, 1UQ.A0H);
                        }
                    }
                    return A0a;
                }
            } else if (this instanceof C54373HAo) {
                C54373HAo hAo = (C54373HAo) this;
                if (hAo instanceof C54600HKj) {
                    C54600HKj hKj = (C54600HKj) hAo;
                    List list = hKj.A02;
                    ArrayList A1C = AnonymousClass7TE.A1C();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        1Xj A0U = DbV.A0U(hKj.A00, AnonymousClass7TE.A18(it));
                        if (A0U != null) {
                            A1C.add(C54600HKj.A02(A0U, hKj));
                        }
                    }
                    if (list.isEmpty() || A1C.size() < list.size()) {
                        return null;
                    }
                    return A1C;
                }
            } else if (!(this instanceof C54376HAr) && !(this instanceof C54371HAm) && !(this instanceof C54374HAp) && !(this instanceof C54372HAn)) {
                if (this instanceof C52765GcI) {
                    C52765GcI gcI = (C52765GcI) this;
                    ArrayList A1C2 = AnonymousClass7TE.A1C();
                    1E8 A002 = 1E7.A00(gcI.A0E);
                    str = "intentAwareAdPivotState";
                    if (C52765GcI.A03(gcI)) {
                        String str3 = gcI.A05;
                        if (str3 != null) {
                            IntentAwareAdPivotState intentAwareAdPivotState = gcI.A02;
                            if (intentAwareAdPivotState != null) {
                                intentAwareAdPivotState.A00(str3).add(str3);
                            }
                        }
                        IntentAwareAdPivotState intentAwareAdPivotState2 = gcI.A02;
                        if (intentAwareAdPivotState2 != null) {
                            Iterator it2 = intentAwareAdPivotState2.A00(gcI.A05).iterator();
                            while (it2.hasNext()) {
                                C52765GcI.A02(A002, gcI, AnonymousClass7TE.A18(it2), A1C2);
                            }
                            return A1C2;
                        }
                    } else {
                        IntentAwareAdPivotState intentAwareAdPivotState3 = gcI.A02;
                        if (intentAwareAdPivotState3 != null) {
                            Iterator it3 = intentAwareAdPivotState3.A0F.iterator();
                            while (it3.hasNext()) {
                                C52765GcI.A02(A002, gcI, AnonymousClass7TE.A18(it3), A1C2);
                            }
                            return A1C2;
                        }
                    }
                } else {
                    C54377HAs hAs = (C54377HAs) this;
                    UserSession userSession = hAs.A08;
                    0Tu r5 = 0Tu.A06;
                    boolean A06 = 182.A06(r5, userSession, 36321451795752323L);
                    ArrayList A1C3 = AnonymousClass7TE.A1C();
                    if (!A06) {
                        return A1C3;
                    }
                    1E8 A003 = 1E7.A00(userSession);
                    AtomicBoolean atomicBoolean = 1Xj.A0i;
                    String str4 = hAs.A03;
                    if (str4 == null) {
                        str = "seedMediaId";
                    } else {
                        String str5 = hAs.A02;
                        if (str5 == null) {
                            str = "seedMediaAuthorId";
                        } else {
                            1Xj A02 = A003.A02(002.A0T(str4, str5, '_'));
                            if (A02 == null || AnonymousClass7TF.A1Y(Boolean.valueOf(A02.CcK()), 182.A06(r5, userSession, 36321451795817860L))) {
                                return A1C3;
                            }
                            A1C3.add(A02);
                            return A1C3;
                        }
                    }
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: X.HAm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: X.HAp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: X.HAq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: X.HAp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: X.HAp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: X.HAp} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A09() {
        /*
            r7 = this;
            boolean r0 = r7 instanceof X.C52767GcK
            if (r0 == 0) goto L_0x000e
            r2 = r7
            X.GcK r2 = (X.C52767GcK) r2
            r1 = 0
            X.1FI r0 = X.1FI.A0G
            X.C52767GcK.A02(r0, r2, r1)
        L_0x000d:
            return
        L_0x000e:
            boolean r0 = r7 instanceof X.C54375HAq
            if (r0 == 0) goto L_0x0024
            r2 = r7
            X.HAq r2 = (X.C54375HAq) r2
            X.6z9 r0 = r2.A00
        L_0x0017:
            X.6zA r0 = r0.A03
            java.lang.Integer r1 = r0.A03
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 == r0) goto L_0x000d
            r0 = 0
            r2.A0Q(r0, r0)
            return
        L_0x0024:
            boolean r0 = r7 instanceof X.C52765GcI
            if (r0 == 0) goto L_0x0078
            r6 = r7
            X.GcI r6 = (X.C52765GcI) r6
            boolean r2 = X.C52765GcI.A03(r6)
            r5 = 0
            r0 = 1
            java.lang.String r4 = "intentAwareAdPivotState"
            com.instagram.feed.ui.state.IntentAwareAdPivotState r1 = r6.A02
            if (r2 == 0) goto L_0x006f
            if (r1 == 0) goto L_0x0074
            java.util.Map r2 = r1.A07
            java.lang.String r1 = r6.A05
            boolean r1 = r2.containsKey(r1)
            java.lang.String r3 = r6.A05
            if (r1 == 0) goto L_0x005f
            if (r3 == 0) goto L_0x0059
            com.instagram.feed.ui.state.IntentAwareAdPivotState r0 = r6.A02
            if (r0 == 0) goto L_0x0074
            java.util.Map r0 = r0.A07
            java.lang.Object r0 = r0.get(r3)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x005d
            boolean r0 = r0.booleanValue()
        L_0x0059:
            r6.A0Q(r0, r5)
            return
        L_0x005d:
            r0 = 0
            goto L_0x0059
        L_0x005f:
            if (r3 == 0) goto L_0x0059
            com.instagram.feed.ui.state.IntentAwareAdPivotState r1 = r6.A02
            if (r1 == 0) goto L_0x0074
            java.util.Map r2 = r1.A07
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            r2.put(r3, r1)
            goto L_0x0059
        L_0x006f:
            if (r1 == 0) goto L_0x0074
            boolean r0 = r1.A0C
            goto L_0x0059
        L_0x0074:
            X.0qQ.A0F(r4)
            goto L_0x00a0
        L_0x0078:
            boolean r0 = r7 instanceof X.C54376HAr
            if (r0 == 0) goto L_0x0084
            r1 = r7
            X.HAr r1 = (X.C54376HAr) r1
            r0 = 0
            X.C54376HAr.A02(r1, r0)
            return
        L_0x0084:
            boolean r0 = r7 instanceof X.C54373HAo
            if (r0 != 0) goto L_0x000d
            boolean r0 = r7 instanceof X.C54371HAm
            if (r0 == 0) goto L_0x0092
            r2 = r7
            X.HAm r2 = (X.C54371HAm) r2
            X.6z9 r0 = r2.A02
            goto L_0x0017
        L_0x0092:
            boolean r0 = r7 instanceof X.C54374HAp
            if (r0 == 0) goto L_0x00a5
            r2 = r7
            X.HAp r2 = (X.C54374HAp) r2
            X.6z9 r0 = r2.A00
            if (r0 != 0) goto L_0x0017
            X.C51965G9l.A16()
        L_0x00a0:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00a5:
            boolean r0 = r7 instanceof X.C54372HAn
            if (r0 != 0) goto L_0x000d
            r0 = 0
            r7.A0Q(r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GAR.A09():void");
    }

    public void A0A() {
        if (this instanceof C52767GcK) {
            C52767GcK gcK = (C52767GcK) this;
            C297555rw A00 = C297545rv.A00(gcK.A0C);
            String str = gcK.A0H;
            String str2 = gcK.A0G.A00;
            0Aj A0e = AnonymousClass7TE.A0e(DbW.A0J(A00.A00, str), "instagram_feed_older_exit");
            if (A0e.isSampled()) {
                A0e.AAJ("module", str);
                A0e.A9F("ig_media_id", Long.MIN_VALUE);
                A0e.AAJ("inventory_source", "");
                C51965G9l.A1Q(A0e, str2);
                A0e.AAJ("detail", str);
                A0e.Cgf();
            }
        } else if (!(this instanceof C54375HAq) && !(this instanceof C52765GcI) && !(this instanceof C54376HAr) && !(this instanceof C54373HAo) && !(this instanceof C54371HAm)) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x017b, code lost:
        if (r1 == null) goto L_0x017d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0B() {
        /*
            r6 = this;
            boolean r0 = r6 instanceof X.C54375HAq
            if (r0 != 0) goto L_0x0022
            boolean r0 = r6 instanceof X.C52767GcK
            if (r0 == 0) goto L_0x0023
            r5 = r6
            X.GcK r5 = (X.C52767GcK) r5
            androidx.fragment.app.Fragment r0 = r5.A09
            android.content.Context r4 = r0.getContext()
            if (r4 == 0) goto L_0x006c
            com.instagram.common.session.UserSession r3 = r5.A0C
            X.0gy r2 = X.AnonymousClass07i.A00(r0)
            java.lang.String r1 = r5.A05
            X.6z9 r0 = new X.6z9
            r0.<init>(r4, r2, r3, r1)
            r5.A01 = r0
        L_0x0022:
            return
        L_0x0023:
            boolean r0 = r6 instanceof X.C54373HAo
            if (r0 == 0) goto L_0x0039
            r3 = r6
            X.HAo r3 = (X.C54373HAo) r3
            androidx.fragment.app.Fragment r2 = r3.A01
            android.content.Context r1 = r2.requireContext()
            com.instagram.common.session.UserSession r0 = r3.A02
            X.6z9 r0 = X.C51970G9q.A0g(r1, r2, r0)
            r3.A00 = r0
            return
        L_0x0039:
            boolean r0 = r6 instanceof X.C54376HAr
            if (r0 == 0) goto L_0x004f
            r3 = r6
            X.HAr r3 = (X.C54376HAr) r3
            androidx.fragment.app.Fragment r2 = r3.A07
            android.content.Context r1 = r2.requireContext()
            com.instagram.common.session.UserSession r0 = r3.A08
            X.6z9 r0 = X.C51970G9q.A0g(r1, r2, r0)
            r3.A00 = r0
            return
        L_0x004f:
            boolean r0 = r6 instanceof X.C54371HAm
            if (r0 != 0) goto L_0x0022
            boolean r0 = r6 instanceof X.C54374HAp
            if (r0 == 0) goto L_0x0071
            r5 = r6
            X.HAp r5 = (X.C54374HAp) r5
            android.content.Context r4 = r5.A01
            com.instagram.common.session.UserSession r3 = r5.A03
            X.07i r2 = r5.A02
            com.instagram.feed.intf.ContextualFeedNetworkConfig r0 = r5.A05
            java.lang.String r1 = r0.A01
            X.6z9 r0 = new X.6z9
            r0.<init>(r4, r2, r3, r1)
            r5.A00 = r0
            return
        L_0x006c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0071:
            boolean r0 = r6 instanceof X.C54372HAn
            if (r0 == 0) goto L_0x0087
            r3 = r6
            X.HAn r3 = (X.C54372HAn) r3
            androidx.fragment.app.Fragment r2 = r3.A01
            android.content.Context r1 = r2.requireContext()
            com.instagram.common.session.UserSession r0 = r3.A02
            X.6z9 r0 = X.C51970G9q.A0g(r1, r2, r0)
            r3.A00 = r0
            return
        L_0x0087:
            boolean r0 = r6 instanceof X.C52765GcI
            if (r0 == 0) goto L_0x0129
            r4 = r6
            X.GcI r4 = (X.C52765GcI) r4
            android.os.Bundle r1 = r4.A0C
            r0 = 274(0x112, float:3.84E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r3 = ""
            java.lang.String r0 = r1.getString(r0, r3)
            r4.A0B = r0
            java.lang.String r0 = "contextual_feed_seed_ad_tracking_token"
            java.lang.String r0 = r1.getString(r0, r3)
            r4.A09 = r0
            r0 = 571(0x23b, float:8.0E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = r1.getString(r0, r3)
            r4.A0A = r0
            r2 = -1
            java.lang.String r0 = "contextual_feed_ad_pivot_type"
            int r0 = r1.getInt(r0, r2)
            r4.A01 = r0
            r0 = 570(0x23a, float:7.99E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            android.os.Parcelable r0 = r1.getParcelable(r0)
            com.instagram.feed.ui.state.IntentAwareAdPivotState r0 = (com.instagram.feed.ui.state.IntentAwareAdPivotState) r0
            if (r0 == 0) goto L_0x0188
            r4.A02 = r0
            java.lang.String r0 = "contextual_feed_category_hash_id"
            java.lang.String r0 = r1.getString(r0, r3)
            r4.A03 = r0
            java.lang.String r0 = "contextual_feed_multi_ad_unit_id"
            java.lang.String r0 = r1.getString(r0, r3)
            r4.A08 = r0
            java.lang.String r0 = "contextual_feed_multi_ad_unit_chaining_position"
            int r0 = r1.getInt(r0, r2)
            r4.A00 = r0
            java.lang.String r0 = "contextual_feed_inventory_source"
            java.lang.String r0 = r1.getString(r0)
            r4.A07 = r0
            java.lang.String r0 = "contextual_feed_individual_ad_media_id"
            java.lang.String r0 = r1.getString(r0)
            r4.A05 = r0
            java.lang.String r0 = "contextual_feed_individual_ad_tracking_token"
            java.lang.String r0 = r1.getString(r0)
            r4.A06 = r0
            java.lang.String r0 = "contextual_feed_individual_ad_ad_id"
            java.lang.String r0 = r1.getString(r0)
            r4.A04 = r0
            X.2un r2 = r4.A0H
            if (r2 == 0) goto L_0x0111
            X.H50 r1 = r4.A0D
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.2uv r0 = r2.A0J
            r0.A01 = r1
        L_0x0111:
            boolean r3 = X.C52765GcI.A03(r4)
            java.lang.String r0 = "intentAwareAdPivotState"
            java.util.Set r2 = r4.A0J
            com.instagram.feed.ui.state.IntentAwareAdPivotState r1 = r4.A02
            if (r3 == 0) goto L_0x017b
            if (r1 == 0) goto L_0x017d
            java.lang.String r0 = r4.A05
            java.util.List r0 = r1.A00(r0)
        L_0x0125:
            r2.addAll(r0)
            return
        L_0x0129:
            r3 = r6
            X.HAs r3 = (X.C54377HAs) r3
            android.os.Bundle r2 = r3.A05
            r0 = 274(0x112, float:3.84E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r1 = ""
            java.lang.String r0 = r2.getString(r0, r1)
            r3.A03 = r0
            r0 = 571(0x23b, float:8.0E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = r2.getString(r0, r1)
            r3.A02 = r0
            r0 = 1230(0x4ce, float:1.724E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = r2.getString(r0, r1)
            r3.A01 = r0
            r0 = 570(0x23a, float:7.99E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            android.os.Parcelable r0 = r2.getParcelable(r0)
            com.instagram.feed.ui.state.IntentAwareAdPivotState r0 = (com.instagram.feed.ui.state.IntentAwareAdPivotState) r0
            if (r0 == 0) goto L_0x018f
            r3.A00 = r0
            X.IY1 r2 = r3.A07
            if (r2 == 0) goto L_0x0172
            X.Hhi r1 = r3.A06
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.HoA r0 = r2.A06
            r0.A01 = r1
        L_0x0172:
            java.util.Set r2 = r3.A0C
            com.instagram.feed.ui.state.IntentAwareAdPivotState r1 = r3.A00
            if (r1 != 0) goto L_0x0185
            java.lang.String r0 = "intentAwareAdPivotState"
            goto L_0x017d
        L_0x017b:
            if (r1 != 0) goto L_0x0185
        L_0x017d:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0185:
            java.util.List r0 = r1.A0F
            goto L_0x0125
        L_0x0188:
            java.lang.String r0 = "Unexpected state"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x018f:
            java.lang.String r0 = "Unexpected state"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GAR.A0B():void");
    }

    public void A0C() {
        IY1 iy1;
        if (this instanceof C52767GcK) {
            ((C52767GcK) this).A0F.onStop();
        } else if (!(this instanceof C54373HAo) && !(this instanceof C54375HAq)) {
            if (this instanceof C52765GcI) {
                C233002un r0 = ((C52765GcI) this).A0H;
                if (r0 != null) {
                    r0.A04();
                }
            } else if (!(this instanceof C54376HAr) && !(this instanceof C54371HAm) && !(this instanceof C54374HAp) && !(this instanceof C54372HAn) && (iy1 = ((C54377HAs) this).A07) != null && iy1.A02 == AnonymousClass05K.A01) {
                iy1.A06.A02 = false;
                iy1.A07.A00();
                iy1.A02 = AnonymousClass05K.A00;
            }
        }
    }

    public void A0D() {
        if (!(this instanceof C52767GcK) && !(this instanceof C54373HAo) && !(this instanceof C54375HAq) && !(this instanceof C52765GcI) && !(this instanceof C54376HAr)) {
            boolean z = this instanceof C54371HAm;
        }
    }

    public final void A0E() {
        if (this instanceof C52767GcK) {
            C52767GcK gcK = (C52767GcK) this;
            if (gcK.A07) {
                C52767GcK.A02(1FI.A0E, gcK, true);
                gcK.A07 = false;
            }
        }
    }

    public void A0F(2da r4) {
        String str;
        if (this instanceof C54375HAq) {
            C54375HAq hAq = (C54375HAq) this;
            str = hAq.A03;
            if (str != null) {
                String str2 = hAq.A02;
                if (str2 != null) {
                    r4.EfN(str, str2);
                    return;
                }
            } else {
                str = hAq.A06.A0G;
            }
        } else if (this instanceof C52767GcK) {
            C52767GcK gcK = (C52767GcK) this;
            if ("feed_timeline_favorites".equals(gcK.A0H)) {
                AnonymousClass3JR A0K = DbS.A0K();
                A0K.A06 = R.drawable.instagram_star_list_pano_outline_24;
                A0K.A05 = 2131965834;
                A0K.A0G = C56801ICy.A00(gcK, 68);
                A0K.A0N = true;
                r4.AA3(new AnonymousClass3Jb(A0K));
                return;
            }
            return;
        } else if (this instanceof C54373HAo) {
            return;
        } else {
            if (this instanceof C54376HAr) {
                str = ((C54376HAr) this).A07.getString(2131969006);
            } else if (this instanceof C54371HAm) {
                str = "Posts";
            } else if (this instanceof C54374HAp) {
                C54374HAp hAp = (C54374HAp) this;
                Dbb.A1I(r4);
                String str3 = hAp.A06;
                if (str3 != null) {
                    r4.EfN(hAp.A01.getString(2131964954), str3);
                    return;
                } else {
                    r4.Eom(2131964954);
                    return;
                }
            } else {
                return;
            }
        }
        r4.setTitle(str);
    }

    public void A0H(AnonymousClass1qK r10) {
        AnonymousClass3W1 BQt;
        if (this instanceof C54376HAr) {
            C54376HAr hAr = (C54376HAr) this;
            0qQ.A0B(r10, 0);
            if ((r10 instanceof C57075INp) && hAr.A0B != null) {
                AnonymousClass6ST r1 = hAr.A0A;
                if (r1.isShowing()) {
                    r1.dismiss();
                }
                C57075INp iNp = (C57075INp) r10;
                String str = iNp.A01;
                Fragment fragment = hAr.A07;
                Context requireContext = fragment.requireContext();
                if (!hAr.A05 && str != null && str.equals("cannot accept more than max number of subposts")) {
                    hAr.A05 = true;
                    FragmentActivity activity = fragment.getActivity();
                    if (activity != null) {
                        C55922Hpj hpj = new C55922Hpj(activity);
                        Integer num = AnonymousClass05K.A0C;
                        hpj.A00(C56719I8z.A00(hAr, 51), hAr.A08, (1Xj) null, num);
                    }
                } else if (hAr.A06 || str == null || str.equals("cannot accept more than max number of subposts")) {
                    if (!(iNp.A00 == null || fragment.mView == null)) {
                        if (iNp.A04) {
                            C56588I2s.A02(requireContext, new C57276IVl(hAr, 13), AnonymousClass7TE.A16(requireContext, 2131968991), iNp.A02);
                        } else {
                            C59689JTv.A01(requireContext, (String) null, 2131968992, 0);
                        }
                        if (!AnonymousClass7TF.A1Z(hAr.A0C)) {
                            hAr.A0Q(true, true);
                        }
                    }
                    if (str == null) {
                        return;
                    }
                } else {
                    hAr.A06 = true;
                    int i = 2131968972;
                    if (iNp.A04) {
                        i = 2131968971;
                    }
                    C56588I2s.A01(requireContext, i);
                }
                if (AnonymousClass7TF.A1Z(hAr.A0C)) {
                    String str2 = iNp.A03;
                    if (!(str2 == null || (BQt = hAr.A09.BQt(str2)) == null)) {
                        BQt.A2l = false;
                    }
                    hAr.A0Q(true, false);
                }
            }
        } else if (!(this instanceof C52767GcK) && !(this instanceof C54373HAo) && !(this instanceof C54371HAm) && !(this instanceof C54375HAq) && !(this instanceof C54374HAp)) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0045, code lost:
        r4 = r3.A09;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0I(X.AnonymousClass1qK r8) {
        /*
            r7 = this;
            boolean r0 = r7 instanceof X.C54376HAr
            if (r0 == 0) goto L_0x00a7
            r3 = r7
            X.HAr r3 = (X.C54376HAr) r3
            r2 = 0
            X.0qQ.A0B(r8, r2)
            boolean r0 = r8 instanceof X.C57073INn
            if (r0 == 0) goto L_0x009d
            java.lang.String r0 = r3.A0B
            if (r0 == 0) goto L_0x009d
            X.INn r8 = (X.C57073INn) r8
            java.lang.String r5 = r8.A01
            r3.A02 = r5
            r3.A06 = r2
            androidx.fragment.app.Fragment r0 = r3.A07
            android.content.Context r6 = r0.requireContext()
            X.0eM r0 = r3.A0C
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            boolean r1 = r8.A02
            if (r0 == 0) goto L_0x00bc
            r0 = 2131968966(0x7f1343c6, float:1.9574842E38)
            if (r1 == 0) goto L_0x0033
            r0 = 2131968929(0x7f1343a1, float:1.9574766E38)
        L_0x0033:
            java.lang.String r4 = X.AnonymousClass7TE.A16(r6, r0)
            java.lang.String r2 = r8.A00
            r1 = 13
            X.IVl r0 = new X.IVl
            r0.<init>(r3, r1)
            X.C56588I2s.A02(r6, r0, r4, r2)
            if (r5 == 0) goto L_0x0077
            X.JRI r4 = r3.A09
            java.util.List r0 = r4.AZL()
            if (r0 == 0) goto L_0x0077
            java.util.Iterator r1 = r0.iterator()
        L_0x0051:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0077
            java.lang.Object r2 = r1.next()
            X.1Xg r2 = (X.1Xg) r2
            X.1Xj r0 = X.C51965G9l.A0o(r2)
            if (r0 == 0) goto L_0x0051
            java.lang.String r0 = r0.A2n()
            boolean r0 = X.0qQ.A0K(r0, r5)
            if (r0 == 0) goto L_0x0051
            X.3W1 r1 = r4.BQs(r2)
            r0 = 1
            r1.A2l = r0
            r4.EDn(r2)
        L_0x0077:
            X.JRI r4 = r3.A09
            java.util.List r0 = r4.AZL()
            if (r0 == 0) goto L_0x009d
            java.util.Iterator r2 = r0.iterator()
        L_0x0083:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x009e
            java.lang.Object r1 = r2.next()
            X.1Xg r1 = (X.1Xg) r1
            X.1Xj r0 = X.C51965G9l.A0o(r1)
            if (r0 == 0) goto L_0x0083
            X.3W1 r0 = r4.BQs(r1)
            boolean r0 = r0.A2l
            if (r0 != 0) goto L_0x0083
        L_0x009d:
            return
        L_0x009e:
            boolean r0 = r3.A04
            if (r0 != 0) goto L_0x009d
            r0 = 1
            X.C54376HAr.A03(r3, r0)
            return
        L_0x00a7:
            boolean r0 = r7 instanceof X.C52767GcK
            if (r0 != 0) goto L_0x009d
            boolean r0 = r7 instanceof X.C54373HAo
            if (r0 != 0) goto L_0x009d
            boolean r0 = r7 instanceof X.C54371HAm
            if (r0 != 0) goto L_0x009d
            boolean r0 = r7 instanceof X.C54375HAq
            if (r0 != 0) goto L_0x009d
            boolean r0 = r7 instanceof X.C54374HAp
            if (r0 == 0) goto L_0x009d
            return
        L_0x00bc:
            if (r1 == 0) goto L_0x00cc
            r3.A05 = r2
            X.6ST r1 = r3.A0A
            r0 = 2131968928(0x7f1343a0, float:1.9574764E38)
        L_0x00c5:
            X.DbU.A18(r6, r1, r0)
            X.AnonymousClass0fN.A00(r1)
            return
        L_0x00cc:
            X.6ST r1 = r3.A0A
            r0 = 2131968966(0x7f1343c6, float:1.9574842E38)
            goto L_0x00c5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GAR.A0I(X.1qK):void");
    }

    public final void A0J(1Ng r4) {
        if (this instanceof C52767GcK) {
            C52767GcK gcK = (C52767GcK) this;
            r4.A01(gcK.A0A, C2371336l.class);
            r4.A01(gcK.A0B, C2371536n.class);
        }
    }

    public final void A0K(1Ng r4) {
        if (this instanceof C52767GcK) {
            C52767GcK gcK = (C52767GcK) this;
            r4.A02(gcK.A0A, C2371336l.class);
            r4.A02(gcK.A0B, C2371536n.class);
        }
    }

    public void A0L(C2362232x r3) {
        if (this instanceof C54375HAq) {
            C54375HAq hAq = (C54375HAq) this;
            r3.A0M = hAq.A01;
            r3.A0N = hAq.A07;
        } else if (!(this instanceof C52767GcK) && !(this instanceof C54373HAo) && !(this instanceof C54376HAr) && !(this instanceof C54371HAm) && !(this instanceof C54374HAp)) {
        }
    }

    public void A0M(User user) {
        if (this instanceof C54376HAr) {
            return;
        }
        if (this instanceof C52767GcK) {
            ((C52767GcK) this).A0D.AVB(user);
        } else if (!(this instanceof C54373HAo) && !(this instanceof C54371HAm) && !(this instanceof C54375HAq) && !(this instanceof C54374HAp)) {
        }
    }

    public void A0N(User user) {
        if (this instanceof C54376HAr) {
            return;
        }
        if (this instanceof C52767GcK) {
            ((C52767GcK) this).A0D.AVB(user);
        } else if (!(this instanceof C54373HAo) && !(this instanceof C54371HAm) && !(this instanceof C54375HAq) && !(this instanceof C54374HAp)) {
        }
    }

    public void A0O(String str) {
        if (this instanceof C54376HAr) {
            return;
        }
        if (this instanceof C52767GcK) {
            ((C52767GcK) this).A0D.FIY(str);
        } else if (!(this instanceof C54373HAo) && !(this instanceof C54371HAm) && !(this instanceof C54375HAq) && !(this instanceof C54374HAp)) {
        }
    }

    public void A0P(List list) {
        if (!(this instanceof C54375HAq) && !(this instanceof C52767GcK) && !(this instanceof C54373HAo) && !(this instanceof C54376HAr) && !(this instanceof C54371HAm)) {
            boolean z = this instanceof C54374HAp;
        }
    }

    public void A0Q(boolean z, boolean z2) {
        String str;
        AnonymousClass3DY valueOf;
        String str2;
        String str3;
        String str4;
        int i;
        long parseLong;
        int i2;
        1FI r0;
        String str5;
        UserSession userSession;
        String A06;
        boolean z3 = z;
        if (this instanceof C54375HAq) {
            C54375HAq hAq = (C54375HAq) this;
            if (z) {
                str5 = null;
            } else {
                str5 = hAq.A00.A03.A07;
            }
            C324356z9 r7 = hAq.A00;
            SavedCollection savedCollection = hAq.A06;
            if (savedCollection.A07 == C54665HMw.ALL_MEDIA_AUTO_COLLECTION) {
                userSession = hAq.A04;
                0qQ.A0B(userSession, 0);
                A06 = "feed/saved/posts/";
            } else {
                String str6 = savedCollection.A0F;
                userSession = hAq.A04;
                0qQ.A0B(userSession, 2);
                A06 = 0mp.A06("feed/collection/%s/posts/", new Object[]{str6});
            }
            1NY A0b = AnonymousClass7TG.A0b(userSession);
            A0b.A0E = A06;
            C51972G9s.A18(A0b, userSession, C56342Hwt.class);
            A0b.A0A = 002.A0R(A06, str5);
            A0b.A03();
            C3724090s.A06(A0b, str5);
            C54381HAw.A00(A0b.A0M(), r7, hAq, 4, z3);
        } else if (this instanceof C52767GcK) {
            C52767GcK gcK = (C52767GcK) this;
            if (!z) {
                r0 = 1FI.A0G;
            } else if (z2) {
                r0 = 1FI.A0J;
            } else {
                String str7 = gcK.A0H;
                int hashCode = str7.hashCode();
                if (hashCode != 96419903) {
                    if (hashCode != 227128404) {
                        if (hashCode == 1970940954 && str7.equals("feed_timeline_favorites")) {
                            if (!gcK.A06) {
                                r0 = 1FI.A09;
                            }
                            r0 = 1FI.A0A;
                        }
                    } else if (str7.equals(AnonymousClass000.A00(605))) {
                        if (gcK.A06) {
                            r0 = 1FI.A0D;
                        } else {
                            r0 = 1FI.A0C;
                        }
                    }
                } else if (str7.equals("feed_timeline_fan_club")) {
                    if (gcK.A06) {
                        r0 = 1FI.A08;
                    } else {
                        r0 = 1FI.A07;
                    }
                }
                if (!gcK.A06) {
                    r0 = 1FI.A06;
                }
                r0 = 1FI.A0A;
            }
            C52767GcK.A02(r0, gcK, z3);
        } else {
            if (this instanceof C54373HAo) {
                C54373HAo hAo = (C54373HAo) this;
                C324356z9 r4 = hAo.A00;
                if (r4 == null) {
                    C51965G9l.A16();
                } else {
                    1OC A01 = C3724090s.A01(hAo.A02, hAo.A04, false, hAo.A05);
                    if (hAo instanceof C54600HKj) {
                        i2 = 2;
                    } else {
                        i2 = 3;
                    }
                    r4.A03(A01, new C54378HAt(hAo, i2));
                    return;
                }
            } else if (this instanceof C52765GcI) {
                C52765GcI gcI = (C52765GcI) this;
                C233002un r3 = gcI.A0H;
                String str8 = "categoryHashId";
                if (r3 != null) {
                    C230282pK r13 = r3.A0K;
                    int i3 = gcI.A00;
                    String str9 = gcI.A03;
                    if (str9 != null) {
                        int size = gcI.A0J.size();
                        String str10 = gcI.A0B;
                        if (str10 != null) {
                            String str11 = gcI.A09;
                            if (str11 != null) {
                                int i4 = gcI.A01;
                                String str12 = gcI.A08;
                                if (str12 == null) {
                                    str8 = "multiAdsUnitId";
                                } else {
                                    IntentAwareAdPivotState intentAwareAdPivotState = gcI.A02;
                                    if (intentAwareAdPivotState == null) {
                                        str8 = "intentAwareAdPivotState";
                                    } else {
                                        String str13 = gcI.A07;
                                        0Aj A0e = AnonymousClass7TE.A0e(r13.A01, "instagram_contextual_ads_pagination_request");
                                        if (A0e.isSampled()) {
                                            C51971G9r.A17(A0e, i3);
                                            C51965G9l.A1R(A0e, intentAwareAdPivotState.A0E);
                                            C51969G9p.A1B(A0e, r13.A04);
                                            A0e.AAJ("contextual_ads_category", "");
                                            if (str9.length() == 0) {
                                                parseLong = 0;
                                            } else {
                                                parseLong = Long.parseLong(str9);
                                            }
                                            A0e.A9F("category_hash_id", Long.valueOf(parseLong));
                                            A0e.A9F("last_ad_index", DbS.A0j(size));
                                            A0e.A9F("hscroll_seed_ad_id", AnonymousClass7TE.A10(str10));
                                            A0e.A9F("multi_ads_type_number", DbV.A0p(A0e, "container_module", "feed_timeline", i4));
                                            A0e.AAJ("multi_ads_unit_id", str12);
                                            A0e.AAJ("inventory_source", C241323Ot.A02(str13));
                                            A0e.AAJ("hscroll_seed_ad_tracking_token", str11);
                                            A0e.Cgf();
                                        }
                                    }
                                }
                            }
                            0qQ.A0F("seedAdTrackingToken");
                        }
                        0qQ.A0F("seedMediaId");
                    }
                    0qQ.A0F(str8);
                }
                String string = gcI.A0C.getString("contextual_feed_trigger_type_name");
                if (string == null) {
                    valueOf = null;
                } else {
                    valueOf = AnonymousClass3DY.valueOf(string);
                }
                UserSession userSession2 = gcI.A0E;
                0Tu r11 = 0Tu.A06;
                if (182.A06(r11, userSession2, 36312887643670011L)) {
                    List AZL = gcI.A0F.AZL();
                    0qQ.A07(AZL);
                    try {
                        StringWriter stringWriter = new StringWriter();
                        17W A0e2 = C51970G9q.A0e(stringWriter);
                        Iterator it = AZL.iterator();
                        while (it.hasNext()) {
                            1Xj A0t = C51966G9m.A0t(it);
                            Integer CEl = A0t.CEl();
                            A0t.A0C.Eqv(true);
                            A0e2.A0c();
                            A0e2.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0t.getId());
                            if (CEl != null) {
                                i = CEl.intValue();
                            } else {
                                i = 0;
                            }
                            A0e2.A0P(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, i);
                            A0e2.A0Z();
                        }
                        A0e2.A0Y();
                        A0e2.close();
                        str2 = stringWriter.toString();
                    } catch (IOException e) {
                        C51969G9p.A1K(0wj.A01.AEf("IntentAwareAdFeedController_captureViewState", 817903741), AnonymousClass7TG.A0m(e, "Failed building JSON: ", AnonymousClass7TE.A1A()));
                        str2 = null;
                    }
                } else {
                    str2 = null;
                }
                AnonymousClass4I5 r2 = AnonymousClass59V.A00;
                if (!r2.A01(Integer.valueOf(gcI.A01))) {
                    int i5 = gcI.A01;
                    if (i5 == 7) {
                        if (r3 != null) {
                            String str14 = gcI.A0B;
                            if (str14 != null) {
                                String str15 = gcI.A0A;
                                AnonymousClass3DY r22 = AnonymousClass3DY.FEED_OF_ADS_PAGINATION;
                                String str16 = gcI.A07;
                                if (str15 == null) {
                                    0wb.A03(AnonymousClass000.A00(2329), 002.A0R("mediaAuthorIgid is null for POE request. seedMediaId = ", str14));
                                }
                                r3.A09.DFK(new AnonymousClass4LN((Integer) null, (Integer) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0sr.A1M(new String[]{str14}), false, false, false, false));
                                C233002un.A03(C233002un.A00(r22, r3, str14, str15, str16, 0, 0), r3);
                                return;
                            }
                        } else {
                            return;
                        }
                    } else if (!r2.A02(Integer.valueOf(i5))) {
                        throw DbW.A0a("unexpected MultiAdsType: ", gcI.A01);
                    } else if (r3 != null) {
                        String str17 = gcI.A03;
                        if (str17 != null) {
                            String str18 = gcI.A04;
                            String str19 = gcI.A06;
                            C233042ur r1 = r3.A09;
                            if (str18 == null) {
                                str3 = "0";
                            } else {
                                str3 = str18;
                            }
                            r1.DFK(new AnonymousClass4LN((Integer) null, (Integer) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0sr.A1M(new String[]{str3}), false, false, false, false));
                            UserSession userSession3 = r3.A0I;
                            1NY A0a = AnonymousClass7TG.A0a(userSession3);
                            A0a.A0A("feed/contextual_multi_ads/");
                            A0a.A0O((15p) null, C54077Gz1.class, D1T.class, false);
                            A0a.A00 = r3.A0H.A00;
                            A0a.A9m("container_module", "feed_timeline");
                            A0a.A9m("trigger_type", "feed_of_ads_pagination");
                            if (182.A06(r11, userSession3, 36312887636264351L)) {
                                A0a.A0G("seed_ad_id", str18);
                                A0a.A0G("seed_ad_token", str19);
                                A0a.A0C("position", 0);
                            } else {
                                A0a.A9m("category_hash_id", str17);
                            }
                            A0a.A0G("client_view_state_media_list", str2);
                            if (z) {
                                str4 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
                            } else {
                                str4 = "0";
                            }
                            A0a.A0G("is_first_page", str4);
                            A0a.A0R = true;
                            C51968G9o.A1C(r3.A0G, A0a, userSession3);
                            C233002un.A02(A0a.A0M(), r3);
                            return;
                        }
                        0qQ.A0F(str8);
                    } else {
                        return;
                    }
                } else if (r3 != null) {
                    String str20 = gcI.A0B;
                    if (str20 != null) {
                        String str21 = gcI.A09;
                        if (str21 != null) {
                            if (valueOf == null) {
                                valueOf = AnonymousClass3DY.FEED_OF_ADS_PAGINATION;
                            }
                            r3.A07(valueOf, (Boolean) null, (Boolean) null, (Integer) null, (Integer) null, (Integer) null, str20, str21, gcI.A07, (String) null, (String) null, gcI.A06, gcI.A04, str2, 0, z3);
                            return;
                        }
                        0qQ.A0F("seedAdTrackingToken");
                    }
                } else {
                    return;
                }
                0qQ.A0F("seedMediaId");
            } else if (this instanceof C54376HAr) {
                C54376HAr hAr = (C54376HAr) this;
                C324356z9 r32 = hAr.A00;
                if (r32 == null) {
                    C51965G9l.A16();
                } else {
                    C54381HAw.A00(C3724090s.A01(hAr.A08, hAr.A03, false, false), r32, hAr, 7, z3);
                    return;
                }
            } else if (this instanceof C54371HAm) {
                C54371HAm hAm = (C54371HAm) this;
                String str22 = null;
                if (!z) {
                    str22 = hAm.A02.A03.A07;
                }
                1NY A0a2 = AnonymousClass7TG.A0a(hAm.A00);
                A0a2.A0A("clips/mashup/attribution_feed/");
                A0a2.A0G("mashup_id", hAm.A03);
                A0a2.A0Q(CGM.class, D38.class);
                if (str22 != null) {
                    A0a2.A9m("max_id", str22);
                }
                C54381HAw.A00(A0a2.A0M(), hAm.A02, hAm, 6, z3);
                return;
            } else {
                if (this instanceof C54374HAp) {
                    C54374HAp hAp = (C54374HAp) this;
                    str = "feedNetworkSource";
                    String str23 = null;
                    if (!z) {
                        C324356z9 r02 = hAp.A00;
                        if (r02 != null) {
                            str23 = r02.A03.A07;
                        }
                    }
                    C324356z9 r33 = hAp.A00;
                    if (r33 != null) {
                        1NY A0M = DbZ.A0M(hAp.A03);
                        A0M.A0A("feed/liked/");
                        A0M.A0Q(1XO.class, 1XW.class);
                        C3724090s.A06(A0M, str23);
                        C54381HAw.A00(A0M.A0M(), r33, hAp, 3, z3);
                        return;
                    }
                } else if (this instanceof C54372HAn) {
                    C54372HAn hAn = (C54372HAn) this;
                    C324356z9 r34 = hAn.A00;
                    if (r34 == null) {
                        C51965G9l.A16();
                    } else {
                        C54381HAw.A00(C3724090s.A01(hAn.A02, hAn.A04, false, false), r34, hAn, 2, z3);
                        return;
                    }
                } else {
                    C54377HAs hAs = (C54377HAs) this;
                    hAs.A04 = z3;
                    IY1 iy1 = hAs.A07;
                    str = "seedMediaId";
                    if (iy1 != null) {
                        String str24 = hAs.A03;
                        if (str24 != null) {
                            String str25 = hAs.A01;
                            if (str25 != null) {
                                iy1.A00(str24, str25, hAs.A0B, hAs.A09.AZL().isEmpty(), z3);
                            }
                            0qQ.A0F("seedAdId");
                        }
                    }
                    if (z && C54771HSd.A00(hAs.A08) && iy1 != null) {
                        String str26 = hAs.A03;
                        if (str26 != null) {
                            String str27 = hAs.A01;
                            if (str27 != null) {
                                iy1.A00(str26, str27, hAs.A0B, false, false);
                                return;
                            }
                            0qQ.A0F("seedAdId");
                        }
                    } else {
                        return;
                    }
                }
                0qQ.A0F(str);
            }
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final boolean A0R() {
        if (this instanceof C52767GcK) {
            String str = ((C52767GcK) this).A0H;
            switch (str.hashCode()) {
                case 227128404:
                    if (str.equals(AnonymousClass000.A00(605))) {
                        return true;
                    }
                    break;
                case 1970940954:
                    if (!str.equals("feed_timeline_favorites")) {
                        return false;
                    }
                    return true;
            }
            return false;
        } else if ((this instanceof C54376HAr) || (this instanceof C54372HAn)) {
            return true;
        } else {
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003d A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0S() {
        /*
            r5 = this;
            boolean r0 = r5 instanceof X.C52765GcI
            if (r0 == 0) goto L_0x003e
            r3 = r5
            X.GcI r3 = (X.C52765GcI) r3
            boolean r2 = X.C52765GcI.A03(r3)
            r4 = 0
            java.lang.String r1 = "intentAwareAdPivotState"
            com.instagram.feed.ui.state.IntentAwareAdPivotState r0 = r3.A02
            if (r2 == 0) goto L_0x002a
            if (r0 == 0) goto L_0x00a2
            java.lang.String r3 = r3.A05
            if (r3 == 0) goto L_0x0029
            java.util.Map r2 = r0.A0G
            boolean r1 = r2.containsKey(r3)
            r0 = 1
            if (r1 != 0) goto L_0x002f
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.put(r3, r0)
        L_0x0028:
            r4 = 1
        L_0x0029:
            return r4
        L_0x002a:
            if (r0 == 0) goto L_0x00a2
            boolean r0 = r0.A0D
            goto L_0x003b
        L_0x002f:
            java.lang.Object r0 = r2.get(r3)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x0029
            boolean r0 = r0.booleanValue()
        L_0x003b:
            if (r0 != 0) goto L_0x0028
            return r4
        L_0x003e:
            boolean r0 = r5 instanceof X.C52767GcK
            if (r0 == 0) goto L_0x0051
            r0 = r5
            X.GcK r0 = (X.C52767GcK) r0
            X.6z9 r0 = r0.A01
            r4 = 1
            if (r0 == 0) goto L_0x00a9
            boolean r0 = r0.A05()
            if (r0 != r4) goto L_0x00a9
            return r4
        L_0x0051:
            boolean r0 = r5 instanceof X.C54375HAq
            if (r0 == 0) goto L_0x005f
            r0 = r5
            X.HAq r0 = (X.C54375HAq) r0
            X.6z9 r0 = r0.A00
        L_0x005a:
            boolean r4 = r0.A05()
            return r4
        L_0x005f:
            boolean r0 = r5 instanceof X.C54373HAo
            if (r0 == 0) goto L_0x0072
            r0 = r5
            X.HAo r0 = (X.C54373HAo) r0
            X.6z9 r0 = r0.A00
            if (r0 != 0) goto L_0x005a
            X.C51965G9l.A16()
        L_0x006d:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0072:
            boolean r0 = r5 instanceof X.C54376HAr
            if (r0 == 0) goto L_0x007c
            r0 = r5
            X.HAr r0 = (X.C54376HAr) r0
            boolean r4 = r0.A04
            return r4
        L_0x007c:
            boolean r0 = r5 instanceof X.C54371HAm
            if (r0 == 0) goto L_0x0086
            r0 = r5
            X.HAm r0 = (X.C54371HAm) r0
            X.6z9 r0 = r0.A02
            goto L_0x005a
        L_0x0086:
            boolean r0 = r5 instanceof X.C54374HAp
            if (r0 == 0) goto L_0x0095
            r0 = r5
            X.HAp r0 = (X.C54374HAp) r0
            X.6z9 r0 = r0.A00
            if (r0 != 0) goto L_0x005a
            X.C51965G9l.A16()
            goto L_0x006d
        L_0x0095:
            boolean r0 = r5 instanceof X.C54372HAn
            if (r0 != 0) goto L_0x00a9
            r0 = r5
            X.HAs r0 = (X.C54377HAs) r0
            com.instagram.feed.ui.state.IntentAwareAdPivotState r0 = r0.A00
            if (r0 != 0) goto L_0x00a6
            java.lang.String r1 = "intentAwareAdPivotState"
        L_0x00a2:
            X.0qQ.A0F(r1)
            goto L_0x006d
        L_0x00a6:
            boolean r4 = r0.A0D
            return r4
        L_0x00a9:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GAR.A0S():boolean");
    }

    public boolean A0T() {
        if (this instanceof C54375HAq) {
            return A01(((C54375HAq) this).A04);
        }
        if (this instanceof C52767GcK) {
            return false;
        }
        if (this instanceof C54373HAo) {
            return A01(((C54373HAo) this).A02);
        }
        if (this instanceof C54376HAr) {
            return A01(((C54376HAr) this).A08);
        }
        if (this instanceof C54371HAm) {
            return A01(((C54371HAm) this).A00);
        }
        if (this instanceof C54374HAp) {
            return A01(((C54374HAp) this).A03);
        }
        if (this instanceof C54372HAn) {
            return A01(((C54372HAn) this).A02);
        }
        return false;
    }

    public boolean A0U() {
        Integer num;
        if (this instanceof C52765GcI) {
            return false;
        }
        if (this instanceof C54375HAq) {
            return C51973G9u.A1Y(((C54375HAq) this).A00);
        }
        if (this instanceof C54373HAo) {
            C324356z9 r0 = ((C54373HAo) this).A00;
            if (r0 != null) {
                return C51973G9u.A1Y(r0);
            }
            C51965G9l.A16();
            throw AnonymousClass00P.createAndThrow();
        } else if (this instanceof C52767GcK) {
            C324356z9 r02 = ((C52767GcK) this).A01;
            if (r02 != null) {
                num = r02.A03.A03;
            } else {
                num = null;
            }
            return AnonymousClass7TF.A1W(num, AnonymousClass05K.A01);
        } else if (this instanceof C54376HAr) {
            C324356z9 r03 = ((C54376HAr) this).A00;
            if (r03 != null) {
                return C51973G9u.A1Y(r03);
            }
            C51965G9l.A16();
            throw AnonymousClass00P.createAndThrow();
        } else if (this instanceof C54371HAm) {
            return C51973G9u.A1Y(((C54371HAm) this).A02);
        } else {
            if (this instanceof C54374HAp) {
                C324356z9 r04 = ((C54374HAp) this).A00;
                if (r04 != null) {
                    return C51973G9u.A1Y(r04);
                }
                C51965G9l.A16();
                throw AnonymousClass00P.createAndThrow();
            } else if (!(this instanceof C54372HAn)) {
                return false;
            } else {
                C324356z9 r05 = ((C54372HAn) this).A00;
                if (r05 != null) {
                    return C51973G9u.A1Y(r05);
                }
                C51965G9l.A16();
                throw AnonymousClass00P.createAndThrow();
            }
        }
    }

    public final boolean A0V() {
        if (this instanceof C54377HAs) {
            return ((C54377HAs) this).A04;
        }
        return false;
    }

    public boolean A0W() {
        Integer num;
        if (this instanceof C54375HAq) {
            return C51973G9u.A1X(((C54375HAq) this).A00);
        }
        if (this instanceof C52767GcK) {
            C324356z9 r0 = ((C52767GcK) this).A01;
            if (r0 != null) {
                num = r0.A03.A03;
            } else {
                num = null;
            }
            return AnonymousClass7TF.A1W(num, AnonymousClass05K.A00);
        } else if (this instanceof C52765GcI) {
            C233002un r02 = ((C52765GcI) this).A0H;
            if (r02 != null) {
                return r02.CTb();
            }
            return false;
        } else if (this instanceof C54373HAo) {
            C324356z9 r03 = ((C54373HAo) this).A00;
            if (r03 != null) {
                return C51973G9u.A1X(r03);
            }
            C51965G9l.A16();
            throw AnonymousClass00P.createAndThrow();
        } else if (this instanceof C54376HAr) {
            C324356z9 r04 = ((C54376HAr) this).A00;
            if (r04 != null) {
                return C51973G9u.A1X(r04);
            }
            C51965G9l.A16();
            throw AnonymousClass00P.createAndThrow();
        } else if (this instanceof C54371HAm) {
            return C51973G9u.A1X(((C54371HAm) this).A02);
        } else {
            if (this instanceof C54374HAp) {
                C324356z9 r05 = ((C54374HAp) this).A00;
                if (r05 != null) {
                    return C51973G9u.A1X(r05);
                }
                C51965G9l.A16();
                throw AnonymousClass00P.createAndThrow();
            } else if (this instanceof C54372HAn) {
                C324356z9 r06 = ((C54372HAn) this).A00;
                if (r06 != null) {
                    return C51973G9u.A1X(r06);
                }
                C51965G9l.A16();
                throw AnonymousClass00P.createAndThrow();
            } else {
                IY1 iy1 = ((C54377HAs) this).A07;
                if (iy1 != null) {
                    return iy1.CTb();
                }
                return false;
            }
        }
    }

    public boolean A0Y() {
        if ((this instanceof C54375HAq) || (this instanceof C52767GcK) || (this instanceof C54373HAo) || (this instanceof C54376HAr)) {
            return true;
        }
        if (this instanceof C54371HAm) {
            return false;
        }
        boolean z = this instanceof C54374HAp;
        return true;
    }

    public boolean A0Z() {
        if (this instanceof C54375HAq) {
            return false;
        }
        if (!(this instanceof C52767GcK)) {
            if ((this instanceof C54373HAo) || (this instanceof C54376HAr) || (this instanceof C54371HAm) || (this instanceof C54374HAp) || (this instanceof C54372HAn) || !(this instanceof C52765GcI)) {
                return false;
            }
            C52765GcI gcI = (C52765GcI) this;
            if (!C52765GcI.A03(gcI)) {
                List AZL = gcI.A0F.AZL();
                0qQ.A07(AZL);
                if (0qQ.A0K(C51971G9r.A0s((1Xj) 00k.A0L(AZL)), gcI.A05)) {
                    return true;
                }
                return false;
            }
        }
        return true;
    }

    public boolean A0a() {
        if ((this instanceof C54375HAq) || (this instanceof C54376HAr) || (this instanceof C52767GcK) || (this instanceof C54373HAo) || (this instanceof C54371HAm)) {
            return false;
        }
        boolean z = this instanceof C54374HAp;
        return false;
    }

    public boolean A0b() {
        if (this instanceof C52767GcK) {
            return true;
        }
        if (this instanceof C54373HAo) {
            return false;
        }
        if (this instanceof C54375HAq) {
            return ((C54375HAq) this).A00.A06();
        }
        if ((this instanceof C54376HAr) || (this instanceof C54371HAm)) {
            return true;
        }
        boolean z = this instanceof C54374HAp;
        return true;
    }

    public boolean A0c() {
        if (this instanceof C54375HAq) {
            return false;
        }
        if (this instanceof C52767GcK) {
            return 182.A06(0Tu.A05, ((C52767GcK) this).A0C, 36314442408987181L);
        } else if ((this instanceof C54373HAo) || (this instanceof C54376HAr) || (this instanceof C54371HAm)) {
            return false;
        } else {
            boolean z = this instanceof C54374HAp;
            return false;
        }
    }

    public boolean A0e() {
        if ((this instanceof C54375HAq) || (this instanceof C52767GcK) || (this instanceof C54373HAo) || (this instanceof C54376HAr) || (this instanceof C54371HAm)) {
            return false;
        }
        boolean z = this instanceof C54374HAp;
        return false;
    }

    public boolean A0f() {
        if (this instanceof C54375HAq) {
            return true;
        }
        if (this instanceof C52767GcK) {
            return false;
        }
        if (this instanceof C54373HAo) {
            return true;
        }
        if ((this instanceof C54376HAr) || (this instanceof C54371HAm) || (this instanceof C54374HAp) || (this instanceof C54372HAn)) {
            return false;
        }
        return true;
    }

    public boolean A0g() {
        if ((this instanceof C54375HAq) || (this instanceof C52767GcK) || (this instanceof C54373HAo) || (this instanceof C54376HAr) || (this instanceof C54371HAm)) {
            return false;
        }
        boolean z = this instanceof C54374HAp;
        return false;
    }

    public boolean A0h(1Xj r2) {
        if ((this instanceof C54375HAq) || (this instanceof C52765GcI) || (this instanceof C54376HAr) || (this instanceof C52767GcK) || (this instanceof C54373HAo)) {
            return true;
        }
        boolean z = this instanceof C54371HAm;
        return true;
    }

    public static int A00(Context context) {
        return AnonymousClass3D4.A00(context);
    }
}
