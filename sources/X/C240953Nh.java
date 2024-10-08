package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.model.reels.Reel;
import java.util.HashSet;

/* renamed from: X.3Nh  reason: invalid class name and case insensitive filesystem */
public final class C240953Nh implements C240963Ni {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ CircularImageView A01;
    public final /* synthetic */ AnonymousClass3BT A02;
    public final /* synthetic */ String A03;

    public C240953Nh(UserSession userSession, CircularImageView circularImageView, AnonymousClass3BT r3, String str) {
        this.A00 = userSession;
        this.A02 = r3;
        this.A01 = circularImageView;
        this.A03 = str;
    }

    public final void DEN() {
        String str;
        Reel reel = this.A02.A03;
        1Ns r0 = reel.A0W;
        if (r0 != null) {
            String id = r0.getId();
            0qQ.A07(id);
            UserSession userSession = this.A00;
            C2372336v A002 = C2372236u.A00(userSession);
            synchronized (A002) {
                1QP A003 = AnonymousClass1QO.A00(A002.A02);
                C2372436w A004 = C2372336v.A00(A003, A002);
                if (A004 != null && A004.A08.contains(id)) {
                    if (0qQ.A0K(A004.A06, id)) {
                        str = "SELF_POG_IMAGE_LOAD_FAIL";
                    } else {
                        str = "POG_IMAGE_LOAD_FAIL";
                    }
                    long j = A004.A05;
                    A003.flowMarkPoint(j, str);
                    A003.flowAnnotate(j, "FAIL_TYPE", str);
                    A003.flowAnnotate(j, "FAILURE_REASON", str);
                    if (!A004.A07.contains(C2372636y.NETWORK)) {
                        A003.flowAnnotate(j, "LOADED_POG_COUNT", A004.A00);
                        A003.flowEndFail(j, str, (String) null);
                        A002.A01 = null;
                    }
                }
            }
            ImageUrl imageUrl = this.A01.A0C;
            String str2 = null;
            if (imageUrl != null) {
                str2 = imageUrl.getUrl();
            }
            1Ns r02 = reel.A0W;
            if (r02 != null) {
                String name = r02.getName();
                String str3 = this.A03;
                0qQ.A0B(str3, 3);
                0qV A04 = C61970qY.A04();
                0wc A012 = AnonymousClass0kN.A01(LS4.A00, userSession);
                0Aj A005 = A012.A00(A012.A00, C273654mx.A00(377));
                A005.AAJ("error_type", "reel_avatar_fail_to_load");
                A005.AAJ(C273654mx.A00(834), 0qT.A00(A04.A00));
                A005.AAJ(C273654mx.A00(835), C61970qY.A06());
                A005.AAJ(C273654mx.A00(836), 0qU.A00(A04.A01));
                A005.AAJ(C273654mx.A00(922), str3);
                A005.AAJ("reel_image_uri", str2);
                A005.AAJ(C66579MXk.A00(1066), id);
                A005.AAJ("reel_owner_name", name);
                A005.Cgf();
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void DO4(C240983Nk r10) {
        C2372336v A002 = C2372236u.A00(this.A00);
        1Ns r0 = this.A02.A03.A0W;
        if (r0 != null) {
            String id = r0.getId();
            0qQ.A07(id);
            synchronized (A002) {
                UserSession userSession = A002.A02;
                1QP A003 = AnonymousClass1QO.A00(userSession);
                C2372436w A004 = C2372336v.A00(A003, A002);
                if (A004 != null) {
                    HashSet hashSet = A004.A08;
                    if (hashSet.remove(id)) {
                        int i = A004.A00 + 1;
                        A004.A00 = i;
                        if (i == 1) {
                            A003.flowMarkPoint(A004.A05, "FIRST_POG_IMAGE_LOAD");
                        }
                        if (0qQ.A0K(A004.A06, id) && A004.A07.remove(C2372636y.SELF_POG_LOAD)) {
                            A003.flowMarkPoint(A004.A05, "SELF_POG_IMAGE_LOAD_SUCCESS");
                        }
                        if (hashSet.isEmpty()) {
                            HashSet hashSet2 = A004.A07;
                            if (hashSet2.contains(C2372636y.NETWORK)) {
                                A004.A04 = 2;
                            } else {
                                hashSet2.remove(C2372636y.POG_LOAD);
                                long j = A004.A05;
                                A003.flowMarkPoint(j, "POG_IMAGE_LOAD_SUCCESS");
                                A003.flowAnnotate(j, "LOADED_POG_COUNT", A004.A00);
                                A003.flowEndSuccess(j);
                                A002.A01 = null;
                            }
                            0Tu r5 = 0Tu.A05;
                            if (182.A06(r5, userSession, 36327370260494721L)) {
                                AnonymousClass2l3 r4 = A002.A00;
                                if (r4 != null) {
                                    AnonymousClass1HB r2 = r4.A0H.A04.A02;
                                    r2.A01.A02("NETWORK_STORIES_TRAY_UI_RENDER_STRICT_END");
                                    r2.A00().A00(1Gx.A08);
                                    if (!182.A06(r5, r4.A0F, 36327370260625795L)) {
                                        r4.A0P = AnonymousClass05K.A1F;
                                    }
                                }
                                A002.A00 = null;
                            }
                        }
                    }
                }
            }
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
