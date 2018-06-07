package app.bkjk.bkjkimagepicker.view;

import android.content.Context;
import android.support.v7.widget.AppCompatCheckBox;
import android.util.AttributeSet;
import android.view.SoundEffectConstants;

/**
 * ================================================
 * 作    者：wudi
 * 版    本：
 * 创建日期：2018/6/4
 * 描    述：带声音的CheckBox
 * 修订历史：
 * ================================================
 */
public class IPSuperCheckBox extends AppCompatCheckBox {

    public IPSuperCheckBox(Context context) {
        super(context);
    }

    public IPSuperCheckBox(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public IPSuperCheckBox(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public boolean performClick() {
        final boolean handled = super.performClick();
        if (!handled) {
            // View only makes a sound effect if the onClickListener was
            // called, so we'll need to make one here instead.
            playSoundEffect(SoundEffectConstants.CLICK);
        }
        return handled;
    }
}
