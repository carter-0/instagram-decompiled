package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.common.util.gradient.BackgroundGradientColors;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.superlativesticker.model.SuperlativeStickerClientModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public abstract class AA8 {
    public static void A04(AnonymousClass87H r3, Iterator it) {
        0eP r0 = (0eP) it.next();
        Drawable drawable = (Drawable) r0.A00;
        C310416b1 r02 = (C310416b1) r0.A01;
        if (r3 != null) {
            r3.A0C(drawable, r02, false);
        }
    }

    public void A08() {
    }

    public void A09(Drawable drawable) {
    }

    public boolean A0G() {
        return true;
    }

    public final int A05() {
        List list;
        if (this instanceof C387529mM) {
            list = ((C387529mM) this).A04;
        } else if (this instanceof C387499mJ) {
            list = ((C387499mJ) this).A04;
        } else if (this instanceof C387509mK) {
            list = ((C387509mK) this).A06;
        } else if (!(this instanceof C387559mP)) {
            return 0;
        } else {
            list = ((C387559mP) this).A01;
        }
        return list.size();
    }

    public void A06() {
        if (this instanceof C387529mM) {
            C387529mM r2 = (C387529mM) this;
            r2.A00 = AnonymousClass7TG.A0G(r2.A04, r2.A00 + 1);
            r2.A0L();
        } else if (this instanceof C387549mO) {
            C387549mO r3 = (C387549mO) this;
            Drawable drawable = r3.A02;
            if (drawable != null) {
                r3.A0B.A08(drawable);
            }
            int i = r3.A00 + 1;
            List list = r3.A05;
            list.getClass();
            r3.A00 = AnonymousClass7TG.A0G(list, i);
            C45361Cv3 A00 = C387549mO.A00(r3);
            AnonymousClass87H r1 = r3.A0B;
            r1.A0H(A00.A01);
            r1.A0I("@");
            C387549mO.A01(r3, A00);
        } else if (this instanceof C387469mG) {
            C387469mG r22 = (C387469mG) this;
            int i2 = r22.A00 + 1;
            C39688A5e a5e = r22.A01;
            a5e.getClass();
            r22.A00 = AnonymousClass7TG.A0G(a5e.A01, i2);
            C387469mG.A00(AnonymousClass57C.CREATE_MODE_RANDOM_SELECTION, r22);
        } else if (this instanceof C387479mH) {
            C387479mH r23 = (C387479mH) this;
            r23.A00 = AnonymousClass7TG.A0G(r23.A01, r23.A00 + 1);
            C387479mH.A00(AnonymousClass57C.CREATE_MODE_RANDOM_SELECTION, r23);
        } else if (this instanceof C387489mI) {
            C387489mI r24 = (C387489mI) this;
            int i3 = r24.A00 + 1;
            AnonymousClass87G r0 = r24.A01;
            r0.getClass();
            List list2 = r0.A0I;
            list2.getClass();
            r24.A00 = AnonymousClass7TG.A0G(list2, i3);
            C387489mI.A00(AnonymousClass57C.CREATE_MODE_RANDOM_SELECTION, r24);
        } else if (this instanceof C387509mK) {
            C387509mK r32 = (C387509mK) this;
            AnonymousClass57C r25 = AnonymousClass57C.CREATE_MODE_RANDOM_SELECTION;
            r32.A00 = AnonymousClass7TG.A0G(r32.A06, r32.A00 + 1);
            C387509mK.A00(r25, r32);
        } else if (this instanceof C387559mP) {
            C387559mP r33 = (C387559mP) this;
            AnonymousClass57C r26 = AnonymousClass57C.CREATE_MODE_RANDOM_SELECTION;
            int A0G = AnonymousClass7TG.A0G(r33.A01, r33.A00 + 1);
            r33.A00 = A0G;
            C387559mP.A00(r26, r33, (C19476WaO) r33.A01.get(A0G));
        }
    }

    public void A07() {
        AnonymousClass87H r7;
        C317876nz r2;
        Drawable drawable;
        if (this instanceof C387549mO) {
            C387549mO r6 = (C387549mO) this;
            AnonymousClass87H r5 = r6.A0B;
            C3509386y r4 = r5.A00;
            r4.A01.A05.A02.A01.A0A = null;
            Context context = r6.A07;
            r5.A0F(new BackgroundGradientColors(context.getColor(R.color.purple_4), context.getColor(R.color.blue_4)));
            r5.A0A((Drawable) null, AnonymousClass57C.CREATE_MODE_DIAL_SELECTION, (C317876nz) null);
            C45361Cv3 A00 = C387549mO.A00(r6);
            r5.A0K(A00.A01, (String) null);
            r5.A0I("@");
            r5.A0D(r6.A0C, context.getResources().getDimensionPixelOffset(R.dimen.action_bar_immersive_gradient_height));
            C387549mO.A01(r6, A00);
            AnonymousClass87D.A00(r4.A0F.A09).addTextChangedListener(r6.A08);
        } else if (this instanceof C387529mM) {
            ((C387529mM) this).A0L();
        } else {
            if (this instanceof C387439mD) {
                C387439mD r0 = (C387439mD) this;
                r7 = r0.A00;
                if (r7 != null) {
                    r2 = C317876nz.A1X;
                    drawable = r0.A01;
                } else {
                    return;
                }
            } else if (this instanceof C387449mE) {
                C387449mE r42 = (C387449mE) this;
                AnonymousClass87H r3 = r42.A04;
                if (r3 != null) {
                    r3.A0A((Drawable) null, AnonymousClass57C.CREATE_MODE_DIAL_SELECTION, (C317876nz) null);
                }
                List<SuperlativeStickerClientModel> list = r42.A05;
                0qQ.A0A(list);
                ArrayList A0r = AnonymousClass7TG.A0r(list);
                for (SuperlativeStickerClientModel superlativeStickerClientModel : list) {
                    C16522UwR uwR = superlativeStickerClientModel.A00;
                    Medium A03 = C282665Eg.A03(AnonymousClass7TE.A0t(superlativeStickerClientModel.A01), 3, 0);
                    TargetViewSizeProvider targetViewSizeProvider = r42.A03;
                    AnonymousClass81W r02 = ((NineSixteenLayoutConfigImpl) targetViewSizeProvider).A0K;
                    C349307zv r1 = new C349307zv(A03, r02.getWidth(), r02.getHeight(), 0);
                    Bitmap decodeFile = BitmapFactory.decodeFile(superlativeStickerClientModel.A02);
                    0qQ.A07(decodeFile);
                    Context context2 = r42.A00;
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(AnonymousClass7TF.A0A(context2), decodeFile);
                    if (r3 != null) {
                        C317876nz r44 = C317876nz.A1V;
                        AnonymousClass57C r43 = AnonymousClass57C.CREATE_MODE_DIAL_SELECTION;
                        C3510387i r9 = r42.A02;
                        C3510387i r16 = null;
                        Integer num = AnonymousClass05K.A00;
                        AnonymousClass8BG r14 = new AnonymousClass8BG(0.0f, 0.0f);
                        if (r9 != null) {
                            r16 = r9;
                        }
                        r3.A0B(bitmapDrawable, r43, r44, new C310416b1((AnonymousClass8BH) r14, (AnonymousClass8DA) null, (C3510487j) r16, num, (Integer) null, (Integer) null, (Object) null, (String) null, (List) null, -1.0f, -1.0f, 1.05f, -1.0f, -1.0f, -3, false, false, false, false, false, false, true, true, true, true, true, true, false, false), false, true);
                    }
                    Bitmap bitmap = bitmapDrawable.getBitmap();
                    0qQ.A07(bitmap);
                    List list2 = superlativeStickerClientModel.A03;
                    UserSession userSession = r42.A01;
                    Iterator it = AIP.A02(context2, userSession, list2, 1.0f).iterator();
                    while (it.hasNext()) {
                        A04(r3, it);
                    }
                    Iterator it2 = C388129nK.A0C.A03(context2, userSession, targetViewSizeProvider, uwR).iterator();
                    while (it2.hasNext()) {
                        A04(r3, it2);
                    }
                    Iterator it3 = AIP.A01(context2, userSession, targetViewSizeProvider, superlativeStickerClientModel.A04).iterator();
                    while (it3.hasNext()) {
                        A04(r3, it3);
                    }
                    0qQ.A0A(r3);
                    C366678pU A032 = r3.A03(r1, C18241Vo8.A01(uwR));
                    0qQ.A07(A032);
                    C39740A7g a7g = new C39740A7g(A032, C18241Vo8.A01(uwR));
                    a7g.A04 = r1;
                    a7g.A01 = bitmap;
                    A0r.add(a7g);
                }
                if (r3 != null) {
                    r3.A0G(r3.A00.A01.A01.A08(), A0r);
                    return;
                }
                return;
            } else if (this instanceof C387539mN) {
                C387539mN r32 = (C387539mN) this;
                AnonymousClass87H r45 = r32.A0B;
                Context context3 = r32.A07;
                r45.A0F(new BackgroundGradientColors(context3.getColor(R.color.purple_4), context3.getColor(R.color.blue_4)));
                r45.A0A((Drawable) null, AnonymousClass57C.CREATE_MODE_DIAL_SELECTION, (C317876nz) null);
                if (!r32.A06) {
                    r45.A04();
                    r32.A06 = true;
                    C39778A8x a8x = r32.A0C;
                    String str = a8x.A01;
                    if (str == null || a8x.A03.A0M(str) == null) {
                        1OC A002 = C394359xx.A00(r32.A08);
                        A002.A00 = new C385479j0(r32, 6);
                        1ES.A03(A002);
                        return;
                    }
                    C387539mN.A02(r32);
                    return;
                }
                return;
            } else if (this instanceof C387519mL) {
                C387519mL r33 = (C387519mL) this;
                AnonymousClass87H r22 = r33.A08;
                r22.A04();
                r22.A0A((Drawable) null, AnonymousClass57C.CREATE_MODE_DIAL_SELECTION, (C317876nz) null);
                C379669Uv.A01(new C385479j0(r33, 5), r33.A05, "birthday_sticker_id");
                return;
            } else if (this instanceof C387469mG) {
                C387469mG.A00(AnonymousClass57C.CREATE_MODE_DIAL_SELECTION, (C387469mG) this);
                return;
            } else if (this instanceof C387409mA) {
                return;
            } else {
                if (this instanceof C387479mH) {
                    C387479mH.A00(AnonymousClass57C.CREATE_MODE_DIAL_SELECTION, (C387479mH) this);
                    return;
                } else if (this instanceof C387489mI) {
                    C387489mI.A00(AnonymousClass57C.CREATE_MODE_DIAL_SELECTION, (C387489mI) this);
                    return;
                } else if (this instanceof C387499mJ) {
                    C387499mJ r34 = (C387499mJ) this;
                    r34.A09.A0E(AnonymousClass87I.MENTIONS, (1Xj) null);
                    C387499mJ.A00(AnonymousClass57C.CREATE_MODE_DIAL_SELECTION, r34, r34.A00);
                    return;
                } else if (this instanceof C387509mK) {
                    C387509mK r35 = (C387509mK) this;
                    r35.A0A.A0E(AnonymousClass87I.MEMORIES, (1Xj) null);
                    C387509mK.A00(AnonymousClass57C.CREATE_MODE_DIAL_SELECTION, r35);
                    return;
                } else if (this instanceof C387429mC) {
                    C387429mC r62 = (C387429mC) this;
                    int[] iArr = AnonymousClass6LW.A0A;
                    int i = iArr[0];
                    int i2 = iArr[4];
                    r7 = r62.A01;
                    AIY aiy = r7.A00.A01.A07.A00().A0B;
                    aiy.getClass();
                    C352048Bm r23 = aiy.A01;
                    if (r23 == null) {
                        0kD.A01("TextModeComposerGradientBackgroundController", "mTextColorSchemeList is null in prependAndSelectBackgroundGradientColours");
                    } else {
                        r23.A02(i, i2);
                        AIY.A02(aiy, false);
                        AIY.A01(aiy, false);
                    }
                    r2 = C317876nz.A1f;
                    drawable = r62.A00;
                } else if (this instanceof C387559mP) {
                    C387559mP r36 = (C387559mP) this;
                    int A0G = AnonymousClass7TG.A0G(r36.A01, r36.A00);
                    r36.A00 = A0G;
                    C387559mP.A00(AnonymousClass57C.CREATE_MODE_DIAL_SELECTION, r36, (C19476WaO) r36.A01.get(A0G));
                    return;
                } else {
                    return;
                }
            }
            r7.A0A(drawable, AnonymousClass57C.CREATE_MODE_DIAL_SELECTION, r2);
        }
    }

    public void A0A(AnonymousClass87G r7) {
        ImmutableList immutableList;
        List list;
        if (this instanceof C387549mO) {
            List list2 = r7.A0L;
            list2.getClass();
            ((C387549mO) this).A05 = list2;
        } else if (this instanceof C387529mM) {
            C387529mM r1 = (C387529mM) this;
            0qQ.A0B(r7, 0);
            C42141BIw bIw = r7.A0C;
            if (bIw == null || (list = bIw.A00) == null) {
                throw AnonymousClass7TE.A0z("CanvasTemplatesController: cannot set templates dial element without templates info.");
            }
            r1.A04 = list;
        } else if (!(this instanceof C387439mD) && !(this instanceof C387449mE) && !(this instanceof C387539mN) && !(this instanceof C387519mL)) {
            if (this instanceof C387469mG) {
                C39688A5e a5e = r7.A0B;
                a5e.getClass();
                ((C387469mG) this).A01 = a5e;
            } else if (this instanceof C387409mA) {
            } else {
                if (this instanceof C387479mH) {
                    C387479mH r12 = (C387479mH) this;
                    0qQ.A0B(r7, 0);
                    List A02 = r7.A02();
                    if (A02 != null) {
                        r12.A01 = A02;
                        return;
                    }
                    throw AnonymousClass7TE.A0y();
                } else if (this instanceof C387489mI) {
                    ((C387489mI) this).A01 = r7;
                } else if (this instanceof C387499mJ) {
                    C387499mJ r5 = (C387499mJ) this;
                    0qQ.A0B(r7, 0);
                    C45242Csx csx = r7.A0A;
                    if (csx != null) {
                        List list3 = csx.A00;
                        if (list3 != null) {
                            immutableList = ImmutableList.copyOf((Collection) list3);
                            0qQ.A07(immutableList);
                        } else {
                            0wb.A01.Ew0("javaClass", "empty media list");
                            immutableList = 0sn.A00;
                        }
                        List list4 = r5.A04;
                        if (list4 != null && list4.size() == immutableList.size()) {
                            int size = immutableList.size();
                            int i = 0;
                            while (i < size) {
                                if (0qQ.A0K(r5.A04.get(i), immutableList.get(i))) {
                                    i++;
                                }
                            }
                            return;
                        }
                        r5.A04 = immutableList;
                        r5.A02 = new SparseArray(immutableList.size());
                        return;
                    }
                    throw AnonymousClass7TE.A0y();
                } else if (this instanceof C387509mK) {
                    C45241Csw csw = r7.A09;
                    csw.getClass();
                    List list5 = csw.A00;
                    list5.getClass();
                    ((C387509mK) this).A06 = list5;
                } else if (!(this instanceof C387429mC) && (this instanceof C387559mP)) {
                    C387559mP r13 = (C387559mP) this;
                    UY8 uy8 = r7.A07;
                    uy8.getClass();
                    r13.A01 = uy8.A00();
                    r13.A02 = r7.A07.A03;
                }
            }
        }
    }

    public void A0B(C39889ADn aDn) {
        boolean z;
        boolean z2;
        boolean z3;
        if (this instanceof C387529mM) {
            C387529mM r0 = (C387529mM) this;
            0qQ.A0B(aDn, 0);
            z3 = true;
            aDn.A0D = true;
            aDn.A09 = ((DUJ) r0.A04.get(r0.A00)).C4Z();
            aDn.A0E = false;
        } else {
            if (!(this instanceof C387449mE)) {
                if (this instanceof C387549mO) {
                    aDn.A0E = false;
                    z3 = true;
                    aDn.A0D = true;
                } else if (!(this instanceof C387539mN)) {
                    if (this instanceof C387519mL) {
                        z2 = false;
                        aDn.A0E = z2;
                        aDn.A0C = z2;
                        z = true;
                        aDn.A0D = z;
                        return;
                    } else if (this instanceof C387499mJ) {
                        0qQ.A0B(aDn, 0);
                        z = true;
                        aDn.A0D = z;
                        return;
                    } else if (this instanceof C387509mK) {
                        z = C387509mK.A02((C387509mK) this);
                        aDn.A0D = z;
                        return;
                    } else {
                        return;
                    }
                }
            }
            z2 = false;
            0qQ.A0B(aDn, 0);
            aDn.A0E = z2;
            aDn.A0C = z2;
            z = true;
            aDn.A0D = z;
            return;
        }
        aDn.A0C = z3;
    }

    public void A0C(AnonymousClass80W r3) {
        if (this instanceof C387549mO) {
            r3.A04(new Object());
            ((C387549mO) this).A0B.A07();
        }
    }

    public void A0D(String str) {
        if (this instanceof C387549mO) {
            C387549mO r1 = (C387549mO) this;
            r1.A03 = null;
            r1.A0B.A07();
            r1.A06 = false;
            if (str.equals("@")) {
                str = "";
            }
            r1.A0E.EhX(str);
        }
    }

    public void A0E(boolean z) {
        AnonymousClass87H r1;
        AnonymousClass87H r0;
        AnonymousClass87H r12;
        if (this instanceof C387509mK) {
            C387509mK r02 = (C387509mK) this;
            if (!z) {
                r1 = r02.A0A;
            } else {
                return;
            }
        } else {
            if (this instanceof C387449mE) {
                C387449mE r2 = (C387449mE) this;
                if (!z && (r12 = r2.A04) != null) {
                    r12.A0F((BackgroundGradientColors) null);
                }
                r0 = r2.A04;
                if (r0 == null) {
                    return;
                }
            } else if (this instanceof C387549mO) {
                C387549mO r4 = (C387549mO) this;
                if (!z) {
                    r4.A0B.A0F((BackgroundGradientColors) null);
                }
                r4.A03 = null;
                r4.A06 = false;
                AnonymousClass87H r22 = r4.A0B;
                AnonymousClass87D.A00(r22.A00.A0F.A09).removeTextChangedListener(r4.A08);
                r4.A04.clear();
                r22.A06();
                r22.A0H((CharSequence) null);
                r22.A0I((CharSequence) null);
                return;
            } else if (this instanceof C387539mN) {
                C387539mN r23 = (C387539mN) this;
                if (!z) {
                    r23.A0B.A0F((BackgroundGradientColors) null);
                }
                r23.A03.clear();
                r0 = r23.A0B;
            } else if (this instanceof C387519mL) {
                C387519mL r24 = (C387519mL) this;
                if (!z) {
                    r24.A08.A0F((BackgroundGradientColors) null);
                }
                r24.A01.clear();
                r0 = r24.A08;
            } else if (this instanceof C387499mJ) {
                C387499mJ r03 = (C387499mJ) this;
                if (!z) {
                    r1 = r03.A09;
                } else {
                    return;
                }
            } else if (this instanceof C387429mC) {
                C387429mC r04 = (C387429mC) this;
                if (!z) {
                    r1 = r04.A01;
                } else {
                    return;
                }
            } else {
                return;
            }
            r0.A06();
            return;
        }
        r1.A0F((BackgroundGradientColors) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0016 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0F() {
        /*
            r4 = this;
            boolean r0 = r4 instanceof X.C387529mM
            if (r0 == 0) goto L_0x0018
            r1 = r4
            X.9mM r1 = (X.C387529mM) r1
            android.graphics.Bitmap r0 = r1.A01
            if (r0 == 0) goto L_0x0016
            X.87H r0 = r1.A08
            android.graphics.drawable.Drawable r0 = r0.A02()
            boolean r0 = r0 instanceof android.graphics.drawable.BitmapDrawable
        L_0x0013:
            r1 = 1
            if (r0 != 0) goto L_0x0017
        L_0x0016:
            r1 = 0
        L_0x0017:
            return r1
        L_0x0018:
            boolean r0 = r4 instanceof X.C387439mD
            if (r0 != 0) goto L_0x00cf
            boolean r0 = r4 instanceof X.C387449mE
            if (r0 != 0) goto L_0x00cf
            boolean r0 = r4 instanceof X.C387549mO
            if (r0 == 0) goto L_0x002e
            r1 = r4
            X.9mO r1 = (X.C387549mO) r1
            android.graphics.Bitmap r0 = r1.A01
            if (r0 == 0) goto L_0x0016
            boolean r0 = r1.A06
            goto L_0x0013
        L_0x002e:
            boolean r0 = r4 instanceof X.C387539mN
            if (r0 == 0) goto L_0x0043
            r1 = r4
            X.9mN r1 = (X.C387539mN) r1
            android.graphics.Bitmap r0 = r1.A00
            if (r0 == 0) goto L_0x0016
            boolean r0 = r1.A06
            if (r0 != 0) goto L_0x0016
            boolean r0 = r1.A05
            r1 = 1
            if (r0 == 0) goto L_0x0017
            goto L_0x0016
        L_0x0043:
            boolean r0 = r4 instanceof X.C387519mL
            if (r0 == 0) goto L_0x004f
            r0 = r4
            X.9mL r0 = (X.C387519mL) r0
            boolean r0 = r0.A02
            r1 = r0 ^ 1
            return r1
        L_0x004f:
            boolean r0 = r4 instanceof X.C387469mG
            if (r0 == 0) goto L_0x006f
            r0 = r4
            X.9mG r0 = (X.C387469mG) r0
            X.87H r1 = r0.A02
            android.graphics.drawable.Drawable r0 = r1.A02()
            boolean r0 = r0 instanceof X.C16149Upa
            if (r0 == 0) goto L_0x0016
            android.graphics.drawable.Drawable r0 = r1.A02()
            X.Upa r0 = (X.C16149Upa) r0
            if (r0 == 0) goto L_0x0016
            X.WaJ r0 = r0.A0H
            boolean r0 = X.C265894Ws.A03(r0)
            goto L_0x0013
        L_0x006f:
            boolean r0 = r4 instanceof X.C387409mA
            if (r0 != 0) goto L_0x00cf
            boolean r0 = r4 instanceof X.C387479mH
            if (r0 == 0) goto L_0x0083
            r0 = r4
            X.9mH r0 = (X.C387479mH) r0
            X.87H r0 = r0.A03
            android.graphics.drawable.Drawable r0 = r0.A02()
            boolean r1 = r0 instanceof X.C16150Upb
            return r1
        L_0x0083:
            boolean r0 = r4 instanceof X.C387489mI
            if (r0 == 0) goto L_0x0093
            r0 = r4
            X.9mI r0 = (X.C387489mI) r0
            X.87H r0 = r0.A02
            android.graphics.drawable.Drawable r0 = r0.A02()
            boolean r1 = r0 instanceof X.C389529pm
            return r1
        L_0x0093:
            boolean r0 = r4 instanceof X.C387499mJ
            if (r0 == 0) goto L_0x00af
            r3 = r4
            X.9mJ r3 = (X.C387499mJ) r3
            android.util.SparseArray r2 = r3.A02
            int r1 = r3.A00
            r0 = 0
            java.lang.Object r0 = r2.get(r1, r0)
            if (r0 == 0) goto L_0x0016
            X.87H r0 = r3.A09
            android.graphics.drawable.Drawable r0 = r0.A02()
            boolean r0 = r0 instanceof X.C369908vW
            goto L_0x0013
        L_0x00af:
            boolean r0 = r4 instanceof X.C387509mK
            if (r0 == 0) goto L_0x00d1
            r2 = r4
            X.9mK r2 = (X.C387509mK) r2
            X.1Xj r0 = r2.A05
            if (r0 == 0) goto L_0x00cf
            boolean r0 = r0.A5v()
            if (r0 == 0) goto L_0x00cf
            java.util.HashMap r1 = r2.A0C
            X.1Xj r0 = r2.A05
            java.lang.String r0 = r0.getId()
            boolean r0 = r1.containsKey(r0)
            r1 = 0
            if (r0 == 0) goto L_0x0017
        L_0x00cf:
            r1 = 1
            return r1
        L_0x00d1:
            boolean r0 = r4 instanceof X.C387429mC
            if (r0 != 0) goto L_0x00cf
            boolean r0 = r4 instanceof X.C387559mP
            if (r0 == 0) goto L_0x0016
            r0 = r4
            X.9mP r0 = (X.C387559mP) r0
            X.87H r1 = r0.A06
            android.graphics.drawable.Drawable r0 = r1.A02()
            boolean r0 = r0 instanceof X.C389629pw
            if (r0 == 0) goto L_0x0016
            android.graphics.drawable.Drawable r0 = r1.A02()
            X.9pw r0 = (X.C389629pw) r0
            if (r0 == 0) goto L_0x0016
            X.WaO r0 = r0.A00
            boolean r0 = X.C309186Xg.A01(r0)
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AA8.A0F():boolean");
    }

    /* JADX WARNING: type inference failed for: r2v1 */
    /* JADX WARNING: type inference failed for: r2v3, types: [boolean] */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0013 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0H() {
        /*
            r3 = this;
            boolean r0 = r3 instanceof X.C387549mO
            if (r0 == 0) goto L_0x0014
            r0 = r3
            X.9mO r0 = (X.C387549mO) r0
            java.util.List r0 = r0.A05
            r0.getClass()
        L_0x000c:
            int r0 = r0.size()
            r2 = 1
        L_0x0011:
            if (r0 <= r2) goto L_0x0052
            return r2
        L_0x0014:
            boolean r0 = r3 instanceof X.C387469mG
            if (r0 == 0) goto L_0x0023
            r0 = r3
            X.9mG r0 = (X.C387469mG) r0
            X.A5e r0 = r0.A01
            r0.getClass()
            java.util.List r0 = r0.A01
            goto L_0x000c
        L_0x0023:
            boolean r0 = r3 instanceof X.C387479mH
            if (r0 == 0) goto L_0x002d
            r0 = r3
            X.9mH r0 = (X.C387479mH) r0
            java.util.List r0 = r0.A01
            goto L_0x000c
        L_0x002d:
            boolean r0 = r3 instanceof X.C387489mI
            if (r0 == 0) goto L_0x003f
            r0 = r3
            X.9mI r0 = (X.C387489mI) r0
            X.87G r0 = r0.A01
            r0.getClass()
            java.util.List r0 = r0.A0I
            r0.getClass()
            goto L_0x000c
        L_0x003f:
            boolean r0 = r3 instanceof X.C387559mP
            if (r0 == 0) goto L_0x0052
            r1 = r3
            X.9mP r1 = (X.C387559mP) r1
            boolean r0 = r1.A02
            r2 = 1
            if (r0 != 0) goto L_0x0052
            java.util.List r0 = r1.A01
            int r0 = r0.size()
            goto L_0x0011
        L_0x0052:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AA8.A0H():boolean");
    }

    public boolean A0I() {
        if (this instanceof C387549mO) {
            return true;
        }
        return false;
    }

    public boolean A0J(Drawable drawable, AnonymousClass80W r5) {
        Object r2;
        C19477WaP waP;
        C19471WaJ waJ;
        if (this instanceof C387529mM) {
            return true;
        }
        if ((this instanceof C387439mD) || (this instanceof C387449mE)) {
            return false;
        }
        if (this instanceof C387549mO) {
            return true;
        }
        if ((this instanceof C387539mN) || (this instanceof C387519mL)) {
            return false;
        }
        if (this instanceof C387469mG) {
            C387469mG r1 = (C387469mG) this;
            if (!(drawable instanceof C16149Upa) || (waJ = ((C16149Upa) drawable).A0H) == null) {
                C39688A5e a5e = r1.A01;
                a5e.getClass();
                r2 = new AnonymousClass8T7(a5e.A00);
            } else {
                r2 = new AnonymousClass8T7(waJ);
            }
            r5.getClass();
        } else if (this instanceof C387409mA) {
            return true;
        } else {
            if (this instanceof C387479mH) {
                if (drawable instanceof C16150Upb) {
                    waP = ((C16152Upd) drawable).A0D;
                } else {
                    waP = null;
                }
                r2 = new AnonymousClass8TC(waP, false, false, false);
            } else if (this instanceof C387489mI) {
                r5.getClass();
                r2 = new AnonymousClass8T8((C389529pm) drawable);
            } else if ((this instanceof C387499mJ) || (this instanceof C387509mK)) {
                return true;
            } else {
                if ((this instanceof C387429mC) || !(this instanceof C387559mP)) {
                    return false;
                }
                if (!(drawable instanceof C389629pw)) {
                    return true;
                }
                r5.getClass();
                r2 = new AnonymousClass8TO(((C389629pw) drawable).A00);
            }
        }
        r5.A04(r2);
        return true;
    }

    public boolean A0K(AnonymousClass80W r3) {
        if (this instanceof C387469mG) {
            return AnonymousClass7TF.A1W(r3.A00.first, AnonymousClass80V.QUIZ_STICKER_COMPOSE);
        }
        if (this instanceof C387479mH) {
            0qQ.A0B(r3, 0);
            return AnonymousClass7TF.A1W(r3.A00.first, AnonymousClass80V.QUESTION_STICKER_COMPOSE);
        } else if (this instanceof C387489mI) {
            return AnonymousClass7TF.A1W(r3.A00.first, AnonymousClass80V.POLLING_STICKER_COMPOSE);
        } else {
            if (!(this instanceof C387559mP) || r3.A00.first != AnonymousClass80V.COUNTDOWN_STICKER_COMPOSE) {
                return false;
            }
            r3.A04(new Object());
            return true;
        }
    }
}
