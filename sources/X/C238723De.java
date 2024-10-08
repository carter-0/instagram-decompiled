package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.proxygen.TraceFieldType;
import com.google.gson.Gson;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.3De  reason: invalid class name and case insensitive filesystem */
public final class C238723De implements 1wn {
    public final /* synthetic */ FragmentActivity A00;

    public C238723De(FragmentActivity fragmentActivity) {
        this.A00 = fragmentActivity;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        C49879FBd fBd;
        int A03 = AnonymousClass0fD.A03(-1614560249);
        AnonymousClass3EI r12 = (AnonymousClass3EI) obj;
        int A032 = AnonymousClass0fD.A03(606903344);
        FragmentActivity fragmentActivity = this.A00;
        AtomicBoolean atomicBoolean = C238713Dd.A00;
        String A002 = C66579MXk.A00(935);
        0tX A01 = 0xn.A01(A002);
        if (A01.contains(A002)) {
            try {
                Object A08 = new Gson().A08(A01.getString(A002, ""), C49879FBd.class);
                fBd = r12.A01;
                if (!fBd.equals(A08)) {
                }
            } catch (AnonymousClass1Aw unused) {
                0wb.A03(AnonymousClass000.A00(949), "Exception trying to deserialize FeedbackRequiredSerializable JSON");
            }
            try {
                0xY AR4 = A01.AR4();
                AR4.E5g(A002, new Gson().A0B(fBd));
                AR4.apply();
            } catch (AnonymousClass1Ax e) {
                0wb.A06(AnonymousClass000.A00(949), "Exception trying to serialize FeedbackRequiredSerializable to JSON", e);
            }
            AnonymousClass0fD.A0A(-1180767477, A032);
            AnonymousClass0fD.A0A(2050816168, A03);
        }
        fBd = r12.A01;
        if (!fBd.A0C || !fBd.A0B) {
            if (r12.A07) {
                0lg r1 = r12.A00;
                0hq supportFragmentManager = fragmentActivity.getSupportFragmentManager();
                if (supportFragmentManager != null && !supportFragmentManager.A12()) {
                    FZ1 A003 = F5E.A00(r1);
                    synchronized (A003) {
                        if (!A003.A02) {
                            A003.A02 = true;
                            HashMap hashMap = new HashMap();
                            hashMap.put(AnonymousClass000.A00(4799), "true");
                            C47552E7p e7p = new C47552E7p(fragmentActivity, A003);
                            C360678ey A04 = C359988do.A04(A003.A06, "com.instagram.challenge.navigation.take_challenge", hashMap);
                            A04.A00(e7p);
                            1ES.A03(A04);
                        }
                    }
                }
            } else {
                C238713Dd.A01(C238713Dd.A00(r12), fragmentActivity.getSupportFragmentManager());
            }
            0xY AR42 = A01.AR4();
            AR42.E5g(A002, new Gson().A0B(fBd));
            AR42.apply();
            AnonymousClass0fD.A0A(-1180767477, A032);
            AnonymousClass0fD.A0A(2050816168, A03);
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put(AnonymousClass000.A00(3894), r12.A04);
        hashMap2.put("restriction_type", r12.A06);
        hashMap2.put(AnonymousClass000.A00(3064), fBd.A02);
        hashMap2.put(AnonymousClass000.A00(3077), fBd.A04);
        hashMap2.put(AnonymousClass000.A00(2999), fBd.A01);
        hashMap2.put(AnonymousClass000.A00(3892), r12.A03);
        hashMap2.put("category", r12.A02);
        hashMap2.put(TraceFieldType.ErrorCode, fBd.A03);
        hashMap2.put(AnonymousClass000.A00(3895), r12.A05);
        hashMap2.put(AnonymousClass000.A00(3835), fBd.A09);
        C360678ey A042 = C359988do.A04(r12.A00, "com.instagram.sentry_block_dialogue_unification.screens.sentry_block_dialogue_unification", hashMap2);
        A042.A00(new C47553E7q(fragmentActivity, r12));
        1ES.A03(A042);
        0xY AR422 = A01.AR4();
        AR422.E5g(A002, new Gson().A0B(fBd));
        AR422.apply();
        AnonymousClass0fD.A0A(-1180767477, A032);
        AnonymousClass0fD.A0A(2050816168, A03);
    }
}
