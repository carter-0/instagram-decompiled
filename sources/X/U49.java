package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.music.common.model.MusicConsumptionModel;
import com.instagram.reels.question.model.MusicQuestionResponseModel;
import com.instagram.reels.questionv2.model.QuestionMediaResponseModel;
import com.instagram.user.model.User;

public final class U49 extends BaseAdapter {
    public final UserSession A00;
    public final AnonymousClass4DU A01;
    public final C234462xu A02;
    public final C15353Ub4 A03;
    public final Activity A04;

    public final long getItemId(int i) {
        return 0;
    }

    public final int getCount() {
        C14177TrG trG = this.A03.A04;
        if (trG != null) {
            return trG.A0B.Bih();
        }
        return 0;
    }

    public final Object getItem(int i) {
        return this.A03.A04.A0B.Big(i);
    }

    public final int getItemViewType(int i) {
        switch (this.A03.A04.A0B.Big(i).A01.intValue()) {
            case 0:
                return -1;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            default:
                return 5;
        }
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        C17801VgE vgE;
        TextView textView;
        Context context;
        ImageUrl simpleImageUrl;
        String str;
        Object vaj;
        View view2 = view;
        C15353Ub4 ub4 = this.A03;
        VTJ Big = ub4.A04.A0B.Big(i);
        if (view == null) {
            int intValue = Big.A01.intValue();
            ViewGroup viewGroup2 = viewGroup;
            if (intValue == 1) {
                view2 = DbV.A0D(viewGroup2).inflate(R.layout.question_response_sheet_text, viewGroup2, false);
                vaj = new C17591Vaj(view2);
            } else if (intValue == 2) {
                view2 = DbV.A0D(viewGroup2).inflate(R.layout.question_response_sheet_music, viewGroup2, false);
                vaj = new WZE(view2, this.A00, this.A01, this.A02);
            } else if (intValue == 3) {
                view2 = DbV.A0D(viewGroup2).inflate(R.layout.question_response_sheet_media, viewGroup2, false);
                vaj = new C17712Vch(view2, this.A00, this.A01.getModuleName());
            } else if (intValue == 4) {
                view2 = DbV.A0D(viewGroup2).inflate(R.layout.question_response_sheet_see_all, viewGroup2, false);
                vaj = new VTI(view2, ub4);
            } else {
                throw new IllegalArgumentException("Unhandeled QuestionResponseCardViewModel type");
            }
            view2.setTag(vaj);
        }
        Object tag = view2.getTag();
        int intValue2 = Big.A01.intValue();
        if (intValue2 == 1) {
            tag.getClass();
            C17591Vaj vaj2 = (C17591Vaj) tag;
            vgE = Big.A00;
            if (vgE != null) {
                UserSession userSession = this.A00;
                String moduleName = this.A01.getModuleName();
                TextView textView2 = vaj2.A01;
                String str2 = vgE.A00.A08;
                if (str2 == null) {
                    str2 = "";
                }
                textView2.setVisibility(0);
                textView2.setText(str2);
                textView2.setOnLongClickListener(new C18889WBg(1, textView2, ub4));
                Us7 us7 = vaj2.A04;
                Us7 us72 = us7;
                C17044VFs.A00(userSession, ub4, vgE, us72, vaj2.A05, vaj2.A03, (AnonymousClass3WR) null, moduleName);
                VTH vth = vaj2.A02;
                ImageView imageView = vth.A00;
                imageView.setVisibility(0);
                WBD.A00(imageView, 29, vgE, ub4);
                textView = vth.A01;
                context = textView.getContext();
            } else {
                throw AnonymousClass7TE.A0y();
            }
        } else if (intValue2 != 2) {
            if (intValue2 == 3) {
                C17712Vch vch = (C17712Vch) tag;
                vgE = Big.A00;
                if (vgE != null) {
                    UserSession userSession2 = this.A00;
                    AnonymousClass4DU r8 = this.A01;
                    if (vch != null) {
                        QuestionMediaResponseModel questionMediaResponseModel = vgE.A00.A03;
                        if (questionMediaResponseModel != null) {
                            AnonymousClass0eM r12 = vch.A07;
                            AnonymousClass7TH.A06(r12).setVisibility(0);
                            AnonymousClass0eM r7 = vch.A06;
                            Context context2 = AnonymousClass7TH.A06(r7).getContext();
                            int dimensionPixelSize = context2.getResources().getDimensionPixelSize(R.dimen.browser_error_screen_description_width);
                            int A0D = C13988Tno.A0D(questionMediaResponseModel.A06);
                            int A0D2 = C13988Tno.A0D(questionMediaResponseModel.A05);
                            ViewGroup.LayoutParams layoutParams = AnonymousClass7TH.A06(r12).getLayoutParams();
                            layoutParams.width = (int) ((((float) A0D) / ((float) A0D2)) * ((float) dimensionPixelSize));
                            layoutParams.height = dimensionPixelSize;
                            AnonymousClass7TH.A06(r12).setLayoutParams(layoutParams);
                            vch.A00 = questionMediaResponseModel;
                            if (C13988Tno.A0D(questionMediaResponseModel.A04) == 1iA.A0Q.A00) {
                                ImageInfo imageInfo = questionMediaResponseModel.A00;
                                imageInfo.getClass();
                                ExtendedImageUrl A002 = C18240Vo7.A00(context2, imageInfo, A0D, A0D2);
                                if (A002 != null) {
                                    JTS.A1W(r7, 0);
                                    ((IgProgressImageView) AnonymousClass7TE.A14(r7)).setUrl(A002, r8);
                                }
                            }
                            JTS.A1W(r7, 8);
                        }
                        Us7 us73 = (Us7) vch.A08.getValue();
                        Us7 us74 = (Us7) vch.A0A.getValue();
                        Us7 us75 = (Us7) vch.A05.getValue();
                        String moduleName2 = r8.getModuleName();
                        QuestionMediaResponseModel questionMediaResponseModel2 = vch.A00;
                        if (questionMediaResponseModel2 != null) {
                            Us7 us76 = us73;
                            C17044VFs.A00(userSession2, ub4, vgE, us76, us74, us75, C18240Vo7.A01(questionMediaResponseModel2), moduleName2);
                            AnonymousClass0eM r2 = vch.A0B;
                            ImageView imageView2 = ((VTH) r2.getValue()).A00;
                            imageView2.setVisibility(0);
                            WBD.A00(imageView2, 29, vgE, ub4);
                            textView = ((VTH) r2.getValue()).A01;
                            context = ((VTH) r2.getValue()).A01.getContext();
                        } else {
                            0qQ.A0F("mediaResponseModel");
                            throw AnonymousClass00P.createAndThrow();
                        }
                    }
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            } else if (intValue2 == 4) {
                tag.getClass();
                ((VTI) tag).A01.A01.setText((CharSequence) null);
            }
            return view2;
        } else {
            tag.getClass();
            WZE wze = (WZE) tag;
            C17801VgE vgE2 = Big.A00;
            if (vgE2 != null) {
                UserSession userSession3 = this.A00;
                AnonymousClass4DU r5 = this.A01;
                MusicQuestionResponseModel musicQuestionResponseModel = vgE2.A00.A01;
                if (musicQuestionResponseModel != null) {
                    ImageView imageView3 = wze.A04;
                    boolean z = false;
                    imageView3.setVisibility(0);
                    View view3 = wze.A01;
                    view3.setVisibility(0);
                    wze.A03.setVisibility(0);
                    MusicAssetModel A012 = MusicAssetModel.A01(musicQuestionResponseModel.A00, false);
                    MusicConsumptionModel musicConsumptionModel = musicQuestionResponseModel.A01;
                    GVO gvo = wze.A09;
                    String str3 = A012.A0I;
                    boolean z2 = A012.A0S;
                    0qQ.A0B(gvo, 0);
                    GVM.A00((Drawable) null, gvo, str3, z2, false);
                    JYP.A00(imageView3, A012.A02);
                    User BEv = musicConsumptionModel.BEv();
                    IgImageView igImageView = wze.A07;
                    if (BEv != null) {
                        simpleImageUrl = BEv.Bh3();
                    } else {
                        simpleImageUrl = new SimpleImageUrl(musicConsumptionModel.getPlaceholderProfilePicUrl());
                    }
                    igImageView.setUrl(simpleImageUrl, r5);
                    TextView textView3 = wze.A05;
                    if (BEv != null) {
                        str = BEv.getUsername();
                    } else {
                        str = A012.A0D;
                    }
                    textView3.setText(str);
                    if (BEv != null) {
                        z = BEv.isVerified();
                    }
                    C244273av.A0A(textView3, wze.A00, z);
                    AnonymousClass3NG r82 = new AnonymousClass3NG(view3);
                    r82.A07 = true;
                    r82.A04 = new C15845UjV(3, ub4, BEv);
                    r82.A00();
                    C65505LuT luT = wze.A08;
                    C263294Kc r0 = new C263294Kc(musicConsumptionModel);
                    luT.A00 = A012;
                    luT.A01 = r0;
                    C65505LuT.A02(luT, C65505LuT.A03(luT));
                }
                Us7 us77 = wze.A0C;
                Us7 us78 = wze.A0D;
                Us7 us79 = us77;
                C17044VFs.A00(userSession3, ub4, vgE2, us79, us78, wze.A0B, (AnonymousClass3WR) null, r5.getModuleName());
                return view2;
            }
            throw AnonymousClass7TE.A0y();
        }
        DbX.A13(context, textView, vgE.A00.A04.getUsername(), 2131971041);
        return view2;
    }

    public U49(Activity activity, UserSession userSession, AnonymousClass4DU r3, C234462xu r4, C15353Ub4 ub4) {
        this.A00 = userSession;
        this.A01 = r3;
        this.A02 = r4;
        this.A03 = ub4;
        this.A04 = activity;
    }
}
