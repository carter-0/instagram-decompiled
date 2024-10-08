package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class UAC extends 2Rw {
    public Integer A00 = AnonymousClass05K.A00;
    public String A01 = "";
    public final C17783Vfu A02;
    public final List A03 = new ArrayList();
    public final AnonymousClass0iw A04;
    public final X1Z A05 = new C19570Wbu(this, 0);
    public final C20848X1a A06 = new C19576Wc0(this, 0);

    public final void onBindViewHolder(C249703kE r15, int i) {
        C249703kE r8 = r15;
        0qQ.A0B(r15, 0);
        int i2 = r15.mItemViewType;
        C18043VkR vkR = null;
        if (i2 == 0 || i2 == 1 || i2 == 2) {
            vkR = (C18043VkR) this.A03.get(i);
            VYg A002 = vkR.A00();
            if (i2 == 0) {
                UCH uch = (UCH) r8;
                0qQ.A0A(A002);
                VPN vpn = A002.A03;
                0qQ.A0A(vpn);
                String str = vpn.A00;
                if (str != null) {
                    0qQ.A0B(uch, 0);
                    uch.A00.setText(str);
                    return;
                }
                throw AnonymousClass7TE.A0y();
            }
        }
        if (i2 == 1) {
            0qQ.A0A(vkR);
            C18250VoH.A01((C53290Glc) null, (JZA) null, this.A04, this.A05, (C14823UBc) r8, vkR, this.A01, true);
        } else if (i2 == 2) {
            0qQ.A0A(vkR);
            VGX.A00((C53290Glc) null, (JZA) null, this.A04, this.A06, (UEF) r8, (VPB) null, vkR, this.A01, true, true);
        } else if (i2 == 3) {
            VGY.A00((C14861UCp) r8, this.A01);
        }
    }

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        0qQ.A0B(viewGroup, 0);
        switch (i) {
            case 0:
                return new UCH(DbT.A0D(JTP.A0G(viewGroup), viewGroup, R.layout.publishing_title_row, false));
            case 1:
                return C18250VoH.A00(viewGroup);
            case 2:
                return new UEF(DbT.A0D(JTP.A0G(viewGroup), viewGroup, R.layout.publishing_product_row, false));
            case 3:
                C14861UCp uCp = new C14861UCp(DbT.A0D(JTP.A0G(viewGroup), viewGroup, R.layout.product_picker_spinner_and_message_row, false));
                uCp.A01.setVisibility(0);
                return uCp;
            case 4:
                View inflate = JTP.A0G(viewGroup).inflate(R.layout.product_row_no_results, viewGroup, false);
                DbT.A1F(inflate, R.id.row_no_results_title, 0);
                DbT.A1F(inflate, R.id.row_no_results_message, 0);
                DbX.A1B(inflate, R.id.row_invalid_catalog_message);
                return new C249703kE(inflate);
            case 5:
                UCG ucg = new UCG(DbT.A0D(JTP.A0G(viewGroup), viewGroup, R.layout.product_picker_spinner_and_message_row, false));
                ucg.A00.setText(2131969816);
                return ucg;
            case 6:
                UCF ucf = new UCF(DbT.A0D(JTP.A0G(viewGroup), viewGroup, R.layout.product_picker_spinner_row, false));
                ucf.A00.setVisibility(0);
                return ucf;
            default:
                throw new IllegalStateException("ViewType was not Recognized while creating a row.");
        }
    }

    public final int A00() {
        Integer num = this.A00;
        if (num != AnonymousClass05K.A01 && num != AnonymousClass05K.A0Y) {
            return 0;
        }
        List<C18043VkR> list = this.A03;
        0qQ.A0B(list, 0);
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        for (C18043VkR A022 : list) {
            A0r.add(VH2.A00(A022.A02()));
        }
        int i = 0;
        if ((A0r instanceof Collection) && A0r.isEmpty()) {
            return 0;
        }
        for (Object next : A0r) {
            if ((next == C16551Uwy.SECTION_TYPE_ITEM || next == C16551Uwy.SECTION_TYPE_GROUP) && (i = i + 1) < 0) {
                0sr.A1S();
                throw AnonymousClass00P.createAndThrow();
            }
        }
        return i;
    }

    public final List A01() {
        Integer num = this.A00;
        if (num != AnonymousClass05K.A01 && num != AnonymousClass05K.A0Y) {
            return null;
        }
        List<C18043VkR> list = this.A03;
        0qQ.A0B(list, 0);
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        for (C18043VkR vkR : list) {
            String str = vkR.A01;
            if (str != null) {
                A0r.add(str);
            } else {
                0qQ.A0F("sectionGroup");
                throw AnonymousClass00P.createAndThrow();
            }
        }
        return 00k.A0W(A0r);
    }

    public UAC(AnonymousClass0iw r3, C17783Vfu vfu) {
        this.A04 = r3;
        this.A02 = vfu;
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(-1477272400);
        int intValue = this.A00.intValue();
        int i = 1;
        if (intValue == 1) {
            i = this.A03.size();
        } else if (intValue == 4) {
            i = 1 + this.A03.size();
        } else if (!(intValue == 0 || intValue == 3 || intValue == 2)) {
            IllegalStateException illegalStateException = new IllegalStateException("Unknown State while determining item count.");
            AnonymousClass0fD.A0A(-1570332015, A032);
            throw illegalStateException;
        }
        AnonymousClass0fD.A0A(60519372, A032);
        return i;
    }

    public final int getItemViewType(int i) {
        IllegalStateException illegalStateException;
        int i2;
        int i3;
        int A032 = AnonymousClass0fD.A03(803620213);
        Integer num = this.A00;
        int intValue = num.intValue();
        int i4 = 5;
        if (intValue == 1 || intValue == 4) {
            if (num == AnonymousClass05K.A0Y && i == getItemCount() - 1) {
                i4 = 6;
                i3 = 1344160019;
                AnonymousClass0fD.A0A(i3, A032);
                return i4;
            }
            String A022 = ((C18043VkR) this.A03.get(i)).A02();
            if (0qQ.A0K(A022, "product_list_header")) {
                i4 = 0;
            } else if (0qQ.A0K(A022, "product_group_list_item")) {
                i4 = 1;
            } else if (0qQ.A0K(A022, "product_item_list_item")) {
                i4 = 2;
            } else {
                illegalStateException = new IllegalStateException("LayoutContent has no recognized content available for the adapter to display.");
                i2 = -287657130;
                AnonymousClass0fD.A0A(i2, A032);
                throw illegalStateException;
            }
        } else if (intValue == 0) {
            i4 = 3;
        } else if (intValue != 3) {
            if (intValue == 2) {
                i4 = 4;
            } else {
                illegalStateException = new IllegalStateException("Could not determine item view type for current state.");
                i2 = 115083760;
                AnonymousClass0fD.A0A(i2, A032);
                throw illegalStateException;
            }
        }
        i3 = -1472374193;
        AnonymousClass0fD.A0A(i3, A032);
        return i4;
    }
}
