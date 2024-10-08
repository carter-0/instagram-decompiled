package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.Base64;
import com.facebook.rsys.transport.gen.SignalingMessageIncomingStats;
import com.instagram.common.session.UserSession;
import com.instagram.foa.session.IgMetaSessionImpl;
import com.instagram.model.rtc.RtcCallKey;
import com.instagram.model.rtc.RtcCallSource;
import com.instagram.model.rtc.RtcCreateCallArgs;
import com.instagram.model.rtc.RtcEnterCallArgs;
import com.instagram.model.rtc.RtcJoinCallArgs;
import com.instagram.rtc.signaling.models.RtcConnectionEntity;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.38Y  reason: invalid class name */
public final class AnonymousClass38Y implements 1XG, 0lm {
    public int A00;
    public C62320sa A01;
    public boolean A02;
    public boolean A03;
    public final Context A04;
    public final AnonymousClass12V A05;
    public final UserSession A06;
    public final 1XD A07;
    public final 1XA A08;
    public final 1XE A09;
    public final HashMap A0A;
    public final AnonymousClass0eM A0B;
    public final AnonymousClass0eM A0C;
    public final 05G A0D;
    public final HashMap A0E;

    public AnonymousClass38Y(Context context, UserSession userSession, 1XD r12, 1XA r13, 1XE r14) {
        0qQ.A0B(context, 1);
        0qQ.A0B(userSession, 2);
        0qQ.A0B(r12, 3);
        0qQ.A0B(r13, 4);
        0qQ.A0B(r14, 5);
        this.A04 = context;
        this.A06 = userSession;
        this.A07 = r12;
        this.A08 = r13;
        this.A09 = r14;
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C377209Ky(this, 11));
        this.A0B = A002;
        if (((Boolean) A002.getValue()).booleanValue()) {
            Context applicationContext = context.getApplicationContext();
            0qQ.A07(applicationContext);
            userSession.A04(C71116OdA.class, new C71116OdA(applicationContext, new C71032OZt(context, userSession), new IgMetaSessionImpl(userSession)));
        }
        r12.A01.add(this);
        r12.A02.add(this);
        this.A0C = AnonymousClass0eN.A01(new C377209Ky(this, 12));
        this.A0A = new HashMap();
        this.A0E = new HashMap();
        this.A0D = new 02z(new C2375338c((Long) null, (Long) null, false, true, false, true, true));
        this.A05 = AnonymousClass12T.A00;
    }

    public final void A06(RtcEnterCallArgs rtcEnterCallArgs, C62320sa r7) {
        RtcCallKey rtcCallKey;
        0qQ.A0B(rtcEnterCallArgs, 0);
        this.A01 = r7;
        String str = null;
        if (rtcEnterCallArgs instanceof RtcJoinCallArgs) {
            rtcCallKey = ((RtcJoinCallArgs) rtcEnterCallArgs).A02;
            if (rtcCallKey != null) {
                str = 002.A0T(this.A06.A06, rtcCallKey.A00, '_');
            }
        } else {
            rtcCallKey = null;
        }
        1XD r2 = this.A07;
        UserSession userSession = this.A06;
        if (str == null) {
            str = AnonymousClass000.A00(343);
        }
        r2.A03.containsKey(str);
        A03(rtcCallKey, rtcEnterCallArgs.Bxh(), this);
        if (rtcEnterCallArgs instanceof RtcCreateCallArgs) {
            RtcCreateCallArgs rtcCreateCallArgs = (RtcCreateCallArgs) rtcEnterCallArgs;
            if (!rtcCreateCallArgs.A0B && 182.A06(0Tu.A05, userSession, 36314850430880581L)) {
                C72192OyC A002 = C66953Mfm.A00(this.A04, userSession);
                A002.A06(rtcCreateCallArgs);
                A002.A06.A02(PLI.A00);
                A04(this);
            }
        }
        Context context = this.A04;
        0kR.A0B(context, C70319O1x.A00(context, userSession, rtcEnterCallArgs));
        A04(this);
    }

    public final void A07(RtcConnectionEntity.RtcCallConnectionEntity rtcCallConnectionEntity, String str, C62320sa r11) {
        C70818OMn oMn;
        0sP pqM;
        0qQ.A0B(rtcCallConnectionEntity, 0);
        A04(this);
        C72192OyC A002 = C66953Mfm.A00(this.A04, this.A06);
        RtcCallKey rtcCallKey = rtcCallConnectionEntity.A03;
        C62320sa r5 = r11;
        if (A002.A0A(rtcCallKey)) {
            AnonymousClass19S A003 = A00();
            1Eo.A05(19B.A00, new MH5(A002, A003, r5, (AnonymousClass4D7) null, 38), A003);
            A002.A05(rtcCallKey, str);
            oMn = (C70818OMn) this.A0C.getValue();
            pqM = C46165DOs.A00;
        } else {
            oMn = (C70818OMn) this.A0C.getValue();
            pqM = new C74180PqM(r11, 28);
        }
        oMn.A00(rtcCallConnectionEntity, str, pqM);
    }

    public final void A09(String str) {
        0qQ.A0B(str, 0);
        this.A07.A05(str, true, false);
    }

    public final void A0B(byte[] bArr, int i, int i2, boolean z) {
        Context context;
        UserSession userSession = this.A06;
        boolean z2 = z;
        int i3 = i2;
        int i4 = i;
        byte[] bArr2 = bArr;
        if (182.A06(0Tu.A05, userSession, 36317496131065021L)) {
            A04(this);
            context = this.A04;
            C71092OcE ocE = new C71092OcE(new OWY(context).A03(bArr2), (String) null);
            Integer A032 = ocE.A03();
            if (A032 == null || A032.intValue() != 4) {
                C72192OyC A012 = C66953Mfm.A01(userSession);
                if (A012 != null) {
                    Integer A033 = ocE.A03();
                    if (A033 != null && A033.intValue() == 5) {
                        A08(ocE);
                    }
                    C70989OVd oVd = A012.A09;
                    C71143Odx.A06(oVd.A0Z, new J6V(i4, 10, (Object) bArr2, (Object) new SignalingMessageIncomingStats((long) i3)), z2, false);
                    Integer num = ((N9J) oVd.A0K.A00.A00).A01;
                    if (!(num == AnonymousClass05K.A0N || num == AnonymousClass05K.A0Y)) {
                        return;
                    }
                }
                A05(this, ocE);
                return;
            }
            AnonymousClass0eM r1 = ocE.A02;
            String str = (String) r1.getValue();
            if (!(str == null || str.length() == 0)) {
                A02(userSession, this, ocE.A05(), (String) r1.getValue(), ocE.A04(), Base64.encodeToString(bArr2, 0));
                return;
            }
        } else {
            context = this.A04;
        }
        C71143Odx.A06(C66953Mfm.A00(context, userSession).A09.A0Z, new J6V(i4, 10, (Object) bArr2, (Object) new SignalingMessageIncomingStats((long) i3)), z2, false);
    }

    public final void CvV(Bundle bundle, UserSession userSession, String str) {
        0qQ.A0B(bundle, 2);
        String A002 = AnonymousClass000.A00(1020);
        Parcelable parcelable = bundle.getParcelable("com.instagram.rtc.stack.impl.enter_args");
        if (parcelable != null) {
            if (parcelable instanceof RtcCreateCallArgs) {
                RtcCreateCallArgs rtcCreateCallArgs = (RtcCreateCallArgs) parcelable;
                if (rtcCreateCallArgs.A09) {
                    C66953Mfm.A00(this.A04, userSession).A06(rtcCreateCallArgs);
                    return;
                }
            } else if (!(parcelable instanceof RtcJoinCallArgs)) {
                0KC.A0C(A002, "Unable to handle provided args");
                return;
            }
            A06((RtcEnterCallArgs) parcelable, C46023DJg.A00);
        }
    }

    public final void D96(Bundle bundle, UserSession userSession, String str) {
        0qQ.A0B(bundle, 2);
        A0A(C46024DJh.A00);
    }

    public final void Dcx(Bundle bundle, UserSession userSession, String str) {
        StringBuilder sb;
        0qQ.A0B(bundle, 2);
        Parcelable parcelable = bundle.getParcelable("com.instagram.rtc.stack.impl.enter_args");
        if (parcelable != null && (parcelable instanceof RtcJoinCallArgs)) {
            RtcCallKey rtcCallKey = ((RtcJoinCallArgs) parcelable).A02;
            String str2 = userSession.A06;
            String str3 = rtcCallKey.A00;
            RtcConnectionEntity A002 = I4H.A00(002.A0T(str2, str3, '_'));
            if (A002 instanceof RtcConnectionEntity.RtcCallConnectionEntity) {
                A07((RtcConnectionEntity.RtcCallConnectionEntity) A002, "ConnectionService: onReject", new C58685Ivu(userSession, 12));
                return;
            }
            ON9 on9 = new ON9(0wj.A01);
            if (A002 != null) {
                sb.append("Unexpected connectionEntity type: ");
                sb.append(A002.getTag());
            } else {
                sb = new StringBuilder();
                sb.append("Can't find connectionEntity given ");
                sb.append(str3);
            }
            sb.append(" when reject call from call stack");
            on9.A01(sb.toString());
        }
    }

    public final void DkT(Bundle bundle, UserSession userSession, String str) {
        0qQ.A0B(bundle, 2);
        CvV(bundle, userSession, str);
    }

    private final AnonymousClass19S A00() {
        return 19E.A02(AnonymousClass199.A02(((AnonymousClass12U) this.A05).A04, new AnonymousClass19G((C262204Co) null)));
    }

    private final void A01() {
        Iterator it = this.A0E.entrySet().iterator();
        while (it.hasNext()) {
            if (SystemClock.elapsedRealtime() - ((Number) ((Map.Entry) it.next()).getValue()).longValue() > 300000) {
                it.remove();
            }
        }
    }

    public static final void A03(RtcCallKey rtcCallKey, RtcCallSource rtcCallSource, AnonymousClass38Y r6) {
        String str;
        if (rtcCallKey != null && (str = rtcCallKey.A00) != null) {
            if (!182.A06(0Tu.A05, r6.A06, 36311637795275400L)) {
                r6.A0A.put(str, rtcCallSource.A02.A02);
            }
        }
    }

    public static final void A04(AnonymousClass38Y r7) {
        if (!r7.A03) {
            C72192OyC A002 = C66953Mfm.A00(r7.A04, r7.A06);
            if (!r7.A03) {
                14i r0 = 14i.A08;
                14i.A03(15Y.A03, new C71939OtP(r7));
                AnonymousClass19S A003 = r7.A00();
                AnonymousClass9K1 r2 = new AnonymousClass9K1((Object) A002, (Object) r7, (AnonymousClass4D7) null, 31);
                1Eo.A03(AnonymousClass05K.A00, 19B.A00, r2, A003);
            }
            AnonymousClass0r6 A004 = AnonymousClass11E.A00(C74203Pqj.A00, A002.A09.A0i);
            AnonymousClass19S A005 = r7.A00();
            AnonymousClass9K1 r02 = new AnonymousClass9K1((Object) A004, (Object) r7, (AnonymousClass4D7) null, 29);
            19B r4 = 19B.A00;
            Integer num = AnonymousClass05K.A00;
            1Eo.A03(num, r4, r02, A005);
            1Eo.A03(num, r4, new AnonymousClass9K1((Object) A002, (Object) r7, (AnonymousClass4D7) null, 30), r7.A00());
            r7.A03 = true;
        }
    }

    public final void A08(C71092OcE ocE) {
        String str;
        C72192OyC A012 = C66953Mfm.A01(this.A06);
        if (A012 != null) {
            RtcCallKey rtcCallKey = new RtcCallKey(ocE.A04());
            C70989OVd oVd = A012.A09;
            C71080Oaz oaz = oVd.A0K;
            N9J n9j = (N9J) oaz.A00.A00;
            if (0qQ.A0K(n9j.A00, rtcCallKey) && n9j.A01 == AnonymousClass05K.A01) {
                oaz.A03();
            } else if (n9j.A01 == AnonymousClass05K.A0C) {
                String str2 = rtcCallKey.A00;
                C69128Nf9 nf9 = oVd.A0T;
                if (0qQ.A0K(str2, nf9.A01.A01) && (str = nf9.A01.A01) != null) {
                    HashMap hashMap = nf9.A08;
                    String str3 = (String) hashMap.get(str);
                    if (str3 != null) {
                        nf9.A00.A00(new C62167KbP(str3));
                        hashMap.remove(str);
                    }
                }
            }
        }
    }

    public final void A0A(C62320sa r10) {
        Integer num;
        N9J n9j;
        UserSession userSession = this.A06;
        C72192OyC A012 = C66953Mfm.A01(userSession);
        C72192OyC A013 = C66953Mfm.A01(userSession);
        if (A013 == null || (n9j = (N9J) A013.A09.A0K.A00.A00) == null) {
            num = null;
        } else {
            num = n9j.A01;
        }
        int i = 0;
        if (num == AnonymousClass05K.A01) {
            i = 1;
        }
        int i2 = i ^ 1;
        A04(this);
        C62320sa r6 = r10;
        if (A012 != null) {
            AnonymousClass19S A002 = A00();
            1Eo.A05(19B.A00, new MH5(A012, A002, r6, (AnonymousClass4D7) null, 39), A002);
            A012.A01(i2, true);
            return;
        }
        r10.invoke();
    }

    public static final void A02(UserSession userSession, AnonymousClass38Y r7, String str, String str2, String str3, String str4) {
        r7.A01();
        HashMap hashMap = r7.A0E;
        if (!hashMap.containsKey(str)) {
            hashMap.put(String.valueOf(str), Long.valueOf(SystemClock.elapsedRealtime()));
            String str5 = str2;
            if (str2 != null && str2.length() != 0) {
                String str6 = str4;
                if (str4 != null) {
                    C2601144i.A00().A00(r7.A04, userSession, str5, str3, str6);
                }
            }
        }
    }

    public static final void A05(AnonymousClass38Y r5, C71092OcE ocE) {
        r5.A01();
        HashMap hashMap = r5.A0E;
        if (hashMap.containsKey(ocE.A05())) {
            ocE.A04();
            return;
        }
        Integer A032 = ocE.A03();
        if (A032 != null && A032.intValue() == 5 && 1pS.A01 != null) {
            Number number = (Number) ocE.A07.getValue();
            Object value = ocE.A06.getValue();
            if (number != null && value != null) {
                C2601144i.A00();
                UserSession userSession = r5.A06;
                Integer A002 = A0M.A00(number.intValue());
                String A042 = ocE.A04();
                0qQ.A0B(A002, 1);
                AnonymousClass1Nd.A00(userSession).A00(new C62163KbL(A042));
                hashMap.put(String.valueOf(ocE.A05()), Long.valueOf(SystemClock.elapsedRealtime()));
            }
        }
    }

    public final void onUserSessionWillEnd(boolean z) {
    }
}
