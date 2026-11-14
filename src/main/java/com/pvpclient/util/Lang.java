package com.pvpclient.util;

import com.pvpclient.PvpClient;

import java.util.HashMap;
import java.util.Map;

/** Display-only translation (English keys stay in the code and in the config file). */
public final class Lang {
    private static final Map<String, String> RU = new HashMap<>();

    private Lang() {}

    public static boolean ru() {
        return PvpClient.settings() != null && PvpClient.settings().language.get() == 1;
    }

    public static String tr(String s) {
        return ru() ? RU.getOrDefault(s, s) : s;
    }

    private static void p(String en, String ru) { RU.put(en, ru); }

    static {
        // categories
        p("Combat", "Бой"); p("Visuals", "Визуал"); p("HUD", "HUD"); p("Settings", "Настройки");
        // modules
        p("KillAura", "Килл Аура"); p("TriggerBot", "Триггер Бот"); p("Hitbox", "Хитбокс");
        p("Player ESP", "ESP игроков"); p("Chest ESP", "ESP сундуков"); p("Player Info", "Инфо об игроках");
        p("CPS Counter", "Счётчик CPS"); p("FPS Counter", "Счётчик FPS"); p("Ping Counter", "Счётчик пинга");
        p("Keystrokes", "Клавиши"); p("Interface", "Интерфейс");
        // descriptions
        p("Practice mode: auto-aim, follow and hit (private worlds only)", "Тренировка: автонаводка, бег за целью и удары (только приватные миры)");
        p("Practice mode: attacks when the crosshair is on a target", "Тренировка: бьёт, когда прицел на цели (только приватные миры)");
        p("Enlarges other players' hitboxes (private worlds only)", "Увеличивает хитбоксы других игроков (только приватные миры)");
        p("Outline boxes around players (private worlds only)", "Рамки вокруг игроков (только приватные миры)");
        p("Colored outlines for chests, barrels and shulkers (private worlds only)", "Цветные рамки сундуков, бочек и шалкеров (только приватные миры)");
        p("Floating panel with name, armor, enchants and held item (private worlds only)", "Панель над игроком: ник, броня, зачарования, предмет (только приватные миры)");
        p("Clicks per second", "Клики в секунду"); p("Frames per second", "Кадры в секунду");
        p("Latency to the server", "Задержка до сервера"); p("WASD, mouse buttons and space", "WASD, кнопки мыши и пробел");
        p("Menu scale, animations and theme colors", "Масштаб меню, анимации, цвета и язык");
        // KillAura / TriggerBot settings
        p("Auto Hit", "Авто удар"); p("Auto Aim", "Автонаводка"); p("Aim At", "Целиться в");
        p("Aim Speed (deg/s)", "Скорость наводки (°/с)"); p("Auto Follow", "Бег за целью");
        p("Auto Sprint", "Авто спринт"); p("Target Range", "Дальность цели");
        p("Follow Stop Distance", "Дистанция остановки"); p("Attack Range", "Дальность удара");
        p("Attack FOV (no aim)", "Угол удара (без наводки)"); p("Cooldown Charge", "Заряд удара");
        p("Only Crits", "Только криты"); p("Strict Crits", "Строгие криты (без обычных ударов)"); p("Auto Jump (for crits)", "Авто прыжок (криты)");
        p("Crit Timeout (ticks)", "Тайм-аут крита (тики)"); p("Min Hit Interval (ticks)", "Мин. интервал ударов (тики)");
        p("Targets", "Цели"); p("Hit Through Walls", "Бить сквозь стены");
        p("Hitbox Size", "Размер хитбокса");
        // ESP
        p("ESP Color", "Цвет ESP"); p("Use Team Colors", "Цвета команд"); p("Highlight", "Подсветка");
        p("Highlight Color", "Цвет подсветки"); p("Distance", "Дистанция");
        p("Chests", "Сундуки"); p("Ender Chests", "Эндер-сундуки"); p("Barrels", "Бочки"); p("Shulker Boxes", "Шалкеры");
        p("Through Walls", "Сквозь стены"); p("Chest Color", "Цвет сундуков"); p("Trapped Chest Color", "Цвет сундуков-ловушек");
        p("Ender Chest Color", "Цвет эндер-сундуков"); p("Barrel Color", "Цвет бочек"); p("Shulker Color", "Цвет шалкеров");
        // Player Info
        p("Show Nicknames", "Показывать ники"); p("Status Dot", "Точка статуса"); p("Show Armor", "Показывать броню");
        p("Show Enchantments", "Показывать зачарования"); p("Show Held Item", "Показывать предмет в руке");
        p("Enchant Format", "Формат зачарований"); p("Text Size", "Размер текста"); p("Panel Scale", "Масштаб панели");
        p("Background Opacity", "Прозрачность фона"); p("Display Distance", "Дистанция показа");
        p("Background Color", "Цвет фона"); p("Border Color", "Цвет рамки"); p("Team Color Border", "Рамка цвета команды");
        // HUD
        p("Scale", "Масштаб"); p("Background", "Фон"); p("Text Color", "Цвет текста");
        p("Position X %", "Позиция X %"); p("Position Y %", "Позиция Y %"); p("Show Right Click", "Показывать ПКМ");
        // Interface
        p("GUI Scale", "Масштаб меню"); p("Animations", "Анимации"); p("Animation Speed", "Скорость анимаций");
        p("Accent Primary", "Основной акцент"); p("Accent Secondary", "Второй акцент"); p("Language", "Язык");
        // mode values
        p("Body", "Тело"); p("Head", "Голова"); p("Players", "Игроки"); p("Mobs", "Мобы"); p("Players + Mobs", "Игроки + Мобы");
        p("Short (P4)", "Короткий (P4)"); p("Full (Protection IV)", "Полный (Protection IV)");
        // new
        p("Target Lock", "Захват цели");
        p("KillAura and TriggerBot only attack the player you locked on", "Килл Аура и Триггер Бот бьют только захваченного игрока");
        p("Lock On Hit", "Захват при ударе"); p("Lock On Enable", "Захват цели в прицеле при включении");
        p("Switch On Hit", "Менять цель при ударе"); p("Target: ", "Цель: ");
        p("Style", "Стиль"); p("2D Box (through walls)", "2D рамка (сквозь стены)"); p("3D Box", "3D рамка"); p("Fill", "Заливка");
        p("Strict Crits", "Строгие криты (без обычных ударов)");
        // ui
        p("Keybind", "Клавиша"); p("Press a key...", "Нажмите клавишу..."); p("None", "Нет");
        p("PRIVATE WORLDS ONLY", "ТОЛЬКО ПРИВАТНЫЕ МИРЫ"); p("Keybinds", "Клавиши модулей");
        p("Click a button, then press a key. Backspace clears.", "Нажмите кнопку, затем клавишу. Backspace — сбросить.");
        p("Menu key: = (change in Options > Controls)", "Клавиша меню: = (меняется в Настройки > Управление)");
        p("Save config", "Сохранить"); p("Saved!", "Сохранено!"); p("=  open / close", "=  открыть / закрыть");
        p("Ping: local", "Пинг: локально"); p("Ping: ", "Пинг: "); p(" ms", " мс");
        p("LMB", "ЛКМ"); p("RMB", "ПКМ"); p(" cps", " кл/с");
    }
}
