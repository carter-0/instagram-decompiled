package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewManager;
import android.widget.AbsSeekBar;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.NumberPicker;
import android.widget.SeekBar;
import androidx.fragment.app.Fragment;
import com.bloks.components.bkavatareditorsparkavatarpreview.BKBloksAvatarEditorSparkAvatarPreviewRenderUnit;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import com.instagram.user.model.Product;

/* renamed from: X.Tpp  reason: case insensitive filesystem */
public abstract class C14097Tpp extends 2Th implements C251273mq {
    public C276544tV A00;
    public final long A01;

    public static Integer A01(C307786Rm r3, C276544tV r4, int i) {
        C276544tV A07 = r4.A07(i);
        if (A07 != null) {
            return Integer.valueOf(AnonymousClass6TP.A00(r3, A07, 0));
        }
        return null;
    }

    public final C251273mq A0I() {
        return this;
    }

    public final /* synthetic */ 2Ue D6k(int i) {
        return C246243eG.A00(this, i);
    }

    public C14097Tpp(C307786Rm r5, C276544tV r6) {
        super(AnonymousClass05K.A01);
        this.A01 = (long) r6.A03;
        this.A00 = r6;
        C244233ar[] r2 = {C244753bh.A00(new C14098Tpq(r5, this), this), C244753bh.A00(new C14099Tpr(r5, this), this)};
        int i = 0;
        do {
            A0D(r2[i]);
            i++;
        } while (i < 2);
    }

    public final long A0H() {
        return this.A01;
    }

    public View A0J(Context context) {
        if (this instanceof C15659UgP) {
            View A09 = DbU.A09(DbT.A0B(context), (ViewGroup) null, R.layout.mini_components_product_tile_name, false);
            A09.setTag(new C14850UCe(A09));
            return A09;
        } else if (this instanceof C15670Ugb) {
            return DbT.A0D(DbT.A0B(context), (ViewGroup) null, R.layout.survey_media_content_view, false);
        } else {
            if (this instanceof C15668UgZ) {
                C15668UgZ ugZ = (C15668UgZ) this;
                0qQ.A0B(context, 0);
                C307786Rm r3 = ugZ.A00;
                C19231WQm wQm = (C19231WQm) C307476Qg.A06(r3, ugZ.A01);
                View A08 = DbU.A08(LayoutInflater.from(context), R.layout.lightbox_cta_layout);
                if (wQm != null) {
                    Product product = wQm.A07;
                    0qQ.A0B(r3, 0);
                    UserSession A002 = C18182Vmw.A00(r3, C273654mx.A00(1326));
                    0Tu r32 = 0Tu.A05;
                    boolean A06 = 182.A06(r32, A002, 36313248408012628L);
                    boolean A062 = 182.A06(r32, A002, 2342156257621837654L);
                    if (A06 && !A062 && product.A04() && product.A0P) {
                        A08.setVisibility(0);
                        return C18680Vwd.A00(A08);
                    }
                }
                A08.setVisibility(8);
                return C18680Vwd.A00(A08);
            } else if (this instanceof C15449Ucz) {
                0qQ.A0B(context, 0);
                View A0A = DbU.A0A(LayoutInflater.from(context), (ViewGroup) null, R.layout.lightbox_story_video, false);
                A0A.setTag(new C19516Wb2(A0A));
                FrameLayout A003 = C18680Vwd.A00(A0A);
                0qQ.A0B(A003, 0);
                ((C15667UgY) this).A00 = A003;
                return A003;
            } else if (this instanceof C15448Ucy) {
                0qQ.A0B(context, 0);
                View A0A2 = DbU.A0A(LayoutInflater.from(context), (ViewGroup) null, R.layout.lightbox_feed_video, false);
                A0A2.setTag(new VWT(A0A2));
                ((C15667UgY) this).A00 = A0A2;
                return A0A2;
            } else if (this instanceof C15447Ucx) {
                C15447Ucx ucx = (C15447Ucx) this;
                View A0A3 = DbU.A0A(LayoutInflater.from(ucx.A00.A00), (ViewGroup) null, R.layout.lightbox_story_photo, false);
                A0A3.setTag(new C19515Wb1(A0A3));
                ucx.A00 = A0A3;
                return A0A3;
            } else if (this instanceof C15446Ucw) {
                0qQ.A0B(context, 0);
                View A0A4 = DbU.A0A(LayoutInflater.from(context), (ViewGroup) null, R.layout.lightbox_product_video, false);
                A0A4.setTag(new VYX(A0A4));
                ((C15667UgY) this).A00 = A0A4;
                return A0A4;
            } else if (this instanceof C15638Ug4) {
                0qQ.A0B(context, 0);
                View A092 = DbU.A09(LayoutInflater.from(context), (ViewGroup) null, R.layout.hero_carousel_try_in_ar, false);
                A092.setTag(new UDW(A092));
                return C18680Vwd.A00(A092);
            } else if (this instanceof C15666UgW) {
                0qQ.A0B(context, 0);
                return ((C15666UgW) this).A0O(context);
            } else {
                if (!(this instanceof C15665UgV) && !(this instanceof C15658UgO)) {
                    if (this instanceof C15661UgR) {
                        return DbT.A0C(LayoutInflater.from(context), (ViewGroup) null, R.layout.checker_tile);
                    }
                    if (this instanceof C15664UgU) {
                        return DbT.A0C(LayoutInflater.from(context), (ViewGroup) null, R.layout.product_tile_grid_item);
                    }
                    if (this instanceof C15663UgT) {
                        return DbT.A0C(LayoutInflater.from(context), (ViewGroup) null, R.layout.save_card_button);
                    }
                    if (!(this instanceof C15636Ug2) && !(this instanceof C15657UgN) && !(this instanceof C15656UgM) && !(this instanceof C15655UgL) && !(this instanceof C15654UgK) && !(this instanceof C14509TxV)) {
                        if (this instanceof C15653UgJ) {
                            return DbT.A0C(LayoutInflater.from(context), (ViewGroup) null, R.layout.guide_card);
                        }
                        if (!(this instanceof C15652UgI) && !(this instanceof C15662UgS) && !(this instanceof C15651UgH) && !(this instanceof C15650UgG) && !(this instanceof C15649UgF)) {
                            if (this instanceof C14626TzY) {
                                return new View(context);
                            }
                            if (!(this instanceof C15648UgE) && !(this instanceof C15647UgD) && !(this instanceof C15646UgC) && !(this instanceof C15645UgB) && !(this instanceof C15644UgA) && !(this instanceof C14618TzQ) && !(this instanceof C15643Ug9) && !(this instanceof C14612TzJ) && !(this instanceof C15642Ug8) && !(this instanceof C15669Uga) && !(this instanceof C15641Ug7) && !(this instanceof C15640Ug6) && !(this instanceof C15671Ugc) && (this instanceof C15639Ug5)) {
                                0qQ.A0B(context, 0);
                                return new U3I(context);
                            }
                        }
                    }
                }
                throw AnonymousClass00P.createAndThrow();
            }
        }
    }

    public void A0L(View view, C307786Rm r7, C276544tV r8, Object obj, Object obj2) {
        if (this instanceof C15665UgV) {
            C15665UgV ugV = (C15665UgV) this;
            ViewGroup viewGroup = (ViewGroup) view;
            C305866Jw r3 = ugV.A02;
            if (r3.A00 != null) {
                viewGroup.removeViewAt(viewGroup.getChildCount() - 1);
            }
            ugV.A01.A02(r3, "fragment_paused", false);
            r3.A01 = null;
            r3.A00 = null;
            viewGroup.setTag(R.id.bloks_video_config_tag, (Object) null);
        } else if (this instanceof C15670Ugb) {
            C15670Ugb ugb = (C15670Ugb) this;
            0qQ.A0B(view, 0);
            0qQ.A0B(r7, 1);
            0qQ.A0B(r8, 2);
            0hq r2 = (0hq) r7.A00(R.id.bloks_ig_fragment_manager);
            Fragment A0R = r2.A0R(ugb.A04);
            if (A0R != null) {
                0s1 r0 = new 0s1(r2);
                r0.A03(A0R);
                r0.A00();
                ugb.A01 = null;
                r8.A0P(31, 0);
            }
        } else if (this instanceof C15655UgL) {
            ((C299025uS) ((ViewGroup) view).getChildAt(0)).setRenderTree((C245663dH) null);
        } else if (this instanceof C14618TzQ) {
            ((X9E) view).setThumbScale(1.0f);
        } else if (this instanceof C15642Ug8) {
            AbsSeekBar absSeekBar = (AbsSeekBar) view;
            C17728Vcx vcx = (C17728Vcx) C307476Qg.A06(r7, r8);
            if (vcx != null) {
                absSeekBar.setThumb(vcx.A08);
                vcx.A0C = null;
                vcx.A0D = null;
                vcx.A07 = 0;
                vcx.A03 = 0;
                vcx.A00 = 0;
                vcx.A02 = 0;
                vcx.A05 = 0;
                vcx.A04 = 0;
                vcx.A06 = 0;
                vcx.A08 = null;
                vcx.A09 = null;
                vcx.A0A = null;
                vcx.A0B = null;
                return;
            }
            throw new RuntimeException("SliderController is null even though a controller is defined");
        } else if (this instanceof C15640Ug6) {
            C15173UTy uTy = (C15173UTy) view;
            0qQ.A0B(uTy, 0);
            uTy.A02.setRenderTree((C245663dH) null);
        } else if (this instanceof C15660UgQ) {
            C18521VtL vtL = ((C15660UgQ) this).A00;
            FrameLayout frameLayout = vtL.A0C;
            if (frameLayout.getWindowToken() != null) {
                Object systemService = vtL.A08.getSystemService("window");
                0qQ.A0C(systemService, AnonymousClass000.A00(14));
                ((ViewManager) systemService).removeView(frameLayout);
                vtL.A05 = false;
            }
            C299025uS r02 = vtL.A04;
            if (r02 != null) {
                r02.setRenderTree((C245663dH) null);
            }
            ViewGroup viewGroup2 = vtL.A02;
            if (viewGroup2 != null) {
                viewGroup2.removeView(vtL.A04);
            }
            vtL.A04 = null;
            vtL.A03 = C16478UvY.A05;
            Activity activity = vtL.A07;
            C18771W0t.A02(activity, vtL.A0F);
            C18771W0t.A01(activity, vtL.A0E);
        } else if (this instanceof C15637Ug3) {
            ViewGroup viewGroup3 = (ViewGroup) view;
            0qQ.A0B(viewGroup3, 0);
            0qQ.A0B(r7, 1);
            0qQ.A0B(r8, 2);
            if (viewGroup3.getChildCount() > 0) {
                View A002 = AnonymousClass046.A00(viewGroup3, 0);
                0qQ.A0C(A002, "null cannot be cast to non-null type com.bloks.components.bkcomponentaeparametricslider.ParametricSlider");
                ((SeekBar) A002).setOnSeekBarChangeListener((SeekBar.OnSeekBarChangeListener) null);
            }
            VUN vun = (VUN) C307476Qg.A06(r7, r8);
            if (vun != null) {
                vun.A02 = null;
                vun.A01 = null;
                vun.A00 = null;
            }
        } else if (this instanceof C15635Ug1) {
            ViewGroup viewGroup4 = (ViewGroup) view;
            0qQ.A0B(viewGroup4, 0);
            0qQ.A0B(r7, 1);
            0qQ.A0B(r8, 2);
            View childAt = viewGroup4.getChildAt(0);
            0qQ.A0C(childAt, "null cannot be cast to non-null type com.bloks.components.bkavatareditorverticalsplitpane.ResizingBloksRenderTreeHostView");
            C15167UTs uTs = (C15167UTs) childAt;
            View childAt2 = viewGroup4.getChildAt(1);
            0qQ.A0C(childAt2, "null cannot be cast to non-null type com.bloks.components.bkavatareditorverticalsplitpane.ResizingBloksRenderTreeHostView");
            C15167UTs uTs2 = (C15167UTs) childAt2;
            uTs.setRenderResult((C307996Sh) null, (C307786Rm) null);
            uTs2.setRenderResult((C307996Sh) null, (C307786Rm) null);
            uTs.A01 = 0;
            uTs.A00 = 0;
            C15167UTs.A00(uTs);
            uTs2.A01 = 0;
            uTs2.A00 = 0;
            C15167UTs.A00(uTs2);
            Object A06 = C307476Qg.A06(r7, r8);
            if (A06 != null) {
                ((VL1) A06).A00 = -1;
                return;
            }
            throw new IllegalStateException("Required value was null.");
        } else if (this instanceof BKBloksAvatarEditorSparkAvatarPreviewRenderUnit) {
            BKBloksAvatarEditorSparkAvatarPreviewRenderUnit bKBloksAvatarEditorSparkAvatarPreviewRenderUnit = (BKBloksAvatarEditorSparkAvatarPreviewRenderUnit) this;
            FrameLayout frameLayout2 = (FrameLayout) view;
            0qQ.A0B(frameLayout2, 0);
            0qQ.A0B(r7, 1);
            0qQ.A0B(r8, 2);
            if (182.A06(0Tu.A05, bKBloksAvatarEditorSparkAvatarPreviewRenderUnit.A04.A00, 2342160681439401405L)) {
                new Handler(r7.A00.getMainLooper()).postDelayed(new C20131Wlr(frameLayout2, bKBloksAvatarEditorSparkAvatarPreviewRenderUnit), 500);
            } else {
                bKBloksAvatarEditorSparkAvatarPreviewRenderUnit.A0P(frameLayout2);
            }
        }
    }

    public void A0M(View view, C307786Rm r7, C276544tV r8, Object obj, Object obj2) {
        1wn r2;
        1Ng r1;
        Class cls;
        String str;
        String str2;
        ImageView imageView;
        NumberPicker numberPicker;
        int i;
        if (this instanceof C14509TxV) {
            imageView = (ImageView) view;
            0qQ.A0B(imageView, 0);
        } else if (this instanceof C15655UgL) {
            ((RefreshableNestedScrollingParent) view).A07 = null;
            return;
        } else if (this instanceof C15659UgP) {
            return;
        } else {
            if (this instanceof C15662UgS) {
                C17565VaJ vaJ = ((C15662UgS) this).A00;
                WQT wqt = vaJ.A00;
                if (wqt != null) {
                    AnonymousClass1Nd.A00(vaJ.A05).A02(wqt, C2370836g.class);
                }
                vaJ.A00 = null;
                return;
            } else if (this instanceof C15665UgV) {
                2el A0D = C308206Td.A0D(r7);
                if (A0D != null) {
                    A0D.A05(view, AnonymousClass30Y.A07);
                    return;
                }
                return;
            } else if (this instanceof C14612TzJ) {
                ImageView imageView2 = (ImageView) view;
                0qQ.A0B(imageView2, 0);
                imageView2.clearColorFilter();
                return;
            } else if (this instanceof C15670Ugb) {
                return;
            } else {
                if (this instanceof C15668UgZ) {
                    AnonymousClass7TG.A1O(r7, r8);
                    C19231WQm wQm = (C19231WQm) C307476Qg.A06(r7, r8);
                    if (wQm != null) {
                        if (C308206Td.A00(r7).mView != null) {
                            AnonymousClass07Z viewLifecycleOwner = C308206Td.A00(r7).getViewLifecycleOwner();
                            if (!wQm.A08) {
                                wQm.A06.A02.A05(viewLifecycleOwner);
                            }
                        }
                        C308206Td.A0J(r7, wQm);
                        return;
                    }
                    return;
                } else if (this instanceof C15667UgY) {
                    C15667UgY ugY = (C15667UgY) this;
                    C18065Vkr vkr = ugY.A01;
                    if (vkr != null) {
                        vkr.A03("scroll");
                    }
                    ((C234372xl) ugY.A03.getValue()).stop();
                    return;
                } else if (this instanceof C15638Ug4) {
                    return;
                } else {
                    if (this instanceof C15666UgW) {
                        C15666UgW ugW = (C15666UgW) this;
                        ugW.A00 = null;
                        C18065Vkr vkr2 = ugW.A03;
                        if (vkr2 != null) {
                            vkr2.A03("scroll");
                            return;
                        }
                        return;
                    } else if (!(this instanceof C15658UgO) && !(this instanceof C15661UgR)) {
                        if (this instanceof C15664UgU) {
                            C15664UgU ugU = (C15664UgU) this;
                            if (ugU.A01 != null || ugU.A02 != null || ugU.A00 != null) {
                                UserSession A012 = 0Gl.A01(C308206Td.A0A(r7));
                                if (A012 == null) {
                                    str = C273654mx.A00(111);
                                    str2 = C273654mx.A00(464);
                                } else {
                                    1wn r22 = ugU.A01;
                                    if (r22 != null) {
                                        AnonymousClass1Nd.A00(A012).A02(r22, AnonymousClass3DT.class);
                                    }
                                    1wn r23 = ugU.A02;
                                    if (r23 != null) {
                                        AnonymousClass1Nd.A00(A012).A02(r23, WQP.class);
                                    }
                                    r2 = ugU.A00;
                                    if (r2 != null) {
                                        r1 = AnonymousClass1Nd.A00(A012);
                                        cls = WQM.class;
                                        r1.A02(r2, cls);
                                        return;
                                    }
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else if (this instanceof C15663UgT) {
                            C15663UgT ugT = (C15663UgT) this;
                            UserSession A013 = 0Gl.A01(C308206Td.A0A(r7));
                            if (A013 == null) {
                                str = "MiniBloksProductSaveButtonBinderUtils";
                                str2 = "Attempt to unbind product save button outside logged in user context";
                            } else {
                                1wn r24 = ugT.A01;
                                if (r24 != null) {
                                    AnonymousClass1Nd.A00(A013).A02(r24, AnonymousClass3DT.class);
                                }
                                r2 = ugT.A00;
                                if (r2 != null) {
                                    r1 = AnonymousClass1Nd.A00(A013);
                                    cls = WQP.class;
                                    r1.A02(r2, cls);
                                    return;
                                }
                                return;
                            }
                        } else {
                            if (!(this instanceof C15636Ug2)) {
                                if (this instanceof C15657UgN) {
                                    return;
                                }
                                if (this instanceof C15656UgM) {
                                    SeekBar seekBar = (SeekBar) view;
                                    C51973G9u.A1E(seekBar, r7, r8);
                                    Object A0V = C13988Tno.A0V(r7, r8);
                                    seekBar.setOnSeekBarChangeListener((SeekBar.OnSeekBarChangeListener) null);
                                    seekBar.setProgress(0);
                                    seekBar.setMin(0);
                                    seekBar.setMax(0);
                                    C17136VJl.A00.removeMessages(0, A0V);
                                    return;
                                } else if (this instanceof C15654UgK) {
                                    ((U4i) view).A05();
                                    VMC vmc = (VMC) C307476Qg.A06(r7, r8);
                                    if (vmc != null) {
                                        vmc.A00 = null;
                                        return;
                                    }
                                    return;
                                } else if (this instanceof C15653UgJ) {
                                    view.setOnClickListener((View.OnClickListener) null);
                                    return;
                                } else if (this instanceof C15652UgI) {
                                    ImageView imageView3 = (ImageView) view;
                                    0qQ.A0B(imageView3, 0);
                                    imageView3.setImageDrawable((Drawable) null);
                                    imageView3.setTag((Object) null);
                                    return;
                                } else if (this instanceof C15651UgH) {
                                    AnonymousClass7TG.A1T(view, r7, r8);
                                    view.setTag((Object) null);
                                    AnonymousClass4M3 r12 = ((C16384Uu1) C13988Tno.A0V(r7, r8)).A00;
                                    if (r12 != null) {
                                        r12.ECP("view_unbound");
                                        return;
                                    }
                                    return;
                                } else if (!(this instanceof C15650UgG) && !(this instanceof C15649UgF) && !(this instanceof C14626TzY) && !(this instanceof C15648UgE)) {
                                    if (this instanceof C15647UgD) {
                                        ((U4i) view).A05();
                                        return;
                                    } else if (!(this instanceof C15646UgC)) {
                                        if (this instanceof C15645UgB) {
                                            numberPicker = (NumberPicker) view;
                                            i = 0;
                                            0qQ.A0B(numberPicker, 0);
                                            numberPicker.setMinValue(0);
                                            numberPicker.setMaxValue(0);
                                        } else if (this instanceof C15644UgA) {
                                            C14719U4a u4a = (C14719U4a) view;
                                            0qQ.A0B(u4a, 0);
                                            u4a.setMaskBounds(new PointF(), new C17319VQy());
                                            return;
                                        } else if (this instanceof C14618TzQ) {
                                            ((X9E) view).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
                                            return;
                                        } else if (this instanceof C15643Ug9) {
                                            0qQ.A0B(view, 0);
                                            view.setBackground((Drawable) null);
                                            return;
                                        } else if (this instanceof C15642Ug8) {
                                            SeekBar seekBar2 = (SeekBar) view;
                                            C17728Vcx vcx = (C17728Vcx) C307476Qg.A06(r7, r8);
                                            if (vcx != null) {
                                                C18701Vx2.A00.removeMessages(0, vcx);
                                                seekBar2.setOnSeekBarChangeListener((SeekBar.OnSeekBarChangeListener) null);
                                                vcx.A01 = seekBar2.getProgress();
                                                seekBar2.setProgress(0);
                                                seekBar2.setEnabled(true);
                                                GradientDrawable gradientDrawable = vcx.A09;
                                                if (!(gradientDrawable == null || vcx.A0A == null || vcx.A0B == null)) {
                                                    gradientDrawable.clearColorFilter();
                                                    vcx.A0A.clearColorFilter();
                                                    vcx.A0B.clearColorFilter();
                                                }
                                                C18701Vx2.A01(vcx, vcx.A05);
                                                seekBar2.setMin(0);
                                                seekBar2.setMax(0);
                                                return;
                                            }
                                            throw new RuntimeException("SliderController is null even though a controller is defined");
                                        } else if (this instanceof C15669Uga) {
                                            SearchEditText searchEditText = (SearchEditText) view;
                                            0qQ.A0B(searchEditText, 0);
                                            ((C15669Uga) this).A00 = false;
                                            DbS.A1C(searchEditText);
                                            searchEditText.setOnTouchListener((View.OnTouchListener) null);
                                            searchEditText.A0C = null;
                                            return;
                                        } else if (this instanceof C15641Ug7) {
                                            view = C13988Tno.A0G((ViewGroup) view);
                                        } else if (this instanceof C15640Ug6) {
                                            C15173UTy uTy = (C15173UTy) view;
                                            0qQ.A0B(uTy, 0);
                                            WJo wJo = uTy.A01;
                                            wJo.A06();
                                            wJo.A0G = null;
                                            wJo.A0K = null;
                                            wJo.A0E = null;
                                            wJo.A0B = 0;
                                            wJo.A0C = 0;
                                            wJo.A0J.A0B(wJo);
                                            wJo.A0H.A0B(wJo);
                                            wJo.A0I.A0B(wJo);
                                            wJo.A08(AnonymousClass05K.A00);
                                            wJo.A07 = 4.0f;
                                            return;
                                        } else if (this instanceof C15671Ugc) {
                                            numberPicker = (NumberPicker) view;
                                            i = 0;
                                            0qQ.A0B(numberPicker, 0);
                                        } else if (!(this instanceof C15639Ug5) && !(this instanceof C15660UgQ)) {
                                            if (this instanceof C15637Ug3) {
                                                ViewGroup viewGroup = (ViewGroup) view;
                                                0qQ.A0B(viewGroup, 0);
                                                if (viewGroup.getChildCount() > 0) {
                                                    View A002 = AnonymousClass046.A00(viewGroup, 0);
                                                    0qQ.A0C(A002, "null cannot be cast to non-null type com.bloks.components.bkcomponentaeparametricslider.ParametricSlider");
                                                    ((SeekBar) A002).setOnSeekBarChangeListener((SeekBar.OnSeekBarChangeListener) null);
                                                    return;
                                                }
                                                return;
                                            } else if (this instanceof C15635Ug1) {
                                                ViewGroup viewGroup2 = (ViewGroup) view;
                                                0qQ.A0B(viewGroup2, 0);
                                                if (obj2 != null) {
                                                    View childAt = viewGroup2.getChildAt(1);
                                                    0qQ.A0C(childAt, "null cannot be cast to non-null type com.bloks.components.bkavatareditorverticalsplitpane.ResizingBloksRenderTreeHostView");
                                                    BottomSheetBehavior A014 = BottomSheetBehavior.A01(childAt);
                                                    0qQ.A07(A014);
                                                    A014.A0l.remove(obj2);
                                                    return;
                                                }
                                                return;
                                            } else {
                                                return;
                                            }
                                        } else {
                                            return;
                                        }
                                        numberPicker.setDisplayedValues((String[]) null);
                                        numberPicker.setValue(i);
                                        return;
                                    } else {
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            }
                            imageView = (ImageView) view;
                        }
                        1Kn.A02(str, str2);
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
        0qQ.A0B(imageView, 0);
        imageView.setImageDrawable((Drawable) null);
        imageView.setTag(R.id.image_request_callback, (Object) null);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setColorFilter((ColorFilter) null);
        imageView.setImageAlpha(255);
        imageView.setScaleX(1.0f);
    }

    public boolean A0N(C276544tV r5, C276544tV r6, Object obj, Object obj2) {
        if (this instanceof C15657UgN) {
            DbY.A1S(r5, r6);
            if (C276544tV.A00(r5, 36) == C276544tV.A00(r6, 36) && C276544tV.A00(r5, 35) == C276544tV.A00(r6, 35)) {
                return false;
            }
            return true;
        } else if (!(this instanceof C15651UgH)) {
            return DbW.A1a(C276674ti.A00());
        } else {
            AnonymousClass7TF.A1B(r5, 0, r6);
            if (!0mp.A0G(r5.A0E(), r6.A0E()) && r5.A0T(false) == r6.A0T(false) && !0mp.A0G(r5.A0G(), r6.A0G()) && r5.A02(45, 0.0f) == r6.A02(45, 0.0f) && r5.A02(44, 0.0f) == r6.A02(44, 0.0f)) {
                return false;
            }
            return true;
        }
    }

    public final /* synthetic */ boolean AFh() {
        return false;
    }

    public final /* synthetic */ 2Sd Bdg() {
        return C243983aS.A00;
    }

    public /* synthetic */ int E2z() {
        return 3;
    }

    public final /* synthetic */ Object Bdd() {
        return getClass();
    }

    /* JADX WARNING: type inference failed for: r5v2, types: [X.V4Z, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v11, types: [android.widget.LinearLayout, X.U52, android.view.View, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v18, types: [X.Vj5, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r13v21, types: [X.0r1, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x05c7, code lost:
        if (r14.isEmpty() != false) goto L_0x05c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0115, code lost:
        if (r1.A0R(58, false) != false) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:755:0x133b, code lost:
        if (r9.A0R(40, false) == false) goto L_0x133d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:1022:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:340:0x087a A[Catch:{ OutOfMemoryError -> 0x087c }] */
    /* JADX WARNING: Removed duplicated region for block: B:375:0x093c  */
    /* JADX WARNING: Removed duplicated region for block: B:386:0x09f1  */
    /* JADX WARNING: Removed duplicated region for block: B:387:0x09fb  */
    /* JADX WARNING: Removed duplicated region for block: B:634:0x1102  */
    /* JADX WARNING: Removed duplicated region for block: B:963:0x1923  */
    /* JADX WARNING: Removed duplicated region for block: B:969:0x1949  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A0K(android.view.View r41, X.C307786Rm r42, X.C276544tV r43, java.lang.Object r44) {
        /*
            r40 = this;
            r2 = r40
            r5 = r44
            r0 = r41
            boolean r4 = r2 instanceof X.C14509TxV
            r3 = r42
            r1 = r43
            if (r4 == 0) goto L_0x004a
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r7 = 0
            X.C51973G9u.A1E(r0, r3, r1)
            r2 = 36
            java.lang.String r8 = r1.A0K(r2)
            X.0lg r5 = X.C308206Td.A0A(r3)
            boolean r2 = r5 instanceof com.instagram.common.session.UserSession
            r4 = 0
            r11 = r4
            if (r2 == 0) goto L_0x0025
            r11 = r5
        L_0x0025:
            r10 = 0
            if (r8 == 0) goto L_0x1979
            if (r11 == 0) goto L_0x1979
            boolean r2 = com.facebook.endtoend.EndToEnd.isRunningEndToEndTest()
            if (r2 != 0) goto L_0x003d
            X.0Tu r2 = X.0Tu.A05
            r5 = 36313351487227805(0x8102cd0000079d, double:3.028047930428143E-306)
            boolean r2 = X.182.A06(r2, r11, r5)
            if (r2 == 0) goto L_0x1979
        L_0x003d:
            android.content.Context r2 = r3.A00     // Catch:{ IllegalArgumentException -> 0x0047 }
            android.graphics.drawable.Drawable r9 = X.C14091Tpi.A02(r2, r8)     // Catch:{ IllegalArgumentException -> 0x0047 }
            if (r9 == 0) goto L_0x18ec
            goto L_0x18eb
        L_0x0047:
            r9 = r4
            goto L_0x18ec
        L_0x004a:
            boolean r4 = r2 instanceof X.C15659UgP
            if (r4 == 0) goto L_0x0056
            X.AnonymousClass7TG.A1T(r0, r3, r1)
            X.C15659UgP.A00(r0, r3, r1)
        L_0x0054:
            r0 = 0
            return r0
        L_0x0056:
            boolean r4 = r2 instanceof X.C15655UgL
            if (r4 == 0) goto L_0x0084
            com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent r0 = (com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent) r0
            X.3dH r5 = (X.C245663dH) r5
            java.lang.Object r6 = X.C307476Qg.A06(r3, r1)
            X.WPp r6 = (X.C19209WPp) r6
            if (r6 == 0) goto L_0x115a
            r6.A00 = r0
            boolean r2 = r6.A01
            boolean r4 = r1.A0T(r2)
            r6.A01 = r4
            X.Wf6 r2 = new X.Wf6
            r2.<init>(r6, r3, r1)
            r0.A07 = r2
            r0.setRefreshing(r4)
            android.view.View r0 = X.C13988Tno.A0G(r0)
            X.5uS r0 = (X.C299025uS) r0
            r0.setRenderTree(r5)
            goto L_0x0054
        L_0x0084:
            boolean r4 = r2 instanceof X.C15662UgS
            if (r4 == 0) goto L_0x00f7
            X.UgS r2 = (X.C15662UgS) r2
            com.instagram.user.follow.FollowButton r0 = (com.instagram.user.follow.FollowButton) r0
            X.AnonymousClass7TG.A1T(r0, r3, r1)
            X.W12.A01(r1, r0)
            X.VaJ r6 = r2.A00
            com.instagram.user.model.User r4 = r6.A01
            java.lang.String r7 = r6.A02
            if (r4 == 0) goto L_0x00d0
            com.instagram.common.session.UserSession r2 = r2.A01
            X.W12.A00(r3, r1, r2, r0, r4)
        L_0x009f:
            com.instagram.user.model.User r4 = r6.A01
            if (r4 == 0) goto L_0x00ee
            X.WQT r3 = r6.A00
            if (r3 == 0) goto L_0x00b2
            com.instagram.common.session.UserSession r1 = r6.A05
            X.1Ng r2 = X.AnonymousClass1Nd.A00(r1)
            java.lang.Class<X.36g> r1 = X.C2370836g.class
            r2.A02(r3, r1)
        L_0x00b2:
            r1 = 0
            r6.A00 = r1
            X.4tV r2 = r6.A04
            X.6Rm r8 = r6.A03
            com.instagram.common.session.UserSession r1 = r6.A05
            X.WQT r7 = new X.WQT
            r9 = r2
            r10 = r1
            r11 = r0
            r12 = r4
            r7.<init>(r8, r9, r10, r11, r12)
            X.1Ng r1 = X.AnonymousClass1Nd.A00(r1)
            java.lang.Class<X.36g> r0 = X.C2370836g.class
            r1.A01(r7, r0)
            r6.A00 = r7
            goto L_0x0054
        L_0x00d0:
            if (r7 == 0) goto L_0x00e6
            X.441 r5 = X.AnonymousClass441.A02
            com.instagram.common.session.UserSession r4 = r2.A01
            r9 = 0
            X.FnG r2 = new X.FnG
            r8 = r2
            r10 = r3
            r11 = r1
            r12 = r6
            r13 = r0
            r14 = r4
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r5.A02(r4, r2, r7)
            goto L_0x009f
        L_0x00e6:
            java.lang.String r2 = "follow_missing_user"
            java.lang.String r1 = "Bloks Follow Button missing user data"
            X.0wb.A03(r2, r1)
            goto L_0x009f
        L_0x00ee:
            java.lang.String r1 = "follow_missing_user"
            java.lang.String r0 = "Bloks Follow Button missing user data"
            X.0wb.A03(r1, r0)
            goto L_0x0054
        L_0x00f7:
            boolean r4 = r2 instanceof X.C14618TzQ
            if (r4 == 0) goto L_0x01d0
            r8 = r2
            X.TzQ r8 = (X.C14618TzQ) r8
            r2 = 35
            r6 = 0
            boolean r7 = r1.A0R(r2, r6)
            r2 = 51
            boolean r2 = r1.A0R(r2, r6)
            r5 = 1
            if (r2 != 0) goto L_0x0117
            r2 = 58
            boolean r2 = r1.A0R(r2, r6)
            r15 = 0
            if (r2 == 0) goto L_0x0118
        L_0x0117:
            r15 = 1
        L_0x0118:
            X.4uI r14 = r1.A08()
            r4 = r0
            X.X9E r4 = (X.X9E) r4
            r4.setChecked(r7)
            boolean r2 = r1.A0T(r5)
            r0.setEnabled(r2)
            if (r15 != 0) goto L_0x012d
            if (r14 == 0) goto L_0x013c
        L_0x012d:
            X.TzT r2 = new X.TzT
            r9 = r2
            r10 = r0
            r11 = r8
            r12 = r3
            r13 = r1
            r16 = r7
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            r4.setOnCheckedChangeListener(r2)
        L_0x013c:
            android.content.Context r11 = r3.A00
            r0 = 40
            X.4tV r0 = r1.A07(r0)
            r15 = 0
            if (r0 != 0) goto L_0x01c6
            r12 = r15
        L_0x0148:
            r0 = 41
            java.lang.Integer r10 = A01(r3, r1, r0)
            r0 = 43
            java.lang.Integer r14 = A01(r3, r1, r0)
            r0 = 48
            java.lang.Integer r13 = A01(r3, r1, r0)
            r0 = 42
            java.lang.Integer r9 = A01(r3, r1, r0)
            r0 = 46
            java.lang.Integer r8 = A01(r3, r1, r0)
            r0 = 45
            java.lang.Integer r7 = A01(r3, r1, r0)
            r0 = 50
            java.lang.Integer r6 = A01(r3, r1, r0)
            r0 = 44
            java.lang.Integer r5 = A01(r3, r1, r0)
            r0 = 49
            java.lang.Integer r2 = A01(r3, r1, r0)
            if (r14 != 0) goto L_0x01be
            if (r9 != 0) goto L_0x01be
            if (r13 != 0) goto L_0x0185
            r13 = r12
        L_0x0185:
            if (r8 != 0) goto L_0x0188
            r8 = r10
        L_0x0188:
            android.content.res.ColorStateList r0 = X.C14620TzS.A00(r11, r12, r10, r13, r8)
            r4.setThumbTintList(r0)
        L_0x018f:
            if (r7 != 0) goto L_0x01b1
            if (r5 != 0) goto L_0x01b1
            if (r6 != 0) goto L_0x0196
            r6 = r12
        L_0x0196:
            if (r2 != 0) goto L_0x0199
            r2 = r10
        L_0x0199:
            android.content.res.ColorStateList r2 = X.C14620TzS.A01(r11, r12, r10, r6, r2)
            r0 = r4
            X.TzR r0 = (X.C14619TzR) r0
            androidx.appcompat.widget.SwitchCompat r0 = r0.A00
            r0.setTrackTintList(r2)
        L_0x01a5:
            r2 = 59
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r1.A02(r2, r0)
            r4.setThumbScale(r0)
            return r15
        L_0x01b1:
            android.content.res.ColorStateList r2 = X.C14620TzS.A01(r11, r7, r5, r6, r2)
            r0 = r4
            X.TzR r0 = (X.C14619TzR) r0
            androidx.appcompat.widget.SwitchCompat r0 = r0.A00
            r0.setTrackTintList(r2)
            goto L_0x01a5
        L_0x01be:
            android.content.res.ColorStateList r0 = X.C14620TzS.A00(r11, r14, r9, r13, r8)
            r4.setThumbTintList(r0)
            goto L_0x018f
        L_0x01c6:
            int r0 = X.AnonymousClass6TP.A00(r3, r0, r6)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
            goto L_0x0148
        L_0x01d0:
            boolean r4 = r2 instanceof X.C15642Ug8
            if (r4 == 0) goto L_0x0319
            r7 = r2
            X.Ug8 r7 = (X.C15642Ug8) r7
            android.widget.SeekBar r0 = (android.widget.SeekBar) r0
            java.lang.Object r6 = X.C307476Qg.A06(r3, r1)
            X.Vcx r6 = (X.C17728Vcx) r6
            if (r6 == 0) goto L_0x1216
            r9 = 0
            r0.setIndeterminate(r9)
            r0.setMin(r9)
            r2 = 50
            r8 = 1
            boolean r2 = r1.A0R(r2, r8)
            r0.setEnabled(r2)
            r2 = 2147483647(0x7fffffff, float:NaN)
            r0.setMax(r2)
            int r2 = r6.A01
            r0.setProgress(r2)
            r4 = 40
            android.util.SparseArray r2 = r1.A05
            int r2 = r2.indexOfKey(r4)
            if (r2 >= 0) goto L_0x030b
            X.4ta r2 = r1.A06
            java.lang.Object r2 = r2.A00()
            android.util.SparseArray r2 = (android.util.SparseArray) r2
            int r2 = r2.indexOfKey(r4)
            if (r2 >= 0) goto L_0x030b
            boolean r2 = r6.A0E
            if (r2 != 0) goto L_0x0220
            int r2 = r6.A0F
            r0.setProgress(r2)
            r6.A0E = r8
        L_0x0220:
            r2 = 38
            X.4uI r14 = r1.A0A(r2)
            r2 = 42
            X.4uI r15 = r1.A0A(r2)
            r2 = 41
            X.4uI r16 = r1.A0A(r2)
            android.graphics.drawable.Drawable r2 = r6.A08
            if (r2 != 0) goto L_0x02e7
            android.graphics.drawable.Drawable r2 = r0.getThumb()
            r6.A08 = r2
            android.graphics.drawable.Drawable r10 = r0.getProgressDrawable()
            android.graphics.drawable.LayerDrawable r10 = (android.graphics.drawable.LayerDrawable) r10
            if (r10 == 0) goto L_0x120e
            r2 = 16908288(0x1020000, float:2.387723E-38)
            android.graphics.drawable.Drawable r2 = r10.findDrawableByLayerId(r2)
            android.graphics.drawable.GradientDrawable r5 = X.C18701Vx2.A00(r2)
            r2 = 16908301(0x102000d, float:2.3877265E-38)
            android.graphics.drawable.Drawable r2 = r10.findDrawableByLayerId(r2)
            android.graphics.drawable.GradientDrawable r4 = X.C18701Vx2.A00(r2)
            r2 = 16908303(0x102000f, float:2.387727E-38)
            android.graphics.drawable.Drawable r2 = r10.findDrawableByLayerId(r2)
            android.graphics.drawable.GradientDrawable r2 = X.C18701Vx2.A00(r2)
            if (r5 == 0) goto L_0x1206
            if (r4 == 0) goto L_0x1206
            if (r2 == 0) goto L_0x1206
            r6.A09 = r5
            r6.A0A = r4
            r6.A0B = r2
            android.content.Context r2 = r3.A00
            android.util.DisplayMetrics r12 = X.AnonymousClass7TF.A0E(r2)
            android.content.res.Resources$Theme r5 = r2.getTheme()
            r4 = 1099956224(0x41900000, float:18.0)
            int r2 = r12.densityDpi
            float r2 = (float) r2
            r13 = 1126170624(0x43200000, float:160.0)
            float r2 = r2 / r13
            int r2 = X.AnonymousClass7TE.A05(r4, r2)
            float r2 = (float) r2
            int r2 = (int) r2
            r6.A03 = r2
            r10 = 16843818(0x101042a, float:2.3696546E-38)
            r4 = -16776961(0xffffffffff0000ff, float:-1.7014636E38)
            int r2 = X.C13989Tnp.A0C(r5, r10, r4)
            r6.A02 = r2
            r11 = 1073741824(0x40000000, float:2.0)
            int r2 = r12.densityDpi
            float r2 = (float) r2
            float r2 = r2 / r13
            int r2 = X.AnonymousClass7TE.A05(r11, r2)
            float r2 = (float) r2
            int r2 = (int) r2
            r6.A05 = r2
            int r2 = X.C13989Tnp.A0C(r5, r10, r4)
            r6.A04 = r2
            r4 = 16843817(0x1010429, float:2.3696543E-38)
            r2 = -7829368(0xffffffffff888888, float:NaN)
            int r2 = X.C13989Tnp.A0C(r5, r4, r2)
            r6.A06 = r2
            int r5 = r6.A03
            int r4 = r6.A02
            android.graphics.drawable.GradientDrawable r2 = new android.graphics.drawable.GradientDrawable
            r2.<init>()
            r2.setShape(r8)
            r2.setSize(r5, r5)
            r2.setColor(r4)
            r0.setThumb(r2)
            r0.setThumbOffset(r9)
            int r2 = r6.A05
            X.C18701Vx2.A01(r6, r2)
            int r4 = r6.A04
            android.graphics.PorterDuff$Mode r5 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.drawable.GradientDrawable r2 = r6.A0A
            if (r2 == 0) goto L_0x02de
            X.C51969G9p.A12(r5, r2, r4)
        L_0x02de:
            int r4 = r6.A06
            android.graphics.drawable.GradientDrawable r2 = r6.A09
            if (r2 == 0) goto L_0x02e7
            X.C51969G9p.A12(r5, r2, r4)
        L_0x02e7:
            r2 = 43
            X.4tV r2 = r1.A07(r2)
            if (r2 == 0) goto L_0x0308
            int r10 = X.AnonymousClass6TP.A00(r3, r2, r9)
        L_0x02f3:
            r2 = 48
            X.4tV r2 = r1.A07(r2)
            if (r2 == 0) goto L_0x0305
            int r5 = X.AnonymousClass6TP.A00(r3, r2, r9)
        L_0x02ff:
            int r11 = r6.A05
            r2 = 46
            goto L_0x1162
        L_0x0305:
            int r5 = r6.A06
            goto L_0x02ff
        L_0x0308:
            int r10 = r6.A04
            goto L_0x02f3
        L_0x030b:
            r2 = 0
            float r4 = r1.A02(r4, r2)
            r2 = 1325400064(0x4f000000, float:2.14748365E9)
            float r4 = r4 * r2
            int r2 = (int) r4
            r0.setProgress(r2)
            goto L_0x0220
        L_0x0319:
            boolean r4 = r2 instanceof X.C15641Ug7
            if (r4 == 0) goto L_0x0370
            r6 = r2
            X.Ug7 r6 = (X.C15641Ug7) r6
            com.instagram.common.ui.widget.zoomcontainer.SimpleZoomableViewContainer r0 = (com.instagram.common.ui.widget.zoomcontainer.SimpleZoomableViewContainer) r0
            r7 = 0
            android.view.View r5 = r0.getChildAt(r7)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            java.lang.String r14 = r1.A0F()
            java.lang.String r2 = r1.A0D()
            if (r2 != 0) goto L_0x0362
            android.widget.ImageView$ScaleType r9 = android.widget.ImageView.ScaleType.CENTER_CROP
        L_0x0335:
            r8 = 0
            r10 = r5
            r11 = r3
            r12 = r1
            r13 = r8
            r15 = r7
            X.C299185ui.A00(r8, r9, r10, r11, r12, r13, r14, r15)
            X.2xl r3 = new X.2xl
            r3.<init>(r0, r7)
            android.content.Context r1 = r5.getContext()
            X.3rc r2 = new X.3rc
            r2.<init>(r1)
            X.WBr r1 = new X.WBr
            r1.<init>(r7, r6, r2)
            r5.setOnTouchListener(r1)
            X.We5 r1 = new X.We5
            r1.<init>(r5, r6, r0, r3)
            java.util.Set r0 = r2.A01
            r0.add(r1)
            r3.start()
            return r8
        L_0x0362:
            android.widget.ImageView$ScaleType r9 = X.AnonymousClass6Su.A0A(r2)     // Catch:{ 3yO -> 0x0367 }
            goto L_0x0335
        L_0x0367:
            r4 = move-exception
            android.widget.ImageView$ScaleType r9 = android.widget.ImageView.ScaleType.CENTER_CROP
            java.lang.String r2 = "BKBloksComponentsZoomableImageBinderUtil"
            X.1Kn.A03(r2, r4)
            goto L_0x0335
        L_0x0370:
            boolean r4 = r2 instanceof X.C14612TzJ
            if (r4 == 0) goto L_0x038b
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r4 = 0
            X.C51973G9u.A1E(r0, r3, r1)
            r2 = 35
            X.4tV r1 = r1.A07(r2)
            if (r1 == 0) goto L_0x0054
            int r1 = X.AnonymousClass6TP.A00(r3, r1, r4)
            r0.setColorFilter(r1)
            goto L_0x0054
        L_0x038b:
            boolean r4 = r2 instanceof X.C14626TzY
            if (r4 == 0) goto L_0x03c2
            r7 = r2
            X.TzY r7 = (X.C14626TzY) r7
            r6 = 0
            X.0qQ.A0B(r3, r6)
            r2 = 2131428799(0x7f0b05bf, float:1.8479253E38)
            android.util.SparseArray r0 = r3.A01
            java.lang.Object r2 = r0.get(r2)
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            java.lang.String r5 = r1.A0D()
            r4 = 0
            if (r5 == 0) goto L_0x1948
            boolean r0 = r2 instanceof X.C262304De
            if (r0 == 0) goto L_0x1948
            boolean r0 = r2 instanceof X.AnonymousClass3M3
            if (r0 == 0) goto L_0x1948
            r0 = r2
            X.4De r0 = (X.C262304De) r0
            boolean r0 = r0.CcT()
            if (r0 != 0) goto L_0x121e
            java.lang.String r0 = "top"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x121e
            return r4
        L_0x03c2:
            boolean r4 = r2 instanceof X.C15665UgV
            if (r4 == 0) goto L_0x043d
            r8 = r2
            X.UgV r8 = (X.C15665UgV) r8
            com.instagram.ui.simplevideolayout.SimpleVideoLayout r0 = (com.instagram.ui.simplevideolayout.SimpleVideoLayout) r0
            X.4tV r1 = r8.A03
            java.lang.String r1 = r1.A0E()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0411
            X.6Jw r9 = r8.A02
            X.3v4 r1 = r9.A00
            if (r1 != 0) goto L_0x0411
            android.content.Context r7 = r8.A00
            r1 = 2131629847(0x7f0e1717, float:1.8887026E38)
            android.view.ViewStub r6 = new android.view.ViewStub
            r6.<init>(r7, r1)
            r1 = -2
            android.widget.FrameLayout$LayoutParams r5 = new android.widget.FrameLayout$LayoutParams
            r5.<init>(r1, r1)
            r1 = 81
            r5.gravity = r1
            android.content.res.Resources r2 = r7.getResources()
            r1 = 2131165498(0x7f07013a, float:1.7945215E38)
            int r4 = r2.getDimensionPixelSize(r1)
            int r1 = X.AnonymousClass7TH.A01(r7)
            r2 = 0
            r5.setMargins(r4, r2, r4, r1)
            r6.setLayoutParams(r5)
            X.3v4 r1 = new X.3v4
            r1.<init>(r6, r2)
            r9.A00 = r1
            r0.addView(r6)
        L_0x0411:
            X.6Jw r6 = r8.A02
            r6.A01 = r0
            X.6gL r5 = r8.A01
            r5.A01(r6)
            X.2el r3 = X.C308206Td.A0D(r3)
            r4 = 0
            if (r3 == 0) goto L_0x1948
            java.lang.String r1 = r6.A00()
            X.30a r2 = X.AnonymousClass30Y.A00(r6, r4, r1)
            X.WTz r1 = new X.WTz
            r1.<init>(r5)
            r2.A00(r1)
            X.C51967G9n.A0z(r0, r2, r3)
            r2 = 2131428813(0x7f0b05cd, float:1.8479281E38)
            X.OI0 r1 = r6.A02
            r0.setTag(r2, r1)
            return r4
        L_0x043d:
            boolean r4 = r2 instanceof X.C15657UgN
            if (r4 == 0) goto L_0x051f
            com.instagram.maps.ui.IgStaticMapView r0 = (com.instagram.maps.ui.IgStaticMapView) r0
            X.DbY.A1S(r0, r1)
            java.lang.String r2 = "bloks_map"
            com.facebook.android.maps.StaticMapView$StaticMapOptions r7 = new com.facebook.android.maps.StaticMapView$StaticMapOptions
            r7.<init>(r2)
            r9 = 36
            X.4tV r11 = r1.A07(r9)
            r8 = 35
            r6 = 0
            if (r11 == 0) goto L_0x0479
            int r3 = r11.A04
            r2 = 13405(0x345d, float:1.8784E-41)
            r10 = 38
            if (r3 == r2) goto L_0x04a4
            r2 = 13406(0x345e, float:1.8786E-41)
            if (r3 != r2) goto L_0x0479
            float r2 = r11.A02(r8, r6)
            double r4 = (double) r2
            float r2 = r11.A02(r9, r6)
            double r2 = (double) r2
            r7.A01(r4, r2)
            r2 = 1
            int r2 = r11.A03(r10, r2)
            r7.A03(r2)
        L_0x0479:
            java.util.List r1 = r1.A0N(r8)
            java.util.ArrayList r11 = X.DbV.A15(r1)
            java.util.Iterator r10 = r1.iterator()
        L_0x0485:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x0517
            java.lang.Object r2 = r10.next()
            X.4tV r2 = (X.C276544tV) r2
            float r1 = r2.A02(r8, r6)
            double r3 = (double) r1
            float r1 = r2.A02(r9, r6)
            double r1 = (double) r1
            com.facebook.android.maps.model.LatLng r5 = new com.facebook.android.maps.model.LatLng
            r5.<init>(r3, r1)
            r11.add(r5)
            goto L_0x0485
        L_0x04a4:
            r2 = 40
            float r5 = r11.A02(r2, r6)
            float r4 = r11.A02(r9, r6)
            float r3 = r11.A02(r8, r6)
            float r2 = r11.A02(r10, r6)
            android.graphics.RectF r11 = new android.graphics.RectF
            r11.<init>(r5, r4, r3, r2)
            float r2 = r11.top
            double r4 = (double) r2
            float r2 = r11.left
            double r2 = (double) r2
            com.facebook.android.maps.model.LatLng r10 = new com.facebook.android.maps.model.LatLng
            r10.<init>(r4, r2)
            float r2 = r11.bottom
            double r4 = (double) r2
            float r2 = r11.right
            double r2 = (double) r2
            com.facebook.android.maps.model.LatLng r11 = new com.facebook.android.maps.model.LatLng
            r11.<init>(r4, r2)
            r5 = 1
            com.facebook.android.maps.model.LatLng[] r2 = new com.facebook.android.maps.model.LatLng[]{r10, r11}
            java.util.List r3 = java.util.Arrays.asList(r2)
            boolean r2 = r3.isEmpty()
            if (r2 == 0) goto L_0x04e4
            r2 = 0
        L_0x04e1:
            r7.A0A = r2
            goto L_0x0479
        L_0x04e4:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.util.Iterator r11 = r3.iterator()
        L_0x04ed:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto L_0x050e
            java.lang.Object r4 = r11.next()
            com.facebook.android.maps.model.LatLng r4 = (com.facebook.android.maps.model.LatLng) r4
            r2 = 124(0x7c, float:1.74E-43)
            r10.append(r2)
            double r2 = r4.A00
            r10.append(r2)
            r2 = 44
            r10.append(r2)
            double r2 = r4.A01
            r10.append(r2)
            goto L_0x04ed
        L_0x050e:
            java.lang.String r2 = r10.toString()
            java.lang.String r2 = r2.substring(r5)
            goto L_0x04e1
        L_0x0517:
            r7.A05(r11)
            r0.setMapOptions(r7)
            goto L_0x0054
        L_0x051f:
            boolean r4 = r2 instanceof X.C15654UgK
            if (r4 == 0) goto L_0x058b
            r8 = r2
            X.UgK r8 = (X.C15654UgK) r8
            X.U4i r0 = (X.U4i) r0
            X.V3v r5 = (X.C16738V3v) r5
            if (r5 == 0) goto L_0x056b
            int r10 = r5.A01
            int r4 = r5.A00
            X.VRU r2 = r5.A02
            java.util.List r9 = r5.A03
            java.util.List r7 = r5.A04
            r6 = 0
            r0.A00 = r4
            r0.A01 = r10
            if (r2 == 0) goto L_0x0540
            X.U4i.A03(r2, r0)
        L_0x0540:
            if (r9 == 0) goto L_0x0564
            java.util.Iterator r5 = r9.iterator()
        L_0x0546:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x055f
            java.lang.Object r2 = r5.next()
            X.Vcy r2 = (X.C17729Vcy) r2
            X.U3X r4 = X.U4i.A02(r2, r6, r6, r0)
            X.U4i.A04(r4, r0)
            java.util.List r2 = r0.A0B
            r2.add(r4)
            goto L_0x0546
        L_0x055f:
            java.util.List r2 = r0.A0C
            r2.addAll(r9)
        L_0x0564:
            if (r7 == 0) goto L_0x056b
            java.util.List r2 = r0.A0E
            r2.addAll(r7)
        L_0x056b:
            X.4uI r2 = r1.A08()
            if (r2 == 0) goto L_0x057f
            X.WNz r5 = new X.WNz
            r5.<init>(r8, r3, r1, r2)
            r4 = 0
            X.WBs r2 = new X.WBs
            r2.<init>(r4, r5, r0, r4)
            r0.setOnTouchListener(r2)
        L_0x057f:
            java.lang.Object r1 = X.C307476Qg.A06(r3, r1)
            X.VMC r1 = (X.VMC) r1
            if (r1 == 0) goto L_0x123c
            r1.A00 = r0
            goto L_0x0054
        L_0x058b:
            boolean r4 = r2 instanceof X.C15647UgD
            if (r4 == 0) goto L_0x0650
            r7 = r2
            X.UgD r7 = (X.C15647UgD) r7
            X.U4i r0 = (X.U4i) r0
            X.V49 r5 = (X.V49) r5
            if (r5 == 0) goto L_0x0639
            boolean r2 = r5.A0D
            r0.A05 = r2
            boolean r2 = r5.A0C
            r0.A04 = r2
            boolean r2 = r5.A0E
            r0.A06 = r2
            int r6 = r5.A03
            int r4 = r5.A02
            X.VRU r2 = r5.A04
            java.util.List r12 = r5.A09
            java.util.List r11 = r5.A0A
            java.util.List r13 = r5.A07
            java.util.List r10 = r5.A0B
            java.util.List r14 = r5.A08
            java.util.List r9 = r5.A06
            r8 = 0
            r0.A00 = r4
            r0.A01 = r6
            if (r2 == 0) goto L_0x05c0
            X.U4i.A03(r2, r0)
        L_0x05c0:
            if (r14 == 0) goto L_0x05c9
            boolean r4 = r14.isEmpty()
            r2 = 0
            if (r4 == 0) goto L_0x05ca
        L_0x05c9:
            r2 = 1
        L_0x05ca:
            r6 = 0
            if (r2 != 0) goto L_0x05da
            java.lang.Object r2 = r14.get(r8)
            X.Vcy r2 = (X.C17729Vcy) r2
            X.U3X r2 = X.U4i.A02(r2, r6, r6, r0)
            X.U4i.A04(r2, r0)
        L_0x05da:
            if (r12 == 0) goto L_0x0627
            java.util.Iterator r15 = r12.iterator()
        L_0x05e0:
            boolean r2 = r15.hasNext()
            if (r2 == 0) goto L_0x0622
            java.lang.Object r14 = r15.next()
            X.Vcy r14 = (X.C17729Vcy) r14
            if (r13 == 0) goto L_0x0615
            boolean r2 = r13.isEmpty()
            if (r2 != 0) goto L_0x0615
            if (r10 == 0) goto L_0x0615
            boolean r2 = r10.isEmpty()
            if (r2 != 0) goto L_0x0615
            java.lang.Object r4 = r13.get(r8)
            X.Vcy r4 = (X.C17729Vcy) r4
            java.lang.Object r2 = r10.get(r8)
            X.Vcy r2 = (X.C17729Vcy) r2
            X.U3X r4 = X.U4i.A02(r14, r4, r2, r0)
            X.U4i.A04(r4, r0)
            java.util.List r2 = r0.A0B
            r2.add(r4)
            goto L_0x05e0
        L_0x0615:
            X.U3X r4 = X.U4i.A02(r14, r6, r6, r0)
            X.U4i.A04(r4, r0)
            java.util.List r2 = r0.A0B
            r2.add(r4)
            goto L_0x05e0
        L_0x0622:
            java.util.List r2 = r0.A0C
            r2.addAll(r12)
        L_0x0627:
            if (r11 == 0) goto L_0x062e
            java.util.List r2 = r0.A0E
            r2.addAll(r11)
        L_0x062e:
            if (r9 == 0) goto L_0x0635
            java.util.List r2 = r0.A0A
            r2.addAll(r9)
        L_0x0635:
            com.instagram.model.mediasize.SpritesheetInfo r2 = r5.A05
            r0.A03 = r2
        L_0x0639:
            X.4uI r2 = r1.A08()
            if (r2 == 0) goto L_0x0054
            X.WNy r4 = new X.WNy
            r4.<init>(r7, r3, r1, r2)
            r3 = 1
            r2 = 0
            X.WBs r1 = new X.WBs
            r1.<init>(r2, r4, r0, r3)
            r0.setOnTouchListener(r1)
            goto L_0x0054
        L_0x0650:
            boolean r4 = r2 instanceof X.C15640Ug6
            if (r4 == 0) goto L_0x0748
            X.UTy r0 = (X.C15173UTy) r0
            r2 = 0
            X.AnonymousClass7TF.A1H(r0, r3)
            r15 = 2
            X.0qQ.A0B(r1, r15)
            X.WJo r6 = r0.A01
            r6.A0G = r0
            r10 = 38
            r7 = 1082130432(0x40800000, float:4.0)
            float r4 = r1.A02(r10, r7)
            r6.A07 = r4
            r11 = 36
            float r4 = r1.A02(r11, r7)
            r6.A03 = r4
            r9 = 41
            X.4uI r17 = r1.A0A(r9)
            r13 = 0
            if (r17 == 0) goto L_0x0745
            X.6Tm r16 = X.AnonymousClass6Tm.A01
            X.IoC r4 = new X.IoC
            r14 = r4
            r18 = r3
            r19 = r1
            r14.<init>(r15, r16, r17, r18, r19)
        L_0x0689:
            r6.A0O = r4
            r7 = 42
            X.4tV r4 = r1.A07(r7)
            r12 = 0
            if (r4 == 0) goto L_0x069b
            int r8 = r4.A04
            r4 = 17026(0x4282, float:2.3859E-41)
            if (r8 != r4) goto L_0x069b
            r12 = 1
        L_0x069b:
            r6.A0Q = r12
            X.4tV r4 = r1.A07(r7)
            if (r4 == 0) goto L_0x0742
            boolean r4 = r4.A0R(r10, r2)
            if (r4 == 0) goto L_0x0742
            r8 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            android.graphics.drawable.ColorDrawable r4 = new android.graphics.drawable.ColorDrawable
            r4.<init>(r8)
        L_0x06b0:
            r6.A0D = r4
            X.4tV r4 = r1.A07(r7)
            r10 = 1048576000(0x3e800000, float:0.25)
            if (r4 == 0) goto L_0x06be
            float r10 = r4.A02(r11, r10)
        L_0x06be:
            X.4tV r8 = r1.A07(r7)
            r12 = 1061158912(0x3f400000, float:0.75)
            if (r8 == 0) goto L_0x06cc
            r4 = 35
            float r12 = r8.A02(r4, r12)
        L_0x06cc:
            r11 = 1065353216(0x3f800000, float:1.0)
            float r10 = X.C229632nm.A01(r10)
            r8 = 1132396544(0x437f0000, float:255.0)
            int r4 = X.AnonymousClass7TE.A06(r10, r8)
            r6.A0A = r4
            float r4 = X.C229632nm.A02(r12, r10, r11)
            int r8 = X.AnonymousClass7TE.A06(r4, r8)
            int r4 = r6.A0A
            int r8 = r8 - r4
            r6.A09 = r8
            X.4tV r4 = r1.A07(r7)
            if (r4 == 0) goto L_0x0740
            X.4uI r17 = r4.A0A(r9)
            if (r17 == 0) goto L_0x0740
            X.6Tm r16 = X.AnonymousClass6Tm.A01
            X.IoC r14 = new X.IoC
            r18 = r3
            r19 = r4
            r14.<init>(r15, r16, r17, r18, r19)
        L_0x06fe:
            r6.A0N = r14
            X.4tV r8 = r1.A07(r7)
            if (r8 == 0) goto L_0x073e
            r4 = 40
            X.4uI r17 = r8.A0A(r4)
            if (r17 == 0) goto L_0x073e
            X.6Tm r16 = X.AnonymousClass6Tm.A01
            X.IoC r14 = new X.IoC
            r18 = r3
            r19 = r8
            r14.<init>(r15, r16, r17, r18, r19)
        L_0x0719:
            r6.A0M = r14
            X.4tV r1 = r1.A07(r7)
            if (r1 == 0) goto L_0x073c
            X.4tV r1 = r1.A07(r7)
            if (r1 == 0) goto L_0x073c
            int r1 = X.AnonymousClass6TP.A00(r3, r1, r2)
        L_0x072b:
            r0.setBackgroundColor(r1)
            X.5uS r1 = r0.A02
            boolean r0 = r5 instanceof X.C245663dH
            if (r0 == 0) goto L_0x073a
            X.3dH r5 = (X.C245663dH) r5
        L_0x0736:
            r1.setRenderTree(r5)
            return r13
        L_0x073a:
            r5 = r13
            goto L_0x0736
        L_0x073c:
            r1 = 0
            goto L_0x072b
        L_0x073e:
            r14 = r13
            goto L_0x0719
        L_0x0740:
            r14 = r13
            goto L_0x06fe
        L_0x0742:
            r4 = 0
            goto L_0x06b0
        L_0x0745:
            r4 = r13
            goto L_0x0689
        L_0x0748:
            boolean r4 = r2 instanceof X.C15660UgQ
            if (r4 == 0) goto L_0x0a0d
            r4 = r2
            X.UgQ r4 = (X.C15660UgQ) r4
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r3 = 0
            int r18 = X.DbW.A02(r3, r0, r1)
            java.lang.String r2 = "null cannot be cast to non-null type com.facebook.rendercore.RenderResult<*, *>"
            X.0qQ.A0C(r5, r2)
            X.6Sh r5 = (X.C307996Sh) r5
            X.VtL r2 = r4.A00
            android.view.ViewGroup r4 = r2.A02
            if (r4 != 0) goto L_0x0765
            r2.A02 = r0
        L_0x0765:
            X.3dH r5 = r5.A01
            X.5uS r4 = r2.A04
            if (r4 != 0) goto L_0x0774
            android.content.Context r0 = r2.A08
            X.5uS r4 = new X.5uS
            r4.<init>(r0)
            r2.A04 = r4
        L_0x0774:
            r4.setRenderTree(r5)
            r0 = 41
            r6 = 0
            float r5 = r1.A02(r0, r6)
            int r0 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x08b4
            r4 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x087f
            int r0 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x08b4
            int r0 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x087f
            X.5uS r11 = r2.A04
            if (r11 == 0) goto L_0x1244
            X.UvY r6 = r2.A03
            X.UvY r4 = X.C16478UvY.A04
            if (r6 == r4) goto L_0x0963
            boolean r0 = r6 instanceof X.UFZ
            if (r0 != 0) goto L_0x0963
            boolean r0 = r6 instanceof X.UFY
            if (r0 != 0) goto L_0x0963
            android.app.Activity r0 = r2.A07
            r19 = r0
            X.UvY r17 = X.C16478UvY.A02
            r0 = r17
            boolean r16 = X.AnonymousClass7TF.A1W(r6, r0)
            r0 = r19
            X.0qQ.A0B(r0, r3)
            r10 = 1
            int r6 = r11.getWidth()     // Catch:{ OutOfMemoryError -> 0x087c }
            int r0 = r11.getHeight()     // Catch:{ OutOfMemoryError -> 0x087c }
            android.graphics.Bitmap r15 = X.AnonymousClass7TF.A0B(r6, r0)     // Catch:{ OutOfMemoryError -> 0x087c }
            r0 = r18
            int[] r0 = new int[r0]     // Catch:{ OutOfMemoryError -> 0x087c }
            r11.getLocationInWindow(r0)     // Catch:{ OutOfMemoryError -> 0x087c }
            r9 = r0[r3]     // Catch:{ OutOfMemoryError -> 0x087c }
            r8 = r0[r10]     // Catch:{ OutOfMemoryError -> 0x087c }
            int r7 = r11.getWidth()     // Catch:{ OutOfMemoryError -> 0x087c }
            int r7 = r7 + r9
            r6 = r0[r10]     // Catch:{ OutOfMemoryError -> 0x087c }
            int r0 = r11.getHeight()     // Catch:{ OutOfMemoryError -> 0x087c }
            int r6 = r6 + r0
            android.graphics.Rect r14 = new android.graphics.Rect     // Catch:{ OutOfMemoryError -> 0x087c }
            r14.<init>(r9, r8, r7, r6)     // Catch:{ OutOfMemoryError -> 0x087c }
            X.0r1 r13 = new X.0r1     // Catch:{ OutOfMemoryError -> 0x087c }
            r13.<init>()     // Catch:{ OutOfMemoryError -> 0x087c }
            X.W8A r12 = new X.W8A     // Catch:{ OutOfMemoryError -> 0x087c }
            r12.<init>(r15, r13)     // Catch:{ OutOfMemoryError -> 0x087c }
            if (r16 == 0) goto L_0x0836
            java.lang.Object r6 = X.SCV.A00     // Catch:{ OutOfMemoryError -> 0x087c }
            if (r6 != 0) goto L_0x07fb
            android.view.WindowManager r6 = r19.getWindowManager()     // Catch:{ OutOfMemoryError -> 0x087c }
            X.0qQ.A07(r6)     // Catch:{ OutOfMemoryError -> 0x087c }
            java.lang.String r0 = "mGlobal"
            java.lang.Object r6 = X.SCV.A00(r0, r6)     // Catch:{ OutOfMemoryError -> 0x087c }
            X.SCV.A00 = r6     // Catch:{ OutOfMemoryError -> 0x087c }
        L_0x07fb:
            if (r6 == 0) goto L_0x0836
            java.lang.String r0 = "mRoots"
            java.lang.Object r10 = X.SCV.A00(r0, r6)     // Catch:{ OutOfMemoryError -> 0x087c }
            boolean r0 = r10 instanceof java.util.ArrayList     // Catch:{ OutOfMemoryError -> 0x087c }
            if (r0 == 0) goto L_0x0836
            java.util.AbstractList r10 = (java.util.AbstractList) r10     // Catch:{ OutOfMemoryError -> 0x087c }
            if (r10 == 0) goto L_0x0836
            java.lang.String r0 = "mParams"
            java.lang.Object r9 = X.SCV.A00(r0, r6)     // Catch:{ OutOfMemoryError -> 0x087c }
            boolean r0 = r9 instanceof java.util.ArrayList     // Catch:{ OutOfMemoryError -> 0x087c }
            if (r0 == 0) goto L_0x0836
            java.util.AbstractList r9 = (java.util.AbstractList) r9     // Catch:{ OutOfMemoryError -> 0x087c }
            if (r9 == 0) goto L_0x0836
            int r16 = r9.size()     // Catch:{ OutOfMemoryError -> 0x087c }
            r8 = 0
            r7 = 0
        L_0x081f:
            r0 = r16
            if (r7 >= r0) goto L_0x0842
            java.lang.Object r0 = r9.get(r7)     // Catch:{ OutOfMemoryError -> 0x087c }
            android.view.WindowManager$LayoutParams r0 = (android.view.WindowManager.LayoutParams) r0     // Catch:{ OutOfMemoryError -> 0x087c }
            int r0 = r0.type     // Catch:{ OutOfMemoryError -> 0x087c }
            r6 = r0
            r0 = 99
            if (r6 != r0) goto L_0x0831
            goto L_0x0834
        L_0x0831:
            int r7 = r7 + 1
            goto L_0x081f
        L_0x0834:
            r8 = r7
            goto L_0x0842
        L_0x0836:
            android.view.Window r6 = r19.getWindow()     // Catch:{ OutOfMemoryError -> 0x087c }
            android.os.Handler r0 = r11.getHandler()     // Catch:{ OutOfMemoryError -> 0x087c }
            android.view.PixelCopy.request(r6, r14, r15, r12, r0)     // Catch:{ OutOfMemoryError -> 0x087c }
            goto L_0x0876
        L_0x0842:
            java.lang.Object r6 = r10.get(r8)     // Catch:{ OutOfMemoryError -> 0x087c }
            if (r6 == 0) goto L_0x0836
            java.lang.String r0 = "mSurface"
            java.lang.Object r7 = X.SCV.A00(r0, r6)     // Catch:{ OutOfMemoryError -> 0x087c }
            boolean r0 = r7 instanceof android.view.Surface     // Catch:{ OutOfMemoryError -> 0x087c }
            if (r0 == 0) goto L_0x0836
            android.view.Surface r7 = (android.view.Surface) r7     // Catch:{ OutOfMemoryError -> 0x087c }
            if (r7 == 0) goto L_0x0836
            java.lang.Object r6 = X.DbZ.A0g(r9, r8)     // Catch:{ OutOfMemoryError -> 0x087c }
            java.lang.String r0 = "surfaceInsets"
            java.lang.Object r8 = X.SCV.A00(r0, r6)     // Catch:{ OutOfMemoryError -> 0x087c }
            boolean r0 = r8 instanceof android.graphics.Rect     // Catch:{ OutOfMemoryError -> 0x087c }
            if (r0 == 0) goto L_0x086f
            android.graphics.Rect r8 = (android.graphics.Rect) r8     // Catch:{ OutOfMemoryError -> 0x087c }
            if (r8 == 0) goto L_0x086f
            int r6 = r8.left     // Catch:{ OutOfMemoryError -> 0x087c }
            int r0 = r8.top     // Catch:{ OutOfMemoryError -> 0x087c }
            r14.offset(r6, r0)     // Catch:{ OutOfMemoryError -> 0x087c }
        L_0x086f:
            android.os.Handler r0 = r11.getHandler()     // Catch:{ OutOfMemoryError -> 0x087c }
            android.view.PixelCopy.request(r7, r14, r15, r12, r0)     // Catch:{ OutOfMemoryError -> 0x087c }
        L_0x0876:
            boolean r0 = r13.A00     // Catch:{ OutOfMemoryError -> 0x087c }
            if (r0 == 0) goto L_0x0934
            goto L_0x0933
        L_0x087c:
            r15 = 0
            goto L_0x0934
        L_0x087f:
            X.UvY r0 = r2.A03
            X.UvY r4 = X.C16478UvY.A02
            if (r0 == r4) goto L_0x09dd
            r5 = -1
            r0 = -2
            android.widget.FrameLayout$LayoutParams r6 = new android.widget.FrameLayout$LayoutParams
            r6.<init>(r5, r0)
            r0 = 17
            r6.gravity = r0
            X.C18521VtL.A00(r2)
            android.view.ViewGroup r0 = r2.A0B
            android.view.ViewGroupOverlay r0 = r0.getOverlay()
            android.widget.ImageView r5 = r2.A0D
            r0.remove(r5)
            r0 = 0
            r5.setImageBitmap(r0)
            r2.A00 = r0
            X.5uS r0 = r2.A04
            if (r0 == 0) goto L_0x1249
            android.widget.FrameLayout r5 = r2.A0C
            r5.addView(r0, r6)
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r5.setBackgroundColor(r0)
            goto L_0x09db
        L_0x08b4:
            X.UvY r5 = r2.A03
            X.UvY r4 = X.C16478UvY.A03
            if (r5 == r4) goto L_0x09dd
            X.UvY r0 = X.C16478UvY.A05
            if (r5 != r0) goto L_0x08dd
            X.5uS r6 = r2.A04
            if (r6 == 0) goto L_0x09db
            android.view.ViewParent r0 = r6.getParent()
            if (r0 != 0) goto L_0x08cf
            android.view.ViewGroup r0 = r2.A02
            if (r0 == 0) goto L_0x08cf
            r0.addView(r6)
        L_0x08cf:
            X.WCI r5 = new X.WCI
            r5.<init>(r3, r6, r2)
            android.view.ViewTreeObserver r0 = r6.getViewTreeObserver()
            r0.addOnPreDrawListener(r5)
            goto L_0x09db
        L_0x08dd:
            android.app.Activity r5 = r2.A07
            boolean r0 = r2.A0F
            X.C18771W0t.A02(r5, r0)
            boolean r0 = r2.A0E
            X.C18771W0t.A01(r5, r0)
            android.view.ViewGroup r0 = r2.A0B
            android.view.ViewGroupOverlay r0 = r0.getOverlay()
            android.widget.ImageView r5 = r2.A0D
            r0.remove(r5)
            r0 = 0
            r5.setImageBitmap(r0)
            r2.A00 = r0
            boolean r0 = r2.A05
            if (r0 == 0) goto L_0x0918
            android.content.Context r5 = r2.A08
            java.lang.String r0 = "window"
            java.lang.Object r5 = r5.getSystemService(r0)
            r0 = 14
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r5, r0)
            android.view.ViewManager r5 = (android.view.ViewManager) r5
            android.widget.FrameLayout r0 = r2.A0C
            r5.removeView(r0)
            r2.A05 = r3
        L_0x0918:
            android.view.ViewGroup r6 = r2.A02
            if (r6 == 0) goto L_0x09db
            X.5uS r5 = r2.A04
            if (r5 == 0) goto L_0x124e
            android.view.ViewGroup$LayoutParams r0 = r2.A01
            if (r0 != 0) goto L_0x092e
            java.lang.String r0 = "initialLayoutParams"
            X.0qQ.A0F(r0)
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x092e:
            r6.addView(r5, r0)
            goto L_0x09db
        L_0x0933:
            r15 = 0
        L_0x0934:
            r2.A00 = r15
            X.UvY r6 = r2.A03
            X.UvY r0 = X.C16478UvY.A03
            if (r6 != r0) goto L_0x09fb
            android.view.ViewGroup$LayoutParams r0 = r11.getLayoutParams()
            X.0qQ.A07(r0)
            r2.A01 = r0
            android.view.ViewGroup r0 = r2.A02
            if (r0 == 0) goto L_0x094c
            r0.removeView(r11)
        L_0x094c:
            android.view.ViewGroup r7 = r2.A0B
            android.view.ViewGroupOverlay r0 = r7.getOverlay()
            r0.clear()
            android.widget.ImageView r6 = r2.A0D
            android.graphics.Bitmap r0 = r2.A00
            r6.setImageBitmap(r0)
            android.view.ViewGroupOverlay r0 = r7.getOverlay()
            r0.add(r6)
        L_0x0963:
            android.graphics.Bitmap r0 = r2.A00
            if (r0 == 0) goto L_0x09ba
            android.graphics.RectF r11 = r2.A0A
            android.graphics.RectF r10 = r2.A09
            android.graphics.RectF r0 = X.C18771W0t.A00
            r0 = 1
            X.0qQ.A0B(r11, r0)
            r0 = r18
            X.0qQ.A0B(r10, r0)
            float r6 = r11.left
            float r0 = r10.left
            float r9 = X.C13988Tno.A00(r0, r6, r5)
            float r6 = r11.top
            float r0 = r10.top
            float r8 = X.C13988Tno.A00(r0, r6, r5)
            float r6 = r11.right
            float r0 = r10.right
            float r7 = X.C13988Tno.A00(r0, r6, r5)
            float r6 = r11.bottom
            float r0 = r10.bottom
            float r0 = X.C13988Tno.A00(r0, r6, r5)
            android.graphics.RectF r6 = X.C18771W0t.A00
            r6.set(r9, r8, r7, r0)
            X.Vts r7 = X.C18540Vts.A02
            android.widget.ImageView r8 = r2.A0D
            float r0 = r6.left
            int r9 = X.AnonymousClass1GB.A01(r0)
            float r0 = r6.top
            int r10 = X.AnonymousClass1GB.A01(r0)
            float r0 = r6.right
            int r11 = X.AnonymousClass1GB.A01(r0)
            float r0 = r6.bottom
            int r12 = X.AnonymousClass1GB.A01(r0)
            r7.A00(r8, r9, r10, r11, r12)
        L_0x09ba:
            android.animation.ArgbEvaluator r7 = new android.animation.ArgbEvaluator
            r7.<init>()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r5 = r7.evaluate(r5, r6, r0)
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Int"
            int r5 = X.DbW.A04(r5, r0)
            X.C18521VtL.A00(r2)
            android.widget.FrameLayout r0 = r2.A0C
            r0.setBackgroundColor(r5)
        L_0x09db:
            r2.A03 = r4
        L_0x09dd:
            boolean r0 = r1.A0T(r3)
            r4 = r0 ^ 1
            r0 = 36
            boolean r0 = r1.A0R(r0, r3)
            r3 = r0 ^ 1
            X.UvY r1 = r2.A03
            X.UvY r0 = X.C16478UvY.A03
            if (r1 == r0) goto L_0x0054
            android.app.Activity r0 = r2.A07
            X.C18771W0t.A02(r0, r4)
            X.C18771W0t.A01(r0, r3)
            goto L_0x0054
        L_0x09fb:
            r0 = r17
            if (r6 != r0) goto L_0x094c
            android.widget.FrameLayout r0 = r2.A0C
            r0.removeView(r11)
            int r6 = r2.A06
            r0 = r19
            r0.setRequestedOrientation(r6)
            goto L_0x094c
        L_0x0a0d:
            boolean r4 = r2 instanceof com.bloks.components.bkavatareditorsparkavatarpreview.BKBloksAvatarEditorSparkAvatarPreviewRenderUnit
            if (r4 == 0) goto L_0x0a6e
            r10 = r2
            com.bloks.components.bkavatareditorsparkavatarpreview.BKBloksAvatarEditorSparkAvatarPreviewRenderUnit r10 = (com.bloks.components.bkavatareditorsparkavatarpreview.BKBloksAvatarEditorSparkAvatarPreviewRenderUnit) r10
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r9 = 0
            boolean r14 = X.AnonymousClass7TF.A1U(r9, r0, r3)
            r8 = 2
            X.0qQ.A0B(r1, r8)
            java.lang.String r2 = r1.A0J()
            if (r2 == 0) goto L_0x0a6b
            java.lang.String r23 = X.DbV.A12(r2)
            if (r23 == 0) goto L_0x0a6b
        L_0x0a2b:
            r4 = 0
            r26 = 0
            X.6Rx r15 = X.C307896Rx.A01(r3, r4, r4)
            r2 = 45
            X.4uI r5 = r1.A0A(r2)
            if (r5 == 0) goto L_0x0a68
            X.6Tm r2 = X.AnonymousClass6Tm.A01
            java.lang.Object r7 = X.C299275ur.A00(r15, r2, r5)
            boolean r2 = r7 instanceof java.util.Map
            if (r2 == 0) goto L_0x0a66
            java.util.Map r7 = (java.util.Map) r7
        L_0x0a46:
            if (r7 == 0) goto L_0x0a69
            java.lang.String r2 = "isPrewarmingEnabled"
            java.lang.Object r5 = r7.get(r2)
        L_0x0a4e:
            boolean r2 = r5 instanceof java.lang.Boolean
            if (r2 == 0) goto L_0x0a63
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            if (r5 == 0) goto L_0x0a63
            boolean r28 = r5.booleanValue()
        L_0x0a5a:
            boolean r2 = X.00l.A0W(r23)
            if (r2 == 0) goto L_0x1253
            if (r28 != 0) goto L_0x1253
            return r4
        L_0x0a63:
            r28 = 0
            goto L_0x0a5a
        L_0x0a66:
            r7 = r4
            goto L_0x0a46
        L_0x0a68:
            r7 = r4
        L_0x0a69:
            r5 = r4
            goto L_0x0a4e
        L_0x0a6b:
            java.lang.String r23 = ""
            goto L_0x0a2b
        L_0x0a6e:
            boolean r4 = r2 instanceof X.C15670Ugb
            if (r4 == 0) goto L_0x0b04
            r7 = r2
            X.Ugb r7 = (X.C15670Ugb) r7
            r0 = 2
            X.0qQ.A0B(r1, r0)
            X.4tV r0 = r7.A03
            java.lang.String r3 = r0.A0D()
            if (r3 == 0) goto L_0x0ae3
            X.0c5 r2 = X.0c9.A04     // Catch:{ IOException -> 0x0a98 }
            X.0eM r9 = r7.A06     // Catch:{ IOException -> 0x0a98 }
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r9)     // Catch:{ IOException -> 0x0a98 }
            X.0c9 r3 = r2.A01(r0, r3)     // Catch:{ IOException -> 0x0a98 }
            X.1Xv r2 = X.1Xj.A0h     // Catch:{ IOException -> 0x0a98 }
            r0 = 1
            r8 = 0
            X.1Xj r0 = r2.A0C(r3, r0, r8)     // Catch:{ IOException -> 0x0a98 }
            if (r0 == 0) goto L_0x0ae3
            goto L_0x0aa1
        L_0x0a98:
            r3 = move-exception
            java.lang.String r2 = "SurveyMediaContentRenderUnit"
            java.lang.String r0 = "Error deserializing Bloks survey media from JSON"
            X.0KC.A0G(r2, r0, r3)
            goto L_0x0ae3
        L_0x0aa1:
            java.lang.String r6 = r0.getId()
            if (r6 == 0) goto L_0x0ae3
            X.6Rm r2 = r7.A02
            X.0qQ.A0B(r2, r8)
            r0 = 2131428801(0x7f0b05c1, float:1.8479257E38)
            java.lang.Object r5 = r2.A00(r0)
            X.0hq r5 = (X.0hq) r5
            java.lang.String r4 = r7.A04
            androidx.fragment.app.Fragment r3 = r5.A0R(r4)
            if (r3 != 0) goto L_0x0ae1
            com.instagram.util.fragment.IgFragmentFactoryImpl.A00()
            X.F3W r2 = new X.F3W
            r2.<init>()
            r2.A0B = r6
            com.instagram.common.session.UserSession r0 = X.DbW.A0S(r9, r8)
            java.lang.String r0 = r0.A05
            r2.A0F = r0
            X.32F r3 = r2.A01()
            X.0s1 r2 = new X.0s1
            r2.<init>(r5)
            r0 = 2131433135(0x7f0b16af, float:1.8488047E38)
            r2.A0C(r3, r4, r0)
            r2.A00()
        L_0x0ae1:
            r7.A01 = r3
        L_0x0ae3:
            r0 = 31
            r3 = 0
            int r0 = r1.A03(r0, r3)
            if (r0 != 0) goto L_0x0af1
            r0 = 3000(0xbb8, float:4.204E-42)
            X.C15670Ugb.A00(r7, r0)
        L_0x0af1:
            androidx.fragment.app.Fragment r0 = r7.A01
            if (r0 == 0) goto L_0x0054
            X.0hq r2 = r0.getParentFragmentManager()
            X.U7z r1 = new X.U7z
            r1.<init>(r7, r3)
            r0 = 1
            r2.A0r(r1, r0)
            goto L_0x0054
        L_0x0b04:
            boolean r4 = r2 instanceof X.C15668UgZ
            if (r4 == 0) goto L_0x0b10
            X.AnonymousClass7TG.A1T(r0, r3, r1)
            X.C15668UgZ.A00(r0, r3, r1)
            goto L_0x0054
        L_0x0b10:
            boolean r4 = r2 instanceof X.C15667UgY
            if (r4 == 0) goto L_0x0b39
            r3 = r2
            X.UgY r3 = (X.C15667UgY) r3
            r1 = 0
            X.0qQ.A0B(r0, r1)
            X.1Xj r2 = r3.A0R()
            r1 = 1
            r3.A00 = r0
            X.0eM r0 = r3.A03
            java.lang.Object r0 = r0.getValue()
            X.2xl r0 = (X.C234372xl) r0
            r0.start()
            X.Vkr r0 = r3.A0T()
            r0.A00(r2)
            r3.A0U(r1)
            goto L_0x0054
        L_0x0b39:
            boolean r4 = r2 instanceof X.C15638Ug4
            if (r4 == 0) goto L_0x0b49
            r4 = r2
            X.Ug4 r4 = (X.C15638Ug4) r4
            boolean r2 = X.C51973G9u.A1b(r0, r3, r1)
            r4.A0O(r0, r3, r1, r2)
            goto L_0x0054
        L_0x0b49:
            boolean r4 = r2 instanceof X.C15666UgW
            if (r4 == 0) goto L_0x0b58
            X.UgW r2 = (X.C15666UgW) r2
            boolean r1 = X.AnonymousClass7TG.A1Z(r0, r3)
            r2.A0P(r0, r3, r1)
            goto L_0x0054
        L_0x0b58:
            boolean r4 = r2 instanceof X.C15658UgO
            if (r4 == 0) goto L_0x0b94
            r6 = r2
            X.UgO r6 = (X.C15658UgO) r6
            com.instagram.ui.widget.rangeseekbar.RangeSeekBar r0 = (com.instagram.ui.widget.rangeseekbar.RangeSeekBar) r0
            r2 = 40
            r5 = 0
            float r4 = r1.A02(r2, r5)
            r2 = 38
            float r2 = r1.A02(r2, r5)
            r0.A02(r4, r2)
            r2 = 42
            float r4 = r1.A02(r2, r5)
            r2 = 35
            float r2 = r1.A02(r2, r5)
            r0.setStartingRangeValue(r4)
            r0.setEndingRangeValue(r2)
            r2 = 41
            X.4uI r4 = r1.A0A(r2)
            if (r4 == 0) goto L_0x0054
            X.Wey r2 = new X.Wey
            r2.<init>(r6, r3, r1, r4)
            r0.A06 = r2
            goto L_0x0054
        L_0x0b94:
            boolean r4 = r2 instanceof X.C15661UgR
            if (r4 == 0) goto L_0x0bae
            r7 = r2
            X.UgR r7 = (X.C15661UgR) r7
            X.0lg r2 = X.C308206Td.A0A(r3)
            com.instagram.common.session.UserSession r23 = X.0Gl.A01(r2)
            r4 = 0
            if (r23 != 0) goto L_0x12f4
            java.lang.String r1 = "MiniBloksShoppingReconsiderationTileBinderUtils"
            java.lang.String r0 = "Attempt to render mini shopping reconsideration tile component outside logged in user context"
        L_0x0baa:
            X.1Kn.A02(r1, r0)
            return r4
        L_0x0bae:
            boolean r4 = r2 instanceof X.C15664UgU
            if (r4 == 0) goto L_0x0bcc
            X.UgU r2 = (X.C15664UgU) r2
            X.0lg r4 = X.C308206Td.A0A(r3)
            com.instagram.common.session.UserSession r6 = X.0Gl.A01(r4)
            r4 = 0
            if (r6 != 0) goto L_0x1573
            r0 = 111(0x6f, float:1.56E-43)
            java.lang.String r1 = X.C273654mx.A00(r0)
            r0 = 464(0x1d0, float:6.5E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            goto L_0x0baa
        L_0x0bcc:
            boolean r4 = r2 instanceof X.C15663UgT
            if (r4 == 0) goto L_0x0c0d
            r5 = r2
            X.UgT r5 = (X.C15663UgT) r5
            X.0lg r2 = X.C308206Td.A0A(r3)
            com.instagram.common.session.UserSession r7 = X.0Gl.A01(r2)
            java.lang.String r6 = "MiniBloksProductSaveButtonBinderUtils"
            r4 = 0
            if (r7 != 0) goto L_0x0be6
            java.lang.String r0 = "Attempt to render product save button outside logged in user context"
        L_0x0be2:
            X.1Kn.A02(r6, r0)
            return r4
        L_0x0be6:
            X.IfI r2 = new X.IfI
            r2.<init>(r0)
            r0.post(r2)
            androidx.fragment.app.Fragment r19 = X.C308206Td.A00(r3)
            X.WWq r10 = new X.WWq
            r10.<init>(r5, r3, r1)
            r2 = 2131440615(0x7f0b33e7, float:1.8503218E38)
            android.widget.ImageView r9 = X.DbU.A0F(r0, r2)
            r2 = 38
            X.4tV r2 = r1.A07(r2)
            if (r2 != 0) goto L_0x166f
            r0 = 998(0x3e6, float:1.398E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            goto L_0x0be2
        L_0x0c0d:
            boolean r4 = r2 instanceof X.C15636Ug2
            if (r4 == 0) goto L_0x0c5c
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            X.AnonymousClass7TG.A1N(r3, r1)
            android.net.Uri r2 = X.AnonymousClass6QD.A00(r3, r1)
            java.lang.String r13 = X.DbX.A0t(r2)
            java.lang.String r2 = r1.A0E()
            if (r2 != 0) goto L_0x0c54
            android.widget.ImageView$ScaleType r8 = android.widget.ImageView.ScaleType.CENTER_CROP
        L_0x0c26:
            r2 = 35
            X.4tV r4 = r1.A07(r2)
            r6 = 0
            if (r4 == 0) goto L_0x0c52
            r2 = 0
            int r5 = X.AnonymousClass6TP.A00(r3, r4, r2)
            if (r5 == 0) goto L_0x0c50
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_ATOP
            android.graphics.PorterDuffColorFilter r4 = new android.graphics.PorterDuffColorFilter
            r4.<init>(r5, r2)
        L_0x0c3d:
            r2 = 44
            X.4uI r12 = r1.A0A(r2)
            r2 = 0
            boolean r14 = r1.A0T(r2)
            r7 = r4
            r9 = r0
            r10 = r3
            r11 = r1
            X.C299185ui.A00(r7, r8, r9, r10, r11, r12, r13, r14)
            return r6
        L_0x0c50:
            r4 = 0
            goto L_0x0c3d
        L_0x0c52:
            r4 = r6
            goto L_0x0c3d
        L_0x0c54:
            android.widget.ImageView$ScaleType r8 = X.AnonymousClass6Su.A0A(r2)     // Catch:{ 3yO -> 0x0c59 }
            goto L_0x0c26
        L_0x0c59:
            android.widget.ImageView$ScaleType r8 = android.widget.ImageView.ScaleType.CENTER_CROP
            goto L_0x0c26
        L_0x0c5c:
            boolean r4 = r2 instanceof X.C15656UgM
            if (r4 == 0) goto L_0x0c98
            android.widget.SeekBar r0 = (android.widget.SeekBar) r0
            r4 = 0
            X.C51973G9u.A1E(r0, r3, r1)
            java.lang.Object r5 = X.C13988Tno.A0V(r3, r1)
            r2 = 36
            int r2 = r1.A03(r2, r4)
            r0.setMax(r2)
            r2 = 38
            int r2 = r1.A03(r2, r4)
            r0.setMin(r2)
            r2 = 35
            int r2 = r1.A03(r2, r4)
            r0.setProgress(r2)
            r2 = 40
            X.4uI r2 = r1.A0A(r2)
            if (r2 == 0) goto L_0x0054
            r4 = 1
            X.WD8 r2 = new X.WD8
            r2.<init>(r4, r3, r5, r1)
            r0.setOnSeekBarChangeListener(r2)
            goto L_0x0054
        L_0x0c98:
            boolean r4 = r2 instanceof X.C15653UgJ
            if (r4 == 0) goto L_0x0d0c
            java.lang.Object r1 = X.C307476Qg.A06(r3, r1)
            X.VMB r1 = (X.VMB) r1
            if (r1 == 0) goto L_0x1803
            X.Cu1 r1 = r1.A00
            X.5u1 r1 = r1.A00
            androidx.fragment.app.FragmentActivity r29 = X.C308206Td.A03(r3)
            X.0lg r28 = X.C308206Td.A0A(r3)
            X.0iw r8 = X.C308206Td.A07(r3)
            android.content.Context r13 = r3.A00
            r3 = 2131430890(0x7f0b0dea, float:1.8483494E38)
            android.view.View r5 = r0.findViewById(r3)
            r4 = 0
            r6 = 0
            java.lang.String r3 = "IgGuideBinderUtils"
            if (r5 == 0) goto L_0x1757
            r7 = 2131100175(0x7f06020f, float:1.7812724E38)
            int r19 = r13.getColor(r7)
            int r7 = X.2Yu.A04(r13)
            int r21 = r13.getColor(r7)
            r15 = 1056964608(0x3f000000, float:0.5)
            r18 = 1058642330(0x3f19999a, float:0.6)
            r16 = 0
            r22 = 300(0x12c, double:1.48E-321)
            r7 = 2
            r14 = 1048576000(0x3e800000, float:0.25)
            r17 = 1045220557(0x3e4ccccd, float:0.2)
            X.JdE r12 = new X.JdE
            r24 = r6
            r25 = r6
            r26 = r6
            r27 = r6
            r20 = r6
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r24, r25, r26, r27)
            r5.setBackground(r12)
            X.BIR r11 = r1.A00
            if (r11 == 0) goto L_0x1776
            com.instagram.api.schemas.GuideMediaType r9 = r11.CAM()
            int r10 = r9.ordinal()
            r9 = 1
            if (r10 == r9) goto L_0x175d
            if (r10 == r7) goto L_0x1740
            if (r10 == r6) goto L_0x1776
            X.Wub r1 = new X.Wub
            r1.<init>()
            throw r1
        L_0x0d0c:
            boolean r4 = r2 instanceof X.C15652UgI
            if (r4 == 0) goto L_0x0d58
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            X.AnonymousClass7TG.A1T(r0, r3, r1)
            java.lang.Object r4 = X.C307476Qg.A06(r3, r1)
            X.VMA r4 = (X.VMA) r4
            if (r4 == 0) goto L_0x180b
            java.lang.String r3 = "cover"
            java.lang.String r2 = r1.A0D()     // Catch:{ 3yO -> 0x0d2e }
            if (r2 == 0) goto L_0x0d26
            r3 = r2
        L_0x0d26:
            android.widget.ImageView$ScaleType r2 = X.AnonymousClass6Su.A0A(r3)     // Catch:{ 3yO -> 0x0d2e }
            r0.setScaleType(r2)     // Catch:{ 3yO -> 0x0d2e }
            goto L_0x0d33
        L_0x0d2e:
            android.widget.ImageView$ScaleType r2 = android.widget.ImageView.ScaleType.CENTER_CROP
            r0.setScaleType(r2)
        L_0x0d33:
            X.U1T r2 = r4.A00
            if (r2 == 0) goto L_0x0d3c
            r0.setImageDrawable(r2)
            goto L_0x0054
        L_0x0d3c:
            r2 = 1
            X.Lrh r3 = new X.Lrh
            r3.<init>(r2, r0, r4)
            r0.setTag(r3)
            X.7Sw r2 = X.C331897Sw.A0A
            android.content.Context r0 = X.AnonymousClass7TE.A0S(r0)
            X.7Sw r2 = X.C331917Sy.A00(r0)
            java.lang.String r0 = r1.A0F()
            r2.A05(r3, r0)
            goto L_0x0054
        L_0x0d58:
            boolean r4 = r2 instanceof X.C15651UgH
            if (r4 == 0) goto L_0x0df9
            com.instagram.ui.simplevideolayout.SimpleVideoLayout r0 = (com.instagram.ui.simplevideolayout.SimpleVideoLayout) r0
            r2 = 0
            X.C51973G9u.A1E(r0, r3, r1)
            java.lang.Object r4 = X.C13988Tno.A0V(r3, r1)
            X.Uu1 r4 = (X.C16384Uu1) r4
            X.0lg r3 = X.C308206Td.A0A(r3)
            X.DbS.A1Z(r3)
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            android.content.Context r6 = r0.getContext()
            r9 = 0
            java.lang.String r5 = "bloks_video_component_binder"
            X.4M1 r6 = X.AnonymousClass4M0.A00(r6, r3, r9, r4, r5)
            r4.A00 = r6
            r8 = 0
            boolean r7 = r1.A0T(r2)
            java.lang.Integer r14 = X.AnonymousClass05K.A00
            java.lang.String r16 = ""
            java.lang.String r6 = r1.A0E()
            if (r6 == 0) goto L_0x0d8f
            r16 = r6
        L_0x0d8f:
            java.lang.String r19 = r1.A0G()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r7)
            java.lang.String r6 = r1.A0G()
            if (r6 == 0) goto L_0x0da3
            int r6 = r6.length()
            if (r6 != 0) goto L_0x0da4
        L_0x0da3:
            r8 = 1
        L_0x0da4:
            r38 = r8 ^ 1
            r30 = -1
            r28 = -1
            X.3WR r8 = new X.3WR
            r10 = r9
            r11 = r9
            r12 = r9
            r13 = r9
            r17 = r9
            r18 = r9
            r20 = r9
            r21 = r9
            r22 = r9
            r23 = r9
            r24 = r9
            r25 = r9
            r26 = r9
            r27 = r9
            r29 = r28
            r32 = r2
            r33 = r2
            r34 = r2
            r35 = r2
            r36 = r2
            r37 = r2
            r39 = r2
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r32, r33, r34, r35, r36, r37, r38, r39)
            X.3vO r6 = new X.3vO
            r6.<init>(r8, r5)
            r0.setTag(r6)
            X.WgN r2 = new X.WgN
            r10 = r2
            r11 = r4
            r12 = r1
            r13 = r0
            r14 = r8
            r15 = r6
            r10.<init>(r11, r12, r13, r14, r15)
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r6.A03 = r0
            X.3uP r0 = X.C255593uO.A00(r3)
            r0.A01(r6)
            return r9
        L_0x0df9:
            boolean r4 = r2 instanceof X.C15650UgG
            if (r4 == 0) goto L_0x0e15
            X.U3A r0 = (X.U3A) r0
            r1 = 0
            X.0qQ.A0B(r0, r1)
            android.animation.ValueAnimator r1 = r0.A01
            X.0qQ.A0A(r1)
            r1.cancel()
            android.animation.ValueAnimator r0 = r0.A01
            X.0qQ.A0A(r0)
        L_0x0e10:
            r0.start()
            goto L_0x0054
        L_0x0e15:
            boolean r4 = r2 instanceof X.C15649UgF
            if (r4 == 0) goto L_0x0e25
            X.528 r0 = (X.AnonymousClass528) r0
            r1 = 0
            X.0qQ.A0B(r0, r1)
            android.animation.ValueAnimator r0 = r0.A04
            r0.cancel()
            goto L_0x0e10
        L_0x0e25:
            boolean r4 = r2 instanceof X.C15648UgE
            if (r4 == 0) goto L_0x0e46
            com.instagram.ui.widget.bubblespinner.BubbleSpinner r0 = (com.instagram.ui.widget.bubblespinner.BubbleSpinner) r0
            r3 = 36
            r2 = 0
            float r4 = r1.A02(r3, r2)
            r3 = 35
            r2 = 0
            int r1 = r1.A03(r3, r2)
            r0.setBubbleRadius(r4)
            r0.setBubbleCount(r1)
            X.8YA r1 = X.AnonymousClass8YA.LOADING
            r0.setLoadingStatus(r1)
            goto L_0x0054
        L_0x0e46:
            boolean r4 = r2 instanceof X.C15646UgC
            if (r4 == 0) goto L_0x0efb
            X.U4P r0 = (X.U4P) r0
            r4 = 0
            X.C51973G9u.A1E(r0, r3, r1)
            r5 = 35
            java.util.List r1 = r1.A0M(r5)
            X.0qQ.A07(r1)
            java.util.ArrayList r7 = X.AnonymousClass7TG.A0r(r1)
            java.util.Iterator r8 = r1.iterator()
        L_0x0e61:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x0e97
            java.lang.Object r6 = r8.next()
            X.4tV r6 = (X.C276544tV) r6
            r2 = 38
            r1 = 0
            float r12 = r6.A02(r2, r1)
            java.lang.String r10 = r6.A0F()
            java.lang.String r11 = ""
            if (r10 != 0) goto L_0x0e7d
            r10 = r11
        L_0x0e7d:
            java.lang.String r1 = r6.A0I()
            if (r1 == 0) goto L_0x0e84
            r11 = r1
        L_0x0e84:
            int r13 = X.C13989Tnp.A0L(r3, r6, r5)
            r1 = 42
            int r14 = X.C13989Tnp.A0L(r3, r6, r1)
            X.VZD r9 = new X.VZD
            r9.<init>(r10, r11, r12, r13, r14)
            r7.add(r9)
            goto L_0x0e61
        L_0x0e97:
            X.U55 r6 = r0.A00
            java.util.List r5 = r6.A01
            r5.clear()
            r6.removeAllViews()
            java.util.Iterator r8 = r7.iterator()
        L_0x0ea5:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0054
            java.lang.Object r7 = r8.next()
            X.VZD r7 = (X.VZD) r7
            android.content.Context r2 = X.AnonymousClass7TE.A0S(r6)
            r1 = 1
            X.U52 r3 = new X.U52
            r3.<init>(r2)
            r0 = 80
            r3.setGravity(r0)
            X.JTP.A13(r3)
            r3.setOrientation(r1)
            int r2 = X.AnonymousClass7TG.A04(r2)
            int r1 = r3.getPaddingTop()
            int r0 = r3.getPaddingBottom()
            r3.setPadding(r2, r1, r2, r0)
            r2 = -1
            r1 = 1065353216(0x3f800000, float:1.0)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r0.<init>(r4, r2, r1)
            r3.setLayoutParams(r0)
            android.view.ViewParent r0 = r6.getParent()
            X.0qQ.A07(r0)
            r3.setViewModel(r7, r0)
            r1 = 24
            X.WBH r0 = new X.WBH
            r0.<init>((int) r1, (java.lang.Object) r3, (java.lang.Object) r6)
            r3.setOnClickListener(r0)
            r6.addView(r3)
            r5.add(r3)
            goto L_0x0ea5
        L_0x0efb:
            boolean r4 = r2 instanceof X.C15645UgB
            if (r4 == 0) goto L_0x0f54
            android.widget.NumberPicker r0 = (android.widget.NumberPicker) r0
            r4 = 0
            X.C51973G9u.A1E(r0, r3, r1)
            r2 = 42
            X.4uI r7 = r1.A0A(r2)
            r6 = 0
            if (r7 == 0) goto L_0x0f52
            r5 = 1
            X.WD3 r2 = new X.WD3
            r2.<init>(r5, r1, r3, r7)
        L_0x0f14:
            r0.setOnValueChangedListener(r2)
            r2 = 36
            int r2 = r1.A03(r2, r4)
            r0.setMinValue(r2)
            r2 = 35
            int r2 = r1.A03(r2, r4)
            r0.setMaxValue(r2)
            r2 = 41
            java.util.List r3 = r1.A0N(r2)
            X.0qQ.A07(r3)
            boolean r2 = X.AnonymousClass7TE.A1b(r3)
            if (r2 == 0) goto L_0x0f48
            java.lang.String[] r3 = X.DbU.A1b(r3, r4)
            r0.setMinValue(r4)
            int r2 = r3.length
            int r2 = r2 + -1
            r0.setMaxValue(r2)
            r0.setDisplayedValues(r3)
        L_0x0f48:
            r2 = 38
            int r1 = r1.A03(r2, r4)
            r0.setValue(r1)
            return r6
        L_0x0f52:
            r2 = r6
            goto L_0x0f14
        L_0x0f54:
            boolean r4 = r2 instanceof X.C15644UgA
            if (r4 == 0) goto L_0x0fb8
            X.U4a r0 = (X.C14719U4a) r0
            r9 = 0
            X.AnonymousClass7TF.A1B(r0, r9, r1)
            android.graphics.PointF r7 = new android.graphics.PointF
            r7.<init>()
            r10 = 36
            X.4tV r3 = r1.A07(r10)
            r8 = 35
            r6 = 0
            if (r3 == 0) goto L_0x0f7a
            float r2 = r3.A02(r8, r6)
            r7.x = r2
            float r2 = r3.A02(r10, r6)
            r7.y = r2
        L_0x0f7a:
            X.VQy r4 = new X.VQy
            r4.<init>()
            r2 = 38
            X.4tV r3 = r1.A07(r2)
            if (r3 == 0) goto L_0x0f93
            float r2 = r3.A02(r10, r6)
            r4.A01 = r2
            float r2 = r3.A02(r8, r6)
            r4.A00 = r2
        L_0x0f93:
            java.lang.String r2 = "null cannot be cast to non-null type com.facebook.rendercore.RenderTree"
            X.0qQ.A0C(r5, r2)
            X.3dH r5 = (X.C245663dH) r5
            android.view.View r3 = r0.getChildAt(r9)
            r2 = 717(0x2cd, float:1.005E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            X.0qQ.A0C(r3, r2)
            X.5uS r3 = (X.C299025uS) r3
            r3.setRenderTree(r5)
            r0.setMaskBounds(r7, r4)
            java.lang.String r1 = r1.A0I()
            r0.setMaskShape(r1)
            goto L_0x0054
        L_0x0fb8:
            boolean r4 = r2 instanceof X.C15643Ug9
            if (r4 == 0) goto L_0x1079
            X.AnonymousClass7TG.A1T(r0, r3, r1)
            java.lang.Object r2 = X.C13988Tno.A0V(r3, r1)
            X.Hqk r2 = (X.C55979Hqk) r2
            X.VkU r5 = r2.A00
            if (r5 == 0) goto L_0x1818
            r4 = 0
            r2 = 42
            X.4tV r11 = r1.A07(r2)
            r8 = 40
            r12 = 0
            r10 = 0
            if (r11 == 0) goto L_0x1070
            r2 = 35
            X.4tV r7 = r11.A07(r2)
            if (r7 == 0) goto L_0x106e
            r2 = 13314(0x3402, float:1.8657E-41)
            X.4tV r6 = new X.4tV
            r6.<init>(r2)
            X.1Kj r2 = X.C64361Kj.A00()
            X.4dW r2 = r2.A02
            android.graphics.drawable.Drawable r14 = r2.A00(r3, r7, r6)
        L_0x0fef:
            int r19 = X.C308136Sw.A00(r3, r11)
            float r17 = X.C16918VAv.A00(r11, r8)
            r2 = 46
            float r18 = X.C16918VAv.A00(r11, r2)
            android.content.Context r9 = r3.A00
            r2 = 52
            r7 = 0
            X.4tV r2 = r11.A07(r2)
            if (r2 == 0) goto L_0x100c
            int r7 = X.AnonymousClass6TP.A00(r3, r2, r4)
        L_0x100c:
            X.0qQ.A0A(r9)
            r2 = 58
            float r2 = r11.A02(r2, r10)
            float r6 = X.C18183Vmx.A00(r9, r2)
            r2 = 57
            float r2 = r11.A02(r2, r10)
            float r4 = X.C18183Vmx.A00(r9, r2)
            r2 = 59
            float r2 = r11.A02(r2, r10)
            float r2 = X.C18183Vmx.A00(r9, r2)
            X.VkP r15 = new X.VkP
            r15.<init>(r6, r4, r2, r7)
        L_0x1032:
            java.lang.String r7 = r1.A0K(r8)
            r1 = 3
            java.lang.Integer[] r6 = X.AnonymousClass05K.A00(r1)
            int r4 = r6.length
            r2 = 0
        L_0x103d:
            if (r2 >= r4) goto L_0x1813
            r16 = r6[r2]
            int r1 = r16.intValue()
            switch(r1) {
                case 1: goto L_0x1068;
                case 2: goto L_0x106b;
                default: goto L_0x1048;
            }
        L_0x1048:
            java.lang.String r1 = "default"
        L_0x104a:
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L_0x1065
            X.Vka r13 = new X.Vka
            r13.<init>(r14, r15, r16, r17, r18, r19)
            X.VkA r4 = new X.VkA
            r4.<init>(r13, r5)
            android.content.Context r2 = r3.A00
            X.U0y r1 = new X.U0y
            r1.<init>(r2, r4)
            r0.setBackground(r1)
            return r12
        L_0x1065:
            int r2 = r2 + 1
            goto L_0x103d
        L_0x1068:
            java.lang.String r1 = "shark-fin"
            goto L_0x104a
        L_0x106b:
            java.lang.String r1 = "none"
            goto L_0x104a
        L_0x106e:
            r14 = r12
            goto L_0x0fef
        L_0x1070:
            r14 = r12
            r15 = r12
            r19 = 0
            r17 = 0
            r18 = 0
            goto L_0x1032
        L_0x1079:
            boolean r4 = r2 instanceof X.C15669Uga
            if (r4 == 0) goto L_0x1091
            X.Uga r2 = (X.C15669Uga) r2
            com.instagram.ui.widget.searchedittext.SearchEditText r0 = (com.instagram.ui.widget.searchedittext.SearchEditText) r0
            X.AnonymousClass7TG.A1N(r0, r3)
            r1 = 0
            X.WC3.A00(r0, r1, r2)
            X.WfD r1 = new X.WfD
            r1.<init>(r2, r3, r0)
            r0.A0C = r1
            goto L_0x0054
        L_0x1091:
            boolean r4 = r2 instanceof X.C15639Ug5
            if (r4 != 0) goto L_0x0054
            boolean r4 = r2 instanceof X.C15637Ug3
            if (r4 == 0) goto L_0x1825
            r8 = r2
            X.Ug3 r8 = (X.C15637Ug3) r8
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r7 = 0
            X.C51973G9u.A1E(r0, r3, r1)
            java.lang.Object r6 = X.C307476Qg.A06(r3, r1)
            X.VUN r6 = (X.VUN) r6
            r4 = 43
            r2 = 0
            float r2 = r1.A02(r4, r2)
            java.lang.Float r13 = java.lang.Float.valueOf(r2)
            r2 = 40
            java.util.List r12 = r1.A0N(r2)
            r2 = 46
            java.util.List r11 = r1.A0N(r2)
            X.0qQ.A07(r11)
            r2 = 45
            boolean r10 = r1.A0R(r2, r7)
            r4 = 48
            r2 = 8
            int r9 = r1.A03(r4, r2)
            r4 = 0
            r2 = 50
            X.V4Z r5 = new X.V4Z
            r5.<init>()
            r5.A02 = r13
            r5.A04 = r12
            r5.A03 = r11
            r5.A05 = r10
            r5.A00 = r2
            r5.A01 = r9
            if (r6 == 0) goto L_0x10f1
            android.view.ViewTreeObserver$OnGlobalLayoutListener r2 = r6.A01
            if (r2 != 0) goto L_0x10fc
            X.WCC r2 = new X.WCC
            r2.<init>(r7, r8, r6, r0)
            r6.A01 = r2
        L_0x10f1:
            android.view.ViewTreeObserver r9 = r0.getViewTreeObserver()
            if (r6 == 0) goto L_0x1158
            android.view.ViewTreeObserver$OnGlobalLayoutListener r2 = r6.A01
        L_0x10f9:
            r9.addOnGlobalLayoutListener(r2)
        L_0x10fc:
            int r2 = r0.getChildCount()
            if (r2 <= 0) goto L_0x1948
            android.view.View r9 = X.AnonymousClass046.A00(r0, r7)
            java.lang.String r2 = "null cannot be cast to non-null type com.bloks.components.bkcomponentaeparametricslider.ParametricSlider"
            X.0qQ.A0C(r9, r2)
            X.U6C r9 = (X.U6C) r9
            r8.A01 = r9
            java.util.List r9 = r5.A04
            if (r6 == 0) goto L_0x1156
            X.V4Z r2 = r6.A02
            if (r2 == 0) goto L_0x1156
            java.util.List r2 = r2.A04
        L_0x1119:
            boolean r2 = X.0qQ.A0K(r9, r2)
            if (r2 != 0) goto L_0x1141
            java.lang.String r9 = "parametricSlider"
            if (r6 == 0) goto L_0x112e
            X.U6C r2 = r8.A01
            if (r2 == 0) goto L_0x114e
            int r0 = r0.getHeight()
            r2.A02(r6, r0)
        L_0x112e:
            java.lang.Float r0 = r5.A02
            if (r0 == 0) goto L_0x1141
            float r2 = r0.floatValue()
            r0 = 1120403456(0x42c80000, float:100.0)
            float r2 = r2 * r0
            int r2 = (int) r2
            X.U6C r0 = r8.A01
            if (r0 == 0) goto L_0x114e
            r0.setProgress(r2)
        L_0x1141:
            X.WD8 r2 = new X.WD8
            r2.<init>(r7, r3, r8, r1)
            r8.A00 = r2
            X.U6C r0 = r8.A01
            if (r0 != 0) goto L_0x181d
            java.lang.String r9 = "parametricSlider"
        L_0x114e:
            X.0qQ.A0F(r9)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x1156:
            r2 = r4
            goto L_0x1119
        L_0x1158:
            r2 = r4
            goto L_0x10f9
        L_0x115a:
            java.lang.String r1 = "PTR container defines a controller but none was found"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x1162:
            java.lang.String r4 = r1.A0K(r2)     // Catch:{ 3yO -> 0x116f }
            float r2 = (float) r11     // Catch:{ 3yO -> 0x116f }
            if (r4 == 0) goto L_0x116d
            float r2 = X.AnonymousClass6Su.A01(r4)     // Catch:{ 3yO -> 0x116f }
        L_0x116d:
            int r11 = (int) r2     // Catch:{ 3yO -> 0x116f }
            goto L_0x1176
        L_0x116f:
            java.lang.String r4 = "BKBloksComponentsSliderBinderUtil"
            java.lang.String r2 = "Error while parsing slider track height"
            X.1Kn.A02(r4, r2)
        L_0x1176:
            int r2 = r6.A05
            if (r11 == r2) goto L_0x117d
            X.C18701Vx2.A01(r6, r11)
        L_0x117d:
            int r2 = r6.A04
            if (r10 == r2) goto L_0x118a
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.SRC
            android.graphics.drawable.GradientDrawable r2 = r6.A0A
            if (r2 == 0) goto L_0x118a
            X.C51969G9p.A12(r4, r2, r10)
        L_0x118a:
            int r2 = r6.A06
            if (r5 == r2) goto L_0x1197
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.SRC
            android.graphics.drawable.GradientDrawable r2 = r6.A09
            if (r2 == 0) goto L_0x1197
            X.C51969G9p.A12(r4, r2, r5)
        L_0x1197:
            int r5 = r6.A03
            r2 = 45
            java.lang.String r4 = r1.A0K(r2)     // Catch:{ 3yO -> 0x11a8 }
            float r2 = (float) r5     // Catch:{ 3yO -> 0x11a8 }
            if (r4 == 0) goto L_0x11a6
            float r2 = X.AnonymousClass6Su.A01(r4)     // Catch:{ 3yO -> 0x11a8 }
        L_0x11a6:
            int r5 = (int) r2     // Catch:{ 3yO -> 0x11a8 }
            goto L_0x11af
        L_0x11a8:
            java.lang.String r4 = "BKBloksComponentsSliderBinderUtil"
            java.lang.String r2 = "Error while parsing slider thumb diameter"
            X.1Kn.A02(r4, r2)
        L_0x11af:
            r2 = 44
            X.4tV r2 = r1.A07(r2)
            if (r2 == 0) goto L_0x11f1
            int r4 = X.AnonymousClass6TP.A00(r3, r2, r9)
        L_0x11bb:
            int r2 = r6.A00
            if (r5 == r2) goto L_0x11ea
            android.graphics.drawable.GradientDrawable r2 = new android.graphics.drawable.GradientDrawable
            r2.<init>()
            r2.setShape(r8)
            r2.setSize(r5, r5)
        L_0x11ca:
            r2.setColor(r4)
            r0.setThumb(r2)
            r0.setThumbOffset(r9)
            r6.A00 = r5
            r0.setSplitTrack(r9)
            r0.setPadding(r9, r9, r9, r9)
            r0.refreshDrawableState()
            r4 = 0
            if (r14 != 0) goto L_0x11f4
            if (r15 != 0) goto L_0x11f4
            if (r16 != 0) goto L_0x11f4
            r6.A0D = r4
            r6.A0C = r4
            return r4
        L_0x11ea:
            android.graphics.drawable.Drawable r2 = r0.getThumb()
            android.graphics.drawable.GradientDrawable r2 = (android.graphics.drawable.GradientDrawable) r2
            goto L_0x11ca
        L_0x11f1:
            int r4 = r6.A02
            goto L_0x11bb
        L_0x11f4:
            r6.A0D = r1
            r6.A0C = r3
            X.WD9 r2 = new X.WD9
            r10 = r2
            r11 = r7
            r12 = r6
            r13 = r3
            r14 = r1
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r0.setOnSeekBarChangeListener(r2)
            return r4
        L_0x1206:
            java.lang.String r1 = "Track is not using the default Drawable"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x120e:
            java.lang.String r1 = "Track drawable is null"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x1216:
            java.lang.String r1 = "SliderController is null even though a controller is defined"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x121e:
            X.3M3 r2 = (X.AnonymousClass3M3) r2
            boolean r0 = r2.A08()
            if (r0 != 0) goto L_0x122f
            java.lang.String r0 = "bottom"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x122f
            return r4
        L_0x122f:
            androidx.fragment.app.FragmentActivity r2 = X.C308206Td.A03(r3)
            X.WfP r0 = new X.WfP
            r0.<init>(r7, r3, r1, r5)
            X.C226112fe.A00(r2, r0, r6)
            return r4
        L_0x123c:
            java.lang.String r1 = "A controller was specified for this component but none was found"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x1244:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x1249:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x124e:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            throw r1
        L_0x1253:
            java.util.UUID r2 = X.C16772V5f.A00()
            java.lang.String r24 = X.DbT.A10(r2)
            int r27 = r24.hashCode()
            r6 = 2131427338(0x7f0b000a, float:1.847629E38)
            java.lang.Object r2 = r0.getTag(r6)
            if (r2 != 0) goto L_0x126f
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r14)
            r0.setTag(r6, r2)
        L_0x126f:
            java.lang.Object r2 = r0.getTag(r6)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r16 = X.AnonymousClass7TG.A1X(r2)
            r12 = 2131427337(0x7f0b0009, float:1.8476287E38)
            java.lang.Object r5 = r0.getTag(r12)
            X.Vl1 r5 = (X.C18073Vl1) r5
            java.lang.String r13 = "PREWARMING"
            if (r28 == 0) goto L_0x12e1
            if (r16 == 0) goto L_0x12e1
            if (r5 != 0) goto L_0x12ab
            com.facebook.quicklog.QuickPerformanceLogger r11 = r10.A08
            r5 = 231933222(0xdd30526, float:1.3005118E-30)
            X.JwA r2 = new X.JwA
            r2.<init>((int) r5, (int) r8, (int) r14)
            X.0qQ.A0B(r11, r9)
            X.Vl1 r5 = new X.Vl1
            r5.<init>(r2, r11)
            r0.setTag(r12, r5)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r14)
            java.lang.String r2 = "isPrewarming"
            r5.A03(r2, r8)
            r5.A02(r13)
        L_0x12ab:
            r2 = 40
            r1.A0K(r2)
            if (r28 == 0) goto L_0x12c4
            if (r16 == 0) goto L_0x12c4
            boolean r2 = X.C51966G9m.A1X(r23)
            if (r2 == 0) goto L_0x12c4
            r5.A01(r13)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r9)
            r0.setTag(r6, r2)
        L_0x12c4:
            X.4Cq r8 = r10.A0G
            X.4CZ r6 = r10.A0E
            com.facebook.fbavatar.cdsavatareditor.liveediting.common.bloks.CommonSparkAvatarPreviewRenderUnit$bind$1 r2 = new com.facebook.fbavatar.cdsavatareditor.liveediting.common.bloks.CommonSparkAvatarPreviewRenderUnit$bind$1
            r16 = r2
            r17 = r0
            r18 = r10
            r19 = r5
            r20 = r3
            r21 = r15
            r22 = r1
            r25 = r7
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            X.1Eo.A05(r6, r2, r8)
            return r4
        L_0x12e1:
            com.facebook.quicklog.QuickPerformanceLogger r11 = r10.A08
            r5 = 231933222(0xdd30526, float:1.3005118E-30)
            X.JwA r2 = new X.JwA
            r2.<init>((int) r5, (int) r8, (int) r14)
            X.0qQ.A0B(r11, r9)
            X.Vl1 r5 = new X.Vl1
            r5.<init>(r2, r11)
            goto L_0x12ab
        L_0x12f4:
            X.UEO r20 = new X.UEO
            r2 = r20
            r2.<init>(r0)
            r5 = 0
            java.lang.Long r12 = java.lang.Long.valueOf(r5)
            r0 = 46
            X.4tV r9 = r1.A07(r0)
            r0 = 36
            if (r9 == 0) goto L_0x1482
            java.lang.String r30 = r9.A0D()
            long r5 = r9.A04(r0, r5)
            java.lang.Long r12 = java.lang.Long.valueOf(r5)
        L_0x1317:
            X.4tV r11 = r1.A07(r0)
            androidx.fragment.app.Fragment r22 = X.C308206Td.A00(r3)
            java.lang.String r19 = ""
            r8 = r4
            if (r9 == 0) goto L_0x132d
            r8 = r19
            java.lang.String r0 = r9.A0G()
            if (r0 == 0) goto L_0x132d
            r8 = r0
        L_0x132d:
            if (r11 != 0) goto L_0x147c
            r28 = r4
        L_0x1331:
            r2 = 40
            r0 = 0
            if (r9 == 0) goto L_0x133d
            boolean r5 = r9.A0R(r2, r0)
            r10 = 1
            if (r5 != 0) goto L_0x133e
        L_0x133d:
            r10 = 0
        L_0x133e:
            r9 = r19
            java.lang.String r5 = r1.A0I()
            if (r5 == 0) goto L_0x1347
            r9 = r5
        L_0x1347:
            X.WWk r6 = new X.WWk
            r6.<init>(r9)
            r5 = 44
            r25 = r19
            java.lang.String r9 = r1.A0K(r5)
            if (r9 == 0) goto L_0x1358
            r25 = r9
        L_0x1358:
            r26 = r19
            java.lang.String r9 = r1.A0G()
            if (r9 == 0) goto L_0x1362
            r26 = r9
        L_0x1362:
            java.lang.String r27 = r1.A0J()
            if (r11 != 0) goto L_0x1476
            r29 = r4
        L_0x136a:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            if (r8 == 0) goto L_0x1378
            r9 = r19
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto L_0x1379
        L_0x1378:
            r8 = r4
        L_0x1379:
            long r32 = r12.longValue()
            boolean r34 = r10.booleanValue()
            X.Wcy r18 = new X.Wcy
            r24 = r6
            r31 = r8
            r21 = r18
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r34)
            X.Wcz r8 = new X.Wcz
            r6 = r18
            r8.<init>(r7, r3, r1, r6)
            r13 = r19
            java.lang.String r6 = r1.A0I()
            if (r6 == 0) goto L_0x139c
            r13 = r6
        L_0x139c:
            X.Vgu r17 = new X.Vgu
            r9 = r17
            r10 = r22
            r11 = r23
            r12 = r8
            r14 = r28
            r15 = r34
            r9.<init>(r10, r11, r12, r13, r14, r15)
            X.0eM r6 = r9.A01
            java.lang.Object r10 = r6.getValue()
            X.JiR r10 = (X.C60270JiR) r10
            X.Lix r12 = r10.A01
            java.lang.String r13 = r10.A02
            X.05G r6 = r12.A0E(r13)
            X.JwC r8 = X.JTO.A0P(r6)
            java.lang.Object r6 = r8.A03
            X.Jw7 r6 = (X.C61069Jw7) r6
            boolean r6 = X.C60270JiR.A00(r6)
            if (r6 == 0) goto L_0x148c
            java.lang.Object r6 = r8.A02
            X.Jw7 r6 = (X.C61069Jw7) r6
            boolean r6 = X.C60270JiR.A00(r6)
            if (r6 == 0) goto L_0x148c
            java.lang.Object r6 = r8.A00
            X.Jw7 r6 = (X.C61069Jw7) r6
            if (r6 == 0) goto L_0x13e0
            boolean r6 = X.C60270JiR.A00(r6)
            if (r6 == 0) goto L_0x148c
        L_0x13e0:
            X.05G r5 = r12.A06
            r21 = r5
            java.lang.Object r5 = r21.getValue()
            X.Jw9 r5 = (X.C61071Jw9) r5
            boolean r5 = r5.A02
            if (r5 == 0) goto L_0x14bc
            X.UzF r14 = X.C16679UzF.CART
            r13 = 1
            X.UzF r11 = X.C16679UzF.WISH_LIST
            r10 = 2
            X.UzF r9 = X.C16679UzF.RECENTLY_VIEWED
            r8 = 3
            X.UzF[] r5 = new X.C16679UzF[]{r14, r11, r9, r4}
            X.0qQ.A0B(r5, r0)
            java.util.List r5 = X.03t.A0I(r5)
            java.util.Iterator r16 = r5.iterator()
        L_0x1406:
            boolean r5 = r16.hasNext()
            if (r5 == 0) goto L_0x14bc
            java.lang.Object r5 = r16.next()
            X.UzF r5 = (X.C16679UzF) r5
            int r5 = X.DbU.A02(r5, r0)
            if (r5 == r0) goto L_0x145a
            if (r5 == r13) goto L_0x144a
            if (r5 == r8) goto L_0x1439
            if (r5 != r10) goto L_0x1486
            r6 = r9
            X.0eM r5 = r12.A05
            java.lang.Object r5 = r5.getValue()
            X.05G r5 = (X.05G) r5
            X.JwC r5 = X.JTO.A0P(r5)
            java.lang.Object r5 = r5.A02
        L_0x142d:
            X.Jw7 r5 = (X.C61069Jw7) r5
            java.lang.Object r15 = r5.A02
            java.util.List r15 = (java.util.List) r15
        L_0x1433:
            r5 = r21
            X.C64835Lix.A0B(r6, r15, r5)
            goto L_0x1406
        L_0x1439:
            X.UzF r6 = X.C16679UzF.LIKED
            X.0eM r5 = r12.A05
            java.lang.Object r5 = r5.getValue()
            X.05G r5 = (X.05G) r5
            X.JwC r5 = X.JTO.A0P(r5)
            java.lang.Object r5 = r5.A01
            goto L_0x142d
        L_0x144a:
            r6 = r11
            X.0eM r5 = r12.A05
            java.lang.Object r5 = r5.getValue()
            X.05G r5 = (X.05G) r5
            X.JwC r5 = X.JTO.A0P(r5)
            java.lang.Object r5 = r5.A03
            goto L_0x142d
        L_0x145a:
            r6 = r14
            X.0eM r5 = r12.A05
            java.lang.Object r5 = r5.getValue()
            X.05G r5 = (X.05G) r5
            X.JwC r5 = X.JTO.A0P(r5)
            java.lang.Object r5 = r5.A00
            X.Jw7 r5 = (X.C61069Jw7) r5
            if (r5 == 0) goto L_0x1473
            java.lang.Object r15 = r5.A02
            java.util.List r15 = (java.util.List) r15
            if (r15 != 0) goto L_0x1433
        L_0x1473:
            X.0sn r15 = X.0sn.A00
            goto L_0x1433
        L_0x1476:
            java.lang.String r29 = r11.A0H()
            goto L_0x136a
        L_0x147c:
            java.lang.String r28 = r11.A0D()
            goto L_0x1331
        L_0x1482:
            r30 = r4
            goto L_0x1317
        L_0x1486:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x148c:
            X.6oS r11 = X.C318116oQ.A00(r10)
            r8 = 2
            X.MGB r6 = new X.MGB
            r6.<init>(r10, r4, r8, r0)
            X.19B r9 = X.19B.A00
            X.1Eo.A05(r9, r6, r11)
            X.6oS r11 = X.C318116oQ.A00(r10)
            r8 = 1
            X.MGB r6 = new X.MGB
            r6.<init>(r10, r4, r8, r0)
            X.1Eo.A05(r9, r6, r11)
            X.05G r6 = r12.A0E(r13)
            X.JwC r6 = X.JTO.A0P(r6)
            java.lang.Object r6 = r6.A00
            X.Jw7 r6 = (X.C61069Jw7) r6
            if (r6 == 0) goto L_0x1530
            boolean r6 = X.C60270JiR.A00(r6)
            if (r6 == 0) goto L_0x1530
        L_0x14bc:
            r17.A00()
            X.WSC r5 = r7.A00
            if (r5 != 0) goto L_0x156d
            android.content.Context r6 = r3.A00
            r11 = 35
            java.util.List r3 = r1.A0N(r11)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r14 = r3.iterator()
        L_0x14d4:
            boolean r3 = r14.hasNext()
            if (r3 == 0) goto L_0x153d
            java.lang.Object r9 = r14.next()
            X.4tV r9 = (X.C276544tV) r9
            r8 = 48
            X.4tV r3 = r9.A07(r8)
            if (r3 != 0) goto L_0x14ea
            r8 = 38
        L_0x14ea:
            X.4tV r8 = r9.A07(r8)
            if (r8 == 0) goto L_0x14d4
            com.instagram.model.mediasize.ImageInfoImpl r13 = new com.instagram.model.mediasize.ImageInfoImpl
            r21 = r13
            r22 = r4
            r23 = r4
            r24 = r4
            r25 = r4
            r26 = r4
            r21.<init>(r22, r23, r24, r25, r26)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r10 = r19
            java.lang.String r3 = r8.A0H()
            if (r3 == 0) goto L_0x150f
            r10 = r3
        L_0x150f:
            int r9 = r8.A03(r2, r0)
            int r8 = r8.A03(r11, r0)
            com.instagram.model.mediasize.ExtendedImageUrl r3 = new com.instagram.model.mediasize.ExtendedImageUrl
            r3.<init>(r10, r9, r8)
            r12.add(r3)
            com.instagram.model.mediasize.ImageInfo r3 = X.1iI.A06(r13, r12)
            com.instagram.model.mediasize.ImageInfoImpl r8 = r3.FEa()
            com.instagram.model.shopping.productimagecontainer.ProductImageContainerImpl r3 = new com.instagram.model.shopping.productimagecontainer.ProductImageContainerImpl
            r3.<init>(r8, r4)
            r5.add(r3)
            goto L_0x14d4
        L_0x1530:
            X.6oS r8 = X.C318116oQ.A00(r10)
            X.MGf r6 = new X.MGf
            r6.<init>(r10, r4, r5)
            X.1Eo.A05(r9, r6, r8)
            goto L_0x14bc
        L_0x153d:
            java.lang.String r12 = r1.A0K(r2)
            java.lang.String r13 = r1.A0H()
            java.lang.String r16 = r1.A0K(r2)
            X.Uz7 r10 = X.C16671Uz7.GRID
            java.lang.String r1 = r1.A0I()
            if (r1 == 0) goto L_0x1553
            r19 = r1
        L_0x1553:
            X.WWk r2 = new X.WWk
            r1 = r19
            r2.<init>(r1)
            java.lang.String r14 = "bloks"
            r8 = r6
            r9 = r2
            r11 = r18
            r15 = r14
            r17 = r5
            r18 = r0
            r19 = r0
            X.WSC r5 = X.C17094VHq.A00(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r7.A00 = r5
        L_0x156d:
            r1 = r20
            X.C18270Vok.A01(r1, r5, r0)
            return r4
        L_0x1573:
            X.Vj5 r5 = new X.Vj5
            r5.<init>()
            r2.A03 = r5
            java.lang.Object r9 = r0.getTag()
            X.UEM r9 = (X.UEM) r9
            r11 = 0
            if (r9 != 0) goto L_0x158b
            X.UEM r9 = new X.UEM
            r9.<init>(r0, r11)
            r0.setTag(r9)
        L_0x158b:
            r0 = 35
            X.4tV r0 = r1.A07(r0)
            if (r0 == 0) goto L_0x1948
            com.instagram.user.model.Product r0 = X.C18132Vm8.A01(r0)
            com.instagram.model.shopping.productfeed.ProductFeedItem r10 = new com.instagram.model.shopping.productfeed.ProductFeedItem
            r10.<init>(r0)
            com.instagram.model.shopping.productfeed.ProductTile r8 = r10.A02
            if (r8 == 0) goto L_0x1948
            r0 = 48
            java.lang.String r7 = r1.A0K(r0)
            r0 = 49
            java.lang.String r5 = r1.A0K(r0)
            com.instagram.api.schemas.RankingInfo r0 = new com.instagram.api.schemas.RankingInfo
            r0.<init>(r7, r5, r4)
            r8.A04 = r0
            X.Wd4 r14 = X.C18706VyX.A00(r3, r1, r6, r11)
            X.C18706VyX.A02(r1, r10)
            r0 = 53
            java.lang.String r5 = r1.A0K(r0)     // Catch:{ IOException -> 0x1603 }
            if (r5 == 0) goto L_0x1603
            X.0c5 r0 = X.0c9.A04     // Catch:{ IOException -> 0x1603 }
            X.0c9 r7 = r0.A01(r6, r5)     // Catch:{ IOException -> 0x1603 }
            X.1Xv r5 = X.1Xj.A0h     // Catch:{ IOException -> 0x1603 }
            r0 = 1
            X.1Xj r5 = r5.A0C(r7, r0, r11)     // Catch:{ IOException -> 0x1603 }
            if (r5 == 0) goto L_0x1603
            com.instagram.model.mediasize.ImageInfo r0 = r5.A1p()
            if (r0 == 0) goto L_0x1603
            com.instagram.user.model.Product r0 = r10.A02()
            if (r0 == 0) goto L_0x1603
            com.instagram.model.shopping.productfeed.ProductTile r0 = r10.A02
            if (r0 == 0) goto L_0x1603
            com.instagram.common.typedurl.ImageUrl r18 = r5.A1Q()
            com.instagram.model.shopping.productfeed.ProductTile r13 = r10.A02
            r13.A05 = r5
            java.lang.String r12 = r5.getId()
            com.instagram.model.mediasize.ImageInfo r8 = r5.A1p()
            java.lang.String r7 = r5.BTL()
            com.instagram.user.model.Product r0 = r10.A02()
            com.instagram.user.model.User r5 = r0.A0B
            com.instagram.model.shopping.productfeed.ProductTileMedia r0 = new com.instagram.model.shopping.productfeed.ProductTileMedia
            r0.<init>(r8, r5, r12, r7)
            r13.A06 = r0
            goto L_0x1605
        L_0x1603:
            r18 = r4
        L_0x1605:
            X.Vj5 r0 = r2.A03
            java.lang.Boolean r22 = java.lang.Boolean.valueOf(r11)
            r15 = r14
            r16 = r1
            r17 = r6
            r19 = r0
            r20 = r10
            r21 = r9
            X.C18706VyX.A01(r15, r16, r17, r18, r19, r20, r21, r22)
            X.WQf r0 = new X.WQf
            r12 = r0
            r13 = r2
            r15 = r3
            r19 = r10
            r20 = r9
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)
            r2.A01 = r0
            r0 = 74
            X.4uI r10 = r1.A0A(r0)
            r0 = 73
            X.4uI r11 = r1.A0A(r0)
            r0 = 77
            X.4uI r12 = r1.A0A(r0)
            r0 = 76
            X.4uI r13 = r1.A0A(r0)
            X.Vhk r7 = new X.Vhk
            r8 = r3
            r9 = r1
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r5 = 1
            X.WQd r0 = new X.WQd
            r0.<init>(r5, r2, r7)
            r2.A02 = r0
            X.IO3 r0 = new X.IO3
            r0.<init>(r5, r2, r1, r3)
            r2.A00 = r0
            X.1Ng r3 = X.AnonymousClass1Nd.A00(r6)
            java.lang.Class<X.3DT> r1 = X.AnonymousClass3DT.class
            X.1wn r0 = r2.A01
            r3.A01(r0, r1)
            java.lang.Class<X.WQP> r1 = X.WQP.class
            X.1wn r0 = r2.A02
            r3.A01(r0, r1)
            java.lang.Class<X.WQM> r1 = X.WQM.class
            X.1wn r0 = r2.A00
            r3.A01(r0, r1)
            return r4
        L_0x166f:
            com.instagram.user.model.Product r6 = X.C18132Vm8.A01(r2)
            X.6xb r2 = X.C323496xa.A00(r7)
            boolean r2 = r2.A03(r6)
            r9.setSelected(r2)
            r2 = 54
            java.lang.String r8 = r1.A0K(r2)
            java.lang.String r2 = "large"
            boolean r8 = r2.equals(r8)
            r2 = 2131240239(0x7f08252f, float:1.8096808E38)
            if (r8 == 0) goto L_0x1692
            r2 = 2131240238(0x7f08252e, float:1.8096806E38)
        L_0x1692:
            r9.setImageResource(r2)
            android.graphics.drawable.Drawable r2 = r9.getDrawable()
            if (r2 == 0) goto L_0x16bd
            r2 = 53
            java.lang.String r8 = r1.A0K(r2)
            java.lang.String r2 = "light"
            boolean r2 = r2.equals(r8)
            android.content.Context r8 = r3.A00
            if (r2 == 0) goto L_0x1732
            r2 = 2131100036(0x7f060184, float:1.7812442E38)
            int r2 = r8.getColor(r2)
            android.graphics.drawable.Drawable r8 = r9.getDrawable()
            android.graphics.ColorFilter r2 = X.AnonymousClass37O.A00(r2)
        L_0x16ba:
            r8.setColorFilter(r2)
        L_0x16bd:
            X.30k r13 = new X.30k
            r13.<init>()
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r9)
            r13.A04(r2)
            r2 = 55
            X.4uI r11 = r1.A0A(r2)
            r2 = 58
            X.4uI r8 = r1.A0A(r2)
            X.Vh5 r2 = new X.Vh5
            r2.<init>(r3, r1, r11, r8)
            r12 = 0
            r0.setVisibility(r12)
            X.WAH r11 = new X.WAH
            r14 = r6
            r15 = r7
            r16 = r1
            r17 = r2
            r18 = r9
            r20 = r10
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            X.AnonymousClass0fU.A00(r11, r0)
            X.IO3 r0 = new X.IO3
            r0.<init>(r12, r6, r7, r9)
            r5.A01 = r0
            r0 = 57
            X.4uI r16 = r1.A0A(r0)
            r0 = 56
            X.4uI r17 = r1.A0A(r0)
            r0 = 61
            X.4uI r18 = r1.A0A(r0)
            r0 = 59
            X.4uI r19 = r1.A0A(r0)
            X.Vhk r2 = new X.Vhk
            r13 = r2
            r14 = r3
            r15 = r1
            r13.<init>(r14, r15, r16, r17, r18, r19)
            X.WQd r0 = new X.WQd
            r0.<init>(r12, r6, r2)
            r5.A00 = r0
            X.1Ng r2 = X.AnonymousClass1Nd.A00(r7)
            java.lang.Class<X.3DT> r1 = X.AnonymousClass3DT.class
            X.1wn r0 = r5.A01
            r2.A01(r0, r1)
            java.lang.Class<X.WQP> r1 = X.WQP.class
            X.1wn r0 = r5.A00
            r2.A01(r0, r1)
            return r4
        L_0x1732:
            int r2 = X.2Yu.A01(r8)
            android.graphics.ColorFilter r2 = X.AnonymousClass37O.A00(r2)
            android.graphics.drawable.Drawable r8 = r9.getDrawable()
            goto L_0x16ba
        L_0x1740:
            X.DTX r7 = r11.AqS()
            if (r7 == 0) goto L_0x1776
            X.DUM r7 = r7.BgE()
            if (r7 == 0) goto L_0x1776
            com.instagram.model.shopping.productimagecontainer.ProductImageContainer r7 = r7.Bbz()
            if (r7 == 0) goto L_0x1776
            com.instagram.model.mediasize.ImageInfo r7 = r7.BGO()
            goto L_0x176b
        L_0x1757:
            java.lang.String r2 = "No cover photo"
            X.1Kn.A02(r3, r2)
            goto L_0x1786
        L_0x175d:
            X.DTX r7 = r11.AqS()
            X.1Xj r7 = r7.BFS()
            if (r7 == 0) goto L_0x17fe
            com.instagram.model.mediasize.ImageInfo r7 = r7.A1p()
        L_0x176b:
            if (r7 == 0) goto L_0x1776
            com.instagram.model.mediasize.ExtendedImageUrl r7 = X.1iI.A01(r13, r7)
            if (r7 == 0) goto L_0x1776
            r12.A02(r7, r4)
        L_0x1776:
            X.WA8 r7 = new X.WA8
            r24 = r7
            r26 = r2
            r27 = r8
            r30 = r1
            r24.<init>(r25, r26, r27, r28, r29, r30)
            X.AnonymousClass0fU.A00(r7, r5)
        L_0x1786:
            r2 = 2131431453(0x7f0b101d, float:1.8484636E38)
            android.widget.TextView r7 = X.AnonymousClass7TE.A0d(r0, r2)
            if (r7 == 0) goto L_0x17f2
            r2 = 1
            X.0qQ.A0B(r1, r2)
            X.EVz r5 = r1.A02
            java.lang.Integer r2 = r1.A04
            if (r2 != 0) goto L_0x17ed
            r2 = 0
        L_0x179a:
            java.lang.String r2 = X.VE9.A00(r13, r5, r2)
            r7.setText(r2)
        L_0x17a1:
            r2 = 2131442898(0x7f0b3cd2, float:1.8507849E38)
            android.widget.TextView r5 = X.AnonymousClass7TE.A0d(r0, r2)
            if (r5 == 0) goto L_0x17e7
            java.lang.String r2 = r1.A08
            r5.setText(r2)
        L_0x17af:
            r2 = 2131437420(0x7f0b276c, float:1.8496738E38)
            com.instagram.common.ui.widget.imageview.IgImageView r5 = X.JTO.A0Y(r0, r2)
            if (r5 == 0) goto L_0x17e1
            com.instagram.user.model.User r2 = r1.A03
            X.DbU.A1S(r8, r5, r2)
        L_0x17bd:
            r2 = 2131437421(0x7f0b276d, float:1.849674E38)
            android.widget.TextView r5 = X.AnonymousClass7TE.A0d(r0, r2)
            if (r5 == 0) goto L_0x17f8
            com.instagram.user.model.User r0 = r1.A03
            X.DbU.A1H(r5, r0)
            com.instagram.user.model.User r0 = r1.A03
            boolean r2 = r0.isVerified()
            int r1 = X.AnonymousClass7TG.A03(r13)
            int r0 = X.2Yu.A05(r13)
            int r0 = r13.getColor(r0)
            X.C244273av.A09(r5, r6, r1, r0, r2)
            return r4
        L_0x17e1:
            java.lang.String r2 = "No owner image"
            X.1Kn.A02(r3, r2)
            goto L_0x17bd
        L_0x17e7:
            java.lang.String r2 = "No title text"
            X.1Kn.A02(r3, r2)
            goto L_0x17af
        L_0x17ed:
            int r2 = r2.intValue()
            goto L_0x179a
        L_0x17f2:
            java.lang.String r2 = "No detail text"
            X.1Kn.A02(r3, r2)
            goto L_0x17a1
        L_0x17f8:
            java.lang.String r0 = "No owner text"
            X.1Kn.A02(r3, r0)
            return r4
        L_0x17fe:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            throw r1
        L_0x1803:
            java.lang.String r0 = "No controller found"
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x180b:
            java.lang.String r1 = "Component defines a controller but none was found."
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x1813:
            java.lang.IllegalArgumentException r0 = X.DbU.A0h()
            throw r0
        L_0x1818:
            java.lang.IllegalArgumentException r0 = X.DbU.A0h()
            throw r0
        L_0x181d:
            r0.setOnSeekBarChangeListener(r2)
            if (r6 == 0) goto L_0x1948
            r6.A02 = r5
            return r4
        L_0x1825:
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r9 = 0
            boolean r6 = X.C51973G9u.A1b(r0, r3, r1)
            java.lang.String r4 = "Required value was null."
            if (r44 == 0) goto L_0x199d
            X.VkZ r5 = (X.C18051VkZ) r5
            android.view.View r10 = r0.getChildAt(r9)
            java.lang.String r2 = "null cannot be cast to non-null type com.bloks.components.bkavatareditorverticalsplitpane.ResizingBloksRenderTreeHostView"
            X.0qQ.A0C(r10, r2)
            X.UTs r10 = (X.C15167UTs) r10
            android.view.View r11 = r0.getChildAt(r6)
            X.0qQ.A0C(r11, r2)
            X.UTs r11 = (X.C15167UTs) r11
            X.6Sh r2 = r5.A04
            X.3dH r0 = r2.A01
            int r18 = r0.A01()
            r10.setRenderResult(r2, r3)
            X.6Sh r0 = r5.A03
            r11.setRenderResult(r0, r3)
            com.google.android.material.bottomsheet.BottomSheetBehavior r7 = com.google.android.material.bottomsheet.BottomSheetBehavior.A01(r11)
            X.0qQ.A07(r7)
            java.util.List r8 = r5.A05
            java.lang.Object r2 = X.C307476Qg.A06(r3, r1)
            if (r2 == 0) goto L_0x1997
            X.VL1 r2 = (X.VL1) r2
            X.UWB r4 = new X.UWB
            r12 = r4
            r13 = r2
            r14 = r5
            r15 = r10
            r16 = r11
            r17 = r8
            r12.<init>(r13, r14, r15, r16, r17, r18)
            r7.A0a(r4)
            int r0 = r8.size()
            r3 = 3
            r1 = 1
            if (r0 >= r3) goto L_0x1880
            r1 = 0
        L_0x1880:
            int r0 = r8.size()
            boolean r0 = X.C51970G9q.A1W(r0, r6)
            r7.A0N = r0
            r7.A0b(r9)
            int r0 = X.C51971G9r.A0I(r8, r1)
            float r10 = (float) r0
            int r1 = r5.A02
            float r0 = (float) r1
            float r10 = r10 / r0
            r7.A0T(r10)
            int r0 = X.DbT.A02(r8, r6)
            int r0 = X.C51971G9r.A0I(r8, r0)
            int r1 = r1 - r0
            if (r1 < 0) goto L_0x198f
            r7.A05 = r1
            boolean r0 = r7.A0O
            if (r0 == r9) goto L_0x18bb
            r7.A0O = r9
            java.lang.ref.WeakReference r0 = r7.A0M
            if (r0 == 0) goto L_0x18b3
            com.google.android.material.bottomsheet.BottomSheetBehavior.A04(r7)
        L_0x18b3:
            int r0 = r7.A0G
            r7.A0X(r0)
            com.google.android.material.bottomsheet.BottomSheetBehavior.A05(r7)
        L_0x18bb:
            int r0 = X.C51971G9r.A0I(r8, r9)
            r7.A0V(r0)
            int r1 = r2.A00
            r0 = -1
            if (r1 != r0) goto L_0x1948
            int r1 = r5.A00
            int r0 = r8.size()
            if (r0 >= r3) goto L_0x18d6
            r0 = 3
            if (r1 != 0) goto L_0x18d3
            r0 = 6
        L_0x18d3:
            r7.A0W(r0)
        L_0x18d6:
            int r0 = r8.size()
            if (r0 != r3) goto L_0x18e4
            if (r1 == 0) goto L_0x18e9
            if (r1 != r6) goto L_0x18e1
            r3 = 6
        L_0x18e1:
            r7.A0W(r3)
        L_0x18e4:
            int r0 = r7.A0G
            r2.A00 = r0
            return r4
        L_0x18e9:
            r3 = 4
            goto L_0x18e1
        L_0x18eb:
            r10 = 1
        L_0x18ec:
            X.0kM r2 = new X.0kM
            r2.<init>(r11)
            X.0wc r5 = r2.A00()
            java.lang.String r2 = "ig_bloks_use_local_asset"
            X.0Aj r6 = X.AnonymousClass7TE.A0e(r5, r2)
            boolean r2 = r6.isSampled()
            if (r2 == 0) goto L_0x1916
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r10)
            java.lang.String r2 = "is_local"
            r6.A7p(r2, r5)
            r2 = 865(0x361, float:1.212E-42)
            java.lang.String r2 = X.Pxd.A00(r2)
            r6.AAJ(r2, r8)
            r6.Cgf()
        L_0x1916:
            if (r10 == 0) goto L_0x1979
            r0.setImageDrawable(r9)
        L_0x191b:
            r5 = 40
            X.4tV r2 = r1.A07(r5)
            if (r2 == 0) goto L_0x1949
            X.4tV r1 = r1.A07(r5)
            X.0qQ.A0A(r1)
            int r3 = X.AnonymousClass6TP.A00(r3, r1, r7)
            int r2 = android.graphics.Color.alpha(r3)
            r1 = 255(0xff, float:3.57E-43)
            if (r2 == r1) goto L_0x193d
            r1 = 16777215(0xffffff, float:2.3509886E-38)
            r3 = r3 & r1
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r3 = r3 | r1
        L_0x193d:
            r0.setColorFilter(r3)
            r0.setImageAlpha(r2)
        L_0x1943:
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_CROP
            r0.setScaleType(r1)
        L_0x1948:
            return r4
        L_0x1949:
            r3 = 38
            java.lang.String r2 = r1.A0K(r3)
            if (r2 == 0) goto L_0x1943
            java.lang.String r1 = r1.A0K(r3)     // Catch:{ 3yO -> 0x196f }
            int r3 = X.AnonymousClass6Su.A03(r1)     // Catch:{ 3yO -> 0x196f }
            int r2 = android.graphics.Color.alpha(r3)     // Catch:{ 3yO -> 0x196f }
            r1 = 255(0xff, float:3.57E-43)
            if (r2 == r1) goto L_0x1968
            r1 = 16777215(0xffffff, float:2.3509886E-38)
            r3 = r3 & r1
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r3 = r3 | r1
        L_0x1968:
            r0.setColorFilter(r3)     // Catch:{ 3yO -> 0x196f }
            r0.setImageAlpha(r2)     // Catch:{ 3yO -> 0x196f }
            goto L_0x1943
        L_0x196f:
            r2 = move-exception
            r0.setColorFilter(r4)
            java.lang.String r1 = "IgIconBinderUtils"
            X.1Kn.A03(r1, r2)
            goto L_0x1943
        L_0x1979:
            java.lang.String r14 = ""
            r2 = 41
            java.lang.String r2 = r1.A0K(r2)
            if (r2 == 0) goto L_0x1984
            r14 = r2
        L_0x1984:
            r8 = r4
            r9 = r4
            r10 = r0
            r11 = r3
            r12 = r1
            r13 = r4
            r15 = r7
            X.C299185ui.A00(r8, r9, r10, r11, r12, r13, r14, r15)
            goto L_0x191b
        L_0x198f:
            java.lang.String r1 = "offset must be greater than or equal to 0"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x1997:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r4)
            throw r0
        L_0x199d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14097Tpp.A0K(android.view.View, X.6Rm, X.4tV, java.lang.Object):java.lang.Object");
    }
}
