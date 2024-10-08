package X;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.style.TypefaceSpan;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Mo8  reason: case insensitive filesystem */
public final class C67453Mo8 {
    public static final C67455MoA A00 = new C67455MoA();
    public static final C67453Mo8 A01 = new Object();
    public static final 11S A02 = new 11S(".*[ऀ-ॿঀ-৿਀-੿઀-૿଀-୿஀-௿ఀ-౿ಀ-೿ഀ-ൿ඀-෿฀-๿຀-໿ༀ-࿿က-႟ᜀ-ᜟᜠ-᜿ᝀ-᝟ᝠ-᝿ក-៿ᤀ-᥏ᥐ-᥿ᦀ-᧟᧠-᧿ᨀ-᨟ᨠ-᪯ᬀ-᭿ᮀ-ᮿᯀ-᯿ᰀ-ᱏ᳀-᳏ꠀ-꠯ꡀ-꡿ꢀ-꣟꣠-ꣿꤰ-꥟ꦀ-꧟ꧠ-꧿ꨀ-꩟ꩠ-ꩿꪀ-꫟ꫠ-꫿ꯀ-꯿֐-׿؀-ۿݐ–ݿࢠ–ࣿﭐ–﷿ﹰ–﻿඀-෿຀-໿].*");

    public static final void A00(SpannableString spannableString, List list, int i, int i2) {
        TypefaceSpan typefaceSpan;
        for (int i3 = i; i3 < i2; i3++) {
            if (!Character.isWhitespace(spannableString.charAt(i3))) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    it.next();
                    Typeface A012 = 0oh.A01((Context) null);
                    if (!0oh.A08() || A012 == null) {
                        typefaceSpan = new TypefaceSpan("sans-serif-medium");
                    } else {
                        typefaceSpan = new TypefaceSpan(A012);
                    }
                    spannableString.setSpan(typefaceSpan, i, i2, 17);
                }
                return;
            }
        }
    }
}
