package X;

import android.content.Context;
import android.content.res.Resources;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.ClipInfo;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Lj3  reason: case insensitive filesystem */
public final class C64841Lj3 implements 1NU {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C64841Lj3(C65293Lqm lqm, List list, int i) {
        this.A00 = i;
        this.A02 = lqm;
        this.A01 = list;
    }

    public final /* bridge */ /* synthetic */ Object then(Object obj) {
        Object obj2;
        String str;
        C65293Lqm lqm;
        Context context;
        Resources resources;
        int i;
        Object[] objArr;
        String str2;
        1GK r15 = (1GK) obj;
        if (this.A00 != 0) {
            0qQ.A0B(r15, 0);
            obj2 = null;
            if (r15.A0D()) {
                lqm = (C65293Lqm) this.A02;
            } else {
                L4R l4r = (L4R) r15.A07();
                if (l4r != null) {
                    lqm = (C65293Lqm) this.A02;
                    List list = (List) this.A01;
                    ClipInfo clipInfo = l4r.A00;
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    if (((long) JTO.A09(clipInfo)) > timeUnit.toMillis(60)) {
                        UserSession userSession = lqm.A01;
                        0Tu r2 = 0Tu.A05;
                        if (182.A06(r2, userSession, 36323895631949397L)) {
                            if (((long) JTO.A09(clipInfo)) > timeUnit.toMillis(90)) {
                                context = lqm.A00;
                                resources = context.getResources();
                                i = 2131960343;
                                objArr = new Object[1];
                                str2 = "90";
                            }
                        } else if (182.A06(r2, userSession, 36323895632014934L)) {
                            context = lqm.A00;
                            resources = context.getResources();
                            i = 2131960343;
                            objArr = new Object[1];
                            str2 = "60";
                        }
                        objArr[0] = str2;
                        C59689JTv.A03(context, resources.getString(i, objArr), "direct_share_video_too_long", 0);
                        return null;
                    }
                    list.add(new KR1(clipInfo, (AnonymousClass3Q2) null, l4r.A01));
                    return null;
                }
            }
            C65293Lqm.A00(lqm);
        } else {
            0qQ.A0B(r15, 0);
            obj2 = null;
            if (r15.A0D()) {
                Context context2 = ((C65293Lqm) this.A02).A00;
                C59689JTv.A03(context2, context2.getResources().getString(2131960324), C66579MXk.A00(301), 0);
                return null;
            }
            C352218Cl r4 = (C352218Cl) r15.A07();
            if (r4 != null) {
                List list2 = (List) this.A01;
                C62948Kp0 A002 = C59737JVv.A00((Context) null, ((C65293Lqm) this.A02).A01, r4.A06(), true);
                MediaUploadMetadata A012 = r4.A01();
                if (A002 != null) {
                    str = A002.A02();
                } else {
                    str = null;
                }
                A012.A05 = str;
                MediaUploadMetadata A013 = r4.A01();
                String A06 = r4.A06();
                0qQ.A0B(A06, 0);
                A013.A0A = C364678lo.A05(A06);
                list2.add(new KR0((AnonymousClass3Q2) null, r4));
                return null;
            }
        }
        return obj2;
    }
}
