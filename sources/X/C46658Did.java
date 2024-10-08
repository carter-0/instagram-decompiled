package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.avatar.ui.UpdateProfilePicturePagerAdapter$UpdateProfileTabType;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Did  reason: case insensitive filesystem */
public final class C46658Did extends C14191TrW {
    public boolean A00 = false;
    public boolean A01;
    public final UserSession A02;
    public final String A03;
    public final String A04;
    public final List A05;
    public final boolean A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C46658Did(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2, List list, boolean z) {
        super(fragmentActivity.getSupportFragmentManager(), fragmentActivity.getLifecycle());
        C317936o5 r2 = new C317936o5(userSession);
        0qQ.A0B(userSession, 2);
        this.A02 = userSession;
        this.A04 = str;
        this.A03 = str2;
        this.A06 = z;
        this.A05 = list;
        this.A01 = r2.A05();
    }

    public final boolean A06(long j) {
        return 0 <= j && j < 2;
    }

    public final Fragment A03(int i) {
        UpdateProfilePicturePagerAdapter$UpdateProfileTabType updateProfilePicturePagerAdapter$UpdateProfileTabType;
        int ordinal = ((UpdateProfilePicturePagerAdapter$UpdateProfileTabType) this.A05.get(i)).ordinal();
        if (ordinal == 0) {
            updateProfilePicturePagerAdapter$UpdateProfileTabType = UpdateProfilePicturePagerAdapter$UpdateProfileTabType.UPDATE_PROFILE_PICTURE_TAB;
        } else if (ordinal != 1) {
            throw AnonymousClass7TE.A1K();
        } else if (this.A01) {
            String str = this.A04;
            EtE etE = new EtE(this);
            Bundle A0B = DbV.A0B(str, 0);
            A0B.putString("args_editor_logging_surface", str);
            C47391DxN dxN = new C47391DxN();
            dxN.setArguments(A0B);
            dxN.A00 = etE;
            return dxN;
        } else {
            updateProfilePicturePagerAdapter$UpdateProfileTabType = UpdateProfilePicturePagerAdapter$UpdateProfileTabType.UPDATE_AVATAR_TAB;
        }
        UserSession userSession = this.A02;
        String str2 = this.A04;
        String str3 = this.A03;
        boolean z = this.A06;
        boolean z2 = this.A00;
        AnonymousClass7TG.A1U(userSession, str2, str3);
        C46654DiZ diZ = new C46654DiZ();
        DbT.A1N(diZ, new 0eP[]{AnonymousClass7TE.A1L("IgSessionManager.SESSION_TOKEN_KEY", userSession.A05), AnonymousClass7TE.A1L("tab_type_key", updateProfilePicturePagerAdapter$UpdateProfileTabType), AnonymousClass7TE.A1L("logging_surface_key", str2), AnonymousClass7TE.A1L("logging_mechanism_key", str3), AnonymousClass7TE.A1L("coin_flip_setting_value_key", Boolean.valueOf(z)), AnonymousClass7TE.A1L("is_tied_to_avatar", Boolean.valueOf(z2))});
        return diZ;
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(-1824556701);
        int size = this.A05.size();
        AnonymousClass0fD.A0A(-729189940, A032);
        return size;
    }

    public final long getItemId(int i) {
        long j;
        int A032 = AnonymousClass0fD.A03(1664095169);
        if (i != 1 || !this.A01) {
            j = (long) i;
        } else {
            j = 2;
        }
        AnonymousClass0fD.A0A(-1073494569, A032);
        return j;
    }
}
