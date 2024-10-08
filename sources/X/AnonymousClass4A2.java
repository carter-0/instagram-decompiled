package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import com.instagram.api.schemas.DirectMediaFallbackUrl;
import com.instagram.api.schemas.NotePogImageDict;
import com.instagram.api.schemas.NotePogVideoDict;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.AdditionalCandidates;
import com.instagram.model.mediasize.ImageInfoImpl;
import com.instagram.model.mediasize.SpriteSheetInfoCandidates;
import com.instagram.model.mediasize.VideoVersion;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.simplewebview.SimpleWebViewActivity;
import com.instagram.simplewebview.SimpleWebViewConfig;
import com.instagram.user.model.User;
import java.io.File;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4A2  reason: invalid class name */
public abstract class AnonymousClass4A2 {
    public static final SpannableStringBuilder A00(Context context, UserSession userSession, boolean z, boolean z2) {
        int i;
        0qQ.A0B(userSession, 1);
        Resources resources = context.getResources();
        if (z) {
            i = 2131965109;
        } else {
            i = 2131965107;
            if (z2) {
                i = 2131965108;
            }
        }
        String string = resources.getString(i);
        0qQ.A0A(string);
        String string2 = context.getResources().getString(2131964884);
        0qQ.A07(string2);
        SpannableStringBuilder append = new SpannableStringBuilder(string).append(002.A0E(string2, ' ', '.'));
        0qQ.A0A(append);
        AnonymousClass7AV.A05(append, new C62141Kau(context, userSession, context.getColor(2Yu.A06(context))), string2);
        return append;
    }

    public static final C300845y2 A01(UserSession userSession, C68176N3r n3r, String str, List list) {
        Object obj;
        Object obj2;
        AnonymousClass60C r1;
        JV7 jv7;
        String str2;
        List list2 = list;
        0qQ.A0B(list2, 3);
        AnonymousClass60F r4 = null;
        C68176N3r n3r2 = n3r;
        if (n3r == null && !(!list2.isEmpty())) {
            return null;
        }
        C45461Cws cws = new C45461Cws(DA0.A00());
        Iterator it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((AnonymousClass3Q2) obj).A1G == 1iA.A0a) {
                break;
            }
        }
        AnonymousClass3Q2 r10 = (AnonymousClass3Q2) obj;
        if (r10 != null) {
            String str3 = null;
            String str4 = r10.A3t;
            DirectMediaFallbackUrl directMediaFallbackUrl = null;
            ImageInfoImpl imageInfoImpl = new ImageInfoImpl((AdditionalCandidates) null, (SpriteSheetInfoCandidates) null, (SpriteSheetInfoCandidates) null, (List) null, (List) null);
            VideoVersion videoVersion = new VideoVersion((DirectMediaFallbackUrl) null, (Integer) null, (Integer) null, (Integer) null, (Long) null, (String) null, (String) null);
            DirectMediaFallbackUrl directMediaFallbackUrl2 = videoVersion.A00;
            Integer num = videoVersion.A02;
            Long l = videoVersion.A04;
            Integer valueOf = Integer.valueOf(r10.A0G);
            ClipInfo clipInfo = (ClipInfo) 00k.A0J(r10.A4G);
            if (clipInfo != null) {
                str3 = clipInfo.A0F;
            }
            Integer valueOf2 = Integer.valueOf(r10.A0H);
            if (directMediaFallbackUrl2 != null) {
                directMediaFallbackUrl = directMediaFallbackUrl2.F2f();
            }
            List singletonList = Collections.singletonList(new VideoVersion(directMediaFallbackUrl, valueOf, num, valueOf2, l, (String) null, str3));
            0qQ.A07(singletonList);
            r1 = new AnonymousClass60C((NotePogImageDict) null, new NotePogVideoDict(imageInfoImpl, str4, str4, singletonList));
        } else {
            Iterator it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it2.next();
                if (((AnonymousClass3Q2) obj2).A1G == 1iA.A0Q) {
                    break;
                }
            }
            AnonymousClass3Q2 r8 = (AnonymousClass3Q2) obj2;
            if (r8 != null) {
                String str5 = r8.A3t;
                String obj3 = new File(r8.A33).toURI().toURL().toString();
                0qQ.A07(obj3);
                r1 = new AnonymousClass60C(new NotePogImageDict(str5, obj3, r8.A3t), (NotePogVideoDict) null);
            } else {
                r1 = null;
            }
        }
        cws.A09 = r1;
        String str6 = str;
        if (str != null) {
            UserSession userSession2 = userSession;
            User A02 = 17h.A00(userSession2).A02(userSession2.A06);
            if (A02 != null) {
                C45885D9e d9e = AnonymousClass60G.A00;
                if (n3r == null || (jv7 = n3r2.A07) == null || (str2 = jv7.A02) == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                C45459Cwq A00 = d9e.A00(str6, str2);
                List singletonList2 = Collections.singletonList(A02);
                0qQ.A07(singletonList2);
                A00.A04 = singletonList2;
                A00.A01 = 1;
                r4 = A00.A00();
            }
        }
        cws.A0B = r4;
        return cws.A00();
    }

    public static final String A03(Context context, UserSession userSession, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        String string;
        Resources resources;
        int i;
        0qQ.A0B(userSession, 1);
        String[] strArr = {context.getResources().getString(2131968566), context.getResources().getString(2131968567), context.getResources().getString(2131968568), context.getResources().getString(2131968565)};
        String[] strArr2 = {context.getResources().getString(2131968576), context.getResources().getString(2131968577), context.getResources().getString(2131968578), context.getResources().getString(2131968579)};
        if (z) {
            resources = context.getResources();
            i = 2131968620;
        } else if (z2) {
            resources = context.getResources();
            i = 2131968528;
        } else if (z4) {
            resources = context.getResources();
            i = 2131956636;
        } else {
            if (!z3) {
                if (z5) {
                    string = context.getResources().getString(2131968566);
                    0qQ.A07(string);
                    return string;
                }
                0Tu r4 = 0Tu.A05;
                if (182.A06(r4, userSession, 36329384600551510L)) {
                    return strArr2[1Au.A00(userSession).A01.getInt("notes_creation_cta_variant", 0)];
                }
                if (182.A06(r4, userSession, 36327344490756444L)) {
                    return strArr[0];
                }
                if (182.A06(r4, userSession, 36327344490821981L)) {
                    return strArr[1];
                }
                if (182.A06(r4, userSession, 36327344490887518L)) {
                    return strArr[2];
                }
                if (182.A06(r4, userSession, 36327344490690907L)) {
                    return strArr[1Au.A00(userSession).A01.getInt("notes_creation_cta_variant", 0)];
                }
            }
            string = context.getResources().getString(2131968565);
            0qQ.A07(string);
            return string;
        }
        string = resources.getString(i);
        0qQ.A07(string);
        return string;
    }

    public static final void A04(Context context, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        SimpleWebViewActivity.A02.A02(context, userSession, new SimpleWebViewConfig(new C11225SFz("https://help.instagram.com/1048118103140467")));
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.1Xx, java.lang.Object] */
    public static final 1Xj A02(NotePogVideoDict notePogVideoDict) {
        ? obj = new Object();
        obj.A5j = notePogVideoDict.A01;
        obj.A64 = notePogVideoDict.A02;
        obj.EqT(notePogVideoDict.A03);
        obj.EZf(notePogVideoDict.A00);
        obj.A4m = Integer.valueOf(1iA.A0a.A00);
        1Xv r0 = 1Xj.A0h;
        return 1Xv.A02(obj);
    }
}
