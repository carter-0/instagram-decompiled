package X;

import com.instagram.api.schemas.MediaPromptPrefType;
import com.instagram.api.schemas.PromptFirstMediaType;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.interactive.prompt.pivot.repository.PromptPivotPageRepository;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.user.model.User;
import java.util.List;

public final class H3B extends C270664h6 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public H3B(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj;
        this.A02 = obj2;
        this.A01 = obj3;
    }

    public final void D3r(H3D h3d) {
        switch (this.A00) {
            case 1:
                List list = (List) this.A02;
                list.clear();
                C51975G9x.A1D(this.A01, list);
                return;
            case 2:
                0qQ.A0B(h3d, 0);
                C55671HlU A002 = C55246Heb.A00(((C55888Hp9) this.A03).A03);
                String valueOf = String.valueOf(h3d.A01.A01());
                String A003 = Pxd.A00(499);
                0qQ.A0B(valueOf, 1);
                Long l = A002.A00;
                if (l != null) {
                    long longValue = l.longValue();
                    AnonymousClass0eM r1 = A002.A01;
                    C51965G9l.A0a(r1).flowAnnotate(longValue, "error", valueOf);
                    C51965G9l.A0a(r1).flowEndFail(longValue, A003, valueOf);
                }
                A002.A00 = null;
                return;
            default:
                super.D3r(h3d);
                return;
        }
    }

    public final void D3s() {
        if (1 - this.A00 != 0) {
            super.D3s();
        }
    }

    public final void D3t(C52228GJt gJt) {
        if (1 - this.A00 != 0) {
            super.D3t(gJt);
        }
    }

    public final void D3u(C52263GLe gLe) {
        String str;
        String str2;
        ImageUrl imageUrl;
        Object value;
        ImageUrl imageUrl2;
        Object value2;
        MediaPromptPrefType mediaPromptPrefType;
        1Xj r0;
        User user;
        String str3;
        String str4;
        ImageUrl A0V;
        Object value3;
        String str5;
        ExtendedImageUrl extendedImageUrl;
        1Xj r02;
        User A2A;
        C55671HlU A002;
        Long l;
        C52263GLe gLe2 = gLe;
        switch (this.A00) {
            case 0:
                0qQ.A0B(gLe2, 0);
                PromptPivotPageRepository promptPivotPageRepository = (PromptPivotPageRepository) this.A03;
                H34 h34 = promptPivotPageRepository.A00;
                C298835u7 r8 = gLe2.A01;
                C298815u5 r2 = (C298815u5) r8;
                h34.A02(r2.BaP());
                List A003 = AnonymousClass93X.A00(promptPivotPageRepository.A02, promptPivotPageRepository.A01.getModuleName(), gLe2.A09);
                boolean z = gLe2.A0D;
                if (z) {
                    ((List) this.A02).clear();
                    C54194H2o h2o = (C54194H2o) r8;
                    String str6 = h2o.A05;
                    if (str6 != null) {
                        PromptFirstMediaType promptFirstMediaType = h2o.A02;
                        ImageUrl imageUrl3 = null;
                        if (promptFirstMediaType == null || promptFirstMediaType == PromptFirstMediaType.A04 || (user = h2o.A03) == null) {
                            str2 = null;
                        } else {
                            str2 = user.getUsername();
                        }
                        User user2 = h2o.A03;
                        if (user2 != null) {
                            imageUrl = user2.Bh3();
                        } else {
                            imageUrl = null;
                        }
                        String str7 = h2o.A04;
                        if (str7 != null) {
                            PromptFirstMediaType promptFirstMediaType2 = h2o.A02;
                            if (!(promptFirstMediaType2 == null || promptFirstMediaType2 == PromptFirstMediaType.A04 || !AnonymousClass7TE.A1b(A003) || (r0 = ((C267324bN) A003.get(0)).A02) == null)) {
                                imageUrl3 = r0.A1Q();
                            }
                            05G r1 = promptPivotPageRepository.A06;
                            do {
                                value = r1.getValue();
                                if (imageUrl3 == null) {
                                    imageUrl2 = DbS.A0V("");
                                } else {
                                    imageUrl2 = imageUrl3;
                                }
                            } while (!r1.AIY(value, new C53381GnB((C56078HsR) null, (C56078HsR) null, imageUrl, imageUrl2, (Boolean) null, str6, str2, str7, 224)));
                            05G r7 = promptPivotPageRepository.A03;
                            while (true) {
                                Object value4 = r7.getValue();
                                MediaPromptPrefType mediaPromptPrefType2 = h2o.A00;
                                if (mediaPromptPrefType2 == null) {
                                    str = "authorAttributionSetting";
                                } else if (r7.AIY(value4, mediaPromptPrefType2)) {
                                    05G r72 = promptPivotPageRepository.A08;
                                    do {
                                        value2 = r72.getValue();
                                        mediaPromptPrefType = h2o.A01;
                                        if (mediaPromptPrefType == null) {
                                            str = "notificationSetting";
                                        }
                                    } while (!r72.AIY(value2, mediaPromptPrefType));
                                    05G r73 = promptPivotPageRepository.A04;
                                    do {
                                    } while (!r73.AIY(r73.getValue(), h2o.A02));
                                }
                            }
                        } else {
                            str = "formattedMediaCount";
                        }
                    } else {
                        str = "promptStickerText";
                    }
                    0qQ.A0F(str);
                    throw AnonymousClass00P.createAndThrow();
                }
                05G r74 = promptPivotPageRepository.A05;
                do {
                } while (!r74.AIY(r74.getValue(), Boolean.valueOf(r2.BaP().BU8())));
                05G r22 = promptPivotPageRepository.A07;
                do {
                } while (!r22.AIY(r22.getValue(), Boolean.valueOf(z)));
                List list = (List) this.A02;
                list.addAll(A003);
                C51975G9x.A1D(this.A01, list);
                return;
            case 1:
                0qQ.A0B(gLe2, 0);
                C55871Hos hos = (C55871Hos) this.A03;
                H34 h342 = hos.A00;
                C298815u5 r23 = (C298815u5) gLe2.A01;
                h342.A02(r23.BaP());
                AnonymousClass7TF.A1O(hos.A03, r23.BaP().BU8());
                AnonymousClass7TF.A1O(hos.A04, gLe2.A0D);
                List A004 = AnonymousClass93X.A00(hos.A02, hos.A01.getModuleName(), gLe2.A09);
                List list2 = (List) this.A02;
                list2.addAll(A004);
                C51975G9x.A1D(this.A01, list2);
                return;
            default:
                0qQ.A0B(gLe2, 0);
                C55888Hp9 hp9 = (C55888Hp9) this.A03;
                H34 h343 = hp9.A01;
                C298835u7 r12 = gLe2.A01;
                C298815u5 r10 = (C298815u5) r12;
                h343.A02(r10.BaP());
                UserSession userSession = hp9.A03;
                List A005 = AnonymousClass93X.A00(userSession, hp9.A02.getModuleName(), gLe2.A09);
                boolean z2 = gLe2.A0D;
                if (!z2) {
                    05G r24 = hp9.A04;
                } else {
                    if (A005.isEmpty() && (l = A002.A00) != null) {
                        C51965G9l.A0a((A002 = C55246Heb.A00(userSession)).A01).flowAnnotate(l.longValue(), "is_empty", 1);
                    }
                    C55671HlU A006 = C55246Heb.A00(userSession);
                    Long l2 = A006.A00;
                    if (l2 != null) {
                        C51965G9l.A0a(A006.A01).flowEndSuccess(l2.longValue());
                    }
                    String str8 = null;
                    A006.A00 = null;
                    ((List) this.A02).clear();
                    C43878CGs cGs = (C43878CGs) r12;
                    QP8 qp8 = cGs.A00;
                    ImageInfo imageInfo = null;
                    if (qp8 != null) {
                        str8 = qp8.A04;
                        str3 = qp8.A03;
                        str4 = qp8.A02;
                    } else {
                        str3 = null;
                        str4 = null;
                    }
                    if (A005.isEmpty() || (r02 = ((C267324bN) A005.get(0)).A02) == null || (A2A = r02.A2A(userSession)) == null) {
                        A0V = DbS.A0V("");
                    } else {
                        A0V = A2A.Bh3();
                    }
                    QP8 qp82 = cGs.A00;
                    if (qp82 != null) {
                        imageInfo = (ImageInfo) qp82.A00;
                    }
                    05G r13 = hp9.A05;
                    do {
                        value3 = r13.getValue();
                        if (str8 == null) {
                            str5 = AnonymousClass7TE.A16(hp9.A00, 2131975065);
                        } else {
                            str5 = str8;
                        }
                        if (imageInfo == null || (extendedImageUrl = 1iI.A03(imageInfo)) == null) {
                            extendedImageUrl = DbS.A0V("");
                        }
                    } while (!r13.AIY(value3, new C53381GnB((C56078HsR) null, (C56078HsR) null, A0V, extendedImageUrl, (Boolean) null, str5, str3, str4, 224)));
                }
                05G r242 = hp9.A04;
                do {
                } while (!r242.AIY(r242.getValue(), Boolean.valueOf(r10.BaP().BU8())));
                05G r25 = hp9.A06;
                do {
                } while (!r25.AIY(r25.getValue(), Boolean.valueOf(z2)));
                List list3 = (List) this.A02;
                list3.addAll(A005);
                C51975G9x.A1D(this.A01, list3);
                return;
        }
    }
}
