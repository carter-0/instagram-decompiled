package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.odin.model.Example;
import com.facebook.odin.model.ExampleContext;
import com.facebook.odin.model.FeatureData;
import com.facebook.odin.model.Type;
import com.google.gson.Gson;
import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.3hZ  reason: invalid class name and case insensitive filesystem */
public final class C248193hZ extends 0vM {
    public final /* synthetic */ 2Lk A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C248193hZ(2Lk r7) {
        super("under_age_upload_app_job", 498115063, 5, true, false);
        this.A00 = r7;
    }

    public final void loggedRun() {
        0sm r10;
        2Lk r1 = this.A00;
        CallerContext callerContext = 2Lk.A08;
        Context context = r1.A01;
        UserSession userSession = r1.A04;
        0qQ.A0B(context, 0);
        0qQ.A0B(userSession, 1);
        AnonymousClass95A r5 = (AnonymousClass95A) userSession.A01(AnonymousClass95A.class, new C13349TVw(21, context, userSession));
        0Tu r2 = 0Tu.A05;
        if (1AW.A06(r2, 18316721257464738L)) {
            C258993zy r4 = r5.A01;
            r4.A00();
            try {
                Context context2 = r5.A00;
                0qQ.A0B(context2, 1);
                1AW.A01(r2, 18598196234230115L);
                Gson gson = new Gson();
                String A002 = Pxd.A00(908);
                C10244Rp4 rp4 = new C10244Rp4(AnonymousClass5KI.A00(context2, (AnonymousClass5KJ) null, A002, new C377589Mk(A002, 5)));
                AnonymousClass0Gt r0 = AnonymousClass0Gt.A00;
                0qQ.A07(r0);
                C10422Rry rry = new C10422Rry(new AnonymousClass953(1vm.A01(r5.A02)), new C10564RuI(r0, rp4, gson));
                C74179PqL pqL = new C74179PqL(r5, 24);
                C74179PqL pqL2 = new C74179PqL(r5, 25);
                C10564RuI ruI = rry.A01;
                C239283Fv r9 = ruI.A01.A00;
                MFe mFe = new MFe((Object) r9, "", "underage", (AnonymousClass4D7) null, 0);
                19B r22 = 19B.A00;
                String str = (String) C67351tA.A00(r22, mFe);
                if (str.length() == 0) {
                    r10 = 0Yt.A0E();
                } else {
                    Object A09 = ruI.A02.A09(str, new R2P().type);
                    0qQ.A07(A09);
                    r10 = (HashMap) A09;
                }
                if (r10.isEmpty()) {
                    pqL.invoke("no data to upload");
                    return;
                }
                C255463uA[] r52 = Example.A04;
                Example example = new Example(ExampleContext.A05, "u13_example", new HashMap());
                for (Map.Entry entry : r10.entrySet()) {
                    String str2 = (String) entry.getKey();
                    example.A02.put(str2, new FeatureData(Type.LONG, str2, (String) null, (List) null, 0.0d, 16376, (long) ((Number) entry.getValue()).intValue()));
                }
                AnonymousClass953 r6 = rry.A00;
                Integer num = AnonymousClass05K.A01;
                List singletonList = Collections.singletonList(example);
                0qQ.A07(singletonList);
                long longValue = ((Number) C67351tA.A00(r22, new MEV(r9, Pxd.A00(909), (AnonymousClass4D7) null, 0, 0))).longValue();
                C13349TVw tVw = new C13349TVw(20, pqL, rry);
                C74179PqL pqL3 = new C74179PqL(pqL2, 23);
                0qQ.A0B(num, 2);
                0qQ.A07(r6.A00(num, "AGE_SIGMA", "0.0.1", singletonList, tVw, pqL3, longValue).get());
            } catch (Exception e) {
                String message = e.getMessage();
                if (message == null) {
                    message = "exception";
                }
                r4.A01.markerAnnotate(310644286, "end_reason", message);
                r4.A04(false, (String) null);
            }
        }
    }
}
