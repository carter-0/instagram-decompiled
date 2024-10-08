package X;

import com.google.common.collect.ImmutableMap;
import java.util.Set;

/* renamed from: X.TTz  reason: case insensitive filesystem */
public final class C13300TTz extends 0Yg implements C62320sa {
    public static final C13300TTz A00 = new C13300TTz();

    public C13300TTz() {
        super(0);
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        ImmutableMap.Builder A0Q = Pxf.A0Q();
        AnonymousClass0eM r3 = STI.A0C;
        return Pxe.A0Z(A0Q, "cc-number", Pxh.A0z("cc[_\\-\\s]?number|credit[_\\-\\s]?card[_\\-\\s]?number|card[_\\-\\s]?Number|cc[_\\-\\s]?num|card[_\\-\\s]?No|number[_\\-\\s]?cc|card[_\\-\\s]?num|num[_\\-\\s]?card|number[_\\-\\s]?card|numer[_\\-\\s]?karty|n[uú]m[eé]ro.+tarjeta|n[uú]m[eé]ro.+carte|^[0123456789xX•]{4}[- ][0123456789xX•]{4}[- ][0123456789xX•]{4}[- ][0123456789xX•]{4}$", Pxi.A0o(A0Q, "cc-csc", Pxh.A0z("cvv|cc[\\-_\\s]?csc|credit[\\-_\\s]?card[\\-_\\s]?cvc|cvv[\\-_\\s]?num|payment\\[card[\\-_\\s]?code\\]|payment[\\-_\\s:]?ccv|cvc|payment\\.cvc|[sS]ecurity.*[cC]ode|[cC]v[vn]|CV[VN]", Pxi.A0o(A0Q, "cc-exp", Pxh.A0z("cc[\\-_\\s]?exp|expiryDate|expiry|[eE]xpir.*[dD]ate|[eE]xp.*[dD]ate|[cC]ard.*[eE]xpir|([cC]ard|[eE]xpir).*(.)\\2 *[/] *(.)\\3\\3?\\3?|expiration|mm\\s*[\\-_/]\\s*aa|mm\\s*[\\-_/]\\s*yy", Pxi.A0o(A0Q, "cc-exp-month", Pxh.A0z("cc[\\-_\\s]?exp[\\-_\\s]?month|exp[\\-_\\s]?month|credit[\\-_\\s]?card[\\-_\\s]?month|card[\\-_\\s]?exp[\\-_\\s]?month|[eE]xpir.*[mM]onth|[cC]redit.*[cC]ard.*[mM]onth", Pxi.A0o(A0Q, "cc-exp-year", Pxh.A0z("cc[\\-_\\s]?exp[\\-_\\s]?year|exp[\\-_\\s]?year|credit[\\-_\\s]?card[\\-_\\s]?year|card[\\-_\\s]?exp[\\-_\\s]?year|[eE]xpir.*[yY]ear|[cC]redit.*[cC]ard.*[yY]ear", Pxi.A0o(A0Q, "cc-type", Pxh.A0z("cc-type", Pxi.A0o(A0Q, "cc-name", Pxh.A0z("cc[\\-_\\s]?name|[nN]ame.*[oO]n.*[cC]ard|[cC]ard.*[nN]ame|[cC][cC].?[nN]ame|[cC]ard.*[oO]wner|[cC]ard.*[hH]older.*[nN]ame", Pxi.A0o(A0Q, "cc-family-name", Pxh.A0z("cc[\\-_\\s]?family[\\-_\\s]?name|[cC]ard.*[lL]ast.*[nN]ame|[cC]ard.*[fF]amily.*[nN]ame", Pxi.A0o(A0Q, "cc-additional-name", Pxh.A0z("cc[\\-_\\s]?additional[\\-_\\s]?name", (Set) r3.getValue()), r3)), r3)), r3)), r3)), r3)), r3)), r3)), r3)));
    }
}
