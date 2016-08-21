package com.lhf.test.newtoasttest;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * com.lhf.test.newtoasttest
 * Created by zeratel3000
 * on 2016 08 16/8/21 11 49
 * description
 */
public class ToastUtil2 {

    private static Toast toast;

    public static void shortText(Context context, String text) {
        View view = View.inflate(context,R.layout.toast,null);
        ((TextView)view.findViewById(R.id.tv)).setText(text);
        toast = new Toast(context);
        toast.setView(view);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.show();
    }

}