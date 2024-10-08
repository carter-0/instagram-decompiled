package X;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.textcell.IgdsListCell;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import go.Seq;
import java.util.Collection;
import java.util.List;
import org.webrtc.EglBase14Impl;

/* renamed from: X.NKx  reason: case insensitive filesystem */
public class C68504NKx extends 2Rv implements C231272rL {
    public final AnonymousClass0iw analyticsModule;
    public boolean areRowDividersEnabled;
    public final Context context;
    public boolean isElevatedSurface;
    public final List objects = AnonymousClass7TE.A1C();
    public boolean roundDialogBottomCorners;
    public boolean roundDialogTopCorners;
    public final 0lg session;
    public boolean shouldCenterText;
    public C74279Ps7 switchItemViewPointDelegate;
    public final List toAnimateMoveInItems = AnonymousClass7TE.A1C();

    public C68504NKx(Context context2, 0lg r3, AnonymousClass0iw r4) {
        0qQ.A0B(context2, 1);
        this.context = context2;
        this.session = r3;
        this.analyticsModule = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
        if (r1 != false) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (r2 == false) goto L_0x0015;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        if (r1 == false) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final X.FAT getMenuItemState(int r9) {
        /*
            r8 = this;
            r1 = 1
            boolean r2 = X.AnonymousClass7TF.A1Q(r9)
            int r0 = r8.getCount()
            int r0 = r0 - r1
            boolean r1 = X.AnonymousClass7TF.A1S(r9, r0)
            boolean r0 = r8.roundDialogTopCorners
            if (r0 == 0) goto L_0x0015
            r3 = 1
            if (r2 != 0) goto L_0x0016
        L_0x0015:
            r3 = 0
        L_0x0016:
            boolean r0 = r8.roundDialogBottomCorners
            if (r0 == 0) goto L_0x001d
            r4 = 1
            if (r1 != 0) goto L_0x001e
        L_0x001d:
            r4 = 0
        L_0x001e:
            boolean r5 = r8.shouldCenterText
            boolean r6 = r8.isElevatedSurface
            boolean r0 = r8.areRowDividersEnabled
            if (r0 == 0) goto L_0x0029
            r7 = 1
            if (r1 == 0) goto L_0x002a
        L_0x0029:
            r7 = 0
        L_0x002a:
            X.FAT r2 = new X.FAT
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68504NKx.getMenuItemState(int):X.FAT");
    }

    public final void addDialogMenuItems(List list) {
        0qQ.A0B(list, 0);
        this.objects.addAll(list);
        this.isElevatedSurface = true;
        notifyDataSetChanged();
    }

    public boolean areAllItemsEnabled() {
        return false;
    }

    public C68504NKx getAdapter() {
        return this;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        0qQ.A0B(viewGroup, 2);
        C249703kE onCreateViewHolder = onCreateViewHolder(viewGroup, getItemViewType(i));
        onBindViewHolder(onCreateViewHolder, i);
        return JTO.A0F(onCreateViewHolder);
    }

    public boolean isEnabled(int i) {
        return false;
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r1v87, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public void onBindViewHolder(C249703kE r14, int i) {
        View view;
        View.OnClickListener onClickListener;
        float f;
        TextView textView;
        0qQ.A0B(r14, 0);
        switch (AnonymousClass05K.A00(45)[getItemViewType(i)].intValue()) {
            case 1:
                Object item = getItem(i);
                0qQ.A0C(item, "null cannot be cast to non-null type com.instagram.ui.menu.HeaderItem");
                FCV.A02((C46448DfA) item, (C46896DnC) r14, false, false);
                break;
            case 2:
                Object item2 = getItem(i);
                0qQ.A0C(item2, "null cannot be cast to non-null type com.instagram.ui.menu.TextItem");
                ORK.A01((C67865Mw9) r14, (FGF) item2);
                break;
            case 3:
                C67864Mw8 mw8 = (C67864Mw8) r14;
                Object item3 = getItem(i);
                0qQ.A0C(item3, "null cannot be cast to non-null type com.instagram.ui.menu.SeparatorItem");
                if (!((C70944OSr) item3).A00) {
                    0nA.A0e(mw8.A00, 0);
                    break;
                }
                break;
            case 4:
                Object item4 = getItem(i);
                0qQ.A0C(item4, "null cannot be cast to non-null type com.instagram.ui.menu.SwitchItem");
                O31.A00(getMenuItemState(i), (Mz1) r14, this.switchItemViewPointDelegate, (PR9) item4);
                break;
            case 5:
                C67869MwD mwD = (C67869MwD) r14;
                Object item5 = getItem(i);
                0qQ.A0C(item5, "null cannot be cast to non-null type com.instagram.ui.menu.CheckItem");
                C70659OFg oFg = (C70659OFg) item5;
                TextView textView2 = mwD.A00;
                17k.A0F(AnonymousClass7TF.A1S(textView2.getPaddingLeft(), textView2.getPaddingRight()));
                textView2.setCompoundDrawablePadding(textView2.getPaddingLeft());
                textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(oFg.A01, 0, 0, 0);
                textView2.setText(oFg.A02);
                mwD.A01.setChecked(oFg.A00);
                view = mwD.itemView;
                onClickListener = oFg.A03;
                break;
            case 6:
                Object item6 = getItem(i);
                0qQ.A0C(item6, "null cannot be cast to non-null type com.instagram.ui.menu.ButtonItem");
                C49801F7n.A01((C67293MlS) item6, (C46885Dn1) r14);
                break;
            case 7:
                Context A07 = DbS.A07(r14);
                Object item7 = getItem(i);
                0qQ.A0C(item7, "null cannot be cast to non-null type com.instagram.ui.menu.RadioGroupItem");
                C70962OTj oTj = (C70962OTj) item7;
                List list = oTj.A05;
                RadioGroup.LayoutParams layoutParams = new RadioGroup.LayoutParams(-1, -2, 16.0f);
                RadioGroup radioGroup = ((C67863Mw7) r14).A00;
                radioGroup.setOnCheckedChangeListener((RadioGroup.OnCheckedChangeListener) null);
                if (list != null && !list.isEmpty()) {
                    String str = oTj.A00;
                    radioGroup.removeAllViews();
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        C70953OTa oTa = (C70953OTa) list.get(i2);
                        CompoundButton compoundButton = (CompoundButton) LayoutInflater.from(A07).inflate(R.layout.row_selection_item, (ViewGroup) null);
                        compoundButton.setText(oTa.A03);
                        AnonymousClass0fU.A00(oTa.A00, compoundButton);
                        compoundButton.setLayoutParams(layoutParams);
                        compoundButton.setId(i2);
                        if ((TextUtils.isEmpty(str) && i2 == 0 && !oTj.A01) || (!TextUtils.isEmpty(str) && str.equals(((C70953OTa) list.get(i2)).A02))) {
                            compoundButton.setChecked(true);
                        }
                        if (oTj.A03) {
                            compoundButton.setAlpha(1.0f);
                        } else {
                            compoundButton.setAlpha(0.3f);
                        }
                        compoundButton.setClickable(oTj.A02);
                        radioGroup.addView(compoundButton);
                        if (!TextUtils.isEmpty(oTa.A01)) {
                            TextView textView3 = (TextView) LayoutInflater.from(A07).inflate(R.layout.row_text, (ViewGroup) null);
                            03v.A07(textView3);
                            textView3.setMovementMethod(AnonymousClass6LK.A00);
                            textView3.setText(oTa.A01);
                            textView3.setClickable(false);
                            textView3.setLongClickable(false);
                            radioGroup.addView(textView3);
                        }
                    }
                }
                radioGroup.setEnabled(oTj.A03);
                radioGroup.setOnCheckedChangeListener(oTj.A04);
                break;
            case 8:
                0qQ.A0C(getItem(i), "null cannot be cast to non-null type com.instagram.ui.menu.UserItem");
                if (this.analyticsModule != null) {
                    throw AnonymousClass7TE.A11("getOnClickListener");
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            case 9:
                C67870MwE mwE = (C67870MwE) r14;
                Object item8 = getItem(i);
                0qQ.A0C(item8, "null cannot be cast to non-null type com.instagram.ui.menu.EditTextItem");
                C71277OhI ohI = (C71277OhI) item8;
                C71277OhI ohI2 = mwE.A01;
                if (ohI2 != null) {
                    mwE.A00.removeTextChangedListener(ohI2);
                }
                mwE.A01 = ohI;
                EditText editText = mwE.A00;
                editText.setHint(ohI.A03);
                editText.setOnEditorActionListener(ohI.A01);
                editText.addTextChangedListener(ohI);
                editText.setText(ohI.A00);
                editText.setInputType(ohI.A02.intValue());
                editText.setOnTouchListener((View.OnTouchListener) null);
                if (mwE.A01.A04) {
                    editText.requestFocus();
                    0nA.A0R(editText);
                    break;
                }
                break;
            case 10:
                0qQ.A0C(getItem(i), "null cannot be cast to non-null type com.instagram.ui.menu.ActionItem");
                throw AnonymousClass7TE.A11("isEnabled");
            case 11:
                0qQ.A0C(getItem(i), "null cannot be cast to non-null type com.instagram.ui.menu.BannerItemWithText");
                throw AnonymousClass7TE.A11("getText");
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                Object item9 = getItem(i);
                0qQ.A0C(item9, "null cannot be cast to non-null type com.instagram.ui.menu.SpinnerItem");
                OAN oan = (OAN) item9;
                0qQ.A0B(oan, 1);
                AnonymousClass0fU.A00(oan.A00, r14.itemView);
                ViewGroup.MarginLayoutParams A0G = DbX.A0G(r14.itemView);
                A0G.setMargins(0, 0, 0, 0);
                AnonymousClass7TE.A0b(r14.itemView, R.id.row_divider).setVisibility(8);
                r14.itemView.setLayoutParams(A0G);
                break;
            case 13:
                C46892Dn8 dn8 = (C46892Dn8) r14;
                0qQ.A0C(getItem(i), "null cannot be cast to non-null type com.instagram.ui.menu.BadgeItem");
                if (dn8 != null) {
                    dn8.A00.setVisibility(8);
                    throw AnonymousClass7TE.A11("getOnClickListener");
                }
                break;
            case 14:
                Object item10 = getItem(i);
                0qQ.A0C(item10, "null cannot be cast to non-null type com.instagram.ui.menu.MenuItemLink");
                C49803F7p.A01((C49862FAc) item10, getMenuItemState(i), (C46889Dn5) r14);
                break;
            case 15:
                C67876MwK mwK = (C67876MwK) r14;
                Object item11 = getItem(i);
                0qQ.A0C(item11, "null cannot be cast to non-null type com.instagram.ui.menu.MetadataItem");
                C70966OTn oTn = (C70966OTn) item11;
                FAT menuItemState = getMenuItemState(i);
                View view2 = mwK.itemView;
                View.OnClickListener onClickListener2 = oTn.A02;
                if (onClickListener2 != null) {
                    AnonymousClass0fU.A00(onClickListener2, view2);
                    2eS.A01(view2);
                } else {
                    view2.setClickable(false);
                }
                CharSequence charSequence = oTn.A04;
                TextView textView4 = mwK.A02;
                if (charSequence != null) {
                    textView4.setText(charSequence);
                } else {
                    textView4.setText(oTn.A01);
                }
                CharSequence charSequence2 = oTn.A03;
                TextView textView5 = mwK.A01;
                if (charSequence2 != null) {
                    textView5.setVisibility(0);
                    textView5.setText(oTn.A03);
                    if (oTn.A07) {
                        textView4.setTypeface(Typeface.DEFAULT_BOLD);
                    }
                    if (oTn.A06) {
                        Context context2 = view2.getContext();
                        Drawable A00 = 0mk.A00(context2, R.drawable.instagram_chevron_right_pano_outline_16);
                        AnonymousClass4Ed.A02(context2, A00, R.attr.glyphColorTertiary);
                        RectF rectF = 0nA.A01;
                        textView5.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, A00, (Drawable) null);
                    }
                } else {
                    textView5.setVisibility(8);
                    DbS.A1C(textView5);
                }
                StringBuilder A1A = AnonymousClass7TE.A1A();
                A1A.append(textView4.getText());
                A1A.append(" ");
                view2.setContentDescription(AnonymousClass7TF.A0i(textView5.getText(), A1A));
                if (oTn.A05) {
                    view2.setEnabled(false);
                    f = 0.3f;
                } else {
                    view2.setEnabled(true);
                    f = 1.0f;
                }
                view2.setAlpha(f);
                Context context3 = view2.getContext();
                view2.setBackgroundResource(C49161EqS.A00(context3, menuItemState));
                textView4.setCompoundDrawablePadding(DbS.A02(context3, 8));
                textView4.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                mwK.A00.setVisibility(8);
                textView4.setLineSpacing(oTn.A00, textView4.getLineSpacingMultiplier());
                break;
            case 16:
                Object item12 = getItem(i);
                0qQ.A0C(item12, "null cannot be cast to non-null type com.instagram.ui.menu.MenuItemWithActionLabel");
                FAT menuItemState2 = getMenuItemState(i);
                ORI.A01(menuItemState2, (PR7) item12, (C67871MwF) r14);
                break;
            case 17:
                Object item13 = getItem(i);
                0qQ.A0C(item13, "null cannot be cast to non-null type com.instagram.ui.menu.ArrowItem");
                ORJ.A01((C71065Oak) item13, (C67880MwO) r14);
                break;
            case EglBase14Impl.EGLExt_SDK_VERSION:
                C67873MwH mwH = (C67873MwH) r14;
                Object item14 = getItem(i);
                0qQ.A0C(item14, "null cannot be cast to non-null type com.instagram.ui.menu.CheckWithSecondaryTextItem");
                OGV ogv = (OGV) item14;
                TextView textView6 = mwH.A01;
                17k.A0F(AnonymousClass7TF.A1S(textView6.getPaddingLeft(), textView6.getPaddingRight()));
                textView6.setCompoundDrawablePadding(textView6.getPaddingLeft());
                textView6.setCompoundDrawablesRelativeWithIntrinsicBounds(ogv.A01, 0, 0, 0);
                textView6.setText(ogv.A02);
                String str2 = ogv.A04;
                if (str2 != null) {
                    mwH.A00.setText(str2);
                }
                mwH.A02.setChecked(ogv.A00);
                view = mwH.itemView;
                onClickListener = ogv.A03;
                break;
            case 19:
                C67872MwG mwG = (C67872MwG) r14;
                Object item15 = getItem(i);
                0qQ.A0C(item15, "null cannot be cast to non-null type com.instagram.ui.menu.CheckWithSecondaryTextAndWhatsAppIconColorItem");
                OGU ogu = (OGU) item15;
                TextView textView7 = mwG.A01;
                if (textView7 != null) {
                    17k.A0F(AnonymousClass7TF.A1S(textView7.getPaddingLeft(), textView7.getPaddingRight()));
                    textView7.setCompoundDrawablePadding(textView7.getPaddingLeft());
                    textView7.setCompoundDrawablesRelativeWithIntrinsicBounds(ogu.A01, 0, 0, 0);
                    textView7.setText(ogu.A02);
                }
                String str3 = ogu.A04;
                if (!(str3 == null || (textView = mwG.A00) == null)) {
                    textView.setText(str3);
                }
                C67697Msh msh = mwG.A02;
                if (msh != null) {
                    msh.setChecked(ogu.A00);
                }
                view = mwG.itemView;
                onClickListener = ogu.A03;
                break;
            case 20:
                Object item16 = getItem(i);
                0qQ.A0C(item16, "null cannot be cast to non-null type com.instagram.ui.menu.SelectionItem");
                EyQ eyQ = (EyQ) item16;
                View view3 = r14.itemView;
                AnonymousClass0fU.A00(eyQ.A01, view3);
                CompoundButton compoundButton2 = (CompoundButton) view3;
                compoundButton2.setText(eyQ.A02);
                compoundButton2.setChecked(eyQ.A00);
                break;
            case 21:
                break;
            case 22:
                0qQ.A0C(getItem(i), "null cannot be cast to non-null type com.instagram.ui.menu.ImageItemViewModel");
                throw AnonymousClass7TE.A11("getOnClickListener");
            case 23:
                C67877MwL mwL = (C67877MwL) r14;
                Object item17 = getItem(i);
                0qQ.A0C(item17, "null cannot be cast to non-null type com.instagram.ui.typeaheadheader.TypeaheadHeaderModel");
                C49605EzO ezO = (C49605EzO) item17;
                G7N g7n = ezO.A01;
                if (g7n != null) {
                    mwL.A01 = g7n;
                }
                C74374Pto pto = ezO.A02;
                if (pto != null) {
                    mwL.A02 = pto;
                }
                SearchEditText searchEditText = ezO.A00;
                if (searchEditText != null) {
                    SearchEditText searchEditText2 = mwL.A00;
                    searchEditText2.A0C = null;
                    searchEditText2.setText(searchEditText.getText());
                    searchEditText2.setSelection(searchEditText.getText().length());
                    searchEditText2.setHint(searchEditText.getHint());
                    C74284PsC psC = searchEditText.A0E;
                    if (psC != null) {
                        searchEditText2.A0E = psC;
                    }
                    searchEditText2.setAllowTextSelection(searchEditText.A0G);
                    searchEditText2.A0J = searchEditText.A0J;
                    searchEditText2.setOnFocusChangeListener(searchEditText.getOnFocusChangeListener());
                    searchEditText2.setClearButtonEnabled(searchEditText.A0H);
                    if (ezO.A03) {
                        searchEditText2.requestFocus();
                    }
                }
                SearchEditText searchEditText3 = mwL.A00;
                searchEditText3.A0C = new PRQ(mwL, ezO);
                searchEditText3.A0B = new PRO(mwL, 1);
                C66997MgV.A00(searchEditText3);
                C66997MgV.A01(searchEditText3);
                G7N g7n2 = mwL.A01;
                if (g7n2 != null) {
                    g7n2.registerTextViewLogging(searchEditText3);
                    break;
                }
                break;
            case 24:
                Object item18 = getItem(i);
                0qQ.A0C(item18, "null cannot be cast to non-null type com.instagram.ui.menu.CustomTextItem");
                C49802F7o.A01((FAZ) item18, (C46887Dn3) r14);
                break;
            case 25:
                0qQ.A0C(getItem(i), "null cannot be cast to non-null type com.instagram.ui.menu.FxCalMenuItem");
                if (((C67861Mw5) r14).A00 != null) {
                    throw AnonymousClass7TE.A11("getListener");
                }
                break;
            case 26:
                0qQ.A0C(getItem(i), "null cannot be cast to non-null type com.instagram.ui.menu.MenuItemLinkEndBadge");
                throw AnonymousClass7TE.A11("getOnClickListener");
            case 27:
                View view4 = r14.itemView;
                Object item19 = getItem(i);
                0qQ.A0C(item19, "null cannot be cast to non-null type com.instagram.ui.menu.LargeButtonItem");
                0qQ.A0C(getItem(i), "null cannot be cast to non-null type com.instagram.ui.menu.LargeButtonItem");
                O30.A00(view4, (C70661OFi) item19, true, false, false);
                break;
            case 28:
                C67988MyG myG = (C67988MyG) r14;
                Object item20 = getItem(i);
                0qQ.A0C(item20, "null cannot be cast to non-null type com.instagram.ui.menu.InfoItem");
                C70660OFh oFh = (C70660OFh) item20;
                AnonymousClass7TF.A1H(myG, oFh);
                myG.A02.setImageDrawable(oFh.A01);
                String str4 = oFh.A03;
                IgTextView igTextView = myG.A01;
                igTextView.setText(str4);
                int i3 = oFh.A00;
                if (i3 != 0) {
                    igTextView.setTextAppearance(i3);
                }
                String str5 = oFh.A02;
                if (str5 != null) {
                    myG.A00.setText(str5);
                    break;
                }
                break;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                C67930MxG mxG = (C67930MxG) r14;
                Object item21 = getItem(i);
                0qQ.A0C(item21, "null cannot be cast to non-null type com.instagram.ui.menu.HeaderImageItem");
                OTE ote = (OTE) item21;
                int i4 = ote.A00;
                if (i4 == 0) {
                    Drawable drawable = ote.A01;
                    if (drawable != null) {
                        int i5 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                        mxG.A00.setImageDrawable(drawable);
                        break;
                    }
                } else {
                    int i6 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                    mxG.A00.setImageResource(i4);
                    break;
                }
                break;
            case 30:
                Object item22 = getItem(i);
                0qQ.A0C(item22, "null cannot be cast to non-null type com.instagram.ui.menu.ButtonWithDescriptionItem");
                C70346O2y.A00((C70658OFf) item22, (C67959Mxj) r14);
                break;
            case 31:
                C67958Mxi mxi = (C67958Mxi) r14;
                Object item23 = getItem(i);
                0qQ.A0C(item23, "null cannot be cast to non-null type com.instagram.ui.menu.ButtonPrimaryWrappedWithDescriptionItem");
                Button button = mxi.A00;
                button.setText(2131972260);
                AnonymousClass0fU.A00(((OAM) item23).A00, button);
                mxi.A01.setText(2131972261);
                break;
            case 32:
                0qQ.A0C(getItem(i), "null cannot be cast to non-null type com.instagram.ui.menu.PrivacyCenterMenuItem");
                if (((C67862Mw6) r14).A00 != null) {
                    throw AnonymousClass7TE.A11("getListener");
                }
                break;
            case 33:
                C67987MyF myF = (C67987MyF) r14;
                Object item24 = getItem(i);
                0qQ.A0C(item24, "null cannot be cast to non-null type com.instagram.ui.menu.CompoundItem");
                C49410EvC evC = (C49410EvC) item24;
                AnonymousClass7TF.A1H(myF, evC);
                myF.A00.setImageResource(R.drawable.instagram_eye_off_pano_outline_24);
                myF.A02.setText(2131952517);
                view = myF.A01;
                onClickListener = evC.A00;
                break;
            case 34:
                0qQ.A0C(getItem(i), "null cannot be cast to non-null type com.instagram.ui.menu.CompanyLayerSectionMenuItem");
                IgImageView igImageView = ((C67881MwP) r14).A05;
                if (igImageView != null) {
                    igImageView.setImageDrawable(AnonymousClass2dd.A00(igImageView.getResources(), R.drawable.company_brand_meta_lockup_primary_12));
                }
                throw AnonymousClass7TE.A11("showAccountsCenter");
            case 35:
                0qQ.A0C(getItem(i), "null cannot be cast to non-null type com.instagram.ui.menu.CompanyLayerSectionAccountsCenterItem");
                throw AnonymousClass7TE.A11("showAccountsCenter");
            case 36:
                C67860Mw4 mw4 = (C67860Mw4) r14;
                Object item25 = getItem(i);
                0qQ.A0C(item25, "null cannot be cast to non-null type com.instagram.ui.menu.CheckboxItem");
                PR8 pr8 = (PR8) item25;
                IgdsListCell igdsListCell = mw4.A00;
                igdsListCell.setTextCellType(C69349Njo.TYPE_CHECKBOX);
                CharSequence charSequence3 = pr8.A01;
                if (charSequence3 != null) {
                    igdsListCell.A0I(charSequence3);
                }
                igdsListCell.setChecked(pr8.A02);
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = pr8.A00;
                if (onCheckedChangeListener != null) {
                    igdsListCell.A0D(onCheckedChangeListener);
                }
                igdsListCell.A0C(new C71396Ojv(mw4, 64));
                break;
            case 37:
                C68007MyZ myZ = (C68007MyZ) r14;
                0qQ.A0C(getItem(i), "null cannot be cast to non-null type com.instagram.ui.menu.PeopleCellWithSwitchItem");
                if (this.analyticsModule != null) {
                    0qQ.A0B(myZ, 0);
                    myZ.A00.A04();
                    throw AnonymousClass7TE.A11("getImageUrl");
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            case 38:
                0qQ.A0C(getItem(i), "null cannot be cast to non-null type com.instagram.ui.menu.AcTransitionTopBannerMenuItem");
                throw AnonymousClass7TE.A11("getTitle");
            case 39:
                0qQ.A0C(getItem(i), "null cannot be cast to non-null type com.instagram.ui.menu.AcTransitionSecondLevelTopBannerItem");
                throw AnonymousClass7TE.A11("getContent");
            case 40:
                Object item26 = getItem(i);
                0qQ.A0C(item26, "null cannot be cast to non-null type com.instagram.ui.menu.IgdsBannerItem");
                C70345O2x.A00((C61057Jvv) item26, (C67859Mw3) r14);
                break;
            case Seq.NULL_REFNUM:
                Object item27 = getItem(i);
                0qQ.A0C(item27, "null cannot be cast to non-null type com.instagram.ui.menu.IgdsListCellItem");
                C70347O2z.A00((OIM) item27, (C67931MxH) r14);
                break;
            case Seq.RefTracker.REF_OFFSET:
                C68006MyY myY = (C68006MyY) r14;
                0qQ.A0C(getItem(i), "null cannot be cast to non-null type com.instagram.ui.menu.CircularImageItem");
                0qQ.A0B(myY, 0);
                ? r2 = myY.A00;
                r2.setBackgroundResource(2Yu.A0H(r2.getContext(), R.attr.igds_color_secondary_background));
                throw AnonymousClass7TE.A11("getImageUrl");
            case 43:
                C67989MyH myH = (C67989MyH) r14;
                Object item28 = getItem(i);
                0qQ.A0C(item28, "null cannot be cast to non-null type com.instagram.settings.common.avatars.AvatarOptionsMenuItem");
                C70782OLc oLc = (C70782OLc) item28;
                boolean A1U = AnonymousClass7TF.A1U(0, myH, oLc);
                CircularImageView circularImageView = myH.A02;
                IgTextView igTextView2 = myH.A00;
                AnonymousClass7TF.A1B(circularImageView, 0, igTextView2);
                oLc.A00 = circularImageView;
                oLc.A00(oLc.A05);
                ? r1 = oLc.A00;
                if (r1 != 0) {
                    C71396Ojv.A00(r1, 57, oLc);
                }
                Context context4 = oLc.A02;
                String A16 = AnonymousClass7TE.A16(context4, 2131953484);
                String A162 = AnonymousClass7TE.A16(context4, 2131953486);
                SpannableStringBuilder A0B = DbZ.A0B(A16, A162);
                C46679Dj8 dj8 = new C46679Dj8(oLc, 10);
                0qQ.A0A(A0B);
                AnonymousClass7AV.A05(A0B, dj8, A162);
                igTextView2.setText(A0B);
                igTextView2.setLinksClickable(A1U);
                igTextView2.setClickable(A1U);
                DbT.A1H(igTextView2);
                break;
            case 44:
                Object item29 = getItem(i);
                0qQ.A0C(item29, "null cannot be cast to non-null type com.instagram.direct.e2ee.ui.menu.SecureMessageBannerItem");
                C69887Ntp.A00((C68182N3x) item29, (C67888MwW) r14);
                break;
            default:
                Object item30 = getItem(i);
                0qQ.A0C(item30, "null cannot be cast to non-null type com.instagram.ui.menu.MenuItem");
                C49804F7q.A01((C50989Fmc) item30, getMenuItemState(i), (C46894DnA) r14);
                break;
        }
        AnonymousClass0fU.A00(onClickListener, view);
        if (getItem(i) instanceof C74277Ps5) {
            0qQ.A0C(getItem(i), "null cannot be cast to non-null type com.instagram.ui.menu.Highlightable");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: X.DnC} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v50, resolved type: X.MwW} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v51, resolved type: X.MyH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v177, resolved type: com.instagram.igds.components.textcell.IgdsListCell} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v52, resolved type: X.MxH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v178, resolved type: com.instagram.igds.components.banner.IgdsBanner} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v54, resolved type: X.DnC} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v55, resolved type: X.DnC} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v56, resolved type: X.DnC} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v57, resolved type: X.DnC} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v59, resolved type: X.Mxi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v60, resolved type: X.Mxj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v64, resolved type: X.Dn3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v70, resolved type: X.MwO} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v71, resolved type: X.MwF} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v73, resolved type: X.Dn5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v74, resolved type: X.Dn8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v80, resolved type: X.Dn1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v83, resolved type: X.Mw9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v84, resolved type: X.DnC} */
    /* JADX WARNING: type inference failed for: r5v5, types: [X.3kE, X.Mw3] */
    /* JADX WARNING: type inference failed for: r5v10, types: [X.3kE, X.Mw4] */
    /* JADX WARNING: type inference failed for: r5v11, types: [X.MwM, X.3kE] */
    /* JADX WARNING: type inference failed for: r5v12, types: [X.3kE, X.MwP] */
    /* JADX WARNING: type inference failed for: r5v14, types: [X.Mw6, X.3kE] */
    /* JADX WARNING: type inference failed for: r5v22, types: [X.MwJ, X.3kE] */
    /* JADX WARNING: type inference failed for: r5v23, types: [X.3kE, X.Mw5] */
    /* JADX WARNING: type inference failed for: r5v25, types: [X.MwI, X.3kE] */
    /* JADX WARNING: type inference failed for: r2v4, types: [X.Msh, android.widget.FrameLayout, android.view.View, android.view.ViewGroup] */
    /* JADX WARNING: type inference failed for: r5v29, types: [X.MwG, X.3kE] */
    /* JADX WARNING: type inference failed for: r2v5, types: [X.Msg, android.widget.FrameLayout, android.view.View, android.view.ViewGroup] */
    /* JADX WARNING: type inference failed for: r5v30, types: [X.MwH, X.3kE] */
    /* JADX WARNING: type inference failed for: r5v33, types: [X.MwK, X.3kE, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v38, types: [X.3kE, X.MwC] */
    /* JADX WARNING: type inference failed for: r5v39, types: [X.3kE, X.MwE] */
    /* JADX WARNING: type inference failed for: r5v40, types: [X.MwN, X.3kE] */
    /* JADX WARNING: type inference failed for: r5v41, types: [X.Mw7, X.3kE] */
    /* JADX WARNING: type inference failed for: r2v6, types: [X.Msf, android.widget.FrameLayout, android.view.View, android.view.ViewGroup] */
    /* JADX WARNING: type inference failed for: r5v43, types: [X.3kE, X.MwD] */
    /* JADX WARNING: type inference failed for: r5v45, types: [X.Mw8, X.3kE] */
    /* JADX WARNING: type inference failed for: r5v48, types: [X.MwL, X.3kE] */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0370, code lost:
        r1.setTag(r5);
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0437, code lost:
        X.0qQ.A07(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x043a, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x04db, code lost:
        r0.setTag(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x04de, code lost:
        return r5;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C249703kE onCreateViewHolder(android.view.ViewGroup r7, int r8) {
        /*
            r6 = this;
            r4 = 0
            X.0qQ.A0B(r7, r4)
            r0 = 45
            java.lang.Integer[] r0 = X.AnonymousClass05K.A00(r0)
            r0 = r0[r8]
            int r0 = r0.intValue()
            switch(r0) {
                case 1: goto L_0x0040;
                case 2: goto L_0x0048;
                case 3: goto L_0x0050;
                case 4: goto L_0x006b;
                case 5: goto L_0x0086;
                case 6: goto L_0x00b8;
                case 7: goto L_0x00c0;
                case 8: goto L_0x00d3;
                case 9: goto L_0x0109;
                case 10: goto L_0x0124;
                case 11: goto L_0x0148;
                case 12: goto L_0x015a;
                case 13: goto L_0x016c;
                case 14: goto L_0x0174;
                case 15: goto L_0x017c;
                case 16: goto L_0x01ac;
                case 17: goto L_0x01b4;
                case 18: goto L_0x01bc;
                case 19: goto L_0x0203;
                case 20: goto L_0x0247;
                case 21: goto L_0x0259;
                case 22: goto L_0x0291;
                case 23: goto L_0x0023;
                case 24: goto L_0x02be;
                case 25: goto L_0x02c6;
                case 26: goto L_0x02e3;
                case 27: goto L_0x0310;
                case 28: goto L_0x032b;
                case 29: goto L_0x033e;
                case 30: goto L_0x034f;
                case 31: goto L_0x0360;
                case 32: goto L_0x0375;
                case 33: goto L_0x0390;
                case 34: goto L_0x03a3;
                case 35: goto L_0x03f0;
                case 36: goto L_0x0429;
                case 37: goto L_0x043b;
                case 38: goto L_0x044e;
                case 39: goto L_0x0461;
                case 40: goto L_0x0474;
                case 41: goto L_0x0487;
                case 42: goto L_0x0496;
                case 43: goto L_0x04b2;
                case 44: goto L_0x04c9;
                default: goto L_0x0013;
            }
        L_0x0013:
            android.content.Context r0 = r6.context
            X.DnA r5 = X.C49804F7q.A00(r0, r7)
            boolean r0 = r6.isElevatedSurface
            if (r0 == 0) goto L_0x0022
            android.view.View r0 = r5.itemView
            r0.setPadding(r4, r4, r4, r4)
        L_0x0022:
            return r5
        L_0x0023:
            android.view.LayoutInflater r1 = A00(r6)
            r0 = 2131629748(0x7f0e16b4, float:1.8886826E38)
            android.view.View r1 = r1.inflate(r0, r7, r4)
            X.MwL r5 = new X.MwL
            r5.<init>(r1)
            r0 = 2131440431(0x7f0b332f, float:1.8502845E38)
            android.view.View r0 = r1.requireViewById(r0)
            com.instagram.ui.widget.searchedittext.SearchEditText r0 = (com.instagram.ui.widget.searchedittext.SearchEditText) r0
            r5.A00 = r0
            goto L_0x0437
        L_0x0040:
            android.content.Context r0 = r6.context
            X.DnC r5 = X.FCV.A00(r0, r7, r4)
            goto L_0x0437
        L_0x0048:
            android.content.Context r0 = r6.context
            X.Mw9 r5 = X.ORK.A00(r0, r7)
            goto L_0x0437
        L_0x0050:
            android.view.LayoutInflater r1 = A00(r6)
            r0 = 2131629232(0x7f0e14b0, float:1.888578E38)
            android.view.View r1 = r1.inflate(r0, r7, r4)
            X.Mw8 r5 = new X.Mw8
            r5.<init>(r1)
            r0 = 2131431953(0x7f0b1211, float:1.848565E38)
            android.view.View r0 = r1.requireViewById(r0)
            r5.A00 = r0
            goto L_0x0437
        L_0x006b:
            android.content.Context r0 = r6.context
            android.view.LayoutInflater r1 = X.DbT.A0B(r0)
            r0 = 2131629226(0x7f0e14aa, float:1.8885767E38)
            android.view.View r1 = X.DbU.A0A(r1, r7, r0, r4)
            X.Mz1 r5 = new X.Mz1
            r5.<init>(r1)
            r1.setTag(r5)
            com.instagram.igds.components.switchbutton.IgdsSwitch r0 = r5.A06
            X.C48947Eml.A00(r1, r0)
            return r5
        L_0x0086:
            android.content.Context r0 = r6.context
            X.Msf r2 = new X.Msf
            r2.<init>(r0)
            android.view.LayoutInflater r1 = X.DbV.A0D(r2)
            r0 = 2131629036(0x7f0e13ec, float:1.8885382E38)
            r1.inflate(r0, r2)
            r1 = 2131440485(0x7f0b3365, float:1.8502955E38)
            android.widget.TextView r0 = X.DbU.A0G(r2, r1)
            r2.A01 = r0
            r0 = 2131440120(0x7f0b31f8, float:1.8502214E38)
            android.view.View r0 = r2.requireViewById(r0)
            r2.A00 = r0
            X.MwD r5 = new X.MwD
            r5.<init>(r2)
            r5.A01 = r2
            android.widget.TextView r0 = X.DbU.A0G(r2, r1)
            r5.A00 = r0
            goto L_0x0437
        L_0x00b8:
            android.content.Context r0 = r6.context
            X.Dn1 r5 = X.C49801F7n.A00(r0, r7)
            goto L_0x0437
        L_0x00c0:
            android.content.Context r1 = r6.context
            android.widget.RadioGroup r0 = new android.widget.RadioGroup
            r0.<init>(r1)
            X.JTS.A0x(r0)
            X.Mw7 r5 = new X.Mw7
            r5.<init>(r0)
            r5.A00 = r0
            goto L_0x0437
        L_0x00d3:
            android.view.LayoutInflater r1 = A00(r6)
            r0 = 2131629237(0x7f0e14b5, float:1.888579E38)
            android.view.View r1 = r1.inflate(r0, r7, r4)
            X.MwN r5 = new X.MwN
            r5.<init>(r1)
            r0 = 2131440554(0x7f0b33aa, float:1.8503095E38)
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = X.DbU.A0X(r1, r0)
            r5.A03 = r0
            r0 = 2131440581(0x7f0b33c5, float:1.850315E38)
            android.widget.TextView r0 = X.DbU.A0G(r1, r0)
            r5.A02 = r0
            r0 = 2131440564(0x7f0b33b4, float:1.8503115E38)
            android.widget.TextView r0 = X.DbU.A0G(r1, r0)
            r5.A00 = r0
            r0 = 2131440563(0x7f0b33b3, float:1.8503113E38)
            android.widget.TextView r0 = X.DbU.A0G(r1, r0)
            r5.A01 = r0
            goto L_0x0437
        L_0x0109:
            android.view.LayoutInflater r1 = A00(r6)
            r0 = 2131629052(0x7f0e13fc, float:1.8885414E38)
            android.view.View r1 = r1.inflate(r0, r7, r4)
            X.MwE r5 = new X.MwE
            r5.<init>(r1)
            r0 = 2131440138(0x7f0b320a, float:1.850225E38)
            android.widget.EditText r0 = X.DbU.A0E(r1, r0)
            r5.A00 = r0
            goto L_0x0370
        L_0x0124:
            android.view.LayoutInflater r1 = A00(r6)
            r0 = 2131629004(0x7f0e13cc, float:1.8885317E38)
            android.view.View r1 = r1.inflate(r0, r7, r4)
            X.MwC r5 = new X.MwC
            r5.<init>(r1)
            r0 = 2131440101(0x7f0b31e5, float:1.8502176E38)
            android.widget.ImageView r0 = X.DbU.A0F(r1, r0)
            r5.A00 = r0
            r0 = 2131440102(0x7f0b31e6, float:1.8502178E38)
            android.widget.TextView r0 = X.DbU.A0G(r1, r0)
            r5.A01 = r0
            goto L_0x0370
        L_0x0148:
            android.view.LayoutInflater r1 = A00(r6)
            r0 = 2131628219(0x7f0e10bb, float:1.8883724E38)
            android.view.View r0 = r1.inflate(r0, r7, r4)
            X.Mvz r5 = new X.Mvz
            r5.<init>(r0)
            goto L_0x0437
        L_0x015a:
            android.view.LayoutInflater r1 = A00(r6)
            r0 = 2131629222(0x7f0e14a6, float:1.8885759E38)
            android.view.View r1 = r1.inflate(r0, r7, r4)
            r0 = 5
            X.JpS r5 = new X.JpS
            r5.<init>(r1, r0)
            return r5
        L_0x016c:
            android.content.Context r0 = r6.context
            X.Dn8 r5 = X.C49160EqR.A00(r0, r7)
            goto L_0x0437
        L_0x0174:
            android.content.Context r0 = r6.context
            X.Dn5 r5 = X.C49803F7p.A00(r0, r7)
            goto L_0x0437
        L_0x017c:
            android.view.LayoutInflater r1 = A00(r6)
            r0 = 2131629155(0x7f0e1463, float:1.8885623E38)
            android.view.View r1 = r1.inflate(r0, r7, r4)
            X.MwK r5 = new X.MwK
            r5.<init>(r1)
            r0 = 2131440485(0x7f0b3365, float:1.8502955E38)
            android.widget.TextView r0 = X.DbU.A0G(r1, r0)
            r5.A02 = r0
            r0 = 2131440137(0x7f0b3209, float:1.8502249E38)
            android.view.View r0 = r1.requireViewById(r0)
            r5.A00 = r0
            r0 = 2131440484(0x7f0b3364, float:1.8502953E38)
            android.widget.TextView r0 = X.DbU.A0G(r1, r0)
            r5.A01 = r0
            r1.setTag(r5)
            goto L_0x0370
        L_0x01ac:
            android.content.Context r0 = r6.context
            X.MwF r5 = X.ORI.A00(r0, r7)
            goto L_0x0437
        L_0x01b4:
            android.content.Context r0 = r6.context
            X.MwO r5 = X.ORJ.A00(r0, r7)
            goto L_0x0437
        L_0x01bc:
            android.content.Context r0 = r6.context
            X.Msg r2 = new X.Msg
            r2.<init>(r0)
            android.view.LayoutInflater r1 = X.DbV.A0D(r2)
            r0 = 2131629037(0x7f0e13ed, float:1.8885384E38)
            r1.inflate(r0, r2)
            r0 = 2131440344(0x7f0b32d8, float:1.8502669E38)
            android.widget.TextView r0 = X.DbU.A0G(r2, r0)
            r2.A02 = r0
            r0 = 2131440463(0x7f0b334f, float:1.850291E38)
            android.widget.TextView r0 = X.DbU.A0G(r2, r0)
            r2.A01 = r0
            r0 = 2131440120(0x7f0b31f8, float:1.8502214E38)
            android.view.View r0 = r2.requireViewById(r0)
            r2.A00 = r0
            X.MwH r5 = new X.MwH
            r5.<init>(r2)
            r5.A02 = r2
            r0 = 2131440344(0x7f0b32d8, float:1.8502669E38)
            android.widget.TextView r0 = X.DbU.A0G(r2, r0)
            r5.A01 = r0
            r0 = 2131440463(0x7f0b334f, float:1.850291E38)
            android.widget.TextView r0 = X.DbU.A0G(r2, r0)
            r5.A00 = r0
            goto L_0x0437
        L_0x0203:
            android.content.Context r0 = r6.context
            X.Msh r2 = new X.Msh
            r2.<init>(r0)
            android.view.LayoutInflater r1 = X.DbV.A0D(r2)
            r0 = 2131629038(0x7f0e13ee, float:1.8885386E38)
            r1.inflate(r0, r2)
            r0 = 2131440344(0x7f0b32d8, float:1.8502669E38)
            android.widget.TextView r0 = X.AnonymousClass7TE.A0d(r2, r0)
            r2.A02 = r0
            r1 = 2131440463(0x7f0b334f, float:1.850291E38)
            android.widget.TextView r0 = X.AnonymousClass7TE.A0d(r2, r1)
            r2.A01 = r0
            r0 = 2131440121(0x7f0b31f9, float:1.8502216E38)
            android.view.View r0 = r2.findViewById(r0)
            r2.A00 = r0
            X.MwG r5 = new X.MwG
            r5.<init>(r2)
            r5.A02 = r2
            r0 = 2131440344(0x7f0b32d8, float:1.8502669E38)
            android.widget.TextView r0 = X.DbU.A0G(r2, r0)
            r5.A01 = r0
            android.widget.TextView r0 = X.DbU.A0G(r2, r1)
            r5.A00 = r0
            goto L_0x0437
        L_0x0247:
            android.view.LayoutInflater r1 = A00(r6)
            r0 = 2131629214(0x7f0e149e, float:1.8885743E38)
            android.view.View r0 = r1.inflate(r0, r7, r4)
            X.Dmv r5 = new X.Dmv
            r5.<init>(r0)
            goto L_0x0437
        L_0x0259:
            android.content.Context r0 = r6.context
            X.0qq r5 = X.AnonymousClass0qo.A00(r0)
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r0)
            r0 = 2131624321(0x7f0e0181, float:1.8875818E38)
            android.view.View r3 = r1.inflate(r0, r7, r4)
            r0 = 2131429079(0x7f0b06d7, float:1.847982E38)
            android.widget.TextView r2 = X.DbU.A0G(r3, r0)
            r0 = 2131429078(0x7f0b06d6, float:1.8479819E38)
            android.widget.TextView r1 = X.DbU.A0G(r3, r0)
            X.0qm r0 = X.0qm.A0J
            android.graphics.Typeface r0 = r5.A02(r0)
            r2.setTypeface(r0)
            X.0qm r0 = X.0qm.A0K
            android.graphics.Typeface r0 = r5.A02(r0)
            r1.setTypeface(r0)
            X.Mvy r5 = new X.Mvy
            r5.<init>(r3)
            goto L_0x0437
        L_0x0291:
            android.view.LayoutInflater r1 = A00(r6)
            r0 = 2131629137(0x7f0e1451, float:1.8885586E38)
            android.view.View r1 = r1.inflate(r0, r7, r4)
            X.MwI r5 = new X.MwI
            r5.<init>(r1)
            r0 = 2131434567(0x7f0b1c47, float:1.8490952E38)
            android.widget.ImageView r0 = X.DbU.A0F(r1, r0)
            r5.A00 = r0
            r0 = 2131434568(0x7f0b1c48, float:1.8490954E38)
            android.widget.TextView r0 = X.DbU.A0G(r1, r0)
            r5.A02 = r0
            r0 = 2131434566(0x7f0b1c46, float:1.849095E38)
            android.widget.TextView r0 = X.DbU.A0G(r1, r0)
            r5.A01 = r0
            goto L_0x0437
        L_0x02be:
            android.content.Context r0 = r6.context
            X.Dn3 r5 = X.C49802F7o.A00(r0, r7)
            goto L_0x0437
        L_0x02c6:
            android.view.LayoutInflater r1 = A00(r6)
            r0 = 2131629150(0x7f0e145e, float:1.8885613E38)
            android.view.View r1 = r1.inflate(r0, r7, r4)
            X.Mw5 r5 = new X.Mw5
            r5.<init>(r1)
            r0 = 2131433346(0x7f0b1782, float:1.8488475E38)
            android.view.View r0 = r1.findViewById(r0)
            com.instagram.common.ui.base.IgFrameLayout r0 = (com.instagram.common.ui.base.IgFrameLayout) r0
            r5.A00 = r0
            goto L_0x0437
        L_0x02e3:
            android.view.LayoutInflater r1 = A00(r6)
            r0 = 2131629151(0x7f0e145f, float:1.8885615E38)
            android.view.View r1 = r1.inflate(r0, r7, r4)
            X.MwJ r5 = new X.MwJ
            r5.<init>(r1)
            r0 = 2131440485(0x7f0b3365, float:1.8502955E38)
            android.widget.TextView r0 = X.DbU.A0G(r1, r0)
            r5.A02 = r0
            r0 = 2131440137(0x7f0b3209, float:1.8502249E38)
            android.view.View r0 = r1.requireViewById(r0)
            r5.A00 = r0
            r0 = 2131440482(0x7f0b3362, float:1.8502949E38)
            android.widget.ImageView r0 = X.DbS.A0G(r1, r0)
            r5.A01 = r0
            goto L_0x0437
        L_0x0310:
            android.view.LayoutInflater r1 = A00(r6)
            r0 = 2131629142(0x7f0e1456, float:1.8885597E38)
            android.view.View r1 = r1.inflate(r0, r7, r4)
            X.Mxk r0 = new X.Mxk
            r0.<init>(r1)
            r1.setTag(r0)
            java.lang.Object r5 = X.DbT.A0o(r1)
            X.3kE r5 = (X.C249703kE) r5
            goto L_0x0437
        L_0x032b:
            android.content.Context r0 = r6.context
            android.view.LayoutInflater r1 = X.DbT.A0B(r0)
            r0 = 2131629138(0x7f0e1452, float:1.8885588E38)
            android.view.View r0 = X.DbU.A09(r1, r7, r0, r4)
            X.MyG r5 = new X.MyG
            r5.<init>(r0)
            return r5
        L_0x033e:
            android.view.LayoutInflater r1 = A00(r6)
            r0 = 2131629033(0x7f0e13e9, float:1.8885375E38)
            android.view.View r0 = r1.inflate(r0, r7, r4)
            X.MxG r5 = new X.MxG
            r5.<init>(r0)
            return r5
        L_0x034f:
            android.view.LayoutInflater r1 = A00(r6)
            r0 = 2131629030(0x7f0e13e6, float:1.888537E38)
            android.view.View r1 = r1.inflate(r0, r7, r4)
            X.Mxj r5 = new X.Mxj
            r5.<init>(r1)
            goto L_0x0370
        L_0x0360:
            android.view.LayoutInflater r1 = A00(r6)
            r0 = 2131629029(0x7f0e13e5, float:1.8885367E38)
            android.view.View r1 = r1.inflate(r0, r7, r4)
            X.Mxi r5 = new X.Mxi
            r5.<init>(r1)
        L_0x0370:
            r1.setTag(r5)
            goto L_0x0437
        L_0x0375:
            android.view.LayoutInflater r1 = A00(r6)
            r0 = 2131629154(0x7f0e1462, float:1.888562E38)
            android.view.View r1 = r1.inflate(r0, r7, r4)
            X.Mw6 r5 = new X.Mw6
            r5.<init>(r1)
            r0 = 2131435511(0x7f0b1ff7, float:1.8492866E38)
            android.widget.TextView r0 = X.AnonymousClass7TE.A0d(r1, r0)
            r5.A00 = r0
            goto L_0x0437
        L_0x0390:
            android.content.Context r0 = r6.context
            android.view.LayoutInflater r1 = X.DbT.A0B(r0)
            r0 = 2131629042(0x7f0e13f2, float:1.8885394E38)
            android.view.View r0 = X.DbT.A0D(r1, r7, r0, r4)
            X.MyF r5 = new X.MyF
            r5.<init>(r0)
            return r5
        L_0x03a3:
            android.view.LayoutInflater r1 = A00(r6)
            r0 = 2131624614(0x7f0e02a6, float:1.8876413E38)
            android.view.View r1 = r1.inflate(r0, r7, r4)
            X.MwP r5 = new X.MwP
            r5.<init>(r1)
            r0 = 2131427473(0x7f0b0091, float:1.8476563E38)
            android.view.View r0 = r1.findViewById(r0)
            com.instagram.common.ui.base.IgFrameLayout r0 = (com.instagram.common.ui.base.IgFrameLayout) r0
            r5.A00 = r0
            r0 = 2131427474(0x7f0b0092, float:1.8476565E38)
            android.view.View r0 = r1.findViewById(r0)
            com.instagram.common.ui.text.TitleTextView r0 = (com.instagram.common.ui.text.TitleTextView) r0
            r5.A03 = r0
            r0 = 2131427477(0x7f0b0095, float:1.8476571E38)
            com.instagram.common.ui.base.IgTextView r0 = X.JTO.A0X(r1, r0)
            r5.A01 = r0
            r0 = 2131432704(0x7f0b1500, float:1.8487173E38)
            android.view.View r0 = r1.findViewById(r0)
            com.instagram.common.ui.text.TitleTextView r0 = (com.instagram.common.ui.text.TitleTextView) r0
            r5.A04 = r0
            r0 = 2131432705(0x7f0b1501, float:1.8487175E38)
            com.instagram.common.ui.base.IgTextView r0 = X.JTO.A0X(r1, r0)
            r5.A02 = r0
            r0 = 2131430538(0x7f0b0c8a, float:1.848278E38)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = X.JTO.A0Y(r1, r0)
            r5.A05 = r0
            goto L_0x0437
        L_0x03f0:
            android.view.LayoutInflater r1 = A00(r6)
            r0 = 2131624613(0x7f0e02a5, float:1.887641E38)
            android.view.View r1 = r1.inflate(r0, r7, r4)
            X.MwM r5 = new X.MwM
            r5.<init>(r1)
            r0 = 2131427473(0x7f0b0091, float:1.8476563E38)
            android.view.View r0 = r1.findViewById(r0)
            androidx.cardview.widget.CardView r0 = (androidx.cardview.widget.CardView) r0
            r5.A00 = r0
            r0 = 2131427474(0x7f0b0092, float:1.8476565E38)
            com.instagram.common.ui.base.IgTextView r0 = X.JTO.A0X(r1, r0)
            r5.A03 = r0
            r0 = 2131427472(0x7f0b0090, float:1.8476561E38)
            com.instagram.common.ui.base.IgTextView r0 = X.JTO.A0X(r1, r0)
            r5.A02 = r0
            r0 = 2131427475(0x7f0b0093, float:1.8476567E38)
            android.view.View r0 = r1.findViewById(r0)
            com.instagram.common.ui.base.IgLinearLayout r0 = (com.instagram.common.ui.base.IgLinearLayout) r0
            r5.A01 = r0
            goto L_0x0437
        L_0x0429:
            android.content.Context r1 = r6.context
            com.instagram.igds.components.textcell.IgdsListCell r0 = new com.instagram.igds.components.textcell.IgdsListCell
            r0.<init>(r1)
            X.Mw4 r5 = new X.Mw4
            r5.<init>(r0)
            r5.A00 = r0
        L_0x0437:
            X.0qQ.A07(r5)
            return r5
        L_0x043b:
            android.content.Context r0 = r6.context
            android.view.LayoutInflater r1 = X.DbT.A0B(r0)
            r0 = 2131628162(0x7f0e1082, float:1.8883609E38)
            android.view.View r0 = X.DbU.A09(r1, r7, r0, r4)
            X.MyZ r5 = new X.MyZ
            r5.<init>(r0)
            return r5
        L_0x044e:
            android.content.Context r0 = r6.context
            android.view.LayoutInflater r1 = X.DbT.A0B(r0)
            r0 = 2131623965(0x7f0e001d, float:1.8875096E38)
            android.view.View r0 = X.DbU.A09(r1, r7, r0, r4)
            X.MyE r5 = new X.MyE
            r5.<init>(r0)
            return r5
        L_0x0461:
            android.content.Context r0 = r6.context
            android.view.LayoutInflater r1 = X.DbT.A0B(r0)
            r0 = 2131623964(0x7f0e001c, float:1.8875094E38)
            android.view.View r0 = X.DbU.A09(r1, r7, r0, r4)
            X.Mxh r5 = new X.Mxh
            r5.<init>(r0)
            return r5
        L_0x0474:
            android.content.Context r2 = r6.context
            X.0qQ.A0B(r2, r4)
            r1 = 0
            com.instagram.igds.components.banner.IgdsBanner r0 = new com.instagram.igds.components.banner.IgdsBanner
            r0.<init>(r2, r1, r4)
            X.Mw3 r5 = new X.Mw3
            r5.<init>(r0)
            r5.A00 = r0
            goto L_0x04db
        L_0x0487:
            android.content.Context r0 = r6.context
            X.0qQ.A0B(r0, r4)
            com.instagram.igds.components.textcell.IgdsListCell r0 = X.C66581MXm.A0d(r0)
            X.MxH r5 = new X.MxH
            r5.<init>(r0)
            goto L_0x04db
        L_0x0496:
            android.content.Context r0 = r6.context
            X.0iw r2 = r6.analyticsModule
            if (r2 == 0) goto L_0x04ad
            android.view.LayoutInflater r1 = X.DbT.A0B(r0)
            r0 = 2131629039(0x7f0e13ef, float:1.8885388E38)
            android.view.View r0 = X.DbU.A09(r1, r7, r0, r4)
            X.MyY r5 = new X.MyY
            r5.<init>(r0, r2)
            return r5
        L_0x04ad:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x04b2:
            X.0lg r3 = r6.session
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            android.content.Context r2 = r6.context
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r2)
            r0 = 2131624192(0x7f0e0100, float:1.8875557E38)
            android.view.View r0 = X.DbU.A09(r1, r7, r0, r4)
            X.MyH r5 = new X.MyH
            r5.<init>(r2, r0, r3)
            goto L_0x04db
        L_0x04c9:
            android.content.Context r0 = r6.context
            android.view.LayoutInflater r1 = X.DbT.A0B(r0)
            r0 = 2131627461(0x7f0e0dc5, float:1.8882187E38)
            android.view.View r0 = X.DbU.A09(r1, r7, r0, r4)
            X.MwW r5 = new X.MwW
            r5.<init>(r0)
        L_0x04db:
            r0.setTag(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68504NKx.onCreateViewHolder(android.view.ViewGroup, int):X.3kE");
    }

    public final void setBottomSheetMenuItems(Collection collection) {
        0qQ.A0B(collection, 0);
        this.objects.clear();
        this.isElevatedSurface = true;
        this.objects.addAll(collection);
        notifyDataSetChanged();
    }

    public final void setItems(Collection collection) {
        0qQ.A0B(collection, 0);
        this.objects.clear();
        this.objects.addAll(collection);
        notifyDataSetChanged();
    }

    public static LayoutInflater A00(C68504NKx nKx) {
        return LayoutInflater.from(nKx.context);
    }

    public final void addMenuItemWithAnimation(Object obj, int i) {
        if (!00k.A0u(this.objects, obj)) {
            this.toAnimateMoveInItems.add(Integer.valueOf(i));
            List list = this.objects;
            0qQ.A0A(obj);
            list.add(i, obj);
        }
        notifyDataSetChanged();
    }

    public int getCount() {
        return this.objects.size();
    }

    public Object getItem(int i) {
        return this.objects.get(i);
    }

    public final int getPosition(Object obj) {
        List list = this.objects;
        0qQ.A0B(list, 0);
        return list.indexOf(obj);
    }

    public int getViewTypeCount() {
        return AnonymousClass05K.A00(45).length;
    }

    public int getItemCount() {
        int A03 = AnonymousClass0fD.A03(-1516114635);
        int size = this.objects.size();
        AnonymousClass0fD.A0A(2037096917, A03);
        return size;
    }

    public long getItemId(int i) {
        AnonymousClass0fD.A0A(-566630962, AnonymousClass0fD.A03(-243531129));
        return 0;
    }

    public int getItemViewType(int i) {
        Integer num;
        int A03 = AnonymousClass0fD.A03(2092575728);
        Object item = getItem(i);
        if (item instanceof C49605EzO) {
            num = AnonymousClass05K.A0G;
        } else if (item instanceof C46448DfA) {
            num = AnonymousClass05K.A01;
        } else if (item instanceof C70944OSr) {
            num = AnonymousClass05K.A0N;
        } else if (item instanceof FGF) {
            num = AnonymousClass05K.A0C;
        } else if (item instanceof PR9) {
            num = AnonymousClass05K.A0Y;
        } else if (item instanceof OGV) {
            num = AnonymousClass05K.A0A;
        } else if (item instanceof OGU) {
            num = AnonymousClass05K.A0B;
        } else if (item instanceof C70659OFg) {
            num = AnonymousClass05K.A0j;
        } else if (item instanceof PR8) {
            num = AnonymousClass05K.A0U;
        } else if (item instanceof C67293MlS) {
            num = AnonymousClass05K.A0u;
        } else if (item instanceof C70962OTj) {
            num = AnonymousClass05K.A15;
        } else if (item instanceof C71277OhI) {
            num = AnonymousClass05K.A1I;
        } else if (item instanceof C70344O2w) {
            num = AnonymousClass05K.A03;
        } else if (item instanceof OAN) {
            num = AnonymousClass05K.A04;
        } else if (item instanceof C49862FAc) {
            num = AnonymousClass05K.A06;
        } else if (item instanceof C71065Oak) {
            num = AnonymousClass05K.A09;
        } else if (item instanceof C70966OTn) {
            num = AnonymousClass05K.A07;
        } else if (item instanceof PR7) {
            num = AnonymousClass05K.A08;
        } else if (item instanceof EyQ) {
            num = AnonymousClass05K.A0D;
        } else if (item instanceof FAZ) {
            num = AnonymousClass05K.A0H;
        } else if (item instanceof C70661OFi) {
            num = AnonymousClass05K.A0K;
        } else if (item instanceof C70660OFh) {
            num = AnonymousClass05K.A0L;
        } else if (item instanceof OTE) {
            num = AnonymousClass05K.A0M;
        } else if (item instanceof C70658OFf) {
            num = AnonymousClass05K.A0O;
        } else if (item instanceof OAM) {
            num = AnonymousClass05K.A0P;
        } else if (item instanceof C49410EvC) {
            num = AnonymousClass05K.A0R;
        } else if (C61057Jvv.A00(4, item)) {
            num = AnonymousClass05K.A0Z;
        } else if (item instanceof OIM) {
            num = AnonymousClass05K.A0a;
        } else if (item instanceof C70782OLc) {
            num = AnonymousClass05K.A0c;
        } else if (!(item instanceof C68182N3x) || ((C68182N3x) item).A00 != 1) {
            num = AnonymousClass05K.A00;
        } else {
            num = AnonymousClass05K.A0d;
        }
        int intValue = num.intValue();
        AnonymousClass0fD.A0A(-896939132, A03);
        return intValue;
    }

    public void updateListView() {
        C68504NKx.super.updateListView();
    }

    public final void setAreRowDividersEnabled(boolean z) {
        this.areRowDividersEnabled = z;
    }

    public final void setRoundDialogBottomCorners(boolean z) {
        this.roundDialogBottomCorners = z;
    }

    public final void setRoundDialogTopCorners(boolean z) {
        this.roundDialogTopCorners = z;
    }

    public final void setShouldCenterText(boolean z) {
        this.shouldCenterText = z;
    }

    public final void setSwitchItemViewPointDelegate(C74279Ps7 ps7) {
        this.switchItemViewPointDelegate = ps7;
    }
}
