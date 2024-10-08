package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.UpcomingEvent;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.8D8  reason: invalid class name */
public abstract class AnonymousClass8D8 {
    public boolean A00;
    public final AnonymousClass57C A01;
    public final AnonymousClass8BA A02;
    public final C310416b1 A03;
    public final Map A04;

    public /* synthetic */ AnonymousClass8D8(AnonymousClass8BA r31, AnonymousClass8BH r32, Integer num, int i, boolean z, boolean z2) {
        boolean z3 = z2;
        boolean z4 = z;
        AnonymousClass8BH r1 = (i & 1) != 0 ? A2J.A00 : r32;
        float f = (i & 2) != 0 ? 0.25f : 0.0f;
        float f2 = (i & 4) != 0 ? 1.5f : 0.0f;
        z4 = (i & 8) != 0 ? false : z4;
        num = (i & 32) != 0 ? null : num;
        C310416b1 r0 = new C310416b1(r1, (AnonymousClass8DA) null, (C3510487j) null, AnonymousClass05K.A01, (Integer) null, (Integer) null, (Object) null, (String) null, (List) null, f, f2, -1.0f, -1.0f, -1.0f, num != null ? num.intValue() : 0, true, false, true, z4, (i & 64) != 0 ? false : z3, false, false, true, true, true, true, true, false, false);
        this.A03 = r0;
        this.A02 = r31;
        this.A04 = new LinkedHashMap();
        this.A01 = AnonymousClass57C.ASSET_PICKER;
    }

    public final AnonymousClass57C A03() {
        if (this instanceof C387999n7) {
            return ((C387999n7) this).A00;
        }
        if (this instanceof C388009n8) {
            return ((C388009n8) this).A00;
        }
        return this.A01;
    }

    public final void A04() {
        String str;
        if (!this.A00) {
            for (Map.Entry entry : A06().entrySet()) {
                Drawable drawable = (Drawable) entry.getKey();
                List list = (List) entry.getValue();
                AnonymousClass8BA r2 = this.A02;
                C310416b1 r5 = (C310416b1) this.A04.get(drawable);
                if (r5 == null) {
                    r5 = this.A03;
                }
                AnonymousClass57C A032 = A03();
                if (this instanceof C388089nG) {
                    str = "mention_sticker";
                } else {
                    str = null;
                }
                r2.A0f(drawable, A032, r5, str, list);
            }
            this.A00 = true;
        }
    }

    public Integer A05() {
        if (this instanceof C388099nH) {
            return ((C388099nH) this).A01;
        }
        if (this instanceof C388119nJ) {
            return AnonymousClass05K.A0U;
        }
        if (this instanceof C388159nN) {
            return AnonymousClass05K.A0E;
        }
        if (this instanceof C388149nM) {
            return AnonymousClass05K.A0A;
        }
        if (this instanceof C388139nL) {
            return AnonymousClass05K.A09;
        }
        if (this instanceof C388129nK) {
            return AnonymousClass05K.A0H;
        }
        if (this instanceof C352598Dz) {
            return ((C352598Dz) this).A00;
        }
        if (this instanceof C387989n6) {
            return AnonymousClass05K.A0B;
        }
        if (this instanceof C387919mz) {
            return AnonymousClass05K.A0S;
        }
        if ((this instanceof C387909my) || (this instanceof C387979n5)) {
            return AnonymousClass05K.A04;
        }
        if (!(this instanceof C387969n4)) {
            if (this instanceof C388039nB) {
                return AnonymousClass05K.A0M;
            }
            if (!(this instanceof C388029nA)) {
                if (this instanceof C388079nF) {
                    return AnonymousClass05K.A00;
                }
                if (this instanceof C388089nG) {
                    return AnonymousClass05K.A0F;
                }
                if (this instanceof C388019n9) {
                    return AnonymousClass05K.A0D;
                }
                if (this instanceof C387959n3) {
                    return AnonymousClass05K.A0T;
                }
                if (this instanceof C388069nE) {
                    return AnonymousClass05K.A15;
                }
                if (this instanceof C388059nD) {
                    return AnonymousClass05K.A0G;
                }
                if (this instanceof C387949n2) {
                    return AnonymousClass05K.A0Y;
                }
                if (this instanceof C387939n1) {
                    return AnonymousClass05K.A0J;
                }
                if (this instanceof C387929n0) {
                    return AnonymousClass05K.A0C;
                }
                if ((this instanceof C388009n8) || (this instanceof C387999n7)) {
                    return AnonymousClass05K.A06;
                }
                return AnonymousClass05K.A1F;
            }
        }
        return AnonymousClass05K.A03;
    }

    public Map A06() {
        Drawable A002;
        String str;
        C317876nz r3;
        C300645xY r0;
        String C4F;
        String str2;
        C300645xY r1;
        C318046oG r12;
        String str3;
        ArrayList arrayList;
        if (this instanceof C387969n4) {
            return ((C387969n4) this).A00;
        }
        if (this instanceof C387999n7) {
            return ((C387999n7) this).A01;
        }
        if (this instanceof C388099nH) {
            return ((C388099nH) this).A02;
        }
        if (this instanceof C388119nJ) {
            return ((C388119nJ) this).A01;
        }
        if (this instanceof C388159nN) {
            return ((C388159nN) this).A01;
        }
        if (this instanceof C388149nM) {
            return ((C388149nM) this).A01;
        }
        if (this instanceof C388139nL) {
            return ((C388139nL) this).A00;
        }
        if (this instanceof C388129nK) {
            return ((C388129nK) this).A0B;
        }
        if (this instanceof C352598Dz) {
            return ((C352598Dz) this).A01;
        }
        if (this instanceof C387989n6) {
            return ((C387989n6) this).A00;
        }
        if (this instanceof C387919mz) {
            A002 = new AnonymousClass9XD(((C387919mz) this).A00);
            str = "share_platform_sticker_id";
        } else if (this instanceof C387909my) {
            return ((C387909my) this).A00;
        } else {
            if (this instanceof C387979n5) {
                A002 = ((C387979n5) this).A00;
                Drawable drawable = A002;
                if (A002 instanceof C347017w8) {
                    drawable = ((C347017w8) drawable).A04();
                }
                0qQ.A0A(drawable);
                if (drawable instanceof C369738vF) {
                    C317876nz r02 = C317876nz.A0a;
                    r12 = C318046oG.QUESTION_RESPONSE_RESHARE;
                    str3 = C273654mx.A00(3194);
                } else if (drawable instanceof B3c) {
                    C317876nz r03 = C317876nz.A0a;
                    C317966o8 r32 = new C317966o8();
                    r32.A0S = "question_music_response_reshare_sticker_id";
                    C317966o8 r13 = new C317966o8();
                    r13.A0S = "question_music_response_reshare_large_sticker_id";
                    r3 = new C317876nz(C318046oG.QUESTION_RESPONSE_RESHARE, "question_music_response_reshare_sticker_id", 0sr.A1P(new C317966o8[]{r32, r13}));
                } else if (drawable instanceof C386069k0) {
                    C317876nz r04 = C317876nz.A0a;
                    r12 = C318046oG.QUESTION_RESPONSE_RESHARE;
                    str3 = "question_media_response_reshare_sticker_id";
                } else {
                    throw new IllegalStateException("responseStickerDrawable contains an unknown sticker type");
                }
                r3 = C317886o0.A06(r12, str3);
            } else if (this instanceof C388039nB) {
                A002 = ((C388039nB) this).A00;
                r3 = C317876nz.A1A;
            } else if (this instanceof C388029nA) {
                A002 = ((C388029nA) this).A00;
                r3 = C317876nz.A19;
            } else if (this instanceof C388079nF) {
                C388079nF r6 = (C388079nF) this;
                Context context = r6.A00;
                Af0 af0 = new Af0(r6.A02, (C40599Aen) null, AnonymousClass6KJ.MUSIC_ONLY, -1);
                UserSession userSession = r6.A01;
                String str4 = r6.A03;
                C314676if r05 = r6.A02.A1g;
                if (r05 != null) {
                    r05.get();
                }
                A002 = C39900AIi.A01(context, userSession, af0, str4);
                str = AnonymousClass000.A00(1607);
            } else if (this instanceof C388089nG) {
                C388089nG r4 = (C388089nG) this;
                Context context2 = r4.A00;
                User user = r4.A03;
                String upperCase = user.getUsername().toUpperCase(Locale.ROOT);
                0qQ.A07(upperCase);
                int A012 = AnonymousClass0nB.A01(context2);
                C387369m6 r5 = new C387369m6(r4.A01, user, 002.A0D(upperCase, '@'), (float) context2.getResources().getDimensionPixelSize(R.dimen.before_and_after_caption_font_size), A012);
                UserSession userSession2 = r4.A02;
                String str5 = r4.A04;
                C314676if r06 = r4.A02.A1g;
                if (r06 != null) {
                    r06.get();
                }
                A002 = C39900AIi.A01(context2, userSession2, r5, str5);
                str = "";
                if (A002 instanceof C347017w8) {
                    ImmutableList copyOf = ImmutableList.copyOf((Collection) A002.A08);
                    0qQ.A07(copyOf);
                    ArrayList arrayList2 = new ArrayList(0Yv.A1E(copyOf, 10));
                    Iterator it = copyOf.iterator();
                    while (it.hasNext()) {
                        Drawable drawable2 = (Drawable) it.next();
                        if (!(drawable2 instanceof C300645xY) || (r1 = (C300645xY) drawable2) == null || (str2 = r1.C4F()) == null) {
                            str2 = str;
                        }
                        arrayList2.add(str2);
                    }
                    arrayList = arrayList2;
                    return 0se.A0M(new 0eP(A002, arrayList));
                } else if (!(!(A002 instanceof C300645xY) || (r0 = (C300645xY) A002) == null || (C4F = r0.C4F()) == null)) {
                    str = C4F;
                }
            } else if (this instanceof C388019n9) {
                C388019n9 r07 = (C388019n9) this;
                Context context3 = r07.A00;
                UpcomingEvent upcomingEvent = r07.A02;
                Integer num = AnonymousClass05K.A00;
                A002 = new C299325uw(context3, r07.A01, upcomingEvent, num, num);
                r3 = C317876nz.A1d;
            } else if (this instanceof C387959n3) {
                return ((C387959n3) this).A00;
            } else {
                if (this instanceof C388069nE) {
                    C388069nE r52 = (C388069nE) this;
                    Context context4 = r52.A00;
                    UserSession userSession3 = r52.A01;
                    C387359m5 r08 = r52.A02;
                    A002 = C379039Se.A01(context4, userSession3, r08.A02, r08.A00, r08.A01);
                    arrayList = r52.A03;
                    return 0se.A0M(new 0eP(A002, arrayList));
                } else if (this instanceof C388059nD) {
                    C388059nD r09 = (C388059nD) this;
                    UserSession userSession4 = r09.A01;
                    A002 = C39576A0s.A00(r09.A00, userSession4, r09.A02, r09.A03);
                    str = "group_mention_sticker_bundle_id";
                } else if (this instanceof C387949n2) {
                    return ((C387949n2) this).A00;
                } else {
                    if (this instanceof C387939n1) {
                        return ((C387939n1) this).A00;
                    }
                    if (this instanceof C387929n0) {
                        return ((C387929n0) this).A00;
                    }
                    if (this instanceof C388009n8) {
                        return ((C388009n8) this).A01;
                    }
                    return ((C388049nC) this).A00;
                }
            }
            arrayList = r3.A01();
            return 0se.A0M(new 0eP(A002, arrayList));
        }
        List singletonList = Collections.singletonList(str);
        0qQ.A07(singletonList);
        arrayList = singletonList;
        return 0se.A0M(new 0eP(A002, arrayList));
    }

    public static Map A00(C317876nz r1, Object obj) {
        return 0se.A0M(new 0eP(obj, r1.A01()));
    }

    public void A07() {
        A04();
    }
}
