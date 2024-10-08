package X;

import android.widget.RadioGroup;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.TraceInfo;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions;
import com.instagram.wellbeing.supervisionupsells.constants.IGSupervisionUpsellEligibilityStatus;
import java.util.HashMap;

/* renamed from: X.OlG  reason: case insensitive filesystem */
public final class C71472OlG implements RadioGroup.OnCheckedChangeListener {
    public final int A00;
    public final Object A01;

    public C71472OlG(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        C69186Ngk ngk;
        OBF obf;
        C333797aA r0;
        Integer num;
        long j;
        C69446Nlq nlq;
        Long A10;
        String str;
        int i2 = i;
        switch (this.A00) {
            case 0:
                ngk = (C69186Ngk) this.A01;
                if (i2 == 1) {
                    r0 = C333797aA.SUBSCRIBERS_ONLY;
                } else {
                    r0 = C333797aA.NOT_SET;
                }
                ngk.A01 = r0;
                break;
            case 1:
                ngk = (C69186Ngk) this.A01;
                if (i == 0) {
                    num = AnonymousClass05K.A00;
                } else if (i2 != 1) {
                    num = AnonymousClass05K.A0u;
                } else {
                    num = AnonymousClass05K.A01;
                }
                if (num == AnonymousClass05K.A0u) {
                    num = AnonymousClass05K.A00;
                }
                ngk.A02 = num;
                break;
            case 2:
                O7K o7k = ((C69182NgV) this.A01).A00;
                if (o7k != null) {
                    C327857Cl r3 = (C327857Cl) C69182NgV.A02.get(i2);
                    0qQ.A0B(r3, 0);
                    C72349P2o p2o = o7k.A00;
                    C254793t3 r5 = p2o.A03.A06;
                    if (r5 != null) {
                        C68314NAb A012 = C71031OZi.A01(p2o.A02);
                        long A07 = C66580MXl.A07(r5);
                        int i3 = r3.A00;
                        AnonymousClass68L A0F = C66580MXl.A0F(A012, 0);
                        MailboxFutureImpl A0G = C66580MXl.A0G(A0F);
                        int A002 = C3030067a.A00(A0G);
                        TraceInfo A013 = C3030067a.A01(A0G, "MailboxTam", "runTamClientThreadUpdateGroupMemberAddMode");
                        if (!A0F.EJd(new C71676Oov(A002, i3, 2, A07, A012, A0G))) {
                            A0G.cancel(false);
                            C3030067a.A02(A002);
                            C3030067a.A03(A013, "MailboxTam", "runTamClientThreadUpdateGroupMemberAddMode");
                        }
                        PlatformLogger.platformEventLog(5);
                        0Aj A0e = AnonymousClass7TE.A0e(p2o.A01, "direct_thread_change_membership_controls");
                        if (A0e.isSampled()) {
                            String A072 = C300965yF.A07(r5);
                            if (A072 == null || (A10 = AnonymousClass7TE.A10(A072)) == null) {
                                j = 0;
                            } else {
                                j = A10.longValue();
                            }
                            A0e.A9F(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, Long.valueOf(j));
                            int ordinal = r3.ordinal();
                            if (ordinal == 0 || ordinal == 2) {
                                nlq = C69446Nlq.ADMIN_ONLY;
                            } else if (ordinal == 1) {
                                nlq = C69446Nlq.ALL_MEMBERS;
                            } else {
                                throw AnonymousClass7TE.A1K();
                            }
                            A0e.A8M(nlq, "new_setting");
                            A0e.Cgf();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                PQ2 pq2 = (PQ2) this.A01;
                DirectMessageInteropReachabilityOptions[] directMessageInteropReachabilityOptionsArr = pq2.A0E;
                if (directMessageInteropReachabilityOptionsArr != null) {
                    DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions = directMessageInteropReachabilityOptionsArr[i];
                    C69185Ngf ngf = pq2.A02;
                    if (ngf != null) {
                        String str2 = pq2.A0A;
                        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions2 = pq2.A00;
                        if (directMessageInteropReachabilityOptions2 == null || (str = directMessageInteropReachabilityOptions2.A03) == null) {
                            str = "";
                        }
                        String str3 = directMessageInteropReachabilityOptions.A03;
                        C20613Wvu wvu = new C20613Wvu(3, pq2, directMessageInteropReachabilityOptions);
                        C46573DhF dhF = new C46573DhF(pq2, 26);
                        0qQ.A0B(str2, 1);
                        0qQ.A0B(str3, 3);
                        C49794F7e.A01(ngf, AnonymousClass7TE.A0l(ngf.A04), str2, str, str3, new C46573DhF(dhF, 27), new C46573DhF(wvu, 28));
                    }
                    C69185Ngf ngf2 = pq2.A02;
                    if (ngf2 != null) {
                        AnonymousClass0eM r4 = ngf2.A04;
                        if (182.A06(0Tu.A06, DbT.A0X(r4), 36318436728707197L)) {
                            HashMap A0F2 = DbX.A0h(r4).A0F();
                            A0F2.put(AnonymousClass000.A00(4407), new IGSupervisionUpsellEligibilityStatus(true));
                            DbX.A0h(r4).A17(A0F2);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
        if (!G9t.A1b(ngk.A03) && (obf = ngk.A00) != null) {
            C333797aA r2 = ngk.A01;
            Integer num2 = ngk.A02;
            AnonymousClass7TG.A1N(r2, num2);
            obf.A01.A0S(r2, num2);
            obf.A00.onBackPressed();
        }
    }
}
