package X;

import android.app.Activity;
import android.app.Application;
import androidx.fragment.app.Fragment;
import com.instagram.clips.drafts.model.ClipsDraftPreviewItemRepository;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "instagram.features.clips.launcher.ClipsDraftEditLauncher$launch$1", f = "ClipsDraftEditLauncher.kt", i = {}, l = {185}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.Ilv  reason: case insensitive filesystem */
public final class C58088Ilv extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final /* synthetic */ Activity A01;
    public final /* synthetic */ Fragment A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ PendingRecipient A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58088Ilv(Activity activity, Fragment fragment, UserSession userSession, PendingRecipient pendingRecipient, String str, String str2, AnonymousClass4D7 r8, boolean z, boolean z2) {
        super(2, r8);
        this.A01 = activity;
        this.A03 = userSession;
        this.A05 = str;
        this.A02 = fragment;
        this.A04 = pendingRecipient;
        this.A08 = z;
        this.A07 = z2;
        this.A06 = str2;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.Ilv, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r12) {
        Activity activity = this.A01;
        UserSession userSession = this.A03;
        String str = this.A05;
        return new C58088Ilv(activity, this.A02, userSession, this.A04, str, this.A06, r12, this.A08, this.A07);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.Ilv, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        Object obj2 = obj;
        Object obj3 = 1Hj.A02;
        int i = this.A00;
        String A002 = AnonymousClass000.A00(2166);
        if (i != 0) {
            0eS.A00(obj2);
        } else {
            0eS.A00(obj2);
            try {
                2MU r5 = ClipsDraftPreviewItemRepository.A09;
                Application application = this.A01.getApplication();
                0qQ.A07(application);
                ClipsDraftPreviewItemRepository A003 = r5.A00(application, this.A03);
                String str = this.A05;
                this.A00 = 1;
                obj2 = A003.A01.A09(str, this);
                if (obj2 == obj3) {
                    return obj3;
                }
            } catch (HP3 e) {
                0wb.A07(A002, e);
                AnonymousClass8A1.A01(this.A03);
                throw AnonymousClass7TE.A11("getMessage");
            } catch (Exception e2) {
                0wb.A07(A002, e2);
                AnonymousClass8A2 A012 = AnonymousClass8A1.A01(this.A03);
                String A16 = C51968G9o.A16(e2);
                0qQ.A07(A16);
                A012.A0N(A16, e2.getMessage());
                throw e2;
            }
        }
        C369968vc r13 = (C369968vc) obj2;
        if (r13 == null) {
            AnonymousClass8A1.A01(this.A03).A0N(A002, AnonymousClass000.A00(1293));
            return C60340gF.A00;
        }
        AnonymousClass9P8 r3 = r13.A03;
        if (r3 != null) {
            UserSession userSession = this.A03;
            Activity activity = this.A01;
            Fragment fragment = this.A02;
            PendingRecipient pendingRecipient = this.A04;
            boolean z = this.A08;
            boolean z2 = this.A07;
            C56002Hr8 hr8 = new C56002Hr8(activity, fragment, userSession, pendingRecipient, new AnonymousClass6ST(activity, true), this.A06, z, AnonymousClass7TF.A1P(z2 ? 1 : 0));
            0qQ.A0B(userSession, 0);
            C55756Hmr hmr = new C55756Hmr(userSession, hr8);
            UserSession userSession2 = hmr.A00;
            1E8 A004 = 1E7.A00(userSession2);
            String str2 = r3.A09;
            if (A004.A02(str2) == null) {
                C54241H4k h4k = new C54241H4k(r13, hmr);
                1OC A042 = C3724090s.A04(userSession2, str2);
                A042.A00 = h4k;
                hmr.A01.schedule(A042);
            } else {
                hmr.A02.A00(r13);
            }
        } else {
            UserSession userSession3 = this.A03;
            Activity activity2 = this.A01;
            Fragment fragment2 = this.A02;
            PendingRecipient pendingRecipient2 = this.A04;
            boolean z3 = this.A08;
            boolean z4 = this.A07;
            String str3 = this.A06;
            int ordinal = r13.A04.ordinal();
            if (ordinal == 0 || ordinal == 1) {
                11Z.A03(new C41262Aqy(activity2, fragment2, r13, userSession3, pendingRecipient2, str3, z4, z3));
            }
        }
        return C60340gF.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C58088Ilv) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
