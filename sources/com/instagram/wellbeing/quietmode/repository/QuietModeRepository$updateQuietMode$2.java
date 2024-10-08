package com.instagram.wellbeing.quietmode.repository;

import X.0Tu;
import X.0eS;
import X.0qQ;
import X.0sP;
import X.0xY;
import X.182;
import X.1Hj;
import X.1NY;
import X.2B0;
import X.AnonymousClass000;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C239793Ih;
import X.C297815sO;
import X.C41845B3m;
import X.C51887G6c;
import X.C60340gF;
import X.DbS;
import X.DbT;
import X.DbV;
import X.DbX;
import X.F3K;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.TimeZone;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.json.JSONArray;
import org.json.JSONObject;

@DebugMetadata(c = "com.instagram.wellbeing.quietmode.repository.QuietModeRepository$updateQuietMode$2", f = "QuietModeRepository.kt", i = {}, l = {26}, m = "invokeSuspend", n = {}, s = {})
public final class QuietModeRepository$updateQuietMode$2 extends AnonymousClass1Ek implements 0sP {
    public int A00;
    public final /* synthetic */ User A01;
    public final /* synthetic */ C51887G6c A02;
    public final /* synthetic */ F3K A03;
    public final /* synthetic */ boolean A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public QuietModeRepository$updateQuietMode$2(User user, C51887G6c g6c, F3K f3k, AnonymousClass4D7 r5, boolean z) {
        super(1, r5);
        this.A03 = f3k;
        this.A04 = z;
        this.A01 = user;
        this.A02 = g6c;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.wellbeing.quietmode.repository.QuietModeRepository$updateQuietMode$2, X.4D7] */
    public final AnonymousClass4D7 create(AnonymousClass4D7 r7) {
        return new QuietModeRepository$updateQuietMode$2(this.A01, this.A02, this.A03, r7, this.A04);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((QuietModeRepository$updateQuietMode$2) create((AnonymousClass4D7) obj)).invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [com.instagram.wellbeing.quietmode.repository.QuietModeRepository$updateQuietMode$2, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        C60340gF r0;
        1Hj r3 = 1Hj.A02;
        if (this.A00 != 0) {
            0eS.A00(obj);
        } else {
            0eS.A00(obj);
            UserSession userSession = this.A03.A01;
            boolean z = this.A04;
            this.A00 = 1;
            0xY A0c = DbV.A0c(userSession, 2B0.A01);
            A0c.E5T("HAS_EVER_ENABLED_QUIET_MODE", true);
            A0c.apply();
            1NY A0a = AnonymousClass7TG.A0a(userSession);
            A0a.A0A("mental_well_being/update_quiet_time_window/");
            A0a.A0H(AnonymousClass000.A00(1736), z);
            0Tu r2 = 0Tu.A05;
            long A012 = 182.A01(r2, userSession, 36597476459023176L);
            long A013 = 182.A01(r2, userSession, 36597476458892103L);
            JSONArray jSONArray = new JSONArray();
            JSONObject A11 = DbS.A11();
            A11.put(TraceFieldType.StartTime, A012);
            A11.put("end_time", A013);
            jSONArray.put(A11);
            A0a.A9m("quiet_time_windows", DbT.A10(jSONArray));
            String id = TimeZone.getDefault().getID();
            0qQ.A07(id);
            DbX.A1M(A0a, AnonymousClass000.A00(687), id);
            obj = A0a.A0M().A00(1440554863, this);
            if (obj == r3) {
                return r3;
            }
        }
        User user = this.A01;
        boolean z2 = this.A04;
        C51887G6c g6c = this.A02;
        C60340gF r1 = null;
        if (obj instanceof C239793Ih) {
            user.A1D(z2);
            if (g6c != null) {
                g6c.Dol(z2);
                r0 = C60340gF.A00;
            } else {
                r0 = null;
            }
            obj = C41845B3m.A0d(r0);
        } else if (!(obj instanceof C297815sO)) {
            throw AnonymousClass7TE.A1K();
        }
        if (obj instanceof C239793Ih) {
            return obj;
        }
        if (obj instanceof C297815sO) {
            if (g6c != null) {
                r1 = C60340gF.A00;
            }
            return new C297815sO(r1);
        }
        throw AnonymousClass7TE.A1K();
    }
}
