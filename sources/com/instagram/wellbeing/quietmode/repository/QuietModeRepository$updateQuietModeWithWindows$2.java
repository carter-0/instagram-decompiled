package com.instagram.wellbeing.quietmode.repository;

import X.0eS;
import X.0qQ;
import X.0sP;
import X.0xY;
import X.1Hj;
import X.1NY;
import X.1XP;
import X.1XY;
import X.2B0;
import X.AnonymousClass000;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C239793Ih;
import X.C297815sO;
import X.C41845B3m;
import X.C60340gF;
import X.DbS;
import X.DbT;
import X.DbU;
import X.DbV;
import X.F3K;
import X.G7S;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.json.JSONArray;
import org.json.JSONObject;

@DebugMetadata(c = "com.instagram.wellbeing.quietmode.repository.QuietModeRepository$updateQuietModeWithWindows$2", f = "QuietModeRepository.kt", i = {}, l = {48}, m = "invokeSuspend", n = {}, s = {})
public final class QuietModeRepository$updateQuietModeWithWindows$2 extends AnonymousClass1Ek implements 0sP {
    public int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ User A03;
    public final /* synthetic */ G7S A04;
    public final /* synthetic */ F3K A05;
    public final /* synthetic */ Long A06;
    public final /* synthetic */ Long A07;
    public final /* synthetic */ List A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public QuietModeRepository$updateQuietModeWithWindows$2(User user, G7S g7s, F3K f3k, Long l, Long l2, List list, AnonymousClass4D7 r8, long j, long j2, boolean z, boolean z2) {
        super(1, r8);
        this.A05 = f3k;
        this.A0A = z;
        this.A02 = j;
        this.A01 = j2;
        this.A09 = z2;
        this.A07 = l;
        this.A06 = l2;
        this.A08 = list;
        this.A03 = user;
        this.A04 = g7s;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.wellbeing.quietmode.repository.QuietModeRepository$updateQuietModeWithWindows$2, X.4D7] */
    public final AnonymousClass4D7 create(AnonymousClass4D7 r15) {
        F3K f3k = this.A05;
        boolean z = this.A0A;
        long j = this.A02;
        long j2 = this.A01;
        boolean z2 = this.A09;
        return new QuietModeRepository$updateQuietModeWithWindows$2(this.A03, this.A04, f3k, this.A07, this.A06, this.A08, r15, j, j2, z, z2);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((QuietModeRepository$updateQuietModeWithWindows$2) create((AnonymousClass4D7) obj)).invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r15v0, types: [com.instagram.wellbeing.quietmode.repository.QuietModeRepository$updateQuietModeWithWindows$2, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        JSONArray jSONArray;
        JSONObject jSONObject;
        C60340gF r0;
        Object obj2 = obj;
        1Hj r2 = 1Hj.A02;
        if (this.A00 != 0) {
            0eS.A00(obj2);
        } else {
            0eS.A00(obj2);
            UserSession userSession = this.A05.A01;
            boolean z = this.A0A;
            long j = this.A02;
            long j2 = this.A01;
            boolean z2 = this.A09;
            Long l = this.A07;
            Long l2 = this.A06;
            List list = this.A08;
            this.A00 = 1;
            0xY A0c = DbV.A0c(userSession, 2B0.A01);
            A0c.E5T("HAS_EVER_ENABLED_QUIET_MODE", true);
            A0c.apply();
            if (list != null) {
                JSONArray jSONArray2 = new JSONArray();
                jSONObject = DbS.A11();
                jSONObject.put(TraceFieldType.StartTime, j);
                jSONObject.put("end_time", j2);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    DbT.A1W(it, jSONArray2);
                }
                jSONObject.put("days", jSONArray2);
            } else {
                jSONArray = new JSONArray();
                jSONObject = DbS.A11();
                jSONObject.put(TraceFieldType.StartTime, j);
                jSONObject.put("end_time", j2);
            }
            jSONArray.put(jSONObject);
            String A10 = DbT.A10(jSONArray);
            1NY A0a = AnonymousClass7TG.A0a(userSession);
            A0a.A0A("mental_well_being/update_quiet_time_window/");
            A0a.A0H(AnonymousClass000.A00(1736), z);
            A0a.A9m("quiet_time_windows", A10);
            String id = TimeZone.getDefault().getID();
            0qQ.A07(id);
            A0a.A9m(AnonymousClass000.A00(687), id);
            if (!(l == null || l2 == null)) {
                long longValue = l.longValue();
                long longValue2 = l2.longValue();
                JSONObject A11 = DbS.A11();
                A11.put(AnonymousClass000.A00(4037), longValue);
                A11.put(AnonymousClass000.A00(3061), longValue2);
                A0a.A9m("pause_window", DbT.A10(A11));
                A0a.A0H("cancel_pause_window", z2);
            }
            obj2 = DbU.A0S(A0a, 1XP.class, 1XY.class).A00(1440554863, this);
            if (obj2 == r2) {
                return r2;
            }
        }
        Object obj3 = obj2;
        User user = this.A03;
        boolean z3 = this.A0A;
        G7S g7s = this.A04;
        long j3 = this.A02;
        long j4 = this.A01;
        Long l3 = this.A07;
        Long l4 = this.A06;
        C60340gF r1 = null;
        if (obj2 instanceof C239793Ih) {
            user.A1D(z3);
            if (g7s != null) {
                g7s.Dov(l3, l4, j3, j4, z3);
                r0 = C60340gF.A00;
            } else {
                r0 = null;
            }
            obj3 = C41845B3m.A0d(r0);
        } else if (!(obj2 instanceof C297815sO)) {
            throw AnonymousClass7TE.A1K();
        }
        if (obj3 instanceof C239793Ih) {
            return obj3;
        }
        if (obj3 instanceof C297815sO) {
            if (g7s != null) {
                g7s.DCw(l3, l4, j3, j4, !z3);
                r1 = C60340gF.A00;
            }
            return new C297815sO(r1);
        }
        throw AnonymousClass7TE.A1K();
    }
}
