package com.instagram.debug.devoptions.helper;

import X.002;
import X.0qQ;
import X.C358248ab;
import X.C59689JTv;
import X.DbT;
import X.DbY;
import X.PR9;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import com.instagram.debug.devoptions.helper.DevOptionsHelper;

public final class DevOptionsHelper$Companion$addLongPressToPin$2$1 implements View.OnLongClickListener {
    public final /* synthetic */ DevOptionsHelper.OnPinnedDevOptionItemAdded $onPinnedDevOptionItemAdded;
    public final /* synthetic */ PR9 $this_apply;

    public DevOptionsHelper$Companion$addLongPressToPin$2$1(PR9 pr9, DevOptionsHelper.OnPinnedDevOptionItemAdded onPinnedDevOptionItemAdded) {
        this.$this_apply = pr9;
        this.$onPinnedDevOptionItemAdded = onPinnedDevOptionItemAdded;
    }

    public final boolean onLongClick(View view) {
        final Context context = view.getContext();
        PR9 pr9 = this.$this_apply;
        0qQ.A0A(context);
        0qQ.A0B(context, 0);
        Object obj = pr9.A0B;
        if (obj == null) {
            obj = context.getString(pr9.A04);
        }
        final String obj2 = obj.toString();
        if (DevOptionsHelper.Companion.isPinnedItem(obj2)) {
            return false;
        }
        C358248ab r2 = new C358248ab(context);
        r2.A09(2131952258);
        DbY.A0w(context, r2, obj2, 2131971258);
        final DevOptionsHelper.OnPinnedDevOptionItemAdded onPinnedDevOptionItemAdded = this.$onPinnedDevOptionItemAdded;
        r2.A0E(new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                DevOptionsHelper.Companion.storePinnedItemInPrefs(obj2);
                onPinnedDevOptionItemAdded.onMenuItemAdded();
                C59689JTv.A09(context, 002.A0R("Added ", obj2));
            }
        });
        r2.A0s(true);
        r2.A05();
        DbT.A1V(r2);
        return true;
    }
}
