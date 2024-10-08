package X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.shapes.Shape;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.mediaactions.MediaActionsView;

/* renamed from: X.OaR  reason: case insensitive filesystem */
public abstract class C71049OaR {
    public static C242553Us A00(AnonymousClass7FE r3, C72578PBj pBj) {
        FrameLayout frameLayout = pBj.A05;
        Drawable drawable = pBj.A02;
        C3265577g.A06(drawable, frameLayout, r3, true);
        C331277Qg A0F = C66581MXm.A0F(drawable);
        if (A0F != null) {
            Shape shape = A0F.A03;
            if (shape instanceof C328047Df) {
                C242553Us r2 = ((C328047Df) shape).A09;
                if (r2.A00 != AnonymousClass05K.A0j) {
                    return r2;
                }
                StringBuilder A1A = AnonymousClass7TE.A1A();
                A1A.append("Rounded Media Frame Layout doesn't currently support corner radius with different x/y values in each corner. (");
                A1A.append(r2);
                throw AnonymousClass7TE.A0w(AnonymousClass7TF.A0l(")", A1A));
            }
        }
        return null;
    }

    public static void A01(C376649Iu r2, AnonymousClass0iw r3, UserSession userSession, C72578PBj pBj) {
        AnonymousClass77G r1 = pBj.A00;
        if (r2 != null) {
            if (r1 == null) {
                r1 = new AnonymousClass77G(DbU.A0D(pBj.A05, R.id.media_cover_view_stub));
                pBj.A00 = r1;
            }
            AnonymousClass77H.A02(r2, r3, userSession, r1);
            AnonymousClass77G r12 = pBj.A00;
            if (r12 == null) {
                r12 = new AnonymousClass77G(DbU.A0D(pBj.A05, R.id.media_cover_view_stub));
                pBj.A00 = r12;
            }
            AnonymousClass7TH.A0R(r12.A00.A08);
            return;
        }
        if (r1 == null) {
            r1 = new AnonymousClass77G(DbU.A0D(pBj.A05, R.id.media_cover_view_stub));
            pBj.A00 = r1;
        }
        AnonymousClass77H.A03(r1);
    }

    /* JADX WARNING: type inference failed for: r1v7, types: [X.Npd, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v3, types: [X.Npd, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a1, code lost:
        if (r15.A02(r1.A02) == false) goto L_0x00a3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(X.AnonymousClass0iw r15, com.instagram.common.session.UserSession r16, X.C72578PBj r17, X.C72492P8b r18, X.C69607Nop r19, com.instagram.model.direct.messageid.DirectMessageIdentifier r20, boolean r21) {
        /*
            r9 = r19
            boolean r0 = r9 instanceof X.C68863NZv
            r7 = r15
            r8 = r17
            r11 = r21
            if (r0 == 0) goto L_0x0054
            X.NZv r9 = (X.C68863NZv) r9
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerMediaFrameLayout r0 = r8.A0K
            r4 = 0
            r0.setVisibility(r4)
            if (r21 != 0) goto L_0x0029
            com.instagram.common.typedurl.ImageUrl r3 = r9.A01
            boolean r0 = X.C253833rU.A02(r3)
            if (r0 != 0) goto L_0x0029
            com.instagram.feed.widget.IgProgressImageView r2 = r8.A0I
            long r0 = r9.A00
            r2.setExpiration(r0)
            r0 = r16
            r2.setUrl(r0, r3, r15)
        L_0x0029:
            com.instagram.ui.mediaactions.MediaActionsView r0 = r8.A0J
            r1 = 8
            r0.setVisibility(r1)
            java.lang.Integer r0 = r9.A02
            if (r0 == 0) goto L_0x004e
            int r2 = r0.intValue()
            X.2eb r1 = r8.A0E
            android.view.View r0 = r1.A01()
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r0.setImageResource(r2)
            r1.A03(r4)
        L_0x0046:
            X.3V4 r1 = r8.A0H
            X.3da r0 = X.C245853da.HIDDEN
            r1.A00(r0)
        L_0x004d:
            return
        L_0x004e:
            X.2eb r0 = r8.A0E
            r0.A03(r1)
            goto L_0x0046
        L_0x0054:
            boolean r0 = r9 instanceof X.C68864NZw
            if (r0 == 0) goto L_0x012c
            X.NZw r9 = (X.C68864NZw) r9
            r0 = r18
            if (r18 != 0) goto L_0x0077
            if (r21 == 0) goto L_0x0074
            X.3TO r1 = X.AnonymousClass3TO.PLAY
        L_0x0062:
            X.3da r0 = X.C245853da.SHOW
            r12 = 0
            X.Npd r10 = new X.Npd
            r10.<init>()
            r10.A02 = r12
            r10.A01 = r1
            r10.A00 = r0
            A03(r7, r8, r9, r10, r11, r12)
            return
        L_0x0074:
            X.3TO r1 = X.AnonymousClass3TO.AUTOPLAY
            goto L_0x0062
        L_0x0077:
            java.util.HashMap r2 = r0.A04
            boolean r1 = r2.containsKey(r8)
            if (r1 == 0) goto L_0x0122
            java.lang.Object r3 = r2.get(r8)
            r3.getClass()
            X.7L3 r3 = (X.AnonymousClass7L3) r3
        L_0x0088:
            X.OJk r13 = r0.A01
            X.Tol r1 = r3.A03
            r15 = r20
            if (r1 == 0) goto L_0x00a3
            boolean r1 = r1.A0G()
            if (r1 == 0) goto L_0x00a3
            X.Nhf r1 = r3.A01
            if (r1 == 0) goto L_0x00a3
            com.instagram.model.direct.messageid.DirectMessageIdentifier r1 = r1.A02
            boolean r1 = r15.A02(r1)
            r6 = 1
            if (r1 != 0) goto L_0x00a4
        L_0x00a3:
            r6 = 0
        L_0x00a4:
            if (r21 != 0) goto L_0x011f
            X.3TO r5 = X.AnonymousClass3TO.AUTOPLAY_USING_TIMER
        L_0x00a8:
            if (r6 == 0) goto L_0x011c
            X.3da r4 = X.C245853da.HIDDEN
        L_0x00ac:
            X.7GO r2 = r13.A00
            java.lang.Object r1 = r2.A01(r15)
            X.Npd r1 = (X.C69655Npd) r1
            if (r1 != 0) goto L_0x0115
            X.Npd r1 = new X.Npd
            r1.<init>()
            r1.A02 = r6
            r1.A01 = r5
            r1.A00 = r4
            r2.A02(r15, r1)
        L_0x00c4:
            java.lang.Object r10 = r2.A01(r15)
            r10.getClass()
            X.Npd r10 = (X.C69655Npd) r10
            r12 = 1
            A03(r7, r8, r9, r10, r11, r12)
            X.7GO r1 = r0.A02
            X.1Xj r14 = r9.A02
            com.instagram.common.session.UserSession r11 = r0.A00
            X.PFK r10 = new X.PFK
            r12 = r8
            r10.<init>(r11, r12, r13, r14, r15)
            r1.A02(r15, r10)
            java.lang.Object r4 = r1.A01(r15)
            X.PFK r4 = (X.PFK) r4
            X.3V4 r5 = r8.A0H
            X.PG9 r2 = new X.PG9
            r2.<init>(r4, r0, r3, r15)
            boolean r1 = r9.A05
            X.Npd r0 = r13.A00(r15)
            X.3da r0 = r0.A00
            r16 = r7
            r17 = r11
            r18 = r2
            r19 = r5
            r20 = r0
            r21 = r1
            X.AnonymousClass4Jq.A01(r16, r17, r18, r19, r20, r21)
            X.0Tu r2 = X.0Tu.A05
            r0 = 2342159139545419770(0x20810554000a0ffa, double:4.062304729795623E-152)
            boolean r0 = X.182.A06(r2, r11, r0)
            if (r0 != 0) goto L_0x004d
            r3.A02(r4, r15)
            return
        L_0x0115:
            r1.A02 = r6
            r1.A01 = r5
            r1.A00 = r4
            goto L_0x00c4
        L_0x011c:
            X.3da r4 = X.C245853da.SHOW
            goto L_0x00ac
        L_0x011f:
            X.3TO r5 = X.AnonymousClass3TO.PLAY
            goto L_0x00a8
        L_0x0122:
            X.7L3 r3 = r0.A03
            r3.getClass()
            r2.put(r8, r3)
            goto L_0x0088
        L_0x012c:
            boolean r0 = r9 instanceof X.C68862NZu
            if (r0 == 0) goto L_0x0138
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerMediaFrameLayout r1 = r8.A0K
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x0138:
            java.lang.String r0 = "MediaFields is neither a Image or a Video"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71049OaR.A02(X.0iw, com.instagram.common.session.UserSession, X.PBj, X.P8b, X.Nop, com.instagram.model.direct.messageid.DirectMessageIdentifier, boolean):void");
    }

    public static void A03(AnonymousClass0iw r5, C72578PBj pBj, C68864NZw nZw, C69655Npd npd, boolean z, boolean z2) {
        ImageUrl imageUrl;
        pBj.A0K.setVisibility(0);
        if (!z && (imageUrl = nZw.A01) != null) {
            IgProgressImageView igProgressImageView = pBj.A0I;
            igProgressImageView.setExpiration(nZw.A02.A17());
            igProgressImageView.setUrl(imageUrl, r5);
        }
        Integer num = nZw.A03;
        if (num != null) {
            pBj.A0J.setVisibility(8);
            int intValue = num.intValue();
            C71662eb r1 = pBj.A0E;
            ((ImageView) r1.A01()).setImageResource(intValue);
            r1.A03(0);
        } else if (nZw.A04) {
            MediaActionsView mediaActionsView = pBj.A0J;
            mediaActionsView.setVisibility(0);
            pBj.A0E.A03(8);
            if (!z && z2) {
                mediaActionsView.EiM((int) nZw.A00, false);
            }
            mediaActionsView.setVideoIconState(npd.A01);
        }
    }
}
