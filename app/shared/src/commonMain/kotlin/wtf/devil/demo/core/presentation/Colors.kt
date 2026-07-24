package wtf.devil.demo.core.presentation

import androidx.compose.ui.graphics.Color

enum class AppColors(val c: Color) {
    // Основной темный фон / глубокие элементы UI (Графит)
    DarkGray(Color(0xFF1E2022)),

    // Поверхности карточек, плашек, SearchBar (Нейтральный тёмно-серый)
    NeutralGray(Color(0xFF2C2E33)),

    // Разделители, границы (Borders), неактивные иконки
    LightGray(Color(0xFF42454D)),

    // Второстепенный текст, плейсхолдеры
    TextSecondary(Color(0xFF9E9E9E)),

    // Мягкий серый акцент для выделения текста / фона выделенных элементов
    TextSelection(Color(0xFF3D444D)),

    // Цвет каретки (курсора) и ярких акцентов текстового поля
    TextSelectionHandle(Color(0xFF8A909A)),
}