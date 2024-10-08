package X;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import android.widget.VideoView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.fbusertag.FBUserTag;
import com.instagram.model.people.PeopleTag;
import com.instagram.tagging.model.Tag;
import com.instagram.user.model.Product;
import com.instagram.user.model.ProductCollection;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.LyM  reason: case insensitive filesystem */
public final class C65707LyM implements X76, C66571MXb {
    public final Context A00;
    public final View A01;
    public final UserSession A02;
    public final K67 A03;
    public final C60264JiL A04;
    public final 0hq A05;
    public final 28D A06;
    public final Boolean A07;

    public C65707LyM(Context context, View view, 0hq r4, 28D r5, UserSession userSession, K67 k67, C60264JiL jiL, Boolean bool) {
        AnonymousClass7TF.A1E(userSession, 2, r5);
        this.A00 = context;
        this.A02 = userSession;
        this.A05 = r4;
        this.A01 = view;
        this.A03 = k67;
        this.A04 = jiL;
        this.A06 = r5;
        this.A07 = bool;
    }

    public final void A00(String str) {
        VideoView videoView = (VideoView) AnonymousClass7TF.A0F(this.A01, R.id.people_tagging_video_preview_container);
        videoView.setVisibility(0);
        videoView.setOnPreparedListener(new LVJ(this, 1));
        videoView.setOnCompletionListener(new LVC(videoView, 3));
        if (182.A06(0Tu.A05, this.A02, 36318058774468429L)) {
            videoView.setOnErrorListener(LVG.A00);
        }
        videoView.setVideoPath(str);
    }

    public final void A8A(User user) {
    }

    public final void AAN(User user, boolean z) {
        String str;
        PeopleTag peopleTag = new PeopleTag(new PointF(), user);
        UserSession userSession = this.A02;
        if (182.A06(0Tu.A05, userSession, 36314618502580964L)) {
            peopleTag.A09(user);
        }
        if (z) {
            C60264JiL jiL = this.A04;
            jiL.A01(peopleTag, true);
            boolean A0F = LTZ.A0F(this.A06, userSession, this.A07);
            String id = user.getId();
            if (A0F) {
                jiL.A02(id);
            } else {
                jiL.A06.A0B(id);
            }
        } else {
            this.A04.A01(peopleTag, false);
        }
        AVW();
        if (z) {
            K67 k67 = this.A03;
            String str2 = k67.A0B;
            if (str2 != null) {
                28D r3 = k67.A03;
                if (r3 != null) {
                    UserSession A0l = AnonymousClass7TE.A0l(k67.A0Q);
                    0qQ.A0B(A0l, 3);
                    27p.A01(A0l).A0E.A0R(r3, str2, "clips_people_tagging");
                }
                str = "entryPoint";
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            str = "cameraSessionId";
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        K67 k672 = this.A03;
        String str3 = k672.A0B;
        if (str3 != null) {
            28D r5 = k672.A03;
            if (r5 != null) {
                UserSession A0l2 = AnonymousClass7TE.A0l(k672.A0Q);
                0qQ.A0B(A0l2, 3);
                29Y r32 = 27p.A01(A0l2).A0E;
                1Ln A0A = 1Ln.A0A(r32.A01);
                if (DbT.A1Y(A0A)) {
                    A0A.A0M(AnonymousClass80P.TAG_PERSON, "tool_type");
                    A0A.A0t("IG_CAMERA_TAG_PEOPLE_PERSON_ADDED");
                    29Y.A00(A0A, r32);
                    JTO.A1U(A0A, str3);
                    A0A.A0a(C279294yP.CLIPS);
                    A0A.A0M(C360948fP.CLIPS, "capture_type");
                    A0A.A0b(r5);
                    A0A.A0T();
                    A0A.A0c(28t.A06);
                    A0A.A0n("clips_people_tagging");
                    A0A.A0d(C59725JVj.SHARE_SHEET);
                    JTS.A1E(A0A);
                    return;
                }
                return;
            }
            str = "entryPoint";
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        str = "cameraSessionId";
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final FragmentActivity B7r() {
        return null;
    }

    public final void Cu2(Product product) {
    }

    public final void D6L(User user) {
    }

    public final void D87(Product product) {
    }

    public final void D88(ProductCollection productCollection) {
    }

    public final void DBl(Context context, User user, String str, int i) {
    }

    public final void DDy(FBUserTag fBUserTag) {
    }

    public final void DRY(User user, int i) {
    }

    public final void DqV() {
    }

    public final void DwV(User user, int i) {
    }

    public final void EBX(View view) {
    }

    public final boolean EtC(Product product) {
        return false;
    }

    public final void AVW() {
        this.A05.A19("PeopleTagSearch", 1);
        this.A03.A08(JTS.A0q(this.A04.A0A));
    }

    public final void DDz(FBUserTag fBUserTag) {
        C60264JiL jiL = this.A04;
        05G r2 = jiL.A0C;
        0sn A16 = JTO.A16(r2);
        if (A16 == null) {
            A16 = 0sn.A00;
        }
        if (AnonymousClass7TE.A1b(A16)) {
            ArrayList A0U = 00k.A0U(JTO.A13(r2));
            if (A0U.remove(fBUserTag)) {
                r2.Epw(A0U);
            }
            05G r1 = jiL.A0B;
            Set A0j = 00k.A0j(JTO.A0x(r1));
            A0j.add(fBUserTag);
            r1.Epw(00k.A0a(A0j));
            this.A03.A08(JTS.A0q(jiL.A0A));
        }
    }

    public final void DJ8(User user, boolean z) {
        Object obj;
        ArrayList arrayList;
        AnonymousClass2Fj r6 = this.A04.A0A;
        Iterator it = JTS.A0q(r6).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (DbV.A1Z(user, ((Tag) obj).getId())) {
                break;
            }
        }
        PeopleTag peopleTag = (PeopleTag) obj;
        if (peopleTag != null) {
            peopleTag.A02 = !z;
            List<Tag> list = (List) r6.A02();
            if (list != null) {
                arrayList = AnonymousClass7TG.A0r(list);
                for (Tag tag : list) {
                    if (0qQ.A0K(tag.getId(), peopleTag.getId())) {
                        tag = peopleTag;
                    }
                    arrayList.add(tag);
                }
            } else {
                arrayList = 0sn.A00;
            }
            r6.A0B(arrayList);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DdP(com.instagram.user.model.User r10) {
        /*
            r9 = this;
            com.instagram.model.people.PeopleTag r5 = new com.instagram.model.people.PeopleTag
            r5.<init>((com.instagram.user.model.User) r10)
            X.JiL r4 = r9.A04
            X.2Fj r1 = r4.A09
            java.util.List r0 = X.JTS.A0q(r1)
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            r2 = 0
            if (r0 == 0) goto L_0x008a
            java.util.List r0 = X.JTS.A0q(r1)
            boolean r0 = X.JTQ.A1S(r5, r0)
            if (r0 == 0) goto L_0x008a
            java.lang.String r0 = r10.getId()
            r4.A03(r0)
            X.2Fj r0 = r4.A06
            r0.A0B(r2)
            X.K67 r0 = r9.A03
            java.lang.String r7 = r0.A0B
            if (r7 == 0) goto L_0x00df
            X.28D r6 = r0.A03
            if (r6 == 0) goto L_0x00e2
            X.0eM r0 = r0.A0Q
            X.0lg r1 = X.DbT.A0X(r0)
            java.lang.String r3 = "clips_people_tagging"
            r2 = 2
            r0 = 3
            X.0qQ.A0B(r1, r0)
            X.0wc r1 = X.AnonymousClass0kN.A02(r1)
            java.lang.String r0 = "ig_camera_invite_collaborator_person_removed"
            X.0Aj r8 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r8.isSampled()
            if (r0 == 0) goto L_0x0071
            X.JTO.A1S(r8, r7)
            X.JTP.A1E(r8)
            X.8fP r1 = X.C360948fP.CLIPS
            java.lang.String r0 = "capture_type"
            r8.A8M(r1, r0)
            X.JTS.A15(r6, r8, r2)
            X.28t r0 = X.28t.A06
            X.JTO.A1P(r0, r8)
            X.DbS.A1K(r8, r3)
            X.JVj r0 = X.C59725JVj.SHARE_SHEET
            X.C51965G9l.A1A(r0, r8)
        L_0x006e:
            X.AnonymousClass7TH.A0V(r8)
        L_0x0071:
            X.2Fj r2 = r4.A0A
            java.util.List r0 = X.JTS.A0q(r2)
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 == 0) goto L_0x0089
            r4.A00(r5)
            X.K67 r1 = r9.A03
            java.util.List r0 = X.JTS.A0q(r2)
            r1.A08(r0)
        L_0x0089:
            return
        L_0x008a:
            X.2Fj r1 = r4.A06
            java.lang.Object r0 = r1.A02()
            boolean r0 = X.DbV.A1Z(r10, r0)
            if (r0 == 0) goto L_0x009a
            r1.A0B(r2)
            goto L_0x0071
        L_0x009a:
            X.K67 r0 = r9.A03
            java.lang.String r7 = r0.A0B
            if (r7 == 0) goto L_0x00df
            X.28D r6 = r0.A03
            if (r6 == 0) goto L_0x00e2
            X.0eM r0 = r0.A0Q
            X.0lg r1 = X.DbT.A0X(r0)
            java.lang.String r3 = "clips_people_tagging"
            r2 = 2
            r0 = 3
            X.0qQ.A0B(r1, r0)
            X.0wc r1 = X.AnonymousClass0kN.A02(r1)
            java.lang.String r0 = "ig_camera_tag_people_person_removed"
            X.0Aj r8 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r8.isSampled()
            if (r0 == 0) goto L_0x0071
            X.JTO.A1S(r8, r7)
            X.JTP.A1E(r8)
            X.8fP r1 = X.C360948fP.CLIPS
            java.lang.String r0 = "capture_type"
            r8.A8M(r1, r0)
            X.JTS.A15(r6, r8, r2)
            X.28t r0 = X.28t.A06
            X.JTO.A1P(r0, r8)
            X.DbS.A1K(r8, r3)
            X.JVj r0 = X.C59725JVj.SHARE_SHEET
            X.C51965G9l.A1A(r0, r8)
            goto L_0x006e
        L_0x00df:
            java.lang.String r0 = "cameraSessionId"
            goto L_0x00e4
        L_0x00e2:
            java.lang.String r0 = "entryPoint"
        L_0x00e4:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65707LyM.DdP(com.instagram.user.model.User):void");
    }
}
