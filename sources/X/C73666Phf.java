package X;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.upcomingevents.common.model.UpcomingEventReminderAction;
import com.instagram.user.model.UpcomingEvent;
import go.Seq;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Phf  reason: case insensitive filesystem */
public final class C73666Phf extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73666Phf(int i, Object obj, Object obj2) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        C67732Mtl mtl;
        UpcomingEventReminderAction upcomingEventReminderAction;
        Object value;
        N4F n4f;
        boolean z;
        Object invoke;
        AnonymousClass07P r1;
        Object invoke2;
        AnonymousClass07P r12;
        2YM defaultViewModelProviderFactory;
        Object invoke3;
        switch (this.A00) {
            case 0:
            case 4:
            case 7:
                AnonymousClass07g A0c = C51969G9p.A0c(this.A01);
                if (!(A0c instanceof AnonymousClass07P) || (r12 = (AnonymousClass07P) A0c) == null || (defaultViewModelProviderFactory = r12.getDefaultViewModelProviderFactory()) == null) {
                    return ((Fragment) this.A02).getDefaultViewModelProviderFactory();
                }
                return defaultViewModelProviderFactory;
            case 3:
            case 6:
            case 25:
            case 27:
            case 28:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
            case 31:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case Seq.NULL_REFNUM:
            case Seq.RefTracker.REF_OFFSET:
            case 43:
            case 45:
            case 46:
            case 47:
                C62320sa r0 = (C62320sa) this.A01;
                if (r0 != null && (invoke2 = r0.invoke()) != null) {
                    return invoke2;
                }
                AnonymousClass07g A0c2 = C51969G9p.A0c(this.A02);
                if (!(A0c2 instanceof AnonymousClass07P) || (r1 = (AnonymousClass07P) A0c2) == null) {
                    return AnonymousClass2YP.A00;
                }
                return r1.getDefaultViewModelCreationExtras();
            case 10:
                C61416K6n k6n = (C61416K6n) this.A02;
                ClipInfo clipInfo = k6n.A00().A02().A02.A1N;
                AnonymousClass3Q2 r6 = k6n.A00().A02().A02;
                AnonymousClass0eM r3 = k6n.A0C;
                int i = clipInfo.A07;
                int i2 = clipInfo.A05;
                LA8 A002 = LKM.A00(clipInfo);
                UserSession A0l = AnonymousClass7TE.A0l(r3);
                0qQ.A0B(A0l, 5);
                return new C64326La1(A0l, new C65828M0u((Context) this.A01, AnonymousClass7TE.A0l(r3), r6, ((float) clipInfo.A09) / ((float) clipInfo.A06)), A002, ((float) clipInfo.A09) / ((float) clipInfo.A06), i, i2);
            case 22:
                PRU pru = ((OHX) this.A02).A01;
                boolean z2 = !((N4F) this.A01).A05;
                PI2 pi2 = pru.A01;
                UpcomingEvent upcomingEvent = pi2.A08;
                if (upcomingEvent != null) {
                    if (z2) {
                        mtl = pi2.A06;
                        upcomingEventReminderAction = UpcomingEventReminderAction.SET_REMINDER;
                    } else {
                        UserSession userSession = pi2.A02;
                        boolean A06 = 182.A06(AnonymousClass7TF.A0H(userSession), userSession, 36324282179071933L);
                        mtl = pi2.A06;
                        if (A06) {
                            05G r5 = mtl.A04;
                            do {
                                value = r5.getValue();
                                n4f = (N4F) value;
                            } while (!r5.AIY(value, N4F.A01(n4f, n4f.A02, 00k.A0T(PIA.A00, n4f.A04), n4f.A05)));
                            break;
                        } else {
                            upcomingEventReminderAction = UpcomingEventReminderAction.UNSET_REMINDER;
                        }
                    }
                    L8U l8u = new L8U(mtl.A00, upcomingEventReminderAction, upcomingEvent, "iab_reminder_ads_footer");
                    int ordinal = upcomingEventReminderAction.ordinal();
                    if (ordinal == 0) {
                        z = true;
                    } else if (ordinal == 1) {
                        z = false;
                    } else {
                        throw AnonymousClass7TE.A1K();
                    }
                    AnonymousClass7TE.A1Z(new C20590WvT(mtl, l8u, upcomingEvent, (AnonymousClass4D7) null, z), C318116oQ.A00(mtl));
                    break;
                }
                break;
            case 23:
                FragmentActivity fragmentActivity = (FragmentActivity) this.A01;
                if (!(fragmentActivity instanceof C249463jp)) {
                    fragmentActivity = null;
                }
                OHX ohx = (OHX) this.A02;
                View view = ohx.A02.A01;
                return new C310326ao(AnonymousClass7TE.A0S(view), (C249463jp) fragmentActivity).A00((1Xj) null, C69206Nh6.A00, ohx.A04, Integer.valueOf(view.getHeight()));
            case 24:
                0lg A0X = DbT.A0X(((C340017kY) this.A02).A08);
                0qQ.A0B(A0X, 0);
                Object obj = this.A01;
                0qQ.A0B(obj, 0);
                List list = ((C10494Rt9) A0X.A01(C10494Rt9.class, new C41562AwU(A0X, 48))).A01;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (it.next().getClass() == obj.getClass()) {
                                break;
                            }
                        }
                    }
                }
                list.add(obj);
                break;
            case 30:
                ((0sP) this.A02).invoke(this.A01);
                break;
            case 32:
                return new 2IN((Context) this.A01, (UserSession) this.A02);
            case 33:
                0fR.A02((JobParameters) this.A01, (JobService) this.A02, false);
                break;
            case 34:
                C62320sa r02 = (C62320sa) this.A01;
                if (r02 == null || (invoke = r02.invoke()) == null) {
                    return ((ComponentActivity) this.A02).getDefaultViewModelCreationExtras();
                }
                return invoke;
            default:
                C62320sa r03 = (C62320sa) this.A01;
                if (r03 == null || (invoke3 = r03.invoke()) == null) {
                    return JTU.A08(this.A02);
                }
                return invoke3;
        }
        return C60340gF.A00;
    }
}
